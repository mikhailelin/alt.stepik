//https://alt.stepik.org/topics/lesson/63841
package multipleconstructors;
class Phone {

    String ownerName;
    String countryCode;
    String cityCode;
    String number;
    public Phone(String ownerName, String countryCode, String cityCode, String number){
        this.ownerName=ownerName;
        this.countryCode=countryCode;
        this.cityCode=cityCode;
        this.number=number;
    }
    public Phone(String ownerName,  String number){
        this.ownerName=ownerName;
        this.number=number;
    }    
}