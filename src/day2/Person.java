package day2;

public class Person  {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String sex;
    private String nationality;

    Person(){}
    Person(String firstName,String lastName,String passportId,int age, String sex,String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }

    void setFirstName(String firstName){
        if (firstName.length() >= 3 && firstName.length() <= 15 ){
            this.firstName = firstName;
        } else {
            System.out.println("invalid firstName");
        }
    }

    void setLastName(String lastName){
        if (lastName.length() >= 6 && lastName.length() <= 20) {
            this.lastName = lastName;
        } else {
            System.out.println("invalid lastName");
        }
    }
    private boolean checkPassportId(String passportId){
        if(passportId.length() != 8) {
            return false;
        } else if (!passportId.startsWith("AN")){
            return false;
        }
        boolean check = true;
        for (int i = 2; i < passportId.length(); i++) {
            if (passportId.charAt(i) > '9' || passportId.charAt(i) < '0'){
                check = false;
                break;
            }
        }
        return check;
    }

    void setPassportId(String passportId){
        if (checkPassportId(passportId)){
            this.passportId = passportId;
        } else {
            System.out.println("invalid passportId");
        }
    }

    void setAge(int age){
        if (age >= 18 && age <= 99) {
            this.age = age;
        } else {
            System.out.println("invalid age");
        }
    }

    void setSex(String sex){
        if (sex.compareToIgnoreCase("Male") == 0 || sex.compareToIgnoreCase("Female") == 0) {
            this.sex = sex;
        } else {
            System.out.println("invalid sex");
        }
    }

    void setNationality(String nationality){
        this.nationality = nationality;
    }

    String getFirstName(String firstName){
        return firstName;
    }

    String  getLastName(String lastName){
        return lastName;
    }

    String getPassportId(String passportId){
        return passportId;
    }

    int getAge(int age){
        return age;
    }

    String getSex(String sex){
        return sex;
    }

    String getNationality(String nationality){
        return nationality;
    }

    void Display(){
        System.out.println("first name " + firstName);
        System.out.println("last name " + lastName);
        System.out.println("passport Id " + passportId);
        System.out.println("age " + age);
        System.out.println("sex " + sex);
        System.out.println("nationality" + nationality);
    }



}
