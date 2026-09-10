package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.Ua;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class dzy {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.mj.lr.xha f18170co;
    private static volatile com.bytedance.sdk.component.mj.lr.xha di;
    private static volatile com.bytedance.sdk.component.mj.lr.xha fi;
    private static volatile boolean ik;
    private static volatile com.bytedance.sdk.component.mj.lr.xha jbs;
    private static volatile com.bytedance.sdk.component.mj.lr.xha ka;
    private static volatile ThreadPoolExecutor lr;
    private static volatile com.bytedance.sdk.component.mj.lr.xha mj;
    private static volatile com.bytedance.sdk.component.mj.lr.xha qt;
    private static volatile ScheduledExecutorService ri;
    private static volatile com.bytedance.sdk.component.mj.lr.xha sf;
    private static volatile com.bytedance.sdk.component.mj.lr.xha xha;

    static {
        com.bytedance.sdk.component.mj.lr.ka.ri(new com.bytedance.sdk.component.mj.lr.ri() { // from class: com.bytedance.sdk.openadsdk.utils.dzy.1
            @Override // com.bytedance.sdk.component.mj.lr.ri
            public void ri(com.bytedance.sdk.component.mj.lr.xha xhaVar, com.bytedance.sdk.component.mj.lr.ik ikVar) {
                ikVar.getName();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.mj.ri.ri(new com.bytedance.sdk.component.ri() { // from class: com.bytedance.sdk.openadsdk.utils.dzy.2
            @Override // com.bytedance.sdk.component.ri
            public void ri(Runnable runnable) {
                dzy.ik(runnable);
            }
        });
        lr = null;
        ik = false;
    }

    private static com.bytedance.sdk.component.mj.lr.xha aw() {
        com.bytedance.sdk.component.mj.lr.xha xhaVar;
        com.bytedance.sdk.component.mj.lr.xha xhaVar2 = fi;
        if (!ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            try {
                if (ri(fi)) {
                    try {
                        fi = ri("log", fi);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (fi == null) {
                        fi = bu();
                    }
                }
                xhaVar = fi;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xhaVar;
    }

    private static com.bytedance.sdk.component.mj.lr.xha bgr() {
        com.bytedance.sdk.component.mj.lr.xha xhaVar;
        com.bytedance.sdk.component.mj.lr.xha xhaVar2 = mj;
        if (!ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            try {
                if (ri(mj)) {
                    try {
                        mj = ri("image", mj);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (mj == null) {
                        mj = bu();
                    }
                }
                xhaVar = mj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xhaVar;
    }

    private static com.bytedance.sdk.component.mj.lr.xha bu() {
        com.bytedance.sdk.component.mj.lr.xha xhaVar;
        com.bytedance.sdk.component.mj.lr.xha xhaVar2 = f18170co;
        if (xhaVar2 != null) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            try {
                if (f18170co == null) {
                    try {
                        f18170co = lr(BuildConfig.FLAVOR).ri();
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                xhaVar = f18170co;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xhaVar;
    }

    private static ThreadPoolExecutor co() {
        com.bytedance.sdk.component.mj.lr.xha xhaVar;
        com.bytedance.sdk.component.mj.lr.xha xhaVar2 = ka;
        if (!ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            try {
                if (ri(ka)) {
                    try {
                        ka = ri("ad", ka);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (ka == null) {
                        ka = bu();
                    }
                }
                xhaVar = ka;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xhaVar;
    }

    public static boolean di() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ExecutorService fi() {
        return jbs();
    }

    public static ExecutorService ik() {
        return slm();
    }

    public static com.bytedance.sdk.component.mj.lr.xha jbs() {
        com.bytedance.sdk.component.mj.lr.xha xhaVar;
        com.bytedance.sdk.component.mj.lr.xha xhaVar2 = di;
        if (!ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            try {
                if (ri(di)) {
                    try {
                        di = ri("cache", di);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (di == null) {
                        di = bu();
                    }
                }
                xhaVar = di;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xhaVar;
    }

    public static ExecutorService ka() {
        return aw();
    }

    public static ExecutorService lr() {
        return bgr();
    }

    public static ExecutorService mj() {
        return vr();
    }

    public static com.bytedance.sdk.component.mj.lr.xha qt() {
        com.bytedance.sdk.component.mj.lr.xha xhaVar;
        com.bytedance.sdk.component.mj.lr.xha xhaVar2 = jbs;
        if (!ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            try {
                if (ri(jbs)) {
                    try {
                        jbs = ri("express", jbs);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (jbs == null) {
                        jbs = bu();
                    }
                }
                xhaVar = jbs;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xhaVar;
    }

    public static ScheduledExecutorService ri() {
        if (ri == null) {
            synchronized (dzy.class) {
                try {
                    if (ri == null) {
                        ri = Executors.newSingleThreadScheduledExecutor(new com.bytedance.sdk.component.mj.lr.fi("scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public static com.bytedance.sdk.component.mj.lr.xha sf() {
        com.bytedance.sdk.component.mj.lr.xha xhaVar;
        com.bytedance.sdk.component.mj.lr.xha xhaVar2 = qt;
        if (!ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            try {
                if (ri(qt)) {
                    try {
                        qt = ri("net", qt);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (qt == null) {
                        qt = bu();
                    }
                }
                xhaVar = qt;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xhaVar;
    }

    private static com.bytedance.sdk.component.mj.lr.xha slm() {
        com.bytedance.sdk.component.mj.lr.xha xhaVar;
        com.bytedance.sdk.component.mj.lr.xha xhaVar2 = sf;
        if (!ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            try {
                if (ri(sf)) {
                    try {
                        sf = ri("imgdisk", sf);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (sf == null) {
                        sf = bu();
                    }
                }
                xhaVar = sf;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xhaVar;
    }

    private static com.bytedance.sdk.component.mj.lr.xha vr() {
        com.bytedance.sdk.component.mj.lr.xha xhaVar;
        com.bytedance.sdk.component.mj.lr.xha xhaVar2 = xha;
        if (!ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            try {
                if (ri(xha)) {
                    try {
                        xha = ri("io", xha);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (xha == null) {
                        xha = bu();
                    }
                }
                xhaVar = xha;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xhaVar;
    }

    public static boolean xha() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    public static void fi(com.bytedance.sdk.component.mj.lr.ik ikVar) {
        sf().execute(ikVar);
    }

    public static void ik(Runnable runnable) {
        if (oh.ri) {
            return;
        }
        vr().execute(runnable);
    }

    public static void ka(com.bytedance.sdk.component.mj.lr.ik ikVar) {
        if (oh.ri) {
            return;
        }
        co().execute(ikVar);
    }

    public static void lr(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.vr.ik().removeCallbacks(runnable);
    }

    public static void lr(com.bytedance.sdk.component.mj.lr.ik ikVar) {
        if (ikVar == null || oh.ri) {
            return;
        }
        aw().execute(ikVar);
    }

    public static void ik(com.bytedance.sdk.component.mj.lr.ik ikVar) {
        if (ikVar == null || oh.ri) {
            return;
        }
        co().execute(ikVar);
    }

    public static void lr(com.bytedance.sdk.component.mj.lr.ik ikVar, int i) {
        if (ikVar == null || oh.ri) {
            return;
        }
        ikVar.setPriority(i);
        aw().execute(ikVar);
    }

    public static void ri(Runnable runnable) {
        if (runnable == null || oh.ri) {
            return;
        }
        if (di()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.vr.ik().post(runnable);
        }
    }

    private static com.bytedance.sdk.component.mj.lr.xha.ri lr(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        com.bytedance.sdk.component.mj.lr.xha.ri riVar = new com.bytedance.sdk.component.mj.lr.xha.ri();
        str.getClass();
        switch (str) {
            case "express":
                return riVar.ri(str).ri(2).lr(4).ik(0).ri(Ua.s).ri(true).fi(-1).ka(10).lr(false);
            case "ad":
                return riVar.ri(str).ri(4).lr(4).ik(0).ri(20000L).ri(true).fi(-1).ka(10).lr(false);
            case "io":
                return riVar.ri(str).ri(4).lr(10).ik(0).ri(20000L).ri(true).fi(-1).ka(10).lr(false);
            case "log":
                return riVar.ri(str).ri(4).lr(6).ik(2).ri(20000L).ri(true).fi(-1).ka(10).lr(false);
            case "net":
                return riVar.ri(str).ri(10).lr(10).ik(0).ri(Ua.s).ri(true).fi(-1).ka(10).lr(false);
            case "aidl":
                return riVar.ri(str).ri(2).lr(4).ik(0).ri(Ua.s).ri(true).fi(-1).ka(10).lr(false);
            case "cache":
                return riVar.ri(str).ri(0).lr(0).ik(0).ri(5000L).ri(true).fi(-1).ka(20).lr(false);
            case "image":
                return riVar.ri(str).ri(3).lr(3).ik(0).ri(20000L).ri(true).fi(-1).ka(10).lr(false);
            case "monitor":
                return riVar.ri(str).ri(2).lr(2).ik(0).ri(Ua.s).ri(true).fi(-1).ka(10).lr(false);
            case "imgdisk":
                return riVar.ri(str).ri(1).lr(2).ik(3).ri(Ua.s).ri(true).fi(-1).ka(10).lr(false);
            default:
                return riVar.ri(str).ri(8).lr(16).ik(2).ri(20000L).ri(true).fi(-1).ka(10).lr(false);
        }
    }

    public static void ri(com.bytedance.sdk.component.mj.lr.ik ikVar) {
        if (oh.ri) {
            return;
        }
        jbs().execute(ikVar);
    }

    public static void ri(com.bytedance.sdk.component.mj.lr.ik ikVar, int i) {
        if (ikVar == null || oh.ri) {
            return;
        }
        ikVar.setPriority(i);
        vr().execute(ikVar);
    }

    private static boolean ri(com.bytedance.sdk.component.mj.lr.xha xhaVar) {
        if (xhaVar != null) {
            return !xhaVar.ri() && com.bytedance.sdk.openadsdk.core.settings.sf.nbc();
        }
        return true;
    }

    private static com.bytedance.sdk.component.mj.lr.xha ri(String str, com.bytedance.sdk.component.mj.lr.xha xhaVar) {
        com.bytedance.sdk.component.mj.lr.xha.ri riVarRi = ri(str);
        if (xhaVar == null) {
            return riVarRi.ri();
        }
        xhaVar.ri(riVarRi);
        return xhaVar;
    }

    private static com.bytedance.sdk.component.mj.lr.xha.ri ri(String str) {
        com.bytedance.sdk.component.mj.lr.xha.ri riVarLr = lr(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.sf.nbc()) {
                riVarLr.lr(true);
                JSONObject jSONObjectJxw = com.bytedance.sdk.openadsdk.core.settings.sf.lr().jxw();
                JSONObject jSONObjectOptJSONObject = jSONObjectJxw != null ? jSONObjectJxw.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    riVarLr.lr(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        riVarLr.ri(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        riVarLr.lr(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        riVarLr.ik(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        riVarLr.ri(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        riVarLr.ri(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                    }
                }
            }
            return riVarLr;
        } catch (Throwable th) {
            th.getMessage();
            return riVarLr;
        }
    }
}
