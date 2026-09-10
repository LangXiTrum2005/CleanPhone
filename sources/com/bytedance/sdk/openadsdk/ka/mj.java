package com.bytedance.sdk.openadsdk.ka;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.ac;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private static boolean fi = false;
    private static Method ik;
    private static Method ka;
    private static Class<?> lr;
    private static Method ri;

    static {
        lr();
    }

    private static boolean ik() {
        return com.bytedance.sdk.openadsdk.wjv.fi.ri("s_i_e", 0) == 1;
    }

    private static void lr() {
        int i;
        if (fi || (i = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (ik()) {
                ri = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                lr = cls;
                ka = cls.getMethod("getReason", null);
                if (i >= 36) {
                    ik = lr.getMethod("getStartComponent", null);
                }
                fi = true;
            }
        } catch (Throwable th) {
            ac.ik(th.getMessage(), new Object[0]);
        }
    }

    public static JSONObject ri() {
        Method method;
        List list;
        Method method2;
        Method method3;
        int i = Build.VERSION.SDK_INT;
        JSONObject jSONObject = null;
        if (i >= 35 && ik()) {
            lr();
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.nr.ri().getSystemService(ActivityManager.class);
                    if (activityManager != null && (method = ri) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                        Object obj = list.get(0);
                        if (i >= 36 && obj != null && (method3 = ik) != null) {
                            jSONObject2.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                        }
                        if (obj != null && (method2 = ka) != null) {
                            jSONObject2.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                        }
                    }
                    return jSONObject2;
                } catch (Throwable th) {
                    th = th;
                    jSONObject = jSONObject2;
                    ac.ik(th.getMessage(), new Object[0]);
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return jSONObject;
    }
}
