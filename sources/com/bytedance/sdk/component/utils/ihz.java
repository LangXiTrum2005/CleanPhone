package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class ihz {
    private static String ri;

    public static String ik(Context context) {
        String strLr = lr(context);
        return (TextUtils.isEmpty(strLr) || !strLr.contains(":")) ? strLr : strLr.replace(":", "_");
    }

    public static String lr(Context context) {
        if (!TextUtils.isEmpty(ri)) {
            return ri;
        }
        String strRi = ri();
        ri = strRi;
        if (!TextUtils.isEmpty(strRi)) {
            return ri;
        }
        String strLr = lr();
        ri = strLr;
        return !TextUtils.isEmpty(strLr) ? ri : ri;
    }

    public static boolean ri(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), lr(context));
    }

    private static String ri() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String lr() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
