package reviews;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ReviewCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	String title;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Collection<Review> reviews;
	
	protected ReviewCategory() {
	}
	
	public ReviewCategory(long id, String title) {
		this(id, title, Collections.emptyList());
	}
	
	public ReviewCategory(long id, String title, Collection<Review> reviews) {
		this.id = id;
		this.title = title;
		this.reviews = reviews;
	}
	
}
