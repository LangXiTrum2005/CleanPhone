package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.Z;
import com.p004ironsource.d9;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class rdp {
    public static long mzz = 0;
    public static volatile boolean qdl = false;
    private static volatile HandlerThread wd;
    public static AtomicBoolean ud = new AtomicBoolean(false);
    public static long lnr = 0;
    private static volatile int mo = 0;
    public static float mml = 1.0f;
    private static volatile Handler jpc = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.rdp.1
            boolean qdl = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.qdl) {
                    return;
                }
                this.qdl = true;
                super.start();
            }
        };
        wd = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.jpc.qdl(wd);
        mzz = System.currentTimeMillis();
    }

    public static void jpc() {
        ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rdp.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rdp.4.1
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            return Z.i(d9.a.f);
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.aaj.lnr("InitHelper", th.getMessage());
                }
            }
        });
    }

    public static Handler lnr() {
        return new Handler(Looper.getMainLooper());
    }

    public static int mml() {
        return mo;
    }

    public static void mo() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - lnr <= 10000) {
            return;
        }
        lnr = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.fco.qdl(new com.bytedance.sdk.component.jpc.jpc("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.rdp.2
            @Override // java.lang.Runnable
            public void run() {
                String strUd = com.bytedance.sdk.openadsdk.core.settings.rq.ud(yt.qdl());
                if (TextUtils.equals(strUd, com.bytedance.sdk.openadsdk.core.settings.rq.mml)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.rq.lnr().qdl(6, true);
                com.bytedance.sdk.openadsdk.core.settings.rq.mml = strUd;
            }
        });
    }

    public static boolean mzz() {
        return mml() == 1;
    }

    public static void qdl(long j) {
        mzz = j;
    }

    public static Handler ud() {
        if (wd == null || !wd.isAlive()) {
            synchronized (rdp.class) {
                try {
                    if (wd == null || !wd.isAlive()) {
                        wd = com.bytedance.sdk.component.utils.jpc.qdl("csj_init_handle", -1);
                        jpc = new Handler(wd.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (jpc == null) {
            synchronized (rdp.class) {
                try {
                    if (jpc == null) {
                        jpc = new Handler(wd.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpc;
    }

    public static void wd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - lnr <= 10000) {
            return;
        }
        synchronized (rdp.class) {
            try {
                if (jElapsedRealtime - lnr <= 10000) {
                    return;
                }
                lnr = jElapsedRealtime;
                com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rdp.3
                    @Override // java.lang.Runnable
                    public void run() {
                        String strUd = com.bytedance.sdk.openadsdk.core.settings.rq.ud(yt.qdl());
                        if (TextUtils.equals(strUd, com.bytedance.sdk.openadsdk.core.settings.rq.mml)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.settings.rq.lnr().qdl(6, true);
                        com.bytedance.sdk.openadsdk.core.settings.rq.mml = strUd;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long qdl() {
        return mzz;
    }

    public static void qdl(int i2) {
        mo = i2;
    }

    public static void qdl(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    tvp.ud().ud(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("InitHelper", th.getMessage());
        }
    }
}
