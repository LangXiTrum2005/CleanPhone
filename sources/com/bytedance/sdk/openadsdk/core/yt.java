package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class yt {
    private static int lnr = -1;
    private static volatile Context qdl;
    private static volatile oth<com.bytedance.sdk.openadsdk.mml.qdl> ud;

    public static class qdl {
        private static volatile Application qdl;

        static {
            try {
                Object objUd = ud();
                qdl = (Application) objUd.getClass().getMethod("getApplication", new Class[0]).invoke(objUd, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.qdl("MyApplication", "application get failed", th);
            }
        }

        public static Application qdl() {
            return qdl;
        }

        private static Object ud() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.qdl("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }

    public static oth<com.bytedance.sdk.openadsdk.mml.qdl> lnr() {
        if (ud == null) {
            synchronized (yt.class) {
                try {
                    if (ud == null) {
                        ud = new ljh(qdl);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ud;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.rq mml() {
        return com.bytedance.sdk.openadsdk.core.settings.rq.lnr();
    }

    public static com.bytedance.sdk.openadsdk.bjy.lnr.lnr mzz() {
        return !com.bytedance.sdk.openadsdk.core.settings.wd.qdl() ? com.bytedance.sdk.openadsdk.bjy.lnr.mml.qdl() : com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl();
    }

    public static Context qdl() {
        if (qdl == null) {
            ud(null);
        }
        return qdl;
    }

    public static void ud(Context context) {
        if (qdl == null) {
            synchronized (yt.class) {
                try {
                    if (qdl == null) {
                        if (context != null) {
                            qdl = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                qdl = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationQdl = qdl.qdl();
                            if (applicationQdl != null) {
                                qdl = applicationQdl;
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

    public static Context qdl(Context context) {
        if (context == null) {
            context = qdl();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int ud() {
        Context contextQdl;
        if (lnr < 0 && (contextQdl = qdl()) != null) {
            lnr = ViewConfiguration.get(contextQdl).getScaledTouchSlop();
        }
        return lnr;
    }
}
