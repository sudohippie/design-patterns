package me.chumbo.designpattern.behaviour.interpreter;

import java.util.StringTokenizer;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class Leaf extends Expression {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()){
            String s = st.nextToken();
            if(s.equals(name)){
                return true;
            }
        }
        return false;
    }
}
