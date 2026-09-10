package com.badlogic.gdx.utils.reflect;

/* JADX INFO: loaded from: classes.dex */
public final class Annotation {
    private java.lang.annotation.Annotation annotation;

    public Annotation(java.lang.annotation.Annotation annotation) {
        this.annotation = annotation;
    }

    public <T extends java.lang.annotation.Annotation> T getAnnotation(Class<T> cls) {
        if (this.annotation.annotationType().equals(cls)) {
            return (T) this.annotation;
        }
        return null;
    }

    public Class<? extends java.lang.annotation.Annotation> getAnnotationType() {
        return this.annotation.annotationType();
    }
}
