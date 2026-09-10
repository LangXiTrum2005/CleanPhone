package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.umeng.analytics.pro.bc;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class hg {
    private static volatile com.bytedance.sdk.component.OY.lk.lc JXs;
    private static volatile boolean LD;
    private static volatile ThreadPoolExecutor Lxb;
    private static volatile com.bytedance.sdk.component.OY.lk.lc OY;
    private static volatile com.bytedance.sdk.component.OY.lk.lc QAg;
    private static volatile com.bytedance.sdk.component.OY.lk.lc ZU;
    private static volatile com.bytedance.sdk.component.OY.lk.lc ebl;
    private static volatile com.bytedance.sdk.component.OY.lk.lc lc;
    private static volatile com.bytedance.sdk.component.OY.lk.lc lk;
    private static volatile com.bytedance.sdk.component.OY.lk.lc nBu;

    static {
        com.bytedance.sdk.component.OY.lk.lk.Lxb(new com.bytedance.sdk.component.OY.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.utils.hg.1
            @Override // com.bytedance.sdk.component.OY.lk.Lxb
            public void Lxb(com.bytedance.sdk.component.OY.lk.lc lcVar, com.bytedance.sdk.component.OY.lk.LD ld) {
                ld.LD();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.OY.lk.lk.Lxb(new com.bytedance.sdk.component.OY.lk.JXs() { // from class: com.bytedance.sdk.openadsdk.utils.hg.3
            @Override // com.bytedance.sdk.component.OY.lk.JXs
            public void Lxb(final com.bytedance.sdk.component.OY.lk.lc lcVar) {
                if (Ivz.Lxb || lcVar == null) {
                    return;
                }
                try {
                    LinkedHashMap<String, com.bytedance.sdk.component.OY.lk.Lxb.Lxb> linkedHashMapLxb = lcVar.Lxb();
                    if (linkedHashMapLxb == null || linkedHashMapLxb.size() <= 0) {
                        return;
                    }
                    Iterator<Map.Entry<String, com.bytedance.sdk.component.OY.lk.Lxb.Lxb>> it = linkedHashMapLxb.entrySet().iterator();
                    while (it.hasNext()) {
                        final com.bytedance.sdk.component.OY.lk.Lxb.Lxb value = it.next().getValue();
                        if (value != null) {
                            com.bytedance.sdk.openadsdk.STP.lk.Lxb();
                            com.bytedance.sdk.openadsdk.STP.lk.Lxb("pag_thread_pool_state", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.utils.hg.3.1
                                @Override // com.bytedance.sdk.openadsdk.STP.LD
                                public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("name", value.Lxb());
                                        jSONObject.put("times", value.LD());
                                        jSONObject.put("runMaxTime", value.lc());
                                        jSONObject.put("waitMaxTime", value.JXs());
                                        long jLD = value.LD() == 0 ? 1 : value.LD();
                                        jSONObject.put("avgRunTime", value.ZU() / jLD);
                                        jSONObject.put("avgWaitTime", value.lk() / jLD);
                                        jSONObject.put("poolType", lcVar.LD());
                                    } catch (Exception e) {
                                        com.bytedance.sdk.component.utils.sLN.Lxb("ThreadUtils", "run: ", e);
                                    }
                                    return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("pag_thread_pool_state").LD(jSONObject.toString());
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
        Lxb = null;
        LD = false;
    }

    private static com.bytedance.sdk.component.OY.lk.lc IeN() {
        com.bytedance.sdk.component.OY.lk.lc lcVar;
        com.bytedance.sdk.component.OY.lk.lc lcVar2 = JXs;
        if (!Lxb(lcVar2)) {
            return lcVar2;
        }
        synchronized (hg.class) {
            try {
                if (Lxb(JXs)) {
                    try {
                        JXs = Lxb("aidl", JXs);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                lcVar = JXs;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lcVar;
    }

    public static boolean JVA() {
        if (com.bytedance.sdk.openadsdk.core.settings.VVE.Bj()) {
            return com.bytedance.sdk.openadsdk.core.settings.VVE.TA().gS();
        }
        return true;
    }

    public static boolean JXs() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ExecutorService LD() {
        return JVA() ? VVE() : com.bytedance.sdk.component.OY.lc.nBu();
    }

    public static ScheduledExecutorService Lxb() {
        return com.bytedance.sdk.component.OY.lc.lc();
    }

    private static ThreadPoolExecutor NXR() {
        com.bytedance.sdk.component.OY.lk.lc lcVar;
        com.bytedance.sdk.component.OY.lk.lc lcVar2 = lk;
        if (!Lxb(lcVar2)) {
            return lcVar2;
        }
        synchronized (hg.class) {
            try {
                if (Lxb(lk)) {
                    try {
                        lk = Lxb(bc.aC, lk);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                lcVar = lk;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lcVar;
    }

    public static com.bytedance.sdk.component.OY.lk.lc OY() {
        com.bytedance.sdk.component.OY.lk.lc lcVar;
        com.bytedance.sdk.component.OY.lk.lc lcVar2 = lc;
        if (!Lxb(lcVar2)) {
            return lcVar2;
        }
        synchronized (hg.class) {
            try {
                if (Lxb(lc)) {
                    try {
                        lc = Lxb("cache", lc);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                lcVar = lc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lcVar;
    }

    public static com.bytedance.sdk.component.OY.lk.lc QAg() {
        com.bytedance.sdk.component.OY.lk.lc lcVar;
        com.bytedance.sdk.component.OY.lk.lc lcVar2 = QAg;
        if (!Lxb(lcVar2)) {
            return lcVar2;
        }
        synchronized (hg.class) {
            try {
                if (Lxb(QAg)) {
                    try {
                        QAg = Lxb("express", QAg);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                lcVar = QAg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lcVar;
    }

    private static com.bytedance.sdk.component.OY.lk.lc STP() {
        com.bytedance.sdk.component.OY.lk.lc lcVar;
        com.bytedance.sdk.component.OY.lk.lc lcVar2 = ZU;
        if (!Lxb(lcVar2)) {
            return lcVar2;
        }
        synchronized (hg.class) {
            try {
                if (Lxb(ZU)) {
                    try {
                        ZU = Lxb("log", ZU);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                lcVar = ZU;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lcVar;
    }

    private static com.bytedance.sdk.component.OY.lk.lc VVE() {
        com.bytedance.sdk.component.OY.lk.lc lcVar;
        com.bytedance.sdk.component.OY.lk.lc lcVar2 = OY;
        if (!Lxb(lcVar2)) {
            return lcVar2;
        }
        synchronized (hg.class) {
            try {
                if (Lxb(OY)) {
                    try {
                        OY = Lxb("image", OY);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                lcVar = OY;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lcVar;
    }

    public static ExecutorService ZU() {
        return JVA() ? OY() : com.bytedance.sdk.component.OY.lc.LD();
    }

    public static ExecutorService ebl() {
        return JVA() ? kqm() : com.bytedance.sdk.component.OY.lc.lk();
    }

    private static com.bytedance.sdk.component.OY.lk.lc kqm() {
        com.bytedance.sdk.component.OY.lk.lc lcVar;
        com.bytedance.sdk.component.OY.lk.lc lcVar2 = ebl;
        if (!Lxb(lcVar2)) {
            return lcVar2;
        }
        synchronized (hg.class) {
            try {
                if (Lxb(ebl)) {
                    try {
                        ebl = Lxb("io", ebl);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                lcVar = ebl;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lcVar;
    }

    public static boolean lc() {
        String str = JVA() ? "pag_log" : "csj_log";
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    public static ExecutorService lk() {
        return JVA() ? STP() : com.bytedance.sdk.component.OY.lc.ZU();
    }

    public static com.bytedance.sdk.component.OY.lk.lc nBu() {
        com.bytedance.sdk.component.OY.lk.lc lcVar;
        com.bytedance.sdk.component.OY.lk.lc lcVar2 = nBu;
        if (!Lxb(lcVar2)) {
            return lcVar2;
        }
        synchronized (hg.class) {
            try {
                if (Lxb(nBu)) {
                    try {
                        nBu = Lxb("net", nBu);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                lcVar = nBu;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lcVar;
    }

    private static ThreadPoolExecutor sLN() {
        int i;
        if (Lxb == null) {
            synchronized (hg.class) {
                try {
                    if (Lxb == null) {
                        if (com.bytedance.sdk.openadsdk.core.settings.VVE.Bj()) {
                            int iWi = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Wi();
                            LD = true;
                            i = iWi;
                        } else {
                            i = 4;
                        }
                        Lxb = new ThreadPoolExecutor(i, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public static void JXs(final com.bytedance.sdk.component.OY.OY oy) {
        if (Ivz.Lxb) {
            return;
        }
        if (JVA()) {
            NXR().execute(new com.bytedance.sdk.component.OY.lk.LD(oy.getName(), oy) { // from class: com.bytedance.sdk.openadsdk.utils.hg.2
                @Override // java.lang.Runnable
                public void run() {
                    oy.run();
                }
            });
            return;
        }
        ThreadPoolExecutor threadPoolExecutorSLN = sLN();
        threadPoolExecutorSLN.execute(oy);
        if (LD || !com.bytedance.sdk.openadsdk.core.settings.VVE.Bj()) {
            return;
        }
        LD = true;
        threadPoolExecutorSLN.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Wi());
    }

    public static void Lxb(Runnable runnable) {
        if (runnable == null || Ivz.Lxb) {
            return;
        }
        if (JXs()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.STP.lk().post(runnable);
        }
    }

    public static void LD(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.STP.lk().removeCallbacks(runnable);
    }

    public static void ZU(final com.bytedance.sdk.component.OY.OY oy) {
        if (oy == null || Ivz.Lxb) {
            return;
        }
        if (JVA()) {
            NXR().execute(new com.bytedance.sdk.component.OY.lk.LD(oy.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.hg.9
                @Override // java.lang.Runnable
                public void run() {
                    oy.run();
                }
            });
        } else {
            com.bytedance.sdk.component.OY.lc.JXs(oy);
        }
    }

    public static void lk(final com.bytedance.sdk.component.OY.OY oy) {
        if (oy == null || Ivz.Lxb) {
            return;
        }
        if (JVA()) {
            STP().execute(new com.bytedance.sdk.component.OY.lk.LD(oy.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.hg.7
                @Override // java.lang.Runnable
                public void run() {
                    oy.run();
                }
            });
        } else {
            com.bytedance.sdk.component.OY.lc.lk(oy);
        }
    }

    public static void LD(final com.bytedance.sdk.component.OY.OY oy) {
        if (Ivz.Lxb) {
            return;
        }
        if (JVA()) {
            kqm().execute(new com.bytedance.sdk.component.OY.lk.LD(oy.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.hg.5
                @Override // java.lang.Runnable
                public void run() {
                    oy.run();
                }
            });
        } else {
            com.bytedance.sdk.component.OY.lc.LD(oy);
        }
    }

    public static void Lxb(final com.bytedance.sdk.component.OY.OY oy) {
        if (Ivz.Lxb) {
            return;
        }
        if (JVA()) {
            OY().execute(new com.bytedance.sdk.component.OY.lk.LD(oy.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.hg.4
                @Override // java.lang.Runnable
                public void run() {
                    oy.run();
                }
            });
        } else {
            com.bytedance.sdk.component.OY.lc.Lxb(oy);
        }
    }

    public static void lk(final com.bytedance.sdk.component.OY.OY oy, int i) {
        if (oy == null || Ivz.Lxb) {
            return;
        }
        if (JVA()) {
            IeN().execute(new com.bytedance.sdk.component.OY.lk.LD(oy.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.hg.10
                @Override // java.lang.Runnable
                public void run() {
                    oy.run();
                }
            });
        } else {
            com.bytedance.sdk.component.OY.lc.lk(oy, i);
        }
    }

    public static void LD(final com.bytedance.sdk.component.OY.OY oy, int i) {
        if (oy == null || Ivz.Lxb) {
            return;
        }
        if (JVA()) {
            com.bytedance.sdk.component.OY.lk.LD ld = new com.bytedance.sdk.component.OY.lk.LD(oy.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.hg.8
                @Override // java.lang.Runnable
                public void run() {
                    oy.run();
                }
            };
            ld.Lxb(i);
            STP().execute(ld);
            return;
        }
        com.bytedance.sdk.component.OY.lc.LD(oy, i);
    }

    public static void Lxb(final com.bytedance.sdk.component.OY.OY oy, int i) {
        if (oy == null || Ivz.Lxb) {
            return;
        }
        if (JVA()) {
            com.bytedance.sdk.component.OY.lk.LD ld = new com.bytedance.sdk.component.OY.lk.LD(oy.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.hg.6
                @Override // java.lang.Runnable
                public void run() {
                    oy.run();
                }
            };
            ld.Lxb(i);
            kqm().execute(ld);
            return;
        }
        com.bytedance.sdk.component.OY.lc.Lxb(oy, 5, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    private static com.bytedance.sdk.component.OY.lk.lc.Lxb LD(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        com.bytedance.sdk.component.OY.lk.lc.Lxb lxb = new com.bytedance.sdk.component.OY.lk.lc.Lxb();
        str.getClass();
        switch (str) {
            case "express":
                return lxb.Lxb(str).Lxb(2).LD(4).lk(0).Lxb(WorkRequest.MIN_BACKOFF_MILLIS).Lxb(true).JXs(-1).ZU(10).LD(false);
            case "ad":
                return lxb.Lxb(str).Lxb(4).LD(4).lk(0).Lxb(20000L).Lxb(true).JXs(-1).ZU(10).LD(false);
            case "io":
                return lxb.Lxb(str).Lxb(4).LD(10).lk(0).Lxb(20000L).Lxb(true).JXs(-1).ZU(10).LD(false);
            case "log":
                return lxb.Lxb(str).Lxb(4).LD(6).lk(2).Lxb(20000L).Lxb(true).JXs(-1).ZU(10).LD(false);
            case "net":
                return lxb.Lxb(str).Lxb(10).LD(10).lk(0).Lxb(WorkRequest.MIN_BACKOFF_MILLIS).Lxb(true).JXs(-1).ZU(10).LD(false);
            case "aidl":
                return lxb.Lxb(str).Lxb(2).LD(4).lk(0).Lxb(WorkRequest.MIN_BACKOFF_MILLIS).Lxb(true).JXs(-1).ZU(10).LD(false);
            case "cache":
                return lxb.Lxb(str).Lxb(0).LD(0).lk(0).Lxb(5000L).Lxb(true).JXs(-1).ZU(20).LD(false);
            case "image":
                return lxb.Lxb(str).Lxb(3).LD(3).lk(0).Lxb(20000L).Lxb(true).JXs(-1).ZU(10).LD(false);
            case "monitor":
                return lxb.Lxb(str).Lxb(2).LD(2).lk(0).Lxb(WorkRequest.MIN_BACKOFF_MILLIS).Lxb(true).JXs(-1).ZU(10).LD(false);
            default:
                return lxb.Lxb(str).Lxb(8).LD(16).lk(2).Lxb(20000L).Lxb(true).JXs(-1).ZU(10).LD(false);
        }
    }

    public static void Lxb(com.bytedance.sdk.component.OY.lk.LD ld) {
        nBu().execute(ld);
    }

    private static boolean Lxb(com.bytedance.sdk.component.OY.lk.lc lcVar) {
        if (lcVar != null) {
            return !lcVar.lk() && com.bytedance.sdk.openadsdk.core.settings.VVE.Bj();
        }
        return true;
    }

    private static com.bytedance.sdk.component.OY.lk.lc Lxb(String str, com.bytedance.sdk.component.OY.lk.lc lcVar) {
        com.bytedance.sdk.component.OY.lk.lc.Lxb Lxb2 = Lxb(str);
        if (lcVar == null) {
            return Lxb2.Lxb();
        }
        lcVar.Lxb(Lxb2);
        return lcVar;
    }

    private static com.bytedance.sdk.component.OY.lk.lc.Lxb Lxb(String str) {
        com.bytedance.sdk.component.OY.lk.lc.Lxb lxbLD = LD(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.VVE.Bj()) {
                lxbLD.LD(true);
                JSONObject jSONObjectWPa = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().wPa();
                JSONObject jSONObjectOptJSONObject = jSONObjectWPa != null ? jSONObjectWPa.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    lxbLD.LD(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        lxbLD.Lxb(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        lxbLD.LD(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        lxbLD.lk(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        lxbLD.Lxb(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        lxbLD.Lxb(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        lxbLD.JXs(jSONObjectOptJSONObject.optInt("reportLogThreshold"));
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        lxbLD.ZU(jSONObjectOptJSONObject.optInt("logTaskCount"));
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return lxbLD;
    }
}
