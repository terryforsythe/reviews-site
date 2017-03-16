package reviews;


import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {

	@Resource
	ReviewRepository repository;

	@RequestMapping("/showReviews")
	public String showReviews(Model model) {
		model.addAttribute("reviews", repository.findAll());
		return "reviews";
		

	}

	@RequestMapping("/showReview")
	public String showReview(@RequestParam long id, Model model) {
		model.addAttribute("review", repository.findOne(id));
		return "review";
	}
}
