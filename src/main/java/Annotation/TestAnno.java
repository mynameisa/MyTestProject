package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jiatieying on 2016/12/5.
 * 该注解作为标记,标识需要在javac时做处理的类
 */
@Retention(RetentionPolicy.SOURCE)
public @interface TestAnno {
    String value() default "DefaultString";
}
