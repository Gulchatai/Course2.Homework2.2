public class Hogwarts {
private String studentName;
private int magicPower;
private  int transgressionDistance;

    public Hogwarts(String studentName, int magicPower, int transgressionDistance) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    public  int point(){
        return magicPower + transgressionDistance;
    }
    public void bestHogwarts(Hogwarts hogwarts) {
        if (this.point() < hogwarts.point()) {
            System.out.println(hogwarts.getStudentName() + " лучший в Хогварц, чем "+ this.getStudentName());
        }
        if (this.point() > hogwarts.point()){
            System.out.println(this.getStudentName() + " лучший в Хогварц, чем "+ hogwarts.getStudentName());
        }
        if (this.point() == hogwarts.point()){
            System.out.println(this.getStudentName() + " и "+ hogwarts.getStudentName() + " в Хограрц равны по качествам");
        }
    }
}
