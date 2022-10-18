package webapp.geektext.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {

	@Id
	@Column(name = "author_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long authorId;
	
	@Column(name = "author_firstname")
	private String authorFirstName;
	
	@Column(name = "author_lastname")
	private String authorLastName;
	
	@Column(name = "author_biography")
	private String authorBiography;
	
	@Column(name = "author_publisher")
	private String authorPublisher;

	
	//Constructors
	public Author(long authorId, String authorFirstName, String authorLastName, String authorBiography,
			String authorPublisher) {
		super();
		this.authorId = authorId;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.authorBiography = authorBiography;
		this.authorPublisher = authorPublisher;
	}
	
	public Author(){
		
	}

	
	//Getters and Setters
	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public String getAuthorBiography() {
		return authorBiography;
	}

	public void setAuthorBiography(String authorBiography) {
		this.authorBiography = authorBiography;
	}

	public String getAuthorPublisher() {
		return authorPublisher;
	}

	public void setAuthorPublisher(String authorPublisher) {
		this.authorPublisher = authorPublisher;
	}
	
}
