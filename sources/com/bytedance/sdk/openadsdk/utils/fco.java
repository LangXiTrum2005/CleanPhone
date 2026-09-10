package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.smartdigimkt.q0.b;
import com.smartdigimkt.x.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fco {
    private static volatile com.bytedance.sdk.component.jpc.lnr.mo jpc;
    private static volatile com.bytedance.sdk.component.jpc.lnr.mo lnr;
    private static volatile com.bytedance.sdk.component.jpc.lnr.mo mml;
    private static volatile com.bytedance.sdk.component.jpc.lnr.mo mo;
    private static volatile com.bytedance.sdk.component.jpc.lnr.mo mzz;
    private static volatile ThreadPoolExecutor qdl;
    private static volatile com.bytedance.sdk.component.jpc.lnr.mo rq;
    private static volatile com.bytedance.sdk.component.jpc.lnr.mo to;
    private static volatile com.bytedance.sdk.component.jpc.lnr.mo tvp;
    private static volatile boolean ud;
    private static volatile com.bytedance.sdk.component.jpc.lnr.mo wd;

    static {
        com.bytedance.sdk.component.jpc.lnr.lnr.qdl(new com.bytedance.sdk.component.jpc.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.utils.fco.1
            @Override // com.bytedance.sdk.component.jpc.lnr.qdl
            public void qdl(com.bytedance.sdk.component.jpc.lnr.mo moVar, com.bytedance.sdk.component.jpc.lnr.ud udVar) {
                udVar.ud();
                new RuntimeException();
            }
        });
        qdl = null;
        ud = false;
    }

    private static com.bytedance.sdk.component.jpc.lnr.mo bjy() {
        com.bytedance.sdk.component.jpc.lnr.mo moVar;
        com.bytedance.sdk.component.jpc.lnr.mo moVar2 = mml;
        if (!qdl(moVar2)) {
            return moVar2;
        }
        synchronized (fco.class) {
            try {
                if (qdl(mml)) {
                    try {
                        mml = qdl("log", mml);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                moVar = mml;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return moVar;
    }

    private static com.bytedance.sdk.component.jpc.lnr.mo exc() {
        com.bytedance.sdk.component.jpc.lnr.mo moVar;
        com.bytedance.sdk.component.jpc.lnr.mo moVar2 = rq;
        if (!qdl(moVar2)) {
            return moVar2;
        }
        synchronized (fco.class) {
            try {
                if (qdl(rq)) {
                    try {
                        rq = qdl("imgdisk", rq);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                moVar = rq;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return moVar;
    }

    private static ThreadPoolExecutor exu() {
        int iJyq;
        if (qdl == null) {
            synchronized (fco.class) {
                try {
                    if (qdl == null) {
                        if (com.bytedance.sdk.openadsdk.core.settings.rq.lme()) {
                            iJyq = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().jyq();
                            ud = true;
                        } else {
                            iJyq = 4;
                        }
                        qdl = new ThreadPoolExecutor(iJyq, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public static boolean fs() {
        if (com.bytedance.sdk.openadsdk.core.settings.rq.lme()) {
            return com.bytedance.sdk.openadsdk.core.settings.rq.lnr().blf();
        }
        return true;
    }

    private static com.bytedance.sdk.component.jpc.lnr.mo jl() {
        com.bytedance.sdk.component.jpc.lnr.mo moVar;
        com.bytedance.sdk.component.jpc.lnr.mo moVar2 = wd;
        if (!qdl(moVar2)) {
            return moVar2;
        }
        synchronized (fco.class) {
            try {
                if (qdl(wd)) {
                    try {
                        wd = qdl("io", wd);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                moVar = wd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return moVar;
    }

    public static ExecutorService jpc() {
        return fs() ? jl() : com.bytedance.sdk.component.jpc.mo.lnr();
    }

    private static com.bytedance.sdk.component.jpc.lnr.mo jtx() {
        com.bytedance.sdk.component.jpc.lnr.mo moVar;
        com.bytedance.sdk.component.jpc.lnr.mo moVar2 = mzz;
        if (!qdl(moVar2)) {
            return moVar2;
        }
        synchronized (fco.class) {
            try {
                if (qdl(mzz)) {
                    try {
                        mzz = qdl("aidl", mzz);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                moVar = mzz;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return moVar;
    }

    public static ExecutorService lnr() {
        return fs() ? exc() : com.bytedance.sdk.component.jpc.mo.lnr();
    }

    public static ExecutorService mml() {
        return fs() ? bjy() : com.bytedance.sdk.component.jpc.mo.mml();
    }

    public static boolean mo() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ExecutorService mzz() {
        return fs() ? tvp() : com.bytedance.sdk.component.jpc.mo.ud();
    }

    public static ScheduledExecutorService qdl() {
        return com.bytedance.sdk.component.jpc.mo.mo();
    }

    private static ThreadPoolExecutor rdp() {
        com.bytedance.sdk.component.jpc.lnr.mo moVar;
        com.bytedance.sdk.component.jpc.lnr.mo moVar2 = lnr;
        if (!qdl(moVar2)) {
            return moVar2;
        }
        synchronized (fco.class) {
            try {
                if (qdl(lnr)) {
                    try {
                        lnr = qdl("ad", lnr);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                moVar = lnr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return moVar;
    }

    public static com.bytedance.sdk.component.jpc.lnr.mo rq() {
        com.bytedance.sdk.component.jpc.lnr.mo moVar;
        com.bytedance.sdk.component.jpc.lnr.mo moVar2 = to;
        if (!qdl(moVar2)) {
            return moVar2;
        }
        synchronized (fco.class) {
            try {
                if (qdl(to)) {
                    try {
                        to = qdl("net", to);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                moVar = to;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return moVar;
    }

    public static com.bytedance.sdk.component.jpc.lnr.mo to() {
        com.bytedance.sdk.component.jpc.lnr.mo moVar;
        com.bytedance.sdk.component.jpc.lnr.mo moVar2 = tvp;
        if (!qdl(moVar2)) {
            return moVar2;
        }
        synchronized (fco.class) {
            try {
                if (qdl(tvp)) {
                    try {
                        tvp = qdl("express", tvp);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                moVar = tvp;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return moVar;
    }

    public static com.bytedance.sdk.component.jpc.lnr.mo tvp() {
        com.bytedance.sdk.component.jpc.lnr.mo moVar;
        com.bytedance.sdk.component.jpc.lnr.mo moVar2 = mo;
        if (!qdl(moVar2)) {
            return moVar2;
        }
        synchronized (fco.class) {
            try {
                if (qdl(mo)) {
                    try {
                        mo = qdl(b.O, mo);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                moVar = mo;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return moVar;
    }

    public static ExecutorService ud() {
        return fs() ? yt() : com.bytedance.sdk.component.jpc.mo.to();
    }

    public static boolean wd() {
        String str = fs() ? "pag_log" : "csj_log";
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    private static com.bytedance.sdk.component.jpc.lnr.mo yt() {
        com.bytedance.sdk.component.jpc.lnr.mo moVar;
        com.bytedance.sdk.component.jpc.lnr.mo moVar2 = jpc;
        if (!qdl(moVar2)) {
            return moVar2;
        }
        synchronized (fco.class) {
            try {
                if (qdl(jpc)) {
                    try {
                        jpc = qdl(d.c.k, jpc);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                moVar = jpc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return moVar;
    }

    public static void qdl(Runnable runnable) {
        if (runnable == null || ekw.qdl) {
            return;
        }
        if (mo()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.rdp.lnr().post(runnable);
        }
    }

    public static void lnr(final com.bytedance.sdk.component.jpc.jpc jpcVar) {
        if (jpcVar == null || ekw.qdl) {
            return;
        }
        if (fs()) {
            bjy().execute(new com.bytedance.sdk.component.jpc.lnr.ud(jpcVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.fco.5
                @Override // java.lang.Runnable
                public void run() {
                    jpcVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.jpc.mo.lnr(jpcVar);
        }
    }

    public static void mml(final com.bytedance.sdk.component.jpc.jpc jpcVar) {
        if (jpcVar == null || ekw.qdl) {
            return;
        }
        if (fs()) {
            rdp().execute(new com.bytedance.sdk.component.jpc.lnr.ud(jpcVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.fco.7
                @Override // java.lang.Runnable
                public void run() {
                    jpcVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.jpc.mo.mzz(jpcVar);
        }
    }

    public static void mzz(final com.bytedance.sdk.component.jpc.jpc jpcVar) {
        if (ekw.qdl) {
            return;
        }
        if (fs()) {
            rdp().execute(new com.bytedance.sdk.component.jpc.lnr.ud(jpcVar.getName(), jpcVar) { // from class: com.bytedance.sdk.openadsdk.utils.fco.9
                @Override // java.lang.Runnable
                public void run() {
                    jpcVar.run();
                }
            });
            return;
        }
        ThreadPoolExecutor threadPoolExecutorExu = exu();
        threadPoolExecutorExu.execute(jpcVar);
        if (ud || !com.bytedance.sdk.openadsdk.core.settings.rq.lme()) {
            return;
        }
        ud = true;
        threadPoolExecutorExu.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.rq.lnr().jyq());
    }

    public static void ud(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.rdp.lnr().removeCallbacks(runnable);
    }

    public static void ud(final com.bytedance.sdk.component.jpc.jpc jpcVar) {
        if (ekw.qdl) {
            return;
        }
        if (fs()) {
            jl().execute(new com.bytedance.sdk.component.jpc.lnr.ud(jpcVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.fco.3
                @Override // java.lang.Runnable
                public void run() {
                    jpcVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.jpc.mo.ud(jpcVar);
        }
    }

    public static void qdl(final com.bytedance.sdk.component.jpc.jpc jpcVar) {
        if (ekw.qdl) {
            return;
        }
        if (fs()) {
            tvp().execute(new com.bytedance.sdk.component.jpc.lnr.ud(jpcVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.fco.2
                @Override // java.lang.Runnable
                public void run() {
                    jpcVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.jpc.mo.qdl(jpcVar);
        }
    }

    public static void lnr(final com.bytedance.sdk.component.jpc.jpc jpcVar, int i2) {
        if (jpcVar == null || ekw.qdl) {
            return;
        }
        if (fs()) {
            jtx().execute(new com.bytedance.sdk.component.jpc.lnr.ud(jpcVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.fco.8
                @Override // java.lang.Runnable
                public void run() {
                    jpcVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.jpc.mo.lnr(jpcVar, i2);
        }
    }

    public static void ud(final com.bytedance.sdk.component.jpc.jpc jpcVar, int i2) {
        if (jpcVar == null || ekw.qdl) {
            return;
        }
        if (fs()) {
            com.bytedance.sdk.component.jpc.lnr.ud udVar = new com.bytedance.sdk.component.jpc.lnr.ud(jpcVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.fco.6
                @Override // java.lang.Runnable
                public void run() {
                    jpcVar.run();
                }
            };
            udVar.qdl(i2);
            bjy().execute(udVar);
            return;
        }
        com.bytedance.sdk.component.jpc.mo.ud(jpcVar, i2);
    }

    public static void qdl(final com.bytedance.sdk.component.jpc.jpc jpcVar, int i2) {
        if (jpcVar == null || ekw.qdl) {
            return;
        }
        if (fs()) {
            com.bytedance.sdk.component.jpc.lnr.ud udVar = new com.bytedance.sdk.component.jpc.lnr.ud(jpcVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.fco.4
                @Override // java.lang.Runnable
                public void run() {
                    jpcVar.run();
                }
            };
            udVar.qdl(i2);
            jl().execute(udVar);
            return;
        }
        com.bytedance.sdk.component.jpc.mo.qdl(jpcVar, 5, i2);
    }

    private static com.bytedance.sdk.component.jpc.lnr.mo.qdl ud(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        com.bytedance.sdk.component.jpc.lnr.mo.qdl qdlVar = new com.bytedance.sdk.component.jpc.lnr.mo.qdl();
        str.getClass();
        switch (str) {
            case "express":
                return qdlVar.qdl(str).qdl(2).ud(4).lnr(0).qdl(10000L).qdl(true).mzz(-1).mml(10).ud(false);
            case "ad":
                return qdlVar.qdl(str).qdl(4).ud(4).lnr(0).qdl(20000L).qdl(true).mzz(-1).mml(10).ud(false);
            case "io":
                return qdlVar.qdl(str).qdl(4).ud(10).lnr(0).qdl(20000L).qdl(true).mzz(-1).mml(10).ud(false);
            case "log":
                return qdlVar.qdl(str).qdl(4).ud(6).lnr(2).qdl(20000L).qdl(true).mzz(-1).mml(10).ud(false);
            case "net":
                return qdlVar.qdl(str).qdl(10).ud(10).lnr(0).qdl(10000L).qdl(true).mzz(-1).mml(10).ud(false);
            case "aidl":
                return qdlVar.qdl(str).qdl(2).ud(4).lnr(0).qdl(10000L).qdl(true).mzz(-1).mml(10).ud(false);
            case "cache":
                return qdlVar.qdl(str).qdl(0).ud(0).lnr(0).qdl(5000L).qdl(true).mzz(-1).mml(20).ud(false);
            case "image":
                return qdlVar.qdl(str).qdl(3).ud(3).lnr(0).qdl(20000L).qdl(true).mzz(-1).mml(10).ud(false);
            case "monitor":
                return qdlVar.qdl(str).qdl(2).ud(2).lnr(0).qdl(10000L).qdl(true).mzz(-1).mml(10).ud(false);
            case "imgdisk":
                return qdlVar.qdl(str).qdl(1).ud(2).lnr(3).qdl(10000L).qdl(true).mzz(-1).mml(10).ud(false);
            default:
                return qdlVar.qdl(str).qdl(8).ud(16).lnr(2).qdl(20000L).qdl(true).mzz(-1).mml(10).ud(false);
        }
    }

    public static void qdl(com.bytedance.sdk.component.jpc.lnr.ud udVar) {
        rq().execute(udVar);
    }

    private static boolean qdl(com.bytedance.sdk.component.jpc.lnr.mo moVar) {
        if (moVar != null) {
            return !moVar.qdl() && com.bytedance.sdk.openadsdk.core.settings.rq.lme();
        }
        return true;
    }

    private static com.bytedance.sdk.component.jpc.lnr.mo qdl(String str, com.bytedance.sdk.component.jpc.lnr.mo moVar) {
        com.bytedance.sdk.component.jpc.lnr.mo.qdl qdlVarQdl = qdl(str);
        if (moVar == null) {
            return qdlVarQdl.qdl();
        }
        moVar.qdl(qdlVarQdl);
        return moVar;
    }

    private static com.bytedance.sdk.component.jpc.lnr.mo.qdl qdl(String str) {
        com.bytedance.sdk.component.jpc.lnr.mo.qdl qdlVarUd = ud(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.rq.lme()) {
                qdlVarUd.ud(true);
                JSONObject jSONObjectBx = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().bx();
                JSONObject jSONObjectOptJSONObject = jSONObjectBx != null ? jSONObjectBx.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    qdlVarUd.ud(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        qdlVarUd.qdl(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        qdlVarUd.ud(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        qdlVarUd.lnr(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        qdlVarUd.qdl(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        qdlVarUd.qdl(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                        return qdlVarUd;
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return qdlVarUd;
    }
}
