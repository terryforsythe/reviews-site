package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<Long, Review>();

	public ReviewRepository() {

		reviews.put(001L, new Review(001L, "title001", "imageUrl001", "category001", "content001"));
		reviews.put(002L, new Review(002L, "title002", "imageUrl002", "category002", "content002"));
		reviews.put(003L, new Review(003L, "title003", "imageUrl003", "category003", "content003"));
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(Long id) {
		return reviews.get(id);
	}

}
