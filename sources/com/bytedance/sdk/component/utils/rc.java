package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class rc {
    private static final HashMap<Class<?>, Class<?>> lnr;
    public static final Class<?>[] qdl;
    private static Map<String, Method> ud = new HashMap();

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        lnr = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        qdl = new Class[0];
    }

    public static int qdl(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int qdl(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
