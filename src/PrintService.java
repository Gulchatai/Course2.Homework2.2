public class PrintService {
public void  print(Hogwarts[] student) {
    System.out.println("Численность студентов Hogwarts " + student.length);
    for (int i = 0; i < student.length; i++) {
        Hogwarts hogwarts = student[i];
        System.out.println("Имя студента: " + hogwarts.getStudentName() + "; Уровень магии: " +
                hogwarts.getMagicPower() + "; Расстояние трансгрессии: " + hogwarts.getTransgressionDistance());
    }
}
public void print(Gryffindor[] gryffindors) {
    System.out.println("Численность студентов факультета Gryffindor " + gryffindors.length);
    for (int i = 0; i < gryffindors.length; i++) {
        Gryffindor gryffindor = gryffindors[i];
        System.out.println("Имя студента: " + gryffindor.getStudentName() + "; Уровень магии: " +
                gryffindor.getMagicPower() + "; Расстояние трансгрессии: " + gryffindor.getTransgressionDistance()
                + "; Благородство: " + gryffindor.getNobleness() + "; Честь: " + gryffindor.getHonor() + "; Храбрость: "
                + gryffindor.getBravery());
    }
    }
    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Численность студентов факультета Gryffindor " + hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя студента: " + hufflepuff.getStudentName() + "; Уровень магии: " +
                    hufflepuff.getMagicPower() + "; Расстояние трансгрессии: " + hufflepuff.getTransgressionDistance()
                    + "; Трудолюбие: " + hufflepuff.getIndustriousness() + "; Верность: " + hufflepuff.getLoyalty() + "; Честность: "
                    + hufflepuff.getHonesty());
        }
    }
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Численность студентов факультета Gryffindor " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя студента: " + ravenclaw.getStudentName() + "; Уровень магии: " +
                    ravenclaw.getMagicPower() + "; Расстояние трансгрессии: " + ravenclaw.getTransgressionDistance()
                    + "; Интеллект: " + ravenclaw.getIntelligence() + "; Мудрость: " + ravenclaw.getWisdom() + "; Остроумие: "
                    + ravenclaw.getHumor() + "; Креативность:" + ravenclaw.getCreativeness());
        }
    }
    public void print(Slytherin[] slytherins) {
        System.out.println("Численность студентов факультета Gryffindor " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя студента: " + slytherin.getStudentName() + "; Уровень магии: " +
                    slytherin.getMagicPower() + "; Расстояние трансгрессии: " + slytherin.getTransgressionDistance()
                    + "; Хитрость: " + slytherin.getCunning() + "; Решительность: " + slytherin.getDetermination() +
                    "; Амбициозность: " + slytherin.getAmbitiousness() + "; Находчивость:" + slytherin.getResourcefulness() +
                    "; Жажда власти:" + slytherin.getLustForPower());
        }
    }
}
