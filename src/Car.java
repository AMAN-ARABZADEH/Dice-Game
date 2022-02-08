import java.util.Locale;

/**
 *
 */
public class Car {
    private int doors;
    private int wheels;
    private String moodel;
    private String engine;
    private String colour;

    public void setMoodel(String moodel){
        String validModel = moodel.toLowerCase();
        if(validModel.equals("tesla") || validModel.equals("commodore")){
            this.moodel = moodel;
        } else {
            this.moodel = "Unknown";
        }
    }
    public String getMoodel(){
        return this.moodel;
    }











}
