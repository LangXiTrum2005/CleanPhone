package com.badlogic.gdx.utils.reflect;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class Constructor {
    private final java.lang.reflect.Constructor constructor;

    public Constructor(java.lang.reflect.Constructor constructor) {
        this.constructor = constructor;
    }

    public Class getDeclaringClass() {
        return this.constructor.getDeclaringClass();
    }

    public Class[] getParameterTypes() {
        return this.constructor.getParameterTypes();
    }

    public boolean isAccessible() {
        return this.constructor.isAccessible();
    }

    public Object newInstance(Object... objArr) throws ReflectionException {
        try {
            return this.constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw new ReflectionException("Could not instantiate instance of class: ".concat(getDeclaringClass().getName()), e);
        } catch (IllegalArgumentException e2) {
            throw new ReflectionException("Illegal argument(s) supplied to constructor for class: ".concat(getDeclaringClass().getName()), e2);
        } catch (InstantiationException e3) {
            throw new ReflectionException("Could not instantiate instance of class: ".concat(getDeclaringClass().getName()), e3);
        } catch (InvocationTargetException e4) {
            throw new ReflectionException("Exception occurred in constructor for class: ".concat(getDeclaringClass().getName()), e4);
        }
    }

    public void setAccessible(boolean z) {
        this.constructor.setAccessible(z);
    }
}
