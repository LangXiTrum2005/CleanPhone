package com.bytedance.sdk.component.OY;

import com.umeng.analytics.pro.bc;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends JXs {
    private static volatile ScheduledExecutorService JVA;
    private static volatile ThreadPoolExecutor JXs;
    public static lk LD;
    private static volatile ThreadPoolExecutor OY;
    private static volatile ThreadPoolExecutor QAg;
    private static volatile ThreadPoolExecutor ebl;
    private static volatile ThreadPoolExecutor lc;
    private static volatile ThreadPoolExecutor nBu;
    public static final int Lxb = Runtime.getRuntime().availableProcessors();
    public static int lk = 120;
    public static boolean ZU = true;

    public static ExecutorService JXs() {
        if (nBu == null) {
            synchronized (lc.class) {
                try {
                    if (nBu == null) {
                        Lxb Lxb2 = new Lxb.C0049Lxb().Lxb("aidl").LD(10).Lxb(2).Lxb(30L).Lxb(TimeUnit.SECONDS).Lxb(new PriorityBlockingQueue()).Lxb(OY()).Lxb(JXs.Lxb().createThreadFactory(10, "aidl")).Lxb();
                        nBu = Lxb2;
                        Lxb2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nBu;
    }

    public static ExecutorService LD() {
        if (JXs == null) {
            synchronized (lc.class) {
                try {
                    if (JXs == null) {
                        JXs = new Lxb.C0049Lxb().Lxb("init").Lxb(0).LD(10).Lxb(5L).Lxb(TimeUnit.SECONDS).Lxb(new SynchronousQueue()).Lxb(OY()).Lxb(JXs.Lxb().createThreadFactory(10, "init")).Lxb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return JXs;
    }

    public static void Lxb(OY oy) {
        if (JXs == null) {
            LD();
        }
        if (oy == null || JXs == null) {
            return;
        }
        JXs.execute(oy);
    }

    public static RejectedExecutionHandler OY() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.OY.lc.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static lk QAg() {
        return LD;
    }

    public static ExecutorService ZU() {
        if (OY == null) {
            synchronized (lc.class) {
                try {
                    if (OY == null) {
                        Lxb Lxb2 = new Lxb.C0049Lxb().Lxb("log").LD(10).Lxb(4).Lxb(20L).Lxb(TimeUnit.SECONDS).Lxb(new PriorityBlockingQueue()).Lxb(OY()).Lxb(JXs.Lxb().createThreadFactory(10, "log")).Lxb();
                        OY = Lxb2;
                        Lxb2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return OY;
    }

    public static boolean ebl() {
        return ZU;
    }

    public static ScheduledExecutorService lc() {
        if (JVA == null) {
            synchronized (lc.class) {
                try {
                    if (JVA == null) {
                        JVA = Executors.newSingleThreadScheduledExecutor(JXs.Lxb().createThreadFactory(5, "scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return JVA;
    }

    public static ExecutorService lk() {
        return Lxb(10);
    }

    public static ExecutorService nBu() {
        if (QAg == null) {
            synchronized (lc.class) {
                try {
                    if (QAg == null) {
                        Lxb Lxb2 = new Lxb.C0049Lxb().Lxb("computation").Lxb(3).LD(10).Lxb(20L).Lxb(TimeUnit.SECONDS).Lxb(new PriorityBlockingQueue()).Lxb(OY()).Lxb(JXs.Lxb().createThreadFactory(10, "computation")).Lxb();
                        QAg = Lxb2;
                        Lxb2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return QAg;
    }

    public static void lk(OY oy) {
        if (OY == null) {
            ZU();
        }
        if (oy == null || OY == null) {
            return;
        }
        OY.execute(oy);
    }

    public static ExecutorService Lxb(int i) {
        if (lc == null) {
            synchronized (lc.class) {
                try {
                    if (lc == null) {
                        Lxb Lxb2 = new Lxb.C0049Lxb().Lxb("io").Lxb(2).LD(i).Lxb(20L).Lxb(TimeUnit.SECONDS).Lxb(new LinkedBlockingQueue()).Lxb(OY()).Lxb(JXs.Lxb().createThreadFactory(i, "io")).Lxb();
                        lc = Lxb2;
                        Lxb2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lc;
    }

    public static void lk(OY oy, int i) {
        if (oy != null) {
            oy.setPriority(i);
        }
        ZU(oy);
    }

    public static void lk(int i) {
        lk = i;
    }

    public static void LD(OY oy) {
        if (lc == null) {
            lk();
        }
        if (lc != null) {
            lc.execute(oy);
        }
    }

    public static void JXs(OY oy) {
        if (ebl == null) {
            LD(5);
        }
        if (oy == null || ebl == null) {
            return;
        }
        ebl.execute(oy);
    }

    public static void ZU(OY oy) {
        if (nBu == null) {
            JXs();
        }
        if (oy == null || nBu == null) {
            return;
        }
        nBu.execute(oy);
    }

    public static void LD(OY oy, int i) {
        if (oy != null) {
            oy.setPriority(i);
        }
        lk(oy);
    }

    public static void Lxb(OY oy, int i) {
        LD(oy);
    }

    public static ExecutorService LD(int i) {
        if (ebl == null) {
            synchronized (lc.class) {
                try {
                    if (ebl == null) {
                        Lxb Lxb2 = new Lxb.C0049Lxb().Lxb(bc.aC).Lxb(2).LD(i).Lxb(20L).Lxb(TimeUnit.SECONDS).Lxb(new LinkedBlockingQueue()).Lxb(OY()).Lxb(JXs.Lxb().createThreadFactory(i, bc.aC)).Lxb();
                        ebl = Lxb2;
                        Lxb2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ebl;
    }

    public static void Lxb(OY oy, int i, int i2) {
        if (lc == null) {
            Lxb(i2);
        }
        if (oy == null || lc == null) {
            return;
        }
        oy.setPriority(i);
        lc.execute(oy);
    }

    public static void Lxb(boolean z) {
        ZU = z;
    }

    public static void Lxb(lk lkVar) {
        LD = lkVar;
    }
}
