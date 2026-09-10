package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class dw {
    private static final HashMap<Class<?>, Class<?>> ik;
    private static Map<String, Method> lr = new HashMap();
    public static final Class<?>[] ri;

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        ik = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        ri = new Class[0];
    }

    public static int ri(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int ri(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
