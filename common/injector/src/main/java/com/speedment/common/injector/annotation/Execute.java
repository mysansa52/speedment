package com.speedment.common.injector.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotes that the method should be executed as part of the
 * platform initialization. The annoted method can only take 
 * parameters with the @{@link Inject}-annotation.
 * 
 * @author  Emil Forslund
 * @since   1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Execute {
    
}
