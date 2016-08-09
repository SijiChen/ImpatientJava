package com.impatient.ch04;

/**
 * Created by sjchen on 8/9/16.
 */
public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("L");
    /*
    add constructor, method , field to enum
     */
    private String abbre;

    /*
    constructor always private
     */
    Size(String abbre) {
        this.abbre = abbre;
    }

    public String getAbbre() {
        return abbre;
    }
}
