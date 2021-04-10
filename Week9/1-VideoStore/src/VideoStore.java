import java.util.ArrayList;

public class VideoStore {
    ArrayList<Video> videos = new ArrayList<Video>();

    public boolean addVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle() == title) {
                System.out.println(title+" is already in stock.");
                return false;
            }
        }
        Video video = new Video(title);
        videos.add(video);
        return true;
    }

    public Video getVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle() == title) {
                return video;
            }
        }
        System.out.println("Sorry, cannot find the requested video in the catalogue");
        return null;
    }

    public boolean checkOutVideo(String title) {
        Video video = getVideo(title);
        if (video != null && video.isCheckedOut()) {
            video.checkOut();
            return true;
        }
        return false;
    }

    public boolean returnVideo(Video video) {
        return video.returnToStore();
    }

    public void rateVideo(Video video, int rating) {
        video.addRating(rating);
    }

    public double getAverageRatingForVideo(Video video) {
        return video.getAverageRating();
    }

    public Video[] getCheckedOut() {
        int counter = 0;
        for (Video video : videos) {
            if (video.isCheckedOut()) {
                counter++;
            }
        }
        Video array[] = new Video[counter];
        counter = 0;
        for (Video video : videos) {
            if (video.isCheckedOut()) {
                array[counter] = video;
                counter++;
            }
        }
        return array;
    }

    public Video mostPopular() {
        if (videos == null) {
            return null;
        }
        double maxrating = 0;
        Video maxratingvideo = null;
        for (Video video : videos) {
            double rating = video.getAverageRating();
            if (rating > maxrating) {
                maxrating = rating;
                maxratingvideo = video;
            }
        }
        return maxratingvideo;
    }
}
