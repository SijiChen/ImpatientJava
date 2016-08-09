package com.impatient.ch04;

/**
 * Created by sjchen on 8/9/16.
 */
public enum Operation {
    ADD("+") {
        public int eval(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        public int eval(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        public int eval(int a, int b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        public int eval(int a, int b) {
            return a / b;
        }
    };
    private String symbol;

    Operation(String s) {
        this.symbol = s;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract int eval(int arg1, int arg2);
}
