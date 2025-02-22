package lancastermusichall.reviews;

import java.util.List;

public interface ReviewAPI {
    List<Review> getCustomerReviews();
    List<Double> getOnlineRatings();
    List<Insight> getInsights();
}
