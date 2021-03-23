public class ReadingFiles {
    public static void main(String[] args) {
        In file = new In("http://www.gutenberg.org/cache/epub/47715/pg47715.txt");
        int counter = 0;
        while (!file.isEmpty()) {
            String line = file.readLine();
            if (line.contains("Romeo")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
