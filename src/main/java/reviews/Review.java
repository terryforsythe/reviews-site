package reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String imageUrl;
	private String content;
	
	@ManyToOne
	Category category;
	

	protected Review() {
	}

	public Review(long id, String title, String imageUrl, String category, String content) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
//		this.category = category;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}
	
	public Category getCategory() {
		return category;
	}

	public String getcontent() {
		return content;
	}

}
