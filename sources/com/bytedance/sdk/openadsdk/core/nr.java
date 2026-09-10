package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class nr {
    private static int ik = -1;
    private static volatile wjv<com.bytedance.sdk.openadsdk.ka.ri> lr;
    private static volatile Context ri;

    public static class ri {
        private static volatile Application ri;

        static {
            try {
                Object objLr = lr();
                ri = (Application) objLr.getClass().getMethod("getApplication", null).invoke(objLr, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ri("MyApplication", "application get failed", th);
            }
        }

        private static Object lr() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ri("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }

        public static Application ri() {
            return ri;
        }
    }

    public static com.bytedance.sdk.openadsdk.slm.lr.ik fi() {
        return !com.bytedance.sdk.openadsdk.core.settings.xha.ri() ? com.bytedance.sdk.openadsdk.slm.lr.ka.ri() : com.bytedance.sdk.openadsdk.ka.ri.lr.ri();
    }

    public static wjv<com.bytedance.sdk.openadsdk.ka.ri> ik() {
        if (lr == null) {
            synchronized (nr.class) {
                try {
                    if (lr == null) {
                        lr = new ay(ri);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lr;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.sf ka() {
        return com.bytedance.sdk.openadsdk.core.settings.sf.lr();
    }

    public static void lr(Context context) {
        if (ri == null) {
            synchronized (nr.class) {
                try {
                    if (ri == null) {
                        if (context != null) {
                            ri = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                ri = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationRi = ri.ri();
                            if (applicationRi != null) {
                                ri = applicationRi;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Context ri() {
        if (ri == null) {
            lr(null);
        }
        return ri;
    }

    public static Context ri(Context context) {
        if (context == null) {
            context = ri();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int lr() {
        Context contextRi;
        if (ik < 0 && (contextRi = ri()) != null) {
            ik = ViewConfiguration.get(contextRi).getScaledTouchSlop();
        }
        return ik;
    }
}
