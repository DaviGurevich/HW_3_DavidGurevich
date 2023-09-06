package oop3;

public interface School {

    public int ageSchoolStudent();

    public default  String reading(){
        return "letters";
    }
}
