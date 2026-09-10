package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.Ua;
import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class vr {
    private static volatile HandlerThread di = null;
    public static long ik = 0;
    public static long ka = 0;
    private static final Runnable mj;
    public static volatile boolean ri = false;
    public static AtomicBoolean lr = new AtomicBoolean(false);
    private static volatile int fi = 0;
    private static volatile Handler xha = null;

    static {
        HandlerThread handlerThread = new HandlerThread("pag_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.vr.1
            boolean ri = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.ri) {
                    return;
                }
                this.ri = true;
                super.start();
            }
        };
        di = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.mj.ri(di);
        ka = System.currentTimeMillis();
        mj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vr.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.settings.sf.lr().ud()) {
                    vr.di();
                    return;
                }
                String strLr = com.bytedance.sdk.openadsdk.core.settings.sf.lr(nr.ri());
                int iRi = com.bytedance.sdk.openadsdk.core.settings.sf.ri(nr.ri());
                if (!TextUtils.equals(strLr, com.bytedance.sdk.openadsdk.core.settings.sf.ka) || iRi != com.bytedance.sdk.openadsdk.core.settings.sf.fi) {
                    com.bytedance.sdk.openadsdk.core.settings.sf.lr().ri(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.sf.ka = strLr;
                    com.bytedance.sdk.openadsdk.core.settings.sf.fi = iRi;
                }
                vr.di();
            }
        };
    }

    public static void di() {
        Handler handlerLr = lr();
        Runnable runnable = mj;
        handlerLr.removeCallbacks(runnable);
        lr().postDelayed(runnable, Ua.s);
    }

    public static boolean fi() {
        return ka() == 1;
    }

    public static Handler ik() {
        return new Handler(Looper.getMainLooper());
    }

    public static int ka() {
        return fi;
    }

    public static Handler lr() {
        if (di == null || !di.isAlive()) {
            synchronized (vr.class) {
                try {
                    if (di == null || !di.isAlive()) {
                        di = com.bytedance.sdk.component.utils.mj.ri("pag_init_handle", -1);
                        xha = new Handler(di.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (xha == null) {
            synchronized (vr.class) {
                try {
                    if (xha == null) {
                        xha = new Handler(di.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return xha;
    }

    public static void ri(long j) {
        ka = j;
    }

    public static void xha() {
        lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vr.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.vr.3.1
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr(X3.a.f);
                            return riVar;
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ik("InitHelper", th.getMessage());
                }
            }
        });
    }

    public static long ri() {
        return ka;
    }

    public static void ri(int i) {
        fi = i;
    }

    public static void ri(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    qt.lr().lr(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("InitHelper", th.getMessage());
        }
    }
}
