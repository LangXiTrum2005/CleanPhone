package com.adcolony.sdk;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9493a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f9494b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f9495c;
    private c d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            new h0("AdColony.heartbeat", 1).c();
            z.this.c();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0.c f9497a;

        public b(z0.c cVar) {
            this.f9497a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f9495c = null;
            if (com.adcolony.sdk.a.d()) {
                k kVarB = com.adcolony.sdk.a.b();
                if (!this.f9497a.a() || !kVarB.I()) {
                    if (kVarB.F()) {
                        z.this.a();
                        return;
                    } else {
                        z0.a(z.this.f9494b, kVarB.h());
                        return;
                    }
                }
                kVarB.a();
                new e0.a().a("Controller heartbeat timeout occurred. ").a(android.support.v4.media.a.j(this.f9497a.b(), " ms. ", new StringBuilder("Timeout set to: "))).a(android.support.v4.media.a.j(kVarB.h(), " ms. ", new StringBuilder("Interval set to: "))).a("Heartbeat last reply: ").a(z.this.d).a(e0.f9132i);
                z.this.a();
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f1 f9499a;

        public /* synthetic */ c(f1 f1Var, a aVar) {
            this(f1Var);
        }

        public String toString() {
            return this.f9499a.toString();
        }

        private c(f1 f1Var) {
            f1 f1VarM = f1Var != null ? f1Var.m("payload") : c0.b();
            this.f9499a = f1VarM;
            c0.a(f1VarM, "heartbeatLastTimestamp", f0.f9138e.format(new Date()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (com.adcolony.sdk.a.d()) {
            z0.c cVar = new z0.c(com.adcolony.sdk.a.b().i());
            b bVar = new b(cVar);
            this.f9495c = bVar;
            z0.a(bVar, cVar.d());
        }
    }

    public void b() {
        a();
        this.f9493a = false;
        z0.a(this.f9494b, com.adcolony.sdk.a.b().h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f9493a = true;
        z0.c(this.f9494b);
        z0.c(this.f9495c);
        this.f9495c = null;
    }

    public void a(h0 h0Var) {
        if (!com.adcolony.sdk.a.d() || this.f9493a) {
            return;
        }
        this.d = new c(h0Var.a(), null);
        Runnable runnable = this.f9495c;
        if (runnable != null) {
            z0.c(runnable);
            z0.b(this.f9495c);
        } else {
            z0.c(this.f9494b);
            z0.a(this.f9494b, com.adcolony.sdk.a.b().h());
        }
    }
}
