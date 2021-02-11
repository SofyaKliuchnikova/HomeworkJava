package Exercise4;

public class Sotrudnik {
    private String fio;
    private String dolzhnost;
    private long telephone;
    private int zarplata;
    private int age;
    private static int count = 0;
    private int id = 0;


    public Sotrudnik (String fio, String dolzhnost, long telephone, int zarplata, int age){
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.telephone = telephone;
        this.zarplata = zarplata;
        this.age = age;
        id = count++;
    }

    public void nadbavka(){
        if (age > 35){
            zarplata += 10000;
        }
    }

    public String whoIs(){
        return fio;
    }

    public String whatDolzhnost(){
        return dolzhnost;
    }

    public long telNumber(){
        return telephone;
    }

    public int money(){
        return zarplata;
    }

    public int vozrast(){
        return age;
    }

    public void whatId (){
        System.out.println("У сотрудника " + fio + " ID = " + id);
    }






}
