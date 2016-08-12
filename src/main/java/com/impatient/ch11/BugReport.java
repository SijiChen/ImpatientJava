package com.impatient.ch11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/**
 * Created by sjchen on 8/12/16.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Repeatable(BugReports.class)
public @interface BugReport {
    boolean showStopper() default false;

    String assignedTo() default "";

    Class<?> testCase() default Void.class;

    Status status() default Status.REPORTED;

    String[] reporteBy() default ("");

    Reference ref() default @Reference(id = 0);

    enum Status {REPORTED, CONFIRMED, ASSIGNED, FIXED, WONTFIX};

}

@Target({ElementType.TYPE, ElementType.METHOD})
@interface BugReports {
    BugReport[] value();
}