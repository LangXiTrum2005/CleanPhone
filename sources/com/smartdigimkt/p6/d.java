package com.smartdigimkt.p6;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    private static volatile d d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f37685a = d.class.getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.u6.h f37686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.u6.g f37687c;

    public class a implements Runnable {
        final /* synthetic */ com.smartdigimkt.w6.d X;

        public a(com.smartdigimkt.w6.d dVar) {
            this.X = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = new l();
            lVar.a(this.X.I0());
            lVar.b(this.X.K0());
            lVar.b(this.X.L0());
            lVar.a(0);
            d.this.f37686b.a(lVar);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ com.smartdigimkt.w6.d X;

        public b(com.smartdigimkt.w6.d dVar) {
            this.X = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = new l();
            lVar.a(this.X.I0());
            lVar.b(this.X.K0());
            lVar.b(this.X.L0());
            lVar.a(1);
            d.this.f37686b.b(lVar);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f37686b.c();
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.p6.d$d, reason: collision with other inner class name */
    public class RunnableC0568d implements Runnable {
        final /* synthetic */ com.smartdigimkt.w6.d X;

        public RunnableC0568d(com.smartdigimkt.w6.d dVar) {
            this.X = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = d.this.f37685a;
            this.X.K0();
            k kVar = new k();
            kVar.a(this.X.I0());
            kVar.b(this.X.K0());
            kVar.c(this.X.X());
            d.this.f37687c.a(kVar);
        }
    }

    private d() {
        if (com.smartdigimkt.m6.b.p().k() != null) {
            this.f37686b = com.smartdigimkt.u6.h.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k()));
            this.f37687c = com.smartdigimkt.u6.g.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k()));
        }
    }

    public void c(com.smartdigimkt.w6.d dVar) {
        dVar.K0();
        com.smartdigimkt.l7.b.a().g(new b(dVar));
    }

    public static d b() {
        if (d == null) {
            synchronized (d.class) {
                try {
                    if (d == null) {
                        d = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void a() {
        com.smartdigimkt.l7.b.a().g(new c());
    }

    public void a(com.smartdigimkt.w6.d dVar) {
        if (dVar.J0() == 1) {
            if (dVar.j() != 1 && dVar.j() != 4) {
                dVar.j();
                return;
            } else {
                com.smartdigimkt.l7.b.a().g(new RunnableC0568d(dVar));
                return;
            }
        }
        dVar.J0();
    }

    public List<j> a(int i2) {
        return this.f37687c.a(i2);
    }

    public void b(com.smartdigimkt.w6.d dVar) {
        dVar.K0();
        com.smartdigimkt.l7.b.a().g(new a(dVar));
    }

    public List<j> b(int i2) {
        return this.f37686b.a(i2);
    }
}
