package webapp.geektext.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import webapp.geektext.entities.Rating;

public interface RatingRepo extends JpaRepository<Rating, Long> {

}
