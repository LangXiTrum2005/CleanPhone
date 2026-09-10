package com.bytedance.sdk.component.di.ri.lr;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.di.ri.fi;
import com.bytedance.sdk.component.di.ri.xha;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class ka {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final PriorityBlockingQueue<com.bytedance.sdk.component.di.ri.ka.ri> f18045co;
    private volatile com.bytedance.sdk.component.di.ri.lr.lr.ik jbs;
    private volatile Handler qt;
    private final Comparator<com.bytedance.sdk.component.di.ri.ka.ri> sf;
    public static final ka ri = new ka();
    public static final com.bytedance.sdk.component.di.ri.lr.ri.ri ka = new com.bytedance.sdk.component.di.ri.lr.ri.ri();
    public static final AtomicLong fi = new AtomicLong(0);
    public static final AtomicLong di = new AtomicLong(0);
    public static final long xha = System.currentTimeMillis();
    public static long mj = 0;
    public volatile boolean lr = false;
    public volatile boolean ik = false;

    private ka() {
        Comparator<com.bytedance.sdk.component.di.ri.ka.ri> comparator = new Comparator<com.bytedance.sdk.component.di.ri.ka.ri>() { // from class: com.bytedance.sdk.component.di.ri.lr.ka.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.di.ri.ka.ri riVar, com.bytedance.sdk.component.di.ri.ka.ri riVar2) {
                return ka.this.ri(riVar, riVar2);
            }
        };
        this.sf = comparator;
        this.f18045co = new PriorityBlockingQueue<>(8, comparator);
    }

    public void fi() {
        com.bytedance.sdk.component.di.ri.ik.lr.ri(ka.dzy(), 1);
        final com.bytedance.sdk.component.di.ri.lr.lr.ik ikVar = this.jbs;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (ikVar != null) {
                ikVar.ik(2);
                return;
            }
            return;
        }
        fi fiVarVr = xha.di().vr();
        if (fiVarVr != null) {
            Executor executorKa = fiVarVr.ka();
            if (executorKa == null) {
                executorKa = fiVarVr.fi();
            }
            if (executorKa != null) {
                executorKa.execute(new com.bytedance.sdk.component.di.ri.fi.fi("flush") { // from class: com.bytedance.sdk.component.di.ri.lr.ka.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.di.ri.lr.lr.ik ikVar2 = ikVar;
                        if (ikVar2 != null) {
                            ikVar2.ik(2);
                        }
                    }
                });
            }
        }
    }

    public void ik() {
        if (this.jbs == null || !this.jbs.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.jbs != null && this.jbs.isAlive()) {
                    if (this.qt != null) {
                        this.qt.removeCallbacksAndMessages(null);
                    }
                    this.jbs.ri(false);
                    this.jbs.quitSafely();
                    this.jbs = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean ka() {
        try {
            if (this.jbs != null || com.bytedance.sdk.component.di.ri.lr.lr()) {
                return false;
            }
            synchronized (this) {
                if (this.jbs != null) {
                    return false;
                }
                this.jbs = new com.bytedance.sdk.component.di.ri.lr.lr.ik(this.f18045co);
                this.jbs.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void lr() {
        ka();
        fi();
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.di.ri.ka.ri> ri() {
        return this.f18045co;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int ri(com.bytedance.sdk.component.di.ri.ka.ri riVar, com.bytedance.sdk.component.di.ri.ka.ri riVar2) {
        long jRi;
        long jLr;
        long jLr2;
        long jRi2;
        if (riVar == null) {
            return riVar2 == null ? 0 : -1;
        }
        if (riVar2 == null) {
            return 1;
        }
        if (riVar.fi() == riVar2.fi()) {
            if (riVar.ri() != null) {
                jRi = riVar.ri().ri();
                jLr = riVar.ri().lr();
            } else {
                jRi = 0;
                jLr = 0;
            }
            if (riVar2.ri() != null) {
                jRi2 = riVar2.ri().ri();
                jLr2 = riVar2.ri().lr();
            } else {
                jLr2 = 0;
                jRi2 = 0;
            }
            if (jRi == 0 || jRi2 == 0) {
                return 0;
            }
            long j = jRi - jRi2;
            if (Math.abs(j) > 2147483647L) {
                return 0;
            }
            if (j != 0) {
                return (int) j;
            }
            if (jLr == 0 || jLr2 == 0) {
                return 0;
            }
            return (int) (jLr - jLr2);
        }
        return riVar.fi() - riVar2.fi();
    }

    public void ri(Handler handler) {
        this.qt = handler;
    }

    public void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar, int i) {
        ka();
        fi fiVarVr = xha.di().vr();
        com.bytedance.sdk.component.di.ri.lr.lr.ik ikVar = this.jbs;
        if (ikVar != null) {
            ri(fiVarVr, riVar);
            ikVar.ri(riVar, riVar.fi() == 4);
        }
    }

    private void ri(final fi fiVar, com.bytedance.sdk.component.di.ri.ka.ri riVar) {
        if (fiVar != null) {
            try {
                if (fiVar.xha()) {
                    final long jLr = (riVar == null || riVar.ri() == null) ? 0L : riVar.ri().lr();
                    if (jLr == 1) {
                        mj = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongTw = ka.tw();
                    com.bytedance.sdk.component.di.ri.ik.lr.ri(atomicLongTw, 1);
                    if (atomicLongTw.get() == 200) {
                        try {
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                Executor executorKa = fiVar.ka();
                                if (executorKa == null) {
                                    executorKa = fiVar.fi();
                                }
                                if (executorKa != null) {
                                    executorKa.execute(new com.bytedance.sdk.component.di.ri.fi.fi("report") { // from class: com.bytedance.sdk.component.di.ri.lr.ka.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            ka.this.ri(fiVar, jLr);
                                        }
                                    });
                                }
                            } else {
                                ri(fiVar, jLr);
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
    public void ri(fi fiVar, long j) {
        com.bytedance.sdk.component.di.ri.lr.lr.ik ikVar = this.jbs;
        if (fiVar == null || ikVar == null) {
            return;
        }
        com.bytedance.sdk.component.di.ri.lr.ri.ri riVar = ka;
        ikVar.ri(fiVar.ri(riVar.lr(j)), true);
        riVar.zyn();
    }
}
