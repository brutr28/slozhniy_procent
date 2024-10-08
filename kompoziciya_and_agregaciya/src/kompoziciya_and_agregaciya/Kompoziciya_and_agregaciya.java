//Композиция-это отношение, при котором один объект состоит из других объектов и между ними существует жесткая связь, объект не может существовать без его компонентов и компоненты не могут существовать без него
//Агрегация-это более легкое отношение, когда объект включает в себя другой объект, но также может существовать и без него
package kompoziciya_and_agregaciya;

public class Kompoziciya_and_agregaciya {

    public static void main(String[] args) {
       Engine e = new Engine(530);
       Remont remont=new Remont();
       remont.GetEngine(e);
    }
    
}
//Можно привести пример композиции на примере машины и ее двигателя
class Engine
{   boolean sostoyanie=true;
    int power;
    public Engine(int p)
    {
        power = p;
    }
}

class Car
{
    String model = "Porshe";
    Engine engine;//Здесь мы непосредственно в классе создаем объект двигателя, класс не может существовать без него
    public Car()//Это является примером композиции, с неразрывной связью двух классов между собой
    {
        this.engine = new Engine(360);
    }
}

class Remont//В данном же классе приведен пример агрегации, когда класс двигателя используется в методе в качестве параметра
{   double cena_remonta=1000.50;//Но класс ремонт и класс двигатель могут существовать по отдельности

    public void GetEngine (Engine e)
    {
        System.out.println("Ремонт двигателя");
        if (e.sostoyanie=false)
        {
            e.sostoyanie=true;
        }
    }
}