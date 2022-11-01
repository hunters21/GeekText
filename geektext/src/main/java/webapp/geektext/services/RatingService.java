package webapp.geektext.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	public List<Rating> getSortedRatings() {
		List<Rating> ratingListToReturn = new ArrayList<Rating>(); // rating List to Return
		List<Rating> ratingsToSearch = ratingRepo.findAll();
		for (Rating rating : ratingsToSearch) {
			if(ratingListToReturn.size() == 0) {
				ratingListToReturn.add(rating);
			} else {
				for(int i = 0; i < ratingListToReturn.size(); i++) {
					if(ratingListToReturn.get(i).getRatingStars() < rating.getRatingStars()) {
						ratingListToReturn.add(i, rating);
						break;
					} else if(i == ratingListToReturn.size()-1) {
						ratingListToReturn.add(rating);
						break;
					}
				}
			}
		}
		return ratingListToReturn;
	}
	
	public ResponseEntity<List<Rating>> getRatingsByUserID(String userID) {
		List<Rating> ratingListToReturn = new ArrayList<Rating>(); // rating List to Return
		List<Rating> ratingsToSearch = ratingRepo.findAll();
		
		for (Rating rating : ratingsToSearch) {
			if(rating.getRatingUserID().equals(userID)) {
				ratingListToReturn.add(rating);
			}
		}
		if(ratingListToReturn.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<List<Rating>>(ratingListToReturn, HttpStatus.OK);
		}
	}
	
	public Rating addRating(Rating rating) {
		return ratingRepo.save(rating);
	}
	
}
