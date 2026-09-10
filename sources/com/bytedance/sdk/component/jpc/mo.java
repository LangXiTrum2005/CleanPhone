package com.bytedance.sdk.component.jpc;

import com.p004ironsource.d9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class mo extends mzz {
    private static volatile ThreadPoolExecutor jpc;
    private static volatile ThreadPoolExecutor mo;
    private static volatile ThreadPoolExecutor mzz;
    private static volatile ScheduledExecutorService rq;
    private static volatile ThreadPoolExecutor to;
    private static volatile ThreadPoolExecutor tvp;
    public static lnr ud;
    private static volatile ThreadPoolExecutor wd;
    public static final int qdl = Runtime.getRuntime().availableProcessors();
    public static int lnr = 120;
    public static boolean mml = true;

    public static RejectedExecutionHandler jpc() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.jpc.mo.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static ExecutorService lnr() {
        return qdl(10);
    }

    public static ExecutorService mml() {
        if (jpc == null) {
            synchronized (mo.class) {
                try {
                    if (jpc == null) {
                        qdl qdlVarQdl = new qdl.C0082qdl().qdl("log").ud(10).qdl(4).qdl(20L).qdl(TimeUnit.SECONDS).qdl(new PriorityBlockingQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(10, "log")).qdl();
                        jpc = qdlVarQdl;
                        qdlVarQdl.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return jpc;
    }

    public static ScheduledExecutorService mo() {
        if (rq == null) {
            synchronized (mo.class) {
                try {
                    if (rq == null) {
                        rq = Executors.newSingleThreadScheduledExecutor(mzz.qdl().createThreadFactory(5, "scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return rq;
    }

    public static ExecutorService mzz() {
        if (to == null) {
            synchronized (mo.class) {
                try {
                    if (to == null) {
                        qdl qdlVarQdl = new qdl.C0082qdl().qdl("aidl").ud(10).qdl(2).qdl(30L).qdl(TimeUnit.SECONDS).qdl(new PriorityBlockingQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(10, "aidl")).qdl();
                        to = qdlVarQdl;
                        qdlVarQdl.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return to;
    }

    public static void qdl(jpc jpcVar) {
        if (mzz == null) {
            ud();
        }
        if (jpcVar == null || mzz == null) {
            return;
        }
        mzz.execute(jpcVar);
    }

    public static ExecutorService to() {
        if (tvp == null) {
            synchronized (mo.class) {
                try {
                    if (tvp == null) {
                        qdl qdlVarQdl = new qdl.C0082qdl().qdl("computation").qdl(3).ud(10).qdl(20L).qdl(TimeUnit.SECONDS).qdl(new PriorityBlockingQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(10, "computation")).qdl();
                        tvp = qdlVarQdl;
                        qdlVarQdl.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return tvp;
    }

    public static lnr tvp() {
        return ud;
    }

    public static ExecutorService ud() {
        if (mzz == null) {
            synchronized (mo.class) {
                try {
                    if (mzz == null) {
                        mzz = new qdl.C0082qdl().qdl(d9.a.f).qdl(0).ud(10).qdl(5L).qdl(TimeUnit.SECONDS).qdl(new SynchronousQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(10, d9.a.f)).qdl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mzz;
    }

    public static boolean wd() {
        return mml;
    }

    public static void lnr(jpc jpcVar) {
        if (jpc == null) {
            mml();
        }
        if (jpcVar == null || jpc == null) {
            return;
        }
        jpc.execute(jpcVar);
    }

    public static ExecutorService qdl(int i2) {
        if (mo == null) {
            synchronized (mo.class) {
                try {
                    if (mo == null) {
                        qdl qdlVarQdl = new qdl.C0082qdl().qdl("io").qdl(2).ud(i2).qdl(20L).qdl(TimeUnit.SECONDS).qdl(new LinkedBlockingQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(i2, "io")).qdl();
                        mo = qdlVarQdl;
                        qdlVarQdl.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mo;
    }

    public static void lnr(jpc jpcVar, int i2) {
        if (jpcVar != null) {
            jpcVar.setPriority(i2);
        }
        mml(jpcVar);
    }

    public static void lnr(int i2) {
        lnr = i2;
    }

    public static void ud(jpc jpcVar) {
        if (mo == null) {
            lnr();
        }
        if (mo != null) {
            mo.execute(jpcVar);
        }
    }

    public static void mml(jpc jpcVar) {
        if (to == null) {
            mzz();
        }
        if (jpcVar == null || to == null) {
            return;
        }
        to.execute(jpcVar);
    }

    public static void mzz(jpc jpcVar) {
        if (wd == null) {
            ud(5);
        }
        if (jpcVar == null || wd == null) {
            return;
        }
        wd.execute(jpcVar);
    }

    public static void ud(jpc jpcVar, int i2) {
        if (jpcVar != null) {
            jpcVar.setPriority(i2);
        }
        lnr(jpcVar);
    }

    public static void qdl(jpc jpcVar, int i2) {
        ud(jpcVar);
    }

    public static void qdl(jpc jpcVar, int i2, int i3) {
        if (mo == null) {
            qdl(i3);
        }
        if (jpcVar == null || mo == null) {
            return;
        }
        jpcVar.setPriority(i2);
        mo.execute(jpcVar);
    }

    public static ExecutorService ud(int i2) {
        if (wd == null) {
            synchronized (mo.class) {
                try {
                    if (wd == null) {
                        qdl qdlVarQdl = new qdl.C0082qdl().qdl("ad").qdl(2).ud(i2).qdl(20L).qdl(TimeUnit.SECONDS).qdl(new LinkedBlockingQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(i2, "ad")).qdl();
                        wd = qdlVarQdl;
                        qdlVarQdl.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return wd;
    }

    public static void qdl(boolean z2) {
        mml = z2;
    }

    public static void qdl(lnr lnrVar) {
        ud = lnrVar;
    }
}
