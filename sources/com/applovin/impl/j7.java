package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f8222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f8224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f8227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f8228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f8229i = new Object();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                j7.this.f8227g.run();
                synchronized (j7.this.f8229i) {
                    try {
                        if (j7.this.f8226f) {
                            j7.this.f8223c = System.currentTimeMillis();
                            j7 j7Var = j7.this;
                            j7Var.f8224d = j7Var.f8225e;
                        } else {
                            j7.this.f8222b = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    if (j7.this.f8221a != null) {
                        j7.this.f8221a.Q();
                        if (com.applovin.impl.sdk.p.a()) {
                            j7.this.f8221a.Q().a("Timer", "Encountered error while executing timed task", th3);
                        }
                        j7.this.f8221a.E().a("Timer", "executingTimedTask", th3);
                    }
                    synchronized (j7.this.f8229i) {
                        try {
                            if (j7.this.f8226f) {
                                j7.this.f8223c = System.currentTimeMillis();
                                j7 j7Var2 = j7.this;
                                j7Var2.f8224d = j7Var2.f8225e;
                            } else {
                                j7.this.f8222b = null;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    synchronized (j7.this.f8229i) {
                        try {
                            if (j7.this.f8226f) {
                                j7.this.f8223c = System.currentTimeMillis();
                                j7 j7Var3 = j7.this;
                                j7Var3.f8224d = j7Var3.f8225e;
                            } else {
                                j7.this.f8222b = null;
                            }
                            throw th5;
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            }
        }
    }

    private j7(com.applovin.impl.sdk.l lVar, Runnable runnable) {
        this.f8221a = lVar;
        this.f8227g = runnable;
    }

    public long c() {
        if (this.f8222b == null) {
            return this.f8224d - this.f8228h;
        }
        return this.f8224d - (System.currentTimeMillis() - this.f8223c);
    }

    public void d() {
        synchronized (this.f8229i) {
            Timer timer = this.f8222b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f8228h = Math.max(1L, System.currentTimeMillis() - this.f8223c);
                    this.f8222b = null;
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.l lVar = this.f8221a;
                        if (lVar != null) {
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f8221a.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f8221a.Q().a("Timer", "Encountered error while pausing timer", th2);
                                }
                            }
                        }
                        this.f8222b = null;
                    } catch (Throwable th3) {
                        this.f8222b = null;
                        throw th3;
                    }
                }
            }
        }
    }

    public void e() {
        j7 j7Var;
        synchronized (this.f8229i) {
            long j10 = this.f8228h;
            if (j10 > 0) {
                try {
                    long j11 = this.f8224d - j10;
                    this.f8224d = j11;
                    if (j11 < 0) {
                        this.f8224d = 0L;
                    }
                    this.f8222b = new Timer();
                    j7Var = this;
                    try {
                        j7Var.a(b(), this.f8224d, this.f8226f, this.f8225e);
                        j7Var.f8223c = System.currentTimeMillis();
                        j7Var.f8228h = 0L;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.applovin.impl.sdk.l lVar = j7Var.f8221a;
                            if (lVar != null) {
                                lVar.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    j7Var.f8221a.Q();
                                    if (com.applovin.impl.sdk.p.a()) {
                                        j7Var.f8221a.Q().a("Timer", "Encountered error while resuming timer", th);
                                    }
                                }
                            }
                            j7Var.f8228h = 0L;
                        } catch (Throwable th3) {
                            j7Var.f8228h = 0L;
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    j7Var = this;
                }
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static j7 a(long j10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return a(j10, false, lVar, runnable);
    }

    public static j7 a(long j10, boolean z10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.j(j10, "Cannot create a scheduled timer. Invalid fire time passed in: ", "."));
        }
        if (runnable != null) {
            j7 j7Var = new j7(lVar, runnable);
            j7Var.f8223c = System.currentTimeMillis();
            j7Var.f8224d = j10;
            j7Var.f8226f = z10;
            j7Var.f8225e = j10;
            try {
                j7Var.f8222b = new Timer();
                j7Var.a(j7Var.b(), j10, z10, j7Var.f8225e);
                return j7Var;
            } catch (OutOfMemoryError e10) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("Timer", "Failed to create timer due to OOM error", e10);
                }
                return j7Var;
            }
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.f8229i) {
            Timer timer = this.f8222b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f8222b = null;
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.l lVar = this.f8221a;
                        if (lVar != null) {
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f8221a.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f8221a.Q().a("Timer", "Encountered error while cancelling timer", th2);
                                }
                            }
                        }
                        this.f8222b = null;
                    } catch (Throwable th3) {
                        this.f8222b = null;
                        this.f8228h = 0L;
                        throw th3;
                    }
                }
                this.f8228h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j10, boolean z10, long j11) {
        if (z10) {
            this.f8222b.schedule(timerTask, j10, j11);
        } else {
            this.f8222b.schedule(timerTask, j10);
        }
    }
}
