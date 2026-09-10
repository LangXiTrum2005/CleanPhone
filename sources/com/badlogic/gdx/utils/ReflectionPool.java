package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.reflect.ClassReflection;
import com.badlogic.gdx.utils.reflect.Constructor;
import com.badlogic.gdx.utils.reflect.ReflectionException;

/* JADX INFO: loaded from: classes.dex */
public class ReflectionPool<T> extends Pool<T> {
    private final Constructor constructor;

    public ReflectionPool(Class<T> cls) {
        this(cls, 16, Integer.MAX_VALUE);
    }

    @Null
    private Constructor findConstructor(Class<T> cls) {
        try {
            try {
                return ClassReflection.getConstructor(cls, null);
            } catch (ReflectionException unused) {
                return null;
            }
        } catch (Exception unused2) {
            Constructor declaredConstructor = ClassReflection.getDeclaredConstructor(cls, null);
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        }
    }

    @Override // com.badlogic.gdx.utils.Pool
    public T newObject() {
        try {
            return (T) this.constructor.newInstance(null);
        } catch (Exception e) {
            throw new GdxRuntimeException("Unable to create new instance: ".concat(this.constructor.getDeclaringClass().getName()), e);
        }
    }

    public ReflectionPool(Class<T> cls, int i) {
        this(cls, i, Integer.MAX_VALUE);
    }

    public ReflectionPool(Class<T> cls, int i, int i2) {
        super(i, i2);
        Constructor constructorFindConstructor = findConstructor(cls);
        this.constructor = constructorFindConstructor;
        if (constructorFindConstructor == null) {
            throw new RuntimeException("Class cannot be created (missing no-arg constructor): ".concat(cls.getName()));
        }
    }
}
