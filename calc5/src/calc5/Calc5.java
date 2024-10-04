package calc5;
import java.util.Scanner;

public class Calc5{
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

class calc
{
    String num1;
    String num2;
    char typeoperation;
    
    public String get(String op)
    {   String res="";
        if(op.contains("+"))
        {
            this.num1=op.substring(0, op.indexOf("+"));
            this.num2=op.substring(op.indexOf("+")+1, op.length());
            res=sum();
        }
        if(op.contains("-"))
        {
            this.num1=op.substring(0, op.indexOf("-"));
            this.num2=op.substring(op.indexOf("-")+1, op.length());
            res=raz();
    }
        if(op.contains("/"))
        {
            this.num1=op.substring(0, op.indexOf("/"));
            this.num2=op.substring(op.indexOf("/")+1, op.length());
            res=del();
        }
        
        if(op.contains("*"))
        {
            this.num1=op.substring(0, op.indexOf("*"));
            this.num2=op.substring(op.indexOf("*")+1, op.length());
            res=umnozh();
        }
        return res;
}
    
    private String test(double num3)
    {
        if(num3%1==0)
        {
            int intnum=(int)num3;
            String num=String.valueOf(intnum);
            return num;
        }
        else
        {
            String num=String.valueOf(num3);
            return num;
        }
    }
    private String sum()
    {   double num1=Double.parseDouble(this.num1);
        double num2=Double.parseDouble(this.num2);
        double num3=num1+num2;
        String num=test(num3);
        return num;
    }
    
    private String raz()
    {
        double num1=Double.parseDouble(this.num1);
        double num2=Double.parseDouble(this.num2);
        double num3=num1-num2;
        String num=test(num3);
        return num;
    }
    
    private String del()
    {
        double num1=Double.parseDouble(this.num1);
        double num2=Double.parseDouble(this.num2);
        double num3=0;
        try{
        num3=num1/num2;
        }
        catch(ArithmeticException e)
        {
            System.out.println("На ноль делить нельзя");
        }
        String num=test(num3);
        return num;
    }
    
    private String umnozh()
    {
        double num1=Double.parseDouble(this.num1);
        double num2=Double.parseDouble(this.num2);
        double num3=num1*num2;
        String num=test(num3);
        return num;
    }
}
