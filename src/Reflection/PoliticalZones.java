package Reflection;

public enum PoliticalZones{
    NORTH_CENTRAL( "Benue", "Fct", "Kogi", "Kwara", "NAsarawa","Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bacuchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");


    private String[] state;
    PoliticalZones(String... state){
        this.state = state;
    }
    public void setRegion(String...state){
        this.state = state;
    }
    public String[] state(){
        return state;
    }
}
