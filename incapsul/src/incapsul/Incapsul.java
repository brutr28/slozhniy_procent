//Инкапсуляция-это процесс сокрытия внутренних деталей реализации объекта и предоставление внешнему миру только необходимых методов для взаимодействия с объектом
//Среди плюсов инкапсуляции безопасность работы кода от изменений, модульность, легкость чтения и поддержки, легкая адаптация пользователей к изменениям
//Недостатком является то, что жесткие границы между компонентами кода усложняют процесс доступа, нужны обязательно особые методы
package incapsul;

public class Incapsul{
    public static void main(String args[])
    {
          EncapTest encap = new EncapTest();
      encap.setName("Олег");//Пользователь может менять данные не напрямую, а через сеттеры и геттеры
      encap.setAge(28);//Пользователю не нужно знать как работает метод, ему достаточно ввести данные, а затем увидеть результат программы
      encap.setIdNum("12343ms");//Таким образом сложные механизмы скрываются, облегчая восприятие

      System.out.print("Имя: " + encap.getName() + ", возраст: " + encap.getAge());
    }
    
}

class EncapTest {
      private String name;//Данные указаны с уровнем доступа private соответственно напрямую изменить их не получится
   private String idNum;//Уровни доступа являются инструментом инкапсуляции
   private int age;

   public int getAge() { //Сеттеры и геттеры позволяют самим определять уровень доступа пользователя к данным
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge(int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum(String newId) {
      idNum = newId;
   }
    }
    

