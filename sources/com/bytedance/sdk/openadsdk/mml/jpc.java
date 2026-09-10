package com.bytedance.sdk.openadsdk.mml;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.aaj;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jpc {
    private static Method lnr = null;
    private static Method mml = null;
    private static boolean mzz = false;
    private static Method qdl;
    private static Class<?> ud;

    static {
        ud();
    }

    private static boolean lnr() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("s_i_e", 0) == 1;
    }

    public static JSONObject qdl() {
        Method method;
        List list;
        Method method2;
        Method method3;
        int i2 = Build.VERSION.SDK_INT;
        JSONObject jSONObject = null;
        if (i2 >= 35 && lnr()) {
            ud();
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.yt.qdl().getSystemService(ActivityManager.class);
                    if (activityManager != null && (method = qdl) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                        Object obj = list.get(0);
                        if (i2 >= 36 && obj != null && (method3 = lnr) != null) {
                            jSONObject2.put("start_component", ((Integer) method3.invoke(obj, new Object[0])).intValue());
                        }
                        if (obj != null && (method2 = mml) != null) {
                            jSONObject2.put("start_reason", ((Integer) method2.invoke(obj, new Object[0])).intValue());
                        }
                    }
                    return jSONObject2;
                } catch (Throwable th) {
                    th = th;
                    jSONObject = jSONObject2;
                    aaj.lnr(th.getMessage(), new Object[0]);
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return jSONObject;
    }

    private static void ud() {
        int i2;
        if (mzz || (i2 = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (lnr()) {
                qdl = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                ud = cls;
                mml = cls.getMethod("getReason", new Class[0]);
                if (i2 >= 36) {
                    lnr = ud.getMethod("getStartComponent", new Class[0]);
                }
                mzz = true;
            }
        } catch (Throwable th) {
            aaj.lnr(th.getMessage(), new Object[0]);
        }
    }
}
