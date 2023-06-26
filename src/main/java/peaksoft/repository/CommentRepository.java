package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments,Long> {


}
