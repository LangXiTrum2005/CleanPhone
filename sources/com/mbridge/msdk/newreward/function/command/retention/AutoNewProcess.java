package com.mbridge.msdk.newreward.function.command.retention;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class AutoNewProcess {
    public static void bind(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (((AutoNew) field.getAnnotation(AutoNew.class)) != null) {
                field.setAccessible(true);
                try {
                    field.set(obj, field.getType().getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (InvocationTargetException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }
}
