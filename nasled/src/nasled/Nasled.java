//Наследование-это создание иерархии классов
//Наследуя один класс от другого, можно упростить код и облегчить создание новых классов
//Наследование позволяет повторно использовать код, упрощать структуру кода, а также обобщать функции объектов
package nasled;


public class Nasled {

 public static void main(String[] args) {
    sotrudnik Pavel = new sotrudnik();
    nachalnik_otdela Oleg_Dmitrievich = new nachalnik_otdela();
    Pavel.getInformation(30, "ул. Горького, д.48", "Иванов Павел");//Объекты данных классов имеют общие методы
    Oleg_Dmitrievich.getInformation(35, "ул. 50 лет Октября, д.52", "Олег Дмитриевич");
    Oleg_Dmitrievich.upravlenie_otdelom();//Наследование позволяет создать четкую иерархию и структуру классов, испеользовать созданный уже блок кода много раз
    }
    
}

class sotrudnik//Класс сотрудник описывает свойства, которые есть у абсолютно всех сотрудников фирмы, начиная от директора, заканчивая сторожем
{
    private int age;
    private String adress;
    protected String name;
    
    public void getInformation(int age, String adress, String name)
    {
        this.age=age;
        this.adress=adress;
        this.name=name;
    }
}

class nachalnik_otdela extends sotrudnik//Данный класс наследует методы и данные класса сотрудник
{
    public void upravlenie_otdelom()//Расширяется класс сотрудник, добавляя методы, присущие отдельному типу сотрудников
    {
        System.out.println("Где мой отчет??");
    }
}

