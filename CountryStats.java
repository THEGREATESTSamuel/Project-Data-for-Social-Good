public class CountryStats {

  //instance variables
    private String countries;
    private int casualties;
//constructor method
    public CountryStats(String countries, int casualties) {
        this.countries = countries;
        this.casualties = casualties;
    }
/*
returns the specific country.
  */ 
    public String getCountries() {
        return countries;
    }
/*
returns the specific country's amount of casualties.
  */
    public int getCasualties() {
        return casualties;
    }
/*
returns the country and its amount of casualties in a readable manner.
  */ 
    public String toString() {
        return "Country: " + countries + "\nCasualites: " + casualties;
    }




}
