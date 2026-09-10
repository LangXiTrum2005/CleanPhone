package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Application f41649a;

    public static Context a(Context context) {
        Context applicationContext = f41649a;
        if (applicationContext != null) {
            return applicationContext;
        }
        try {
            if (context instanceof Application) {
                try {
                    f41649a = (Application) context;
                } catch (Throwable unused) {
                }
                applicationContext = context;
            } else if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext != null) {
                    applicationContext = a(baseContext);
                }
            } else if (context != null) {
                applicationContext = context.getApplicationContext();
            }
        } catch (Throwable unused2) {
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        Application application = f41649a;
        if (application == null) {
            synchronized (x0.class) {
                try {
                    application = f41649a;
                    if (application == null) {
                        try {
                            Method declaredMethod = Class.forName(Activity.class.getName().concat("Thread")).getDeclaredMethod("current".concat("Application"), new Class[0]);
                            declaredMethod.setAccessible(true);
                            application = (Application) declaredMethod.invoke(null, new Object[0]);
                        } catch (Throwable unused3) {
                        }
                        f41649a = application;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return application == null ? context : application;
    }
}
