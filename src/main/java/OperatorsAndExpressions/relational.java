package OperatorsAndExpressions;

public class relational {
    int shri = 60;
    int anu = 70;
    public void grade(){
    if (shri < anu){
        System.out.println("Anu scored more!");
    }
    else if (anu < shri){
        System.out.println("Shri scored better!");
    }
    else System.out.println("Both scored same!");
    }
}
