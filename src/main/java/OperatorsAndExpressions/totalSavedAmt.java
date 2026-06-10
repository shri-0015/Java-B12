package OperatorsAndExpressions;

public class totalSavedAmt {
    int totalamt=0;
    public void totalsaving(int salary, int expence){
        totalamt += salary - expence + totalamt;
        totalamt += salary - expence + totalamt;
        totalamt += salary - expence + totalamt;
        totalamt += salary - expence + totalamt;
        System.out.println("Total savings: " +totalamt);
    }
}
