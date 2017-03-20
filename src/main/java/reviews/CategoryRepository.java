package reviews;

import java.util.Set;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	public Set<Category> findAll();

}
