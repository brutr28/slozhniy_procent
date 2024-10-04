//класс калькулятор
package calc6;


class calc
{
    String num1;
    String num2;
    
    public String get(String op)//метод, определяющий операцию и преобразует строку в числа, также возвращает результат
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
    
    private String test(double num3)//Определяет тип данных результата и преобразует в строку
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
    private String sum()//Сумма
    {   double num1=Double.parseDouble(this.num1);
        double num2=Double.parseDouble(this.num2);
        double num3=num1+num2;
        String num=test(num3);
        return num;
    }
    
    private String raz()//Разность
    {
        double num1=Double.parseDouble(this.num1);
        double num2=Double.parseDouble(this.num2);
        double num3=num1-num2;
        String num=test(num3);
        return num;
    }
    
    private String del()//Деление
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
    
    private String umnozh()//Умножение
    {
        double num1=Double.parseDouble(this.num1);
        double num2=Double.parseDouble(this.num2);
        double num3=num1*num2;
        String num=test(num3);
        return num;
    }
}
