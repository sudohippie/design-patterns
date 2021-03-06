package me.sudohippie.designpattern.behavioral.interpreter;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class OrOperator extends Expression {
    private Expression leftHandExpr;
    private Expression rightHandExpr;

    public OrOperator(Expression leftHandExpr, Expression rightHandExpr) {
        this.leftHandExpr = leftHandExpr;
        this.rightHandExpr = rightHandExpr;
    }

    @Override
    public boolean interpret(String str) {
        return leftHandExpr.interpret(str) || rightHandExpr.interpret(str);
    }
}
