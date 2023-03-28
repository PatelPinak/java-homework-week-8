package p17_carpet_cost;

/**
 * 3. Write a class with the name Calculator. The class needs two fields (instance variables) with name  floor of type Floor and carpet of type Carpet.
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * ● Method named getTotalCost without any parameters, it needs to return the calculated total  cost to cover the floor with a carpet.
 */
public class C03_Calculator {
    C01_Floor floor;
    C02_Carpet carpet;

    public C03_Calculator(C01_Floor floor, C02_Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double totalCost;
        totalCost = floor.getArea() * carpet.getCost();
        return totalCost;
    }
}
