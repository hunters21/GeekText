package webapp.geektext.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import webapp.geektext.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
