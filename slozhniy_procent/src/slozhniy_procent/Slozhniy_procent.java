//Сложный процент - неоднократное изменение числа на какой-либо процент, при этом следующее увеличение происходит не на изначальную сумму, а на накопленную, то есть увеличенную в прошлый раз
//Данный код выполняет вычисление сложного процента
package slozhniy_procent;
import java.util.Scanner;

public class Slozhniy_procent {

    public static void main(String[] args) {
       new procent().proc();
    }
    
}


class procent 
{
    int period;
    double procent;
    double first_sum;
    double last_sum;
    
    private void getPeriod()
    {
        System.out.println("Введите кол-во преиодов:");
        Scanner sc = new Scanner(System.in);
        int period = sc.nextInt();
        this.period=period;
    }
    
    private void getProcent()
    {
        System.out.println("Введите процент:");
        Scanner sc=new Scanner(System.in);
        double procent = sc.nextDouble();
        this.procent = procent/100;
        System.out.println(this.procent);
    }
    
    private void getFirstSum()
    {
        System.out.println("Введите начальное число");
        Scanner sc = new Scanner(System.in);
        double first_sum = sc.nextDouble();
        this.first_sum = first_sum;
    }
    
    private void getLastSum()
    {
        System.out.println("Введите число, которое должно получиться");
        Scanner sc = new Scanner(System.in);
        double last_sum = sc.nextDouble();
        this.last_sum = last_sum;
    }
    
    
    public void proc()
    {
        getFirstSum();
        getProcent();
        getPeriod();
        double n=first_sum;
        
        for(int i=1;i<=this.period;i++)
        {
            n=n*(1+this.procent);
        }
        
        String last_sum = String.format("%3.4f", n);
        System.out.println("Равно:" + last_sum);
    }
    
    public void proc_back()
    {
        getFirstSum();
        getLastSum();
        getPeriod();
        
        double n=this.last_sum/this.first_sum;
        
        for(int i=1;i<=this.period;i++)
        {
            n=Math.sqrt(n);
            System.out.println(n);
        }
        System.out.println("Равно: " + n*10);
    }
    }



