/*
"As world history enjoyers , we want to analyze casualties by country during WW2 +, so that we can understand the scale of human cost during the war\n"
"Question 1: Which country suffered the most casualties?\n"
    "Question 2: What is the average number of casualties across all countries?\n"
    "Question 3: How many countries had casualties above 1,000,000?";
*/
public class UserStory {

    private CountryStats[] stats;
  /*
  constructor method that allows the array to contain the countries 
  and casualties text files.
  */
    public UserStory(String countryFile, String casualtyFile) {
        this.stats = createCountries(countryFile, casualtyFile);
    }
  
  /*
Uses FileReader to parse through the information in the text files.
Then uses for Loop to add a CountryStat variable with the country name and amount of 
casualties.
  */

    public CountryStats[] createCountries(String countryFile, String casualtyFile) {
        String[] countries = FileReader.toStringArray(countryFile);
        int[] casualties = FileReader.toIntArray(casualtyFile);

        CountryStats[] statsArray = new CountryStats[countries.length];

        for (int i = 0; i < countries.length; i++) {
            statsArray[i] = new CountryStats(countries[i], casualties[i]);
        }

        return statsArray;
    }
/*
returns country with the most casualties.
  */
    public String getCountryWithMostCasualties() {
        int max = 0;

        for (int i = 1; i < stats.length; i++) {
            if (stats[i].getCasualties() > stats[max].getCasualties()) {
                max = i;
            }
        }

        return stats[max].getCountries() +", which had " + stats[max].getCasualties() + " casualties";
    }
  
/*
returns average number of casualties
per country.
  */
    public int getAverageCasualties() {
        int total = 0;
        for (int i = 0; i < stats.length; i++) {
            total += stats[i].getCasualties();
        }
        return total / stats.length;
    }
/*
returns total number of country with or with over 1,000,000 casualties.
  */
    public int getAboveMillion() {
        int totalAbove = 0;

        for (int i = 0; i < stats.length; i++) {
            if (stats[i].getCasualties() >= 1_000_000) {
                totalAbove++;
            }
        }

        return totalAbove;
    }
/*
toString method that answers all three of our questions and displays our UserStory.
  */
    public String toString() {
      String result = 
       "As world history enjoyers, we want to analyze casualties by country during WW2, so that we can understand the scale of human cost during the war\n" + "Question 1: Which country suffered the most casualties?\n"+ "Question 2: What is the average number of casualties across all countries?\n" + "Question 3: How many countries had casualties above 1,000,000?";
      // some code here to add to result 
      result+= "\n";
      result+= "\n";
      result+= "Casualty Summary: \n";
      result += "Total number of countries: " + stats.length + "\n";
      result += "Country with the most casualties: " + getCountryWithMostCasualties() + "\n";
      result += "Average number of casualties per country in the world: " + getAverageCasualties() + "\n";
      result += "Number of countries with over one million casualties: " + getAboveMillion() + "\n";
      return result;
    }
}
