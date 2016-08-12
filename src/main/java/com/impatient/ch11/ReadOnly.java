package com.impatient.ch11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by sjchen on 8/12/16.
 */
@Target({ElementType.TYPE_USE,ElementType.PARAMETER})
public @interface ReadOnly {

}
