package javareview;

public class Student {
// access spectifier / access modifier
    // ตัวระบุการเข้าถึงตัวแปลและเมทอด มี 4 ระดับ
    // private, public, package (default), protected

    //1. field, attribute, instance variable
    private int id;
    private String name;
    private double midtermScore;
    private double finalScore;

    //2. constructor
    // ถูกเรียกตอนสร้าง object ช่วยกำหนดค่าเริ่มต้นให้ field
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMidtermScore() {
        return midtermScore;
    }

    public void setMidtermScore(double midtermScore) {
        this.midtermScore = midtermScore;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    //3. method (คล้ายฟังก์ชัน)
    public double getTotalScore(){
        double total = midtermScore + finalScore;
        return  total;
    }

    @Override
    public String toString() {
        return id + "-" + name + "  ได้คะแนน -:" + getTotalScore();
    }
}
