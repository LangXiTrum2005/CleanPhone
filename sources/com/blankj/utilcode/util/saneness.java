package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: AdaptScreenUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static List<Field> f17496attabal;

    /* JADX INFO: compiled from: AdaptScreenUtils.java */
    public class attabal implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            saneness.competently();
        }
    }

    public static Runnable beachfront() {
        return new attabal();
    }

    public static void competently() {
        saneness(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }

    public static void dern(Resources resources, float f) {
        Iterator<Field> it = f17496attabal.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) it.next().get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static DisplayMetrics marial(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void saneness(Resources resources, float f) {
        resources.getDisplayMetrics().xdpi = f;
        adultoid.attabal().getResources().getDisplayMetrics().xdpi = f;
        wireman(resources, f);
    }

    public static void wireman(Resources resources, float f) {
        if (f17496attabal != null) {
            dern(resources, f);
            return;
        }
        f17496attabal = new ArrayList();
        Class<?> superclass = resources.getClass();
        Field[] declaredFields = superclass.getDeclaredFields();
        while (declaredFields != null && declaredFields.length > 0) {
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                    field.setAccessible(true);
                    DisplayMetrics displayMetricsMarial = marial(resources, field);
                    if (displayMetricsMarial != null) {
                        f17496attabal.add(field);
                        displayMetricsMarial.xdpi = f;
                    }
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return;
            } else {
                declaredFields = superclass.getDeclaredFields();
            }
        }
    }
}
