package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class kqm {
    private static volatile tD<com.bytedance.sdk.openadsdk.ZU.Lxb> LD = null;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context Lxb = null;
    private static int lk = -1;

    public static class Lxb {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application Lxb;

        static {
            try {
                Object objLD = LD();
                Lxb = (Application) objLD.getClass().getMethod("getApplication", new Class[0]).invoke(objLD, new Object[0]);
                com.bytedance.sdk.component.utils.sLN.Lxb("MyApplication", "application get success");
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("MyApplication", "application get failed", th);
            }
        }

        private static Object LD() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }

        @Nullable
        public static Application Lxb() {
            return Lxb;
        }
    }

    public static com.bytedance.sdk.openadsdk.STP.lk.LD JXs() {
        return !com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb() ? com.bytedance.sdk.openadsdk.STP.lk.lk.Lxb() : com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb();
    }

    public static void LD(Context context) {
        if (Lxb == null) {
            synchronized (kqm.class) {
                try {
                    if (Lxb == null) {
                        if (context != null) {
                            Lxb = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                Lxb = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationLxb = Lxb.Lxb();
                            if (applicationLxb != null) {
                                Lxb = applicationLxb;
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

    public static Context Lxb() {
        if (Lxb == null) {
            LD(null);
        }
        return Lxb;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.lc ZU() {
        return com.bytedance.sdk.openadsdk.core.settings.VVE.TA();
    }

    public static tD<com.bytedance.sdk.openadsdk.ZU.Lxb> lk() {
        if (LD == null) {
            synchronized (kqm.class) {
                try {
                    if (LD == null) {
                        LD = new DY(Lxb);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    public static Context Lxb(Context context) {
        if (context == null) {
            context = Lxb();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int LD() {
        Context contextLxb;
        if (lk < 0 && (contextLxb = Lxb()) != null) {
            lk = ViewConfiguration.get(contextLxb).getScaledTouchSlop();
        }
        return lk;
    }
}
