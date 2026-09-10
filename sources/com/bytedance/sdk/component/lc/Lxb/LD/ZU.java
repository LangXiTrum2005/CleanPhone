package com.bytedance.sdk.component.lc.Lxb.LD;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.lc.Lxb.JXs;
import com.bytedance.sdk.component.lc.Lxb.OY;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private final Comparator<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> JVA;
    private volatile com.bytedance.sdk.component.lc.Lxb.LD.lk.lk QAg;
    private volatile Handler nBu;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> sLN;
    public static final ZU Lxb = new ZU();
    public static final com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb ZU = new com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb();
    public static final AtomicLong JXs = new AtomicLong(0);
    public static final AtomicLong lc = new AtomicLong(0);
    public static final long ebl = System.currentTimeMillis();
    public static long OY = 0;
    public volatile boolean LD = false;
    public volatile boolean lk = false;

    private ZU() {
        Comparator<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> comparator = new Comparator<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb>() { // from class: com.bytedance.sdk.component.lc.Lxb.LD.ZU.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb2) {
                return ZU.this.Lxb(lxb, lxb2);
            }
        };
        this.JVA = comparator;
        this.sLN = new PriorityBlockingQueue<>(8, comparator);
    }

    public void JXs() {
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(ZU.nJ(), 1);
        final com.bytedance.sdk.component.lc.Lxb.LD.lk.lk lkVar = this.QAg;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (lkVar != null) {
                lkVar.lk(2);
                return;
            }
            return;
        }
        JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE != null) {
            Executor executorZU = jXsVVE.ZU();
            if (executorZU == null) {
                executorZU = jXsVVE.JXs();
            }
            if (executorZU != null) {
                executorZU.execute(new com.bytedance.sdk.component.lc.Lxb.JXs.JXs("flush") { // from class: com.bytedance.sdk.component.lc.Lxb.LD.ZU.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.lc.Lxb.LD.lk.lk lkVar2 = lkVar;
                        if (lkVar2 != null) {
                            lkVar2.lk(2);
                        }
                    }
                });
            }
        }
    }

    public void LD() {
        ZU();
        JXs();
    }

    public boolean ZU() {
        try {
            if (this.QAg != null || com.bytedance.sdk.component.lc.Lxb.LD.LD()) {
                return false;
            }
            synchronized (this) {
                if (this.QAg != null) {
                    return false;
                }
                this.QAg = new com.bytedance.sdk.component.lc.Lxb.LD.lk.lk(this.sLN);
                this.QAg.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void lk() {
        if (this.QAg == null || !this.QAg.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.QAg != null && this.QAg.isAlive()) {
                    if (this.nBu != null) {
                        this.nBu.removeCallbacksAndMessages(null);
                    }
                    this.QAg.Lxb(false);
                    this.QAg.quitSafely();
                    this.QAg = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> Lxb() {
        return this.sLN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb2) {
        long jLxb;
        long jLD;
        long jLD2;
        long jLxb2;
        if (lxb == null) {
            return lxb2 == null ? 0 : -1;
        }
        if (lxb2 == null) {
            return 1;
        }
        if (lxb.JXs() == lxb2.JXs()) {
            if (lxb.Lxb() != null) {
                jLxb = lxb.Lxb().Lxb();
                jLD = lxb.Lxb().LD();
            } else {
                jLxb = 0;
                jLD = 0;
            }
            if (lxb2.Lxb() != null) {
                jLxb2 = lxb2.Lxb().Lxb();
                jLD2 = lxb2.Lxb().LD();
            } else {
                jLD2 = 0;
                jLxb2 = 0;
            }
            if (jLxb == 0 || jLxb2 == 0) {
                return 0;
            }
            long j = jLxb - jLxb2;
            if (Math.abs(j) > 2147483647L) {
                return 0;
            }
            if (j != 0) {
                return (int) j;
            }
            if (jLD == 0 || jLD2 == 0) {
                return 0;
            }
            return (int) (jLD - jLD2);
        }
        return lxb.JXs() - lxb2.JXs();
    }

    public void Lxb(Handler handler) {
        this.nBu = handler;
    }

    public void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, int i) {
        ZU();
        JXs jXsVVE = OY.ebl().VVE();
        com.bytedance.sdk.component.lc.Lxb.LD.lk.lk lkVar = this.QAg;
        if (lkVar != null) {
            Lxb(jXsVVE, lxb);
            lkVar.Lxb(lxb, lxb.JXs() == 4);
        }
    }

    private void Lxb(final JXs jXs, com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (jXs != null) {
            try {
                if (jXs.ebl()) {
                    final long jLD = (lxb == null || lxb.Lxb() == null) ? 0L : lxb.Lxb().LD();
                    if (jLD == 1) {
                        OY = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongLXE = ZU.LXE();
                    com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(atomicLongLXE, 1);
                    if (atomicLongLXE.get() == 200) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            Executor executorZU = jXs.ZU();
                            if (executorZU == null) {
                                executorZU = jXs.JXs();
                            }
                            if (executorZU != null) {
                                executorZU.execute(new com.bytedance.sdk.component.lc.Lxb.JXs.JXs("report") { // from class: com.bytedance.sdk.component.lc.Lxb.LD.ZU.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        ZU.this.Lxb(jXs, jLD);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        Lxb(jXs, jLD);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(JXs jXs, long j) {
        com.bytedance.sdk.component.lc.Lxb.LD.lk.lk lkVar = this.QAg;
        if (jXs == null || lkVar == null) {
            return;
        }
        com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb lxb = ZU;
        lkVar.Lxb(jXs.Lxb(lxb.LD(j)), true);
        lxb.VU();
    }
}
