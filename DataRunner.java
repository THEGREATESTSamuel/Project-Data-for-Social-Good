public class DataRunner {
    public static void main(String[] args) {
      //creates a UserStory array with the countries.txt and casualties.txt text files.
        UserStory ww2 = new UserStory("countries.txt", "casualties.txt");
        System.out.println(ww2);
}
}
