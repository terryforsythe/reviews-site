package reviews;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	String title;
	
	@ManyToOne
	private Collection<Review> reviews;
	
	protected Category() {
	}
	
	public Category(String title, Collection<Review> reviews) {
		this.title = title;
		this.reviews = reviews;
	}
	
	
}
