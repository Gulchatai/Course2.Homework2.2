public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambitiousness;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String studentName, int magicPower, int transgressionDistance, int cunning, int determination, int ambitiousness, int resourcefulness, int lustForPower) {
        super(studentName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int point() {
        return cunning + ambitiousness + resourcefulness + lustForPower + determination;
    }

    public void bestSlytherin(Slytherin slytherin) {
        if (this.point() < slytherin.point()) {
            System.out.println(slytherin.getStudentName() + " лучший на Когтевран, чем " + this.getStudentName());
        }
        if (this.point() > slytherin.point()) {
            System.out.println(this.getStudentName() + " лучший на Когтевран, чем " + slytherin.getStudentName());
        }
        if (this.point() == slytherin.point()) {
            System.out.println(this.getStudentName() + " и " + slytherin.getStudentName() + " равны по качествам");
        }
    }
}