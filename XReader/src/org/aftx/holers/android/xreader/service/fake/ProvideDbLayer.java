package org.aftx.holers.android.xreader.service.fake;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import com.google.inject.BindingAnnotation;

@BindingAnnotation
@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ProvideDbLayer {

}