package oop3;

public class SecondarySchool extends PrimarySchool {

    @Override
    public String reading() {
        return "phrases";
    }

    @Override
    public  int heightSchoolStudent() {
        return 165;
    }

    @Override
    public int ageSchoolStudent() {
       return 15;
     }

     public String name() {
        return "My name is___";
     }
}
