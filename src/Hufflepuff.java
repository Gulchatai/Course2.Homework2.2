public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private  int honesty;

    public Hufflepuff(String studentName, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(studentName, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public  int point(){
        return loyalty + industriousness + honesty;
    }
    public void bestHufflepuff(Hufflepuff hufflepuff) {
        if (this.point() < hufflepuff.point()) {
            System.out.println(hufflepuff.getStudentName() + " лучший на Пуффендуй, чем "+ this.getStudentName());
        }
        if (this.point() > hufflepuff.point()){
            System.out.println(this.getStudentName() + " лучший на Пуффендуй, чем "+ hufflepuff.getStudentName());
        }
        if (this.point() == hufflepuff.point()){
            System.out.println(this.getStudentName() + " и "+ hufflepuff.getStudentName() + " равны по качествам");
        }
    }
}