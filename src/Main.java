import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nurtilek ","Avazbekov ",23,"navazbekkov@gmail.com ","men ",10);
        Student student2 = new Student("Aikol ","Tuigunova ",24,"tuigunova@gmail.com ","women ",9);
        Student student3 = new Student("Ruslan ","Erkebaev ",25,"erkebaev@gmail.com ","men ",8);
        Student student4 = new Student("Nargiza ","Umarbaeva ",26,"umarbaeva@gmail.com ","women ",7);
        Student student5 = new Student("Musa ","Tazhibaev ",27,"tazhibaev@gmail.com ","men ",6);
        Student student6 = new Student("Zarina ","Tashtemirova ",28,"tashtemirova@gmail.com ","women ",6);
        Student student7 = new Student("Boru ","Kasenov ",29,"kasenov@gmail.com ","men ",7);
        Student student8 = new Student("Fatima ","Abdilatova ",22,"abdilatova@gmail.com ","women ",8);
        Student student9 = new Student("Abdu ","Temirov ",20,"temirov@gmail.com ","men ",9);
        Student student10 = new Student("Anelya ","Orozbaeva ",21,"orozbaeva@gmail.com ","women ",10);

        Student [] student = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
        School school = new School("Peaksoft",student);
        System.out.println(school);
        System.out.println(school.findByName("Nurtilek "));
        school.getAllStudents();
        System.out.println(Arrays.asList(school.getAllGirls()));
        school.getMaxEstimation();
        System.out.println(school.getAverageEstimation());
        school.getAverageAge();
    }
}