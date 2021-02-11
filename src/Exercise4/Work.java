package Exercise4;

public class Work {

    public static void main(String[] args){

        Sotrudnik sotrudnik1 = new Sotrudnik("Маруся Климова", "HR", 79035554477l, 50000, 25);

        System.out.println("У сотрудника " + sotrudnik1.whoIs() + " должность " + sotrudnik1.whatDolzhnost());
        sotrudnik1.whatId();
        System.out.println();


        Sotrudnik[] sotrudniks = new Sotrudnik[5];
        sotrudniks[0] = new Sotrudnik("Иван Иванов", "директор", 79112223344l, 100000, 45);
        sotrudniks[1] = new Sotrudnik("Павел Павлов", "заместитель", 79001112233l, 80000, 40);
        sotrudniks[2] = new Sotrudnik("Галина Петрова", "бухгалтер", 79052221144l, 50000, 34);
        sotrudniks[3] = new Sotrudnik("Николай Григорьев", "менеджер", 79556667788l, 40000, 28);
        sotrudniks[4] = new Sotrudnik("Никифор Парфирьев", "дворник", 79348514568l, 20000, 55);
        for (int i = 0; i < 5; i++){
            if (sotrudniks[i].vozrast() > 40){
                System.out.println(sotrudniks[i].whoIs() + " занимает должность " + sotrudniks[i].whatDolzhnost() + " и старше 40 лет");
            }
        }

        System.out.println();
        System.out.println("У сотрудника " + sotrudniks[4].whoIs() + " зарплата до надбавки составляет " + sotrudniks[4].money());
        sotrudniks[4].nadbavka();
        System.out.println("У сотрудника " + sotrudniks[4].whoIs() + " зарплата после надбавки составляет " + sotrudniks[4].money());
        sotrudniks[4].whatId();

    }


}
