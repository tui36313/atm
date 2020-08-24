package javareview;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1,"อจร");
        Student s2 = new Student(2,"อด");
s1.setMidtermScore(12);
s1.setFinalScore(20);
s2.setMidtermScore(15);
s2.setFinalScore(18);
//        s1.midtermScore = 12;
//        s1.finalScore = 20;
//

//        s2.midtermScore = 15;
//        s2.finalScore = 18;
        System.out.println(s1.getId() +": "+ s1.getName() + "  ได้คะแนนรวม : "+ s1.getTotalScore());
        System.out.println(s2.getId() +": "+ s2.getName() + "  ได้คะแนนรวม : "+ s2.getTotalScore());
//        Student x = s1;
//        x.id = 100;
//        System.out.println(s1.id+x.name+x.getTotalScore());
//
        System.out.println(s1);
        System.out.println(s2.toString());
    }
}
