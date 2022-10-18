package webapp.geektext.entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rating")
public class Rating {

	@Id
	@Column(name = "rating_book_isbn")
	private long ratingBookISBN;
	
	@Column(name = "rating_stars")
	private int ratingStars;
	
	@Column(name = "rating_datestamp")
	private Date ratingDatestamp;
	
	@Column(name = "rating_user_id")
	private String ratingUserID;
	

	
	//Constructors
	public Rating(long ratingBookISBN, int ratingStars, Date ratingDatestamp, String ratingUserID) {
		super();
		this.ratingBookISBN = ratingBookISBN;
		this.ratingStars = ratingStars;
		this.ratingDatestamp = ratingDatestamp;
		this.ratingUserID = ratingUserID;
	}
	
	public Rating(){
		
	}

	
	//Getters and Setters
	public long getRatingBookISBN() {
		return ratingBookISBN;
	}

	public void setRatingBookISBN(long ratingBookISBN) {
		this.ratingBookISBN = ratingBookISBN;
	}
	
	public long getRatingStars() {
		return ratingStars;
	}

	public void setRatingStars(int ratingStars) {
		this.ratingStars = ratingStars;
	}

	public Date getRatingDatestamp() {
		return ratingDatestamp;
	}

	public void setRatingDatestamp(Date ratingDatestamp) {
		this.ratingDatestamp = ratingDatestamp;
	}

	public String getRatingUserID() {
		return ratingUserID;
	}

	public void setRatingUserID(String ratingUserID) {
		this.ratingUserID = ratingUserID;
	}

}
