//Полиморфизм - принцип объектно-ориентированного программирования, который позволяет разным сущностям выполнять одни и те же действия
//Полиморфизм может быть реализован с помощью перегрузки методов,переопределения методов создания абстрактных классов, интерфейсов
//Полиморфизм делает код более читаемым, легко обслуживаемым и эффективным, но также может затруднять понимание поведения объекта в той или иной ситуации
package polymorph;


public class Polymorph {//В качестве примера я использовала интерфейсы, один класс, реализуя несколько интерфейсов может по разному выступать в коде программы

    public static void main(String[] args) {
      Messanger tel = new Telegram();//Используя разные интерфейсы один и тот же класс может в роли разных объектов по необходимости
      tel.GetMessage();
      
      Application app = new Telegram();
      app.InstallApplication();
    }
    
}

interface Messanger//Интерфейс, реализующий работу мессенджера
{
    public void SendMessage();
    public void GetMessage();
}

interface Application//Интерфейс, который характеризует работу любого приложения на устройстве
{
    public void InstallApplication();
    public void DeleteApplication();
}

class Telegram implements Messanger, Application {//Класс телеграм, который может выступать как просто приложение, так и является мессенджером
    
    @Override
    public void SendMessage()
    {
        System.out.println("Сообщение отправлено");
    }
    
    @Override
    public void GetMessage()
    {
        System.out.println("Сообщение получено");
    }
    
    @Override
    public void InstallApplication()
    {
        System.out.println("Приложение установлено");
    }
    
    @Override 
    public void DeleteApplication()
    {
        System.out.println("Приложение удалено");
    }
}