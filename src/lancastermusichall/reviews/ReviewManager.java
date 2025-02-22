package lancastermusichall.reviews;

import java.util.ArrayList;
import java.util.List;

public class ReviewManager implements ReviewAPI{

    private List<Review> reviews;
    private List<Insight> insights;

    public ReviewManager() {
        reviews = new ArrayList<>(); // CHANGE TO DATABASE INSTEAD
        insights = new ArrayList<>();
    };
    @Override
    public List<Review> getCustomerReviews() {
        return reviews;
    }

    @Override
    public List<Double> getOnlineRatings() {
        List<Double> ratings = new ArrayList<>();
        for (Review review : reviews) {
            ratings.add(review.getRating());
        }
        return ratings;
    }

    @Override
    public List<Insight> getInsights() {
        return insights;
    }
}
