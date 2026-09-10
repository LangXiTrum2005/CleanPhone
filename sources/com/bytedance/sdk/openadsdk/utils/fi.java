package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private static boolean ik;
    private static long lr;
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.wjv> ri;

    public static boolean ik() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.wjv> weakReference = ri;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        ik = true;
        return true;
    }

    private static void lr(final long j) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.wjv> weakReference = ri;
        if (weakReference == null || j <= 0 || (wjvVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, wjvVar.fi(), "store_duration", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.utils.fi.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        ri = null;
        ik = false;
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        com.bytedance.sdk.openadsdk.core.model.di diVarTyz = wjvVar.tyz();
        if (diVarTyz == null || TextUtils.isEmpty(diVarTyz.ri())) {
            return;
        }
        ri = new WeakReference<>(wjvVar);
    }

    public static void ri(long j) {
        lr(j);
    }

    public static void lr() {
        if (ri == null || ik) {
            return;
        }
        lr = SystemClock.elapsedRealtime();
    }

    public static void ri() {
        if (ri == null || ik) {
            return;
        }
        if (lr > 0) {
            lr(SystemClock.elapsedRealtime() - lr);
        }
        ri = null;
        lr = 0L;
    }
}
