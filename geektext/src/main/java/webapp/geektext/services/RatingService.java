package webapp.geektext.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.geektext.entities.Rating;
import webapp.geektext.repos.RatingRepo;

@Service
public class RatingService {

	@Autowired RatingRepo ratingRepo;
	public RatingService() {
		
	}
	
	public List<Rating> getRatings(){
		return ratingRepo.findAll();
	}
	
	public Rating addRating(Rating rating) {
		return ratingRepo.save(rating);
	}
}
