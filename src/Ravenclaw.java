public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int humor;
    private int creativeness;

    public Ravenclaw(String studentName, int magicPower, int transgressionDistance, int intelligence, int wisdom, int humor, int creativeness) {
        super(studentName, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.humor = humor;
        this.creativeness = creativeness;
    }


    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public int getCreativeness() {
        return creativeness;
    }

    public void setCreativeness(int creativeness) {
        this.creativeness = creativeness;
    }

    public  int point(){
        return intelligence + wisdom + humor + creativeness;
    }
    public void bestRavenclaw(Ravenclaw ravenclaw) {
        if (this.point() < ravenclaw.point()) {
            System.out.println(ravenclaw.getStudentName() + " лучший на Когтевран, чем "+ this.getStudentName());
        }
        if (this.point() > ravenclaw.point()){
            System.out.println(this.getStudentName() + " лучший на Когтевран, чем "+ ravenclaw.getStudentName());
        }
        if (this.point() == ravenclaw.point()){
            System.out.println(this.getStudentName() + " и "+ ravenclaw.getStudentName() + " равны по качествам");
        }
    }
}


