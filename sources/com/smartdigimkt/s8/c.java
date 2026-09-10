package com.smartdigimkt.s8;

import com.smartdigimkt.h7.e;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    private static final long d = 300000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f38245a = "sdm_handler";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f38246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f38247c;

    public class a implements com.smartdigimkt.h7.b {
        private final b X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private final c f38248Y;

        public a(b bVar, c cVar) {
            this.X = bVar;
            this.f38248Y = cVar;
        }

        @Override // com.smartdigimkt.h7.b
        public boolean a() {
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.n();
            this.X.r();
            if (this.X.r()) {
                return;
            }
            c cVar = this.f38248Y;
            if (cVar != null) {
                cVar.c(this.X);
            } else {
                this.X.a(com.smartdigimkt.v7.b.a("30001", "load ad timeout."));
                c.this.d(this.X);
            }
        }
    }

    public c a(c cVar) {
        this.f38246b = cVar;
        return cVar;
    }

    public abstract boolean b(b bVar);

    public final void c(b bVar) {
        try {
            if (bVar.h() != null) {
                d(bVar);
                return;
            }
            boolean zB = b(bVar);
            if (bVar.h() != null) {
                d(bVar);
                return;
            }
            if (zB) {
                a(bVar);
                return;
            }
            if (this.f38247c != null) {
                e.b().a(this.f38247c);
            }
            this.f38247c = new a(bVar, this.f38246b);
            e.b().a(this.f38247c, d);
        } catch (Throwable th) {
            bVar.a(com.smartdigimkt.v7.b.a("30001", "load ad with an error." + th));
            d(bVar);
        }
    }

    public void d(b bVar) {
        if (bVar.r()) {
            return;
        }
        bVar.a(true);
        if (this.f38247c != null) {
            e.b().a(this.f38247c);
        }
        e.b().a(bVar.b());
        bVar.c(System.currentTimeMillis());
        if (bVar.j() != null) {
            bVar.j().onAdLoadFail(bVar.h());
        }
        com.smartdigimkt.i7.d.a(bVar.d(), bVar.h());
    }

    public void e(b bVar) {
        if (bVar.r()) {
            return;
        }
        bVar.a(true);
        if (this.f38247c != null) {
            e.b().a(this.f38247c);
        }
        e.b().a(bVar.b());
        bVar.c(System.currentTimeMillis());
        d dVarA = bVar.a();
        if (bVar.j() != null) {
            bVar.j().onAdLoaded(dVarA.a());
        }
    }

    public final void a(b bVar) {
        if (this.f38247c != null) {
            e.b().a(this.f38247c);
        }
        c cVar = this.f38246b;
        if (cVar != null) {
            cVar.c(bVar);
        }
    }
}
