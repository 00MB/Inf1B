public class Video {
    String video_title;
    int video_rating;
    double video_rating_count;
    boolean video_checkout;

    public Video(String title) {
        video_title = title;
        video_rating_count = 0.0;
        video_rating = 0;
        video_checkout = false;
    }

    public String getTitle() {
        return video_title;
    }

    public boolean addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            video_rating += rating;
            video_rating_count++;
            return true;
        }
        System.out.println(rating+" should be between 1 and 5.");
        return false;
    }

    public double getAverageRating() {
        if (video_rating == 0) {
            return 0;
        }
        return video_rating / video_rating_count;
    }

    public boolean checkOut() {
        if (video_checkout) {
            System.out.println(toString()+" is already checked out.");
            return false;
        }
        video_checkout = true;
        return true;
    }

    public boolean isCheckedOut() {
        return video_checkout;
    }

    public boolean returnToStore() {
        if (!video_checkout) {
            System.out.println(toString()+" is not checked out.");
            return false;
        }
        video_checkout = false;
        return true;
    }

    public String toString() {
        return String.format("Video[title=\"%s\", checkedOut=%s]", video_title, video_checkout);
    }
}
