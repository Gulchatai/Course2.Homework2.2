public class Main {
    public static void main(String[] args) {
        System.out.println("Курс 2. Домашняя работа 2.2");
        Hogwarts[] student = {
                new Hogwarts("Гарри Поттер", 5, 5),
                new Hogwarts("Гермиона Грейнджер", 10, 5),
                new Hogwarts("Рон Уизли", 3, 3),
                new Hogwarts("Драко Малфой", 10, 10),
                new Hogwarts("Грэхэм Монтегю", 8, 8),
                new Hogwarts("Грегори Гойл", 2, 4),
                new Hogwarts("Захария Смит", 10, 12),
                new Hogwarts("Седрик Диггори", 20, 20),
                new Hogwarts("Джастин Финч-Флетчл", 5, 10),
                new Hogwarts("Чжоу Чанг", 25, 20),
                new Hogwarts("Падма Патил", 5, 4),
                new Hogwarts("Маркус Белби", 15, 14),
        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 5, 5, 6, 8, 10),
                new Gryffindor("Гермиона Грейнджер", 10, 5, 62, 50, 40),
                new Gryffindor("Рон Уизли", 3, 3, 20, 30, 40),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 10, 12, 20, 5, 10),
                new Hufflepuff("Седрик Диггори", 20, 20, 30, 40, 77),
                new Hufflepuff("Джастин Финч-Флетчл", 5, 10, 4, 18, 6),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 25, 20, 5, 10, 18, 7),
                new Ravenclaw("Падма Патил", 5, 4, 50, 15, 9, 5),
                new Ravenclaw("Маркус Белби", 15, 14, 8, 6, 20, 70),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 10, 10, 6, 66,
                        4, 56, 74),
                new Slytherin("Грэхэм Монтегю", 8, 8, 45, 95, 14,
                        37, 41),
                new Slytherin("Грегори Гойл", 2, 4, 62, 55, 16,
                        9, 7)
        };

        PrintService printService = new PrintService();
        printService.print(student);
        printService.print(gryffindors);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        printService.print(slytherins);
    }
}



