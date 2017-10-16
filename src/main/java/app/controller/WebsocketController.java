package app.controller;

import app.model.OutputMessage;
import app.model.Student;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WebsocketController {
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(Student student) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(student.getFirstName(), student.getLastName(), time);
    }
}
