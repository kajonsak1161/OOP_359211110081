package ooplab7;

public class SuperCar {
    private String CarBrand;
    private String CarColor;
    private String CarEngineSize;
    private String maxspeed;
    private String CountryOfOrigin ;
    private String SuperCarClass;
    public  SuperCar(){}

    public SuperCar(String a,String b,String c, String d,String e, String f){
        //assign data to properties ประกาศค่าเท่ากับตัวแปร
        this.CarBrand = a;
        this.CarColor = b;
        this.CarEngineSize = c;
        this.maxspeed = d;
        this.CountryOfOrigin = e;
        this.SuperCarClass = f;
    }//Student

    @Override
    public String toString() {
        return "SuperCar{" +
                "CarBrand='" + CarBrand + '\'' +
                ", CarColor='" + CarColor + '\'' +
                ", CarEngineSize='" + CarEngineSize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", CountryOfOrigin='" + CountryOfOrigin + '\'' +
                ", SuperCarClass='" + SuperCarClass + '\'' +
                '}';
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }

    public String getCarEngineSize() {
        return CarEngineSize;
    }

    public void setCarEngineSize(String carEngineSize) {
        CarEngineSize = carEngineSize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountryOfOrigin() {
        return CountryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        CountryOfOrigin = countryOfOrigin;
    }

    public String getSuperCarClass() {
        return SuperCarClass;
    }

    public void setSuperCarClass(String superCarClass) {
        SuperCarClass = superCarClass;
    }
}//class
