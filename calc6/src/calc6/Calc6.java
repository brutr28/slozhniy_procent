package calc6;
import java.util.Scanner;

public class Calc6{
    public static void main (String args[])
    {   
        System.out.println("Калькулятор");
        System.out.println("Калькулятор может выполнять такие операции, как сложение, вычитание, умножение и деление");
        System.out.println("Введите выражение:");
        while(true){
        String op;
        Scanner scanner=new Scanner(System.in, "utf-8");
        op=scanner.nextLine();
        calc Calc=new calc();
        String num=Calc.get(op);
        System.out.println("Результат: "+ num);
        System.out.println("Еще операция?y/n");
        op=scanner.nextLine();
        if(op.equals("n"))
        break;
    }
        
}
}


