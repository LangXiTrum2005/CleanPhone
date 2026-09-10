package com.adcolony.sdk;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
class t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9377c;
    private boolean f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9380i;
    private boolean j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private u0 f9381l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f9375a = 1800000;
    private boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9378e = true;
    private boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9379h = false;

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            t0.this.j = true;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f9383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f9384b;

        public b(t0 t0Var, l lVar, k kVar) {
            this.f9383a = lVar;
            this.f9384b = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9383a.b();
            this.f9384b.q().d();
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9385a;

        public c(boolean z2) {
            this.f9385a = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinkedHashMap<Integer, k0> linkedHashMapD = com.adcolony.sdk.a.b().r().d();
            synchronized (linkedHashMapD) {
                try {
                    for (k0 k0Var : linkedHashMapD.values()) {
                        f1 f1VarB = c0.b();
                        c0.b(f1VarB, "from_window_focus", this.f9385a);
                        if (t0.this.f9379h && !t0.this.g) {
                            c0.b(f1VarB, "app_in_foreground", false);
                            t0.this.f9379h = false;
                        }
                        new h0("SessionInfo.on_pause", k0Var.getAdc3ModuleId(), f1VarB).c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.adcolony.sdk.a.f();
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9387a;

        public d(boolean z2) {
            this.f9387a = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVarB = com.adcolony.sdk.a.b();
            LinkedHashMap<Integer, k0> linkedHashMapD = kVarB.r().d();
            synchronized (linkedHashMapD) {
                try {
                    for (k0 k0Var : linkedHashMapD.values()) {
                        f1 f1VarB = c0.b();
                        c0.b(f1VarB, "from_window_focus", this.f9387a);
                        if (t0.this.f9379h && t0.this.g) {
                            c0.b(f1VarB, "app_in_foreground", true);
                            t0.this.f9379h = false;
                        }
                        new h0("SessionInfo.on_resume", k0Var.getAdc3ModuleId(), f1VarB).c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            kVarB.q().d();
        }
    }

    private void h() {
        a(false);
    }

    private void i() {
        b(false);
    }

    public void c(boolean z2) {
        k kVarB = com.adcolony.sdk.a.b();
        if (this.f) {
            return;
        }
        if (this.f9380i) {
            kVarB.c(false);
            this.f9380i = false;
        }
        this.f9376b = 0;
        this.f9377c = SystemClock.uptimeMillis();
        this.d = true;
        this.f = true;
        this.g = true;
        this.f9379h = false;
        AdColony.c();
        if (z2) {
            f1 f1VarB = c0.b();
            c0.a(f1VarB, "id", z0.a());
            new h0("SessionInfo.on_start", 1, f1VarB).c();
            l lVarC = com.adcolony.sdk.a.b().r().c();
            if (lVarC != null && !AdColony.a(new b(this, lVarC, kVarB))) {
                new e0.a().a("RejectedExecutionException on controller update.").a(e0.f9132i);
            }
        }
        kVarB.r().h();
        v.a().b();
    }

    public void d() {
        com.adcolony.sdk.a.a("SessionInfo.stopped", new a());
        this.f9381l = new u0(this);
    }

    public boolean e() {
        return this.d;
    }

    public void f(boolean z2) {
        this.f9380i = z2;
    }

    public void g(boolean z2) {
        this.k = z2;
    }

    public void j() {
        s0 s0VarA = com.adcolony.sdk.a.b().q().a();
        this.f = false;
        this.d = false;
        if (s0VarA != null) {
            s0VarA.b();
        }
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "session_length", (SystemClock.uptimeMillis() - this.f9377c) / 1000.0d);
        new h0("SessionInfo.on_stop", 1, f1VarB).c();
        com.adcolony.sdk.a.f();
        AdColony.g();
    }

    public void e(boolean z2) {
        if (this.g != z2) {
            this.g = z2;
            this.f9379h = true;
            if (z2) {
                return;
            }
            h();
        }
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.k;
    }

    public void a(boolean z2) {
        this.f9378e = true;
        this.f9381l.b();
        if (AdColony.a(new c(z2))) {
            return;
        }
        new e0.a().a("RejectedExecutionException on session pause.").a(e0.f9132i);
    }

    public void b(boolean z2) {
        this.f9378e = false;
        this.f9381l.c();
        if (AdColony.a(new d(z2))) {
            return;
        }
        new e0.a().a("RejectedExecutionException on session resume.").a(e0.f9132i);
    }

    public void d(boolean z2) {
        if (z2 && this.f9378e) {
            i();
        } else if (!z2 && !this.f9378e) {
            h();
        }
        this.d = z2;
    }

    public long a() {
        return this.f9375a;
    }

    public int b() {
        return this.f9376b;
    }

    public void a(int i2) {
        this.f9375a = i2 <= 0 ? this.f9375a : i2 * 1000;
    }

    public void c() {
        this.f9376b++;
    }
}
