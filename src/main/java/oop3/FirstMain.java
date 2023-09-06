package oop3;

public class FirstMain {

    public static void main(String[] args) {
       SecondarySchool secondarySchool = new SecondarySchool();
//        System.out.println(secondarySchool.heightSchoolStudent()); //165
//        System.out.println(secondarySchool.reading()); // phrases
//        System.out.println(secondarySchool.ageSchoolStudent()); //15

        PrimarySchool primarySchool = new PrimarySchool();
//        System.out.println(primarySchool.heightSchoolStudent()); // 130
//        System.out.println(primarySchool.reading()); // words
//        System.out.println(primarySchool.ageSchoolStudent()); // 8

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
