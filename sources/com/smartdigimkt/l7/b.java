package com.smartdigimkt.l7;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36378c = 1;
    public static final int d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36379e = 3;
    public static final int f = 4;
    public static final int g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f36380h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f36381i = 7;
    public static final int j = 8;
    public static final int k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f36382l = 10;
    public static final int m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f36383n = 12;
    public static final int o = 13;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f36384p = 14;
    public static final int q = 15;
    public static final int r = 16;
    public static final int s = 17;
    public static final int t = 18;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile b f36385u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.l7.a f36386a = new com.smartdigimkt.l7.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f36387b = new Handler(Looper.getMainLooper());

    public class a extends d {
        final /* synthetic */ long j0;
        final /* synthetic */ Runnable k0;

        public a(long j, Runnable runnable) {
            this.j0 = j;
            this.k0 = runnable;
        }

        @Override // com.smartdigimkt.l7.d
        public void d() {
            long j = this.j0;
            if (j > 0) {
                try {
                    Thread.sleep(j);
                } catch (InterruptedException unused) {
                }
            }
            b();
            this.k0.run();
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.l7.b$b, reason: collision with other inner class name */
    public class C0533b extends d {
        final /* synthetic */ Runnable j0;

        public C0533b(Runnable runnable) {
            this.j0 = runnable;
        }

        @Override // com.smartdigimkt.l7.d
        public void d() {
            this.j0.run();
        }
    }

    private b() {
    }

    public static b a() {
        if (f36385u == null) {
            synchronized (b.class) {
                try {
                    if (f36385u == null) {
                        f36385u = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36385u;
    }

    public void b(Runnable runnable, int i2) {
        a(runnable, i2, true);
    }

    public void c(Runnable runnable, long j2) {
        a(runnable, j2, 2);
    }

    public void d(Runnable runnable) {
        if (TextUtils.equals(Thread.currentThread().getName(), this.f36386a.b(6))) {
            runnable.run();
        } else if (runnable != null) {
            C0533b c0533b = new C0533b(runnable);
            c0533b.a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            a((d) c0533b, 6);
        }
    }

    public void e(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f36387b.post(runnable);
        }
    }

    public void f(Runnable runnable) {
        a(runnable, 13);
    }

    public void g() {
    }

    public void b(Runnable runnable) {
        a(runnable, 2, true);
    }

    public void c(Runnable runnable) {
        a(runnable, 2, true);
    }

    public boolean f() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void g(Runnable runnable) {
        b(runnable, 2);
    }

    public Executor b() {
        com.smartdigimkt.l7.a aVar = this.f36386a;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public Executor c() {
        com.smartdigimkt.l7.a aVar = this.f36386a;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public void b(Runnable runnable, long j2) {
        if (j2 <= 0 && Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f36387b.postDelayed(runnable, j2);
        }
    }

    public ScheduledExecutorService e() {
        com.smartdigimkt.l7.a aVar = this.f36386a;
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    public void a(d dVar, int i2) {
        try {
            this.f36386a.a(dVar, i2);
        } catch (Throwable unused) {
        }
    }

    public ExecutorService d() {
        com.smartdigimkt.l7.a aVar = this.f36386a;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public void a(Runnable runnable, int i2, boolean z2) {
        if (z2) {
            a(runnable, 0L, i2);
        } else if (f()) {
            a(runnable, 0L, i2);
        } else {
            runnable.run();
        }
    }

    public void a(Runnable runnable, int i2) {
        if (f()) {
            b(runnable, i2);
        } else {
            runnable.run();
        }
    }

    public void a(Runnable runnable, long j2, int i2) {
        if (runnable != null) {
            a aVar = new a(j2, runnable);
            aVar.a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            a((d) aVar, i2);
        }
    }

    public void a(Runnable runnable, long j2) {
        a(runnable, j2, 2);
    }

    public Handler a(int i2) {
        return this.f36386a.a(i2);
    }

    public void a(Runnable runnable) {
        this.f36387b.removeCallbacks(runnable);
    }
}
