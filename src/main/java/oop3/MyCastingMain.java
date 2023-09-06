package oop3;

public class MyCastingMain {

    public static void main(String[] args) {
        SecondarySchool secondarySchool = new SecondarySchool();
//        System.out.println(secondarySchool.heightSchoolStudent()); //165
//        System.out.println(secondarySchool.reading()); // phrases
//        System.out.println(secondarySchool.ageSchoolStudent()); //15

        PrimarySchool primaryFromSecondarySchool = (SecondarySchool) secondarySchool;
        System.out.println("str 12 " + primaryFromSecondarySchool.reading()); // phrases, casting does not work
        System.out.println("str 13 " + secondarySchool.reading()  + " name " + secondarySchool.name()); // phrases name My name is___

        PrimarySchool primarySchool = new PrimarySchool();
//        System.out.println(primarySchool.heightSchoolStudent()); // 130
//        System.out.println(primarySchool.reading()); // words
//        System.out.println(primarySchool.ageSchoolStudent()); // 8


        primarySchool = (PrimarySchool) secondarySchool;
        System.out.println("str 22 " + primarySchool.reading());
        System.out.println("str 23 " + secondarySchool.reading());


        SecondarySchool secondarySchoolCasting = (SecondarySchool) primarySchool;
        System.out.println("str 27 " + secondarySchoolCasting.reading()); // ooops - get the stack trace!
        System.out.println("str 28 " + primarySchool.reading()); // ooops - get the stack trace!

        School school = new School() {
            @Override
            public int ageSchoolStudent() {
                return 108;
            }
        };

        System.out.println(school.ageSchoolStudent()); // 108
        System.out.println(school.reading()); // letters

        School schoolClass = new School() {
            int weight;

            public void setWeight(int weight) {
                this.weight = weight;
            }

            @Override
            public int ageSchoolStudent() {
                return 108;
            }
        };

        System.out.println(schoolClass.getClass());

    }
}

