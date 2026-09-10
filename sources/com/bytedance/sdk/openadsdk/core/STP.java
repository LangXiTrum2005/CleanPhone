package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class STP {
    public static long JXs = 0;
    public static volatile boolean Lxb = false;
    private static volatile HandlerThread ebl;
    public static AtomicBoolean LD = new AtomicBoolean(false);
    public static long lk = 0;
    private static volatile int lc = 0;
    public static float ZU = 1.0f;
    private static volatile Handler OY = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10);
        ebl = handlerThread;
        handlerThread.start();
        JXs = System.currentTimeMillis();
    }

    public static boolean JXs() {
        return ZU() == 1;
    }

    public static Handler LD() {
        if (ebl == null || !ebl.isAlive()) {
            synchronized (STP.class) {
                try {
                    if (ebl == null || !ebl.isAlive()) {
                        HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                        ebl = handlerThread;
                        handlerThread.start();
                        OY = new Handler(ebl.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (OY == null) {
            synchronized (STP.class) {
                try {
                    if (OY == null) {
                        OY = new Handler(ebl.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return OY;
    }

    public static void Lxb(long j) {
        JXs = j;
    }

    public static void OY() {
        LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.STP.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.VVE.lk.Lxb(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.STP.3.1
                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                            return AbstractC3950lJ.l("init");
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("InitHelper", th.getMessage());
                }
            }
        });
    }

    public static int ZU() {
        return lc;
    }

    public static void ebl() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - lk <= WorkRequest.MIN_BACKOFF_MILLIS) {
            return;
        }
        synchronized (STP.class) {
            try {
                if (jElapsedRealtime - lk <= WorkRequest.MIN_BACKOFF_MILLIS) {
                    return;
                }
                lk = jElapsedRealtime;
                com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.STP.2
                    @Override // java.lang.Runnable
                    public void run() {
                        String strLk = com.bytedance.sdk.openadsdk.core.settings.VVE.lk(kqm.Lxb());
                        if (TextUtils.equals(strLk, com.bytedance.sdk.openadsdk.core.settings.VVE.ZU)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(6, true);
                        com.bytedance.sdk.openadsdk.core.settings.VVE.ZU = strLk;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void lc() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - lk <= WorkRequest.MIN_BACKOFF_MILLIS) {
            return;
        }
        lk = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.hg.Lxb(new com.bytedance.sdk.component.OY.OY("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.STP.1
            @Override // java.lang.Runnable
            public void run() {
                String strLk = com.bytedance.sdk.openadsdk.core.settings.VVE.lk(kqm.Lxb());
                if (TextUtils.equals(strLk, com.bytedance.sdk.openadsdk.core.settings.VVE.ZU)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(6, true);
                com.bytedance.sdk.openadsdk.core.settings.VVE.ZU = strLk;
            }
        });
    }

    public static Handler lk() {
        return new Handler(Looper.getMainLooper());
    }

    public static long Lxb() {
        return JXs;
    }

    public static void Lxb(int i) {
        lc = i;
    }

    public static void Lxb(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    QAg.LD().LD(jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE, ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("InitHelper", th.getMessage());
        }
    }
}
