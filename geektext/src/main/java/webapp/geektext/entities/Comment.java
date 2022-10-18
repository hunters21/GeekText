package webapp.geektext.entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment {

	@Id
	@Column(name = "comment_book_isbn")
	private long commentBookISBN;
	
	@Column(name = "comment_datestamp")
	private Date commentDatestamp;
	
	@Column(name = "comment_user_id")
	private String commentUserID;
	
	@Column(name = "comment_details")
	private String commentDetails;

	
	//Constructors
	public Comment(long commentBookISBN, Date commentDatestamp, String commentUserID,
			String commentDetails) {
		super();
		this.commentBookISBN = commentBookISBN;
		this.commentDatestamp = commentDatestamp;
		this.commentUserID = commentUserID;
		this.commentDetails = commentDetails;
	}
	
	public Comment(){
		
	}

	
	//Getters and Setters
	public long getCommentBookISBN() {
		return commentBookISBN;
	}

	public void setCommentBookISBN(long commentBookISBN) {
		this.commentBookISBN = commentBookISBN;
	}

	public Date getCommentDatestamp() {
		return commentDatestamp;
	}

	public void setCommentDatestamp(Date commentDatestamp) {
		this.commentDatestamp = commentDatestamp;
	}

	public String getCommentUserID() {
		return commentUserID;
	}

	public void setCommentUserID(String commentUserID) {
		this.commentUserID = commentUserID;
	}

	public String getCommentDetails() {
		return commentDetails;
	}

	public void setCommentDetails(String commentDetails) {
		this.commentDetails = commentDetails;
	}
	
}
