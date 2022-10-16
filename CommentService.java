package webapp.geektext.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.geektext.entities.Comment;
import webapp.geektext.entities.Rating;
import webapp.geektext.repos.CommentRepo;

@Service
public class CommentService {

	@Autowired CommentRepo commentRepo;
	public CommentService() {
		
	}
	
	public List<Comment> getComments(){
		return commentRepo.findAll();
	}
	
	public Comment addComment(Comment comment) {
		return commentRepo.save(comment);
	}
}
