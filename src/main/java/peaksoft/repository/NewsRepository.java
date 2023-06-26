package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.entity.News;

public interface NewsRepository extends JpaRepository<News,Long> {

}
