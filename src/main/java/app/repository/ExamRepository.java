package app.repository;

import app.model.Exam;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ExamRepository extends PagingAndSortingRepository<Exam, Long> {
}
