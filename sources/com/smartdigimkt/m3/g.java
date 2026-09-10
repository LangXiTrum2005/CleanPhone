package com.smartdigimkt.m3;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.smartdigimkt.o3.o;
import com.smartdigimkt.sdk.api.IOfferClickHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    public static final int s = 1;
    public static final int t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f36598u = 3;
    public static final int v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f36599w = 6;
    public static final int x = 7;
    public static final int y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f36600z = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.smartdigimkt.w6.f f36603c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Context f36604e;
    com.smartdigimkt.v6.a f;
    IOfferClickHandler g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.smartdigimkt.o3.k f36605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.smartdigimkt.o3.b f36606i;
    private com.smartdigimkt.o3.a.C0557a j;
    private com.smartdigimkt.o3.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.smartdigimkt.o3.d f36607l;
    private com.smartdigimkt.o3.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.smartdigimkt.o3.i f36608n;
    private o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.smartdigimkt.o3.g f36609p;
    boolean q;
    com.smartdigimkt.s6.c r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36601a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36602b = 10;
    boolean d = false;

    public class a implements Runnable {
        final /* synthetic */ com.smartdigimkt.v3.l X;

        /* JADX INFO: renamed from: com.smartdigimkt.m3.g$a$a, reason: collision with other inner class name */
        public class C0537a implements com.smartdigimkt.c7.a {

            /* JADX INFO: renamed from: com.smartdigimkt.m3.g$a$a$a, reason: collision with other inner class name */
            public class RunnableC0538a implements Runnable {
                public RunnableC0538a() {
                }

                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    a aVar = a.this;
                    g.this.b(aVar.X);
                }
            }

            public C0537a() {
            }

            @Override // com.smartdigimkt.c7.a
            public void a(boolean z2) {
                if (z2) {
                    com.smartdigimkt.l7.b.a().g(new RunnableC0538a());
                } else if (g.this.f36606i != null) {
                    g.this.f36606i.clickEndUI();
                }
            }
        }

        public a(com.smartdigimkt.v3.l lVar) {
            this.X = lVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (g.this.k.a().a()) {
                return;
            }
            g gVar = g.this;
            int iH = i.h(gVar.f36603c, gVar.f);
            if (iH == 1) {
                g.this.m.a(g.this.m.c(), com.smartdigimkt.o3.e.HANDLE_SUCCESS_WITH_WEB_CLICK);
                com.smartdigimkt.o3.n nVarA = g.this.f36607l.a();
                g gVar2 = g.this;
                com.smartdigimkt.i7.d.a(gVar2.f36603c, gVar2.f, 1, nVarA.a() ? 1 : 2);
                return;
            }
            if (iH > 1) {
                g gVar3 = g.this;
                com.smartdigimkt.i7.d.a(gVar3.f36603c, gVar3.f, iH, 0);
            }
            com.smartdigimkt.v3.l lVar = this.X;
            if (!lVar.m) {
                g gVar4 = g.this;
                if (gVar4.q && i.a(gVar4.f36603c, gVar4.f.t, lVar, 1)) {
                    g gVar5 = g.this;
                    gVar5.r.openDataConfirmDialog(gVar5.f36604e, gVar5.f36603c, gVar5.f, new C0537a());
                    return;
                }
            }
            g.this.b(this.X);
        }
    }

    public class b implements com.smartdigimkt.c7.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.o3.e f36612a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                b bVar = b.this;
                g.this.a(bVar.f36612a);
            }
        }

        public b(com.smartdigimkt.o3.e eVar) {
            this.f36612a = eVar;
        }

        @Override // com.smartdigimkt.c7.a
        public void a(boolean z2) {
            if (z2) {
                com.smartdigimkt.l7.b.a().g(new a());
            } else if (g.this.f36606i != null) {
                g.this.f36606i.clickEndUI();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextK = com.smartdigimkt.m6.b.p().k();
            if (contextK != null) {
                Context applicationContext = contextK.getApplicationContext();
                try {
                    Toast.makeText(applicationContext.getApplicationContext(), com.smartdigimkt.n8.h.a(applicationContext, "myoffer_click_no_response", com.smartdigimkt.v0.k.f38992h), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public interface d {
        void clickCallback();

        void clickEndUI();

        void clickStartUI();

        void deeplinkCallback(boolean z2);

        boolean openInternalWebView(String str, IOfferClickHandler iOfferClickHandler);
    }

    public g(Context context, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, View view) {
        boolean z2 = false;
        this.q = false;
        this.f36603c = fVar;
        this.f = aVar;
        this.f36604e = context.getApplicationContext();
        this.f36603c.N(aVar.f);
        this.g = new com.smartdigimkt.x4.e();
        this.f36605h = new com.smartdigimkt.o3.k(fVar, aVar);
        this.f36606i = new com.smartdigimkt.o3.b();
        com.smartdigimkt.o3.a.C0557a c0557a = new com.smartdigimkt.o3.a.C0557a();
        this.j = c0557a;
        c0557a.f37332a = this.f36604e;
        c0557a.f37333b = this.f36603c;
        c0557a.f37334c = this.f;
        c0557a.d = this.f36605h;
        c0557a.f37335e = this.f36606i;
        c0557a.f = this.g;
        this.k = new com.smartdigimkt.o3.h(c0557a);
        this.f36607l = new com.smartdigimkt.o3.d(this.j);
        this.m = new com.smartdigimkt.o3.c(this.j);
        this.f36608n = new com.smartdigimkt.o3.i(this.j);
        this.o = new o(this.j);
        this.f36609p = new com.smartdigimkt.o3.g(this.j);
        if (view != null) {
            this.f36607l.a(new WeakReference<>(view));
        }
        this.f36607l.a(this.m);
        this.m.a(this.f36607l);
        com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
        this.r = cVarB;
        if (cVarB != null && cVarB.a()) {
            z2 = true;
        }
        this.q = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.smartdigimkt.v3.l lVar) throws Throwable {
        com.smartdigimkt.o3.e eVar = com.smartdigimkt.o3.e.NO_HANDLE;
        if (this.f.t.R() != 2) {
            eVar = this.f36607l.a().a() ? com.smartdigimkt.o3.e.HANDLE_SUCCESS : com.smartdigimkt.o3.e.HANDLE_FAIL;
        }
        com.smartdigimkt.o3.e eVar2 = com.smartdigimkt.o3.e.HANDLE_SUCCESS;
        if (eVar == eVar2 && this.f.t.R() == 1) {
            return;
        }
        if (lVar.m || !this.q || eVar == eVar2 || !i.a(this.f36603c, this.f.t, lVar, 4)) {
            a(eVar);
        } else {
            this.r.openDataConfirmDialog(this.f36604e, this.f36603c, this.f, new b(eVar));
        }
    }

    public com.smartdigimkt.v6.a c() {
        return this.f;
    }

    public boolean d() {
        com.smartdigimkt.o3.b bVar = this.f36606i;
        if (bVar != null) {
            return bVar.b();
        }
        return false;
    }

    public void a(d dVar) {
        com.smartdigimkt.o3.b bVar = this.f36606i;
        if (bVar != null) {
            bVar.a(dVar);
        }
    }

    public void a(com.smartdigimkt.v3.l lVar) {
        com.smartdigimkt.v3.a aVar;
        if (this.d || d()) {
            return;
        }
        com.smartdigimkt.o3.k kVar = this.f36605h;
        if (kVar != null) {
            kVar.a(lVar);
        }
        com.smartdigimkt.o3.b bVar = this.f36606i;
        if (bVar != null) {
            bVar.d();
        }
        if (lVar != null && (aVar = lVar.f39137i) != null) {
            int i2 = aVar.f39068n;
            int i3 = aVar.o;
        }
        com.smartdigimkt.l7.b.a().g(new a(lVar));
    }

    public com.smartdigimkt.w6.f b() {
        return this.f36603c;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003a A[PHI: r3
  0x003a: PHI (r3v3 com.smartdigimkt.o3.n) = (r3v1 com.smartdigimkt.o3.n), (r3v4 com.smartdigimkt.o3.n), (r3v6 com.smartdigimkt.o3.n), (r3v8 com.smartdigimkt.o3.n) binds: [B:45:0x0093, B:36:0x006c, B:29:0x0053, B:20:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    public void a(com.smartdigimkt.o3.e eVar) throws Throwable {
        com.smartdigimkt.o3.n nVarA;
        com.smartdigimkt.o3.n nVarA2;
        int iJ = this.f36603c.j();
        String strC = this.m.c();
        if (iJ == 1) {
            nVarA = eVar != com.smartdigimkt.o3.e.HANDLE_SUCCESS ? this.f36608n.a() : null;
            if (nVarA == null || !nVarA.a()) {
                nVarA2 = this.m.a(strC, eVar);
            } else {
                nVarA2 = nVarA;
            }
        } else if (iJ == 2 || iJ == 3) {
            nVarA2 = this.m.a(strC, eVar);
        } else if (iJ == 4) {
            nVarA = eVar != com.smartdigimkt.o3.e.HANDLE_SUCCESS ? this.f36608n.a() : null;
            if (nVarA == null || !nVarA.a()) {
                nVarA2 = this.m.a(strC, eVar);
            } else {
                nVarA2 = nVarA;
            }
        } else if (iJ == 6) {
            nVarA = eVar != com.smartdigimkt.o3.e.HANDLE_SUCCESS ? this.o.a() : null;
            if (nVarA == null || !nVarA.a()) {
                nVarA2 = this.m.a(strC, eVar);
            } else {
                nVarA2 = nVarA;
            }
        } else if (iJ != 7) {
            nVarA2 = this.m.a(strC, eVar);
        } else {
            nVarA = eVar != com.smartdigimkt.o3.e.HANDLE_SUCCESS ? this.f36609p.a() : null;
            if (nVarA == null || !nVarA.a()) {
                nVarA2 = this.m.a(strC, eVar);
            } else {
                nVarA2 = nVarA;
            }
        }
        com.smartdigimkt.o3.b bVar = this.f36606i;
        if (bVar != null) {
            bVar.clickEndUI();
        }
        if (nVarA2 == null || nVarA2.a()) {
            return;
        }
        com.smartdigimkt.l7.b.a().e(new c());
    }

    public void a() {
        this.d = true;
        com.smartdigimkt.o3.b bVar = this.f36606i;
        if (bVar != null) {
            bVar.a();
            this.f36606i = null;
        }
        com.smartdigimkt.o3.d dVar = this.f36607l;
        if (dVar != null) {
            dVar.destroy();
        }
    }
}
