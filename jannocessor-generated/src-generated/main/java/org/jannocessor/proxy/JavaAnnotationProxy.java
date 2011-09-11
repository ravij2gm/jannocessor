package org.jannocessor.proxy;

import javax.annotation.Generated;
import org.jannocessor.proxy.JavaTypeProxy;
import org.jannocessor.model.type.JavaAnnotation;
import org.jannocessor.data.JavaAnnotationData;


@Generated("JAnnocessor-bootstraped")
public class JavaAnnotationProxy extends JavaTypeProxy implements JavaAnnotation {

    private JavaAnnotation adapter;

    private JavaAnnotationData data;

    public JavaAnnotationProxy(JavaAnnotation adapter, JavaAnnotationData data) {
        super(adapter, data);
        this.adapter = adapter;
        this.data = data;
    }



}

