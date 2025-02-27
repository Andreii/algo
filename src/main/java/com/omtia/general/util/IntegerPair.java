/*
 * @author Andrei Constantin Tanasache, act@omtia.com
 */

package com.omtia.general.util;

public class IntegerPair implements Comparable<IntegerPair> {
    Integer u,v;

    IntegerPair(Integer first) {
        u = first;
        v = 0;
    }

    public IntegerPair(Integer first, Integer second) {
        u = first;
        v = second;
    }

    @Override
    public int compareTo(IntegerPair o) {
        if(!this.u.equals(o.u)) {
            return this.u - o.u;
        } else {
            return this.v - o.v;
        }
    }

    public Integer first() {
        return u;
    }
    public Integer second() {
        return v;
    }

    public String toString() {
        return "( " + u + "," + v + ")";
    }
}
