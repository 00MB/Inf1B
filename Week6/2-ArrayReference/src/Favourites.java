public class Favourites {
    String[][] favourites = new String[10][];
    public void addTrack(String artist, String title) {
        for (int i = 0; i < 6; i++) {
            if (i < 5 && favourites[i] == null) {
                favourites[i] = new String[]{artist, title};
                break;
            } else if (i == 5) {
                System.out.println("Sorry, can't add: "+title+" | "+artist+"\n");
            }
        }
    }

    public void showFavourites() {
        for (int i = 0; i < 5; i++) {
            if (favourites[i] != null) {
                System.out.println(favourites[i][1] + " | " + favourites[i][0]);
            }
        }
    }
}
