package me.chumbo.designpattern.behaviour.interpreter;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class Client {
    public static void main(String[] args){
        Leaf john = new Leaf("john");
        Leaf mary = new Leaf("mary");
        Leaf joe = new Leaf("joe");
        Leaf emily = new Leaf("emily");
        Leaf jess = new Leaf("jess");

        // (emily or john) and (joe and (jess or mary))
        Expression expr1 = new OrOperator(emily, john);
        Expression expr2 = new OrOperator(jess, mary);
        Expression expr3 = new AndOperator(joe, expr2);
        Expression expr4 = new AndOperator(expr1, expr3);

        String str = "john joe mary";
        System.out.println(expr4.interpret(str));
    }
}
