package reviews;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<ReviewCategory, Long> {

	public Set<ReviewCategory> findAll();

}
