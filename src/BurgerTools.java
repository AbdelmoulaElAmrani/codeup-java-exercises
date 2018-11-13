public class BurgerTools {

    private String mostPopularTopping;

    private int averageDaysBeforeExpiration;

    private int temperatureWhenCooked;

//    public BurgerTools(String mostPopularTopping, int averageDaysBeforeExpiration, int temperatureWhenCooked) {
//        this.mostPopularTopping = mostPopularTopping;
//        this.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
//        this.temperatureWhenCooked = temperatureWhenCooked;
//    }
    public  BurgerTools(String mostPopularTopping, int averageDaysBeforeExpiration , int temperatureWhenCooked){
        this.mostPopularTopping = mostPopularTopping;
        this.averageDaysBeforeExpiration =averageDaysBeforeExpiration;
        this.temperatureWhenCooked =temperatureWhenCooked;
    }

    public String getMostPopularTopping() {
        return mostPopularTopping;
    }

    public int getAverageDaysBeforeExpiration() {
        return averageDaysBeforeExpiration;
    }

    public int getTemperatureWhenCooked() {
        return temperatureWhenCooked;
    }

    public void grill(){
        System.out.println( "Grilling burger");
    }

}

