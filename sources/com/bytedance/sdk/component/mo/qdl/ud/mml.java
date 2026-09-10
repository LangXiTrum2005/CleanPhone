package com.bytedance.sdk.component.mo.qdl.ud;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.mzz;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    private final PriorityBlockingQueue<com.bytedance.sdk.component.mo.qdl.mml.qdl> fs;
    private final Comparator<com.bytedance.sdk.component.mo.qdl.mml.qdl> rq;
    private volatile Handler to;
    private volatile com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr tvp;
    public static final mml qdl = new mml();
    public static final com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl mml = new com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl();
    public static final AtomicLong mzz = new AtomicLong(0);
    public static final AtomicLong mo = new AtomicLong(0);
    public static final long wd = System.currentTimeMillis();
    public static long jpc = 0;
    public volatile boolean ud = false;
    public volatile boolean lnr = false;

    private mml() {
        Comparator<com.bytedance.sdk.component.mo.qdl.mml.qdl> comparator = new Comparator<com.bytedance.sdk.component.mo.qdl.mml.qdl>() { // from class: com.bytedance.sdk.component.mo.qdl.ud.mml.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar2) {
                return mml.this.qdl(qdlVar, qdlVar2);
            }
        };
        this.rq = comparator;
        this.fs = new PriorityBlockingQueue<>(8, comparator);
    }

    public void lnr() {
        if (this.tvp == null || !this.tvp.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.tvp != null && this.tvp.isAlive()) {
                    if (this.to != null) {
                        this.to.removeCallbacksAndMessages(null);
                    }
                    this.tvp.qdl(false);
                    this.tvp.quitSafely();
                    this.tvp = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean mml() {
        try {
            if (this.tvp != null || com.bytedance.sdk.component.mo.qdl.ud.ud()) {
                return false;
            }
            synchronized (this) {
                if (this.tvp != null) {
                    return false;
                }
                this.tvp = new com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr(this.fs);
                this.tvp.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void mzz() {
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(mml.hzv(), 1);
        final com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr lnrVar = this.tvp;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (lnrVar != null) {
                lnrVar.lnr(2);
                return;
            }
            return;
        }
        mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx != null) {
            Executor executorMml = mzzVarJtx.mml();
            if (executorMml == null) {
                executorMml = mzzVarJtx.mzz();
            }
            if (executorMml != null) {
                executorMml.execute(new com.bytedance.sdk.component.mo.qdl.mzz.mzz("flush") { // from class: com.bytedance.sdk.component.mo.qdl.ud.mml.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr lnrVar2 = lnrVar;
                        if (lnrVar2 != null) {
                            lnrVar2.lnr(2);
                        }
                    }
                });
            }
        }
    }

    public void ud() {
        mml();
        mzz();
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl() {
        return this.fs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar2) {
        long jQdl;
        long jUd;
        long jUd2;
        long jQdl2;
        if (qdlVar == null) {
            return qdlVar2 == null ? 0 : -1;
        }
        if (qdlVar2 == null) {
            return 1;
        }
        if (qdlVar.mzz() == qdlVar2.mzz()) {
            if (qdlVar.qdl() != null) {
                jQdl = qdlVar.qdl().qdl();
                jUd = qdlVar.qdl().ud();
            } else {
                jQdl = 0;
                jUd = 0;
            }
            if (qdlVar2.qdl() != null) {
                jQdl2 = qdlVar2.qdl().qdl();
                jUd2 = qdlVar2.qdl().ud();
            } else {
                jUd2 = 0;
                jQdl2 = 0;
            }
            if (jQdl == 0 || jQdl2 == 0) {
                return 0;
            }
            long j = jQdl - jQdl2;
            if (Math.abs(j) > 2147483647L) {
                return 0;
            }
            if (j != 0) {
                return (int) j;
            }
            if (jUd == 0 || jUd2 == 0) {
                return 0;
            }
            return (int) (jUd - jUd2);
        }
        return qdlVar.mzz() - qdlVar2.mzz();
    }

    public void qdl(Handler handler) {
        this.to = handler;
    }

    public void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, int i2) {
        mml();
        mzz mzzVarJtx = jpc.wd().jtx();
        com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr lnrVar = this.tvp;
        if (lnrVar != null) {
            qdl(mzzVarJtx, qdlVar);
            lnrVar.qdl(qdlVar, qdlVar.mzz() == 4);
        }
    }

    private void qdl(final mzz mzzVar, com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (mzzVar != null) {
            try {
                if (mzzVar.wd()) {
                    final long jUd = (qdlVar == null || qdlVar.qdl() == null) ? 0L : qdlVar.qdl().ud();
                    if (jUd == 1) {
                        jpc = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongCar = mml.car();
                    com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(atomicLongCar, 1);
                    if (atomicLongCar.get() == 200) {
                        try {
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                Executor executorMml = mzzVar.mml();
                                if (executorMml == null) {
                                    executorMml = mzzVar.mzz();
                                }
                                if (executorMml != null) {
                                    executorMml.execute(new com.bytedance.sdk.component.mo.qdl.mzz.mzz("report") { // from class: com.bytedance.sdk.component.mo.qdl.ud.mml.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            mml.this.qdl(mzzVar, jUd);
                                        }
                                    });
                                }
                            } else {
                                qdl(mzzVar, jUd);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(mzz mzzVar, long j) {
        com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr lnrVar = this.tvp;
        if (mzzVar == null || lnrVar == null) {
            return;
        }
        com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl qdlVar = mml;
        lnrVar.qdl(mzzVar.qdl(qdlVar.ud(j)), true);
        qdlVar.cx();
    }
}
