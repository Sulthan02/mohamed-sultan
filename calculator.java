
class Calculator
{
public static void main(String[] args)
{
Calculator calc = new Calculator(); //()-Connect with constructor

calc.add(); //Method Calling Statement
calc.substract();
calc.multiply();
calc.divide();
// . - Dot Operator - before dot operator - object reference name
// after dot operator - action
}
void add(){ // Method Signature - Method Name - add
//Method Defination
System.out.println(10+20);
}
void substract(){
//Method Defination
System.out.println(10-20);
}
void multiply(){
//Method Defination
System.out.println(10*20);
}
void divide(){
//Method Defination
System.out.println(10/20);
}
}
