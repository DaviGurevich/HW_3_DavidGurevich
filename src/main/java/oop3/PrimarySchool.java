package oop3;

public class PrimarySchool implements School{
    @Override
    public int ageSchoolStudent() {
        return 8;
    }

    @Override
    public String reading() {
        return "words";
    }

    public  int heightSchoolStudent() {
        return 130;
    }
}
