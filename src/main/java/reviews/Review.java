package reviews;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reviewId;
	private String reviewTitle;
	private String reviewImageUrl;
	private String reviewCategory;
	private String reviewContent;
	
	@ManyToOne
	Category category;
	
	protected Review() {
	}

	public Review(long id, String title, String imageUrl, String category, String content) {
		this.reviewId = id;
		this.reviewTitle = title;
		this.reviewImageUrl = imageUrl;
		this.reviewCategory = category;
		this.reviewContent = content;
	}

	public long getReviewId() {
		return reviewId;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public String getReviewImageUrl() {
		return reviewImageUrl;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public String getReviewContent() {
		return reviewContent;
	}

}
