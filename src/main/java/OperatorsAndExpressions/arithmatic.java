package OperatorsAndExpressions;

public class arithmatic {
    int pbanana = 5;
    int pmango = 10;
    int psuger = 30;
    public void add(int banana, int mango, int suger){
        int totalcost = banana * pbanana +
                mango * pmango +
                suger * psuger;
        System.out.println("total cost is:" +totalcost);
    }
}
