package com.smartdigimkt.d1;

import android.text.TextUtils;
import android.view.View;
import com.smartdigimkt.b1.c;
import com.smartdigimkt.expressad.out.TemplateBannerView;
import com.smartdigimkt.f1.h;
import com.smartdigimkt.f1.i;
import com.smartdigimkt.v0.a0;
import com.smartdigimkt.v0.l;
import com.smartdigimkt.x.e;
import com.smartdigimkt.z0.d;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    private static String v = "BannerController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34381c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TemplateBannerView f34382e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34383h;
    private h j;
    private e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f34385l;
    private com.smartdigimkt.n1.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f34386n;
    private boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f34387p;
    private boolean q;
    private boolean r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i f34388u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34384i = -1;
    private com.smartdigimkt.a1.c s = new C0455a();
    private com.smartdigimkt.a1.b t = new b();

    public class b implements com.smartdigimkt.a1.b {
        public b() {
        }

        @Override // com.smartdigimkt.a1.b
        public void a(String str, e eVar, boolean z2) {
            a.this.k = eVar;
        }

        @Override // com.smartdigimkt.a1.b
        public void b(com.smartdigimkt.y.c cVar) {
            if (a.this.j != null) {
                a.this.j.onLoadFailed(com.smartdigimkt.x0.a.f39857c);
            }
            a.this.c();
        }

        @Override // com.smartdigimkt.a1.b
        public void a(com.smartdigimkt.y.c cVar) {
            String str = "";
            if (cVar != null) {
                String strJ = cVar.j();
                str = TextUtils.isEmpty(strJ) ? "" : strJ;
                cVar.b();
                cVar.s();
            }
            if (a.this.j != null) {
                a.this.j.onLoadFailed(str);
            }
            a.this.c();
        }

        @Override // com.smartdigimkt.a1.b
        public void a(String str, boolean z2) {
            e unused = a.this.k;
            if (a.this.f34382e != null) {
                try {
                    a.this.q = true;
                    a.this.j();
                } catch (Throwable th) {
                    a.this.q = false;
                    if (a.this.j != null) {
                        a.this.j.onLoadFailed("startShowBanner fail:" + th.getMessage());
                    }
                    String unused2 = a.v;
                    th.getMessage();
                }
            }
        }
    }

    public a(TemplateBannerView templateBannerView, i iVar, String str, String str2) {
        this.f34382e = templateBannerView;
        if (iVar != null) {
            this.f = iVar.a();
            this.g = iVar.b();
        }
        this.f34388u = iVar;
        this.f34379a = str2;
        this.f34380b = TextUtils.isEmpty(str) ? "" : str;
        f();
    }

    private int a(int i2) {
        if (i2 > 0) {
            if (i2 < 10) {
                return 10;
            }
            if (i2 > 180) {
                return 180;
            }
        }
        return i2;
    }

    private void k() {
        TemplateBannerView templateBannerView = this.f34382e;
        if (templateBannerView != null) {
            if (!this.f34386n || !this.o || this.r || a0.a(templateBannerView, 1)) {
                com.smartdigimkt.b1.a.a().a(2, this.f34380b, this.f34379a, null, null);
            } else {
                com.smartdigimkt.b1.a.a().a(3, this.f34380b, this.f34379a, new d(this.g + "x" + this.f, this.f34383h * 1000), this.t);
            }
            if (this.f34386n) {
                return;
            }
            com.smartdigimkt.b1.a.a().a(4, this.f34380b, this.f34379a, null, null);
            com.smartdigimkt.b1.a.a().b(this.f34379a);
        }
    }

    private void l() {
        com.smartdigimkt.n1.c cVarE = com.smartdigimkt.n1.b.b().e(com.smartdigimkt.u.a.f().a(), this.f34379a);
        this.m = cVarE;
        if (cVarE == null) {
            this.m = com.smartdigimkt.n1.c.a(this.f34379a);
        }
        if (this.f34384i == -1) {
            this.f34383h = a(this.m.F());
        }
        if (this.d == 0) {
            boolean z2 = this.m.f() == 1;
            this.f34381c = z2;
            c cVar = this.f34385l;
            if (cVar != null) {
                cVar.c(z2);
            }
        }
    }

    public void c() {
    }

    private boolean a(View view) {
        return true;
    }

    private void f() {
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f34387p || !this.q) {
            return;
        }
        if (!a(this.f34382e)) {
            a(com.smartdigimkt.x0.a.g);
        } else if (this.k != null) {
            if (this.f34385l == null) {
                this.f34385l = new c(this.f34382e, this.s, this.f34380b, this.f34379a, this.f34381c, this.m);
            }
            this.f34385l.a(this.f34388u);
            this.f34385l.b(this.f34386n);
            this.f34385l.d(this.o);
            this.f34385l.a(this.f34381c, this.d);
            this.f34385l.b(this.k);
        } else {
            a(com.smartdigimkt.x0.a.f39859h);
        }
        this.q = false;
    }

    public String d() {
        e eVar = this.k;
        return eVar != null ? l.a(eVar.f()) : "";
    }

    public String e() {
        e eVar = this.k;
        return (eVar == null || eVar.y() == null) ? "" : this.k.y();
    }

    public void g() {
        com.smartdigimkt.b1.a.a().a(4, this.f34380b, this.f34379a, new d(this.g + "x" + this.f, this.f34383h * 1000), this.t);
    }

    public void h() {
        com.smartdigimkt.b1.a.a().a(3, this.f34380b, this.f34379a, new d(this.g + "x" + this.f, this.f34383h * 1000), this.t);
    }

    public void i() {
        this.f34387p = true;
        if (this.j != null) {
            this.j = null;
        }
        if (this.t != null) {
            this.t = null;
        }
        if (this.s != null) {
            this.s = null;
        }
        if (this.f34382e != null) {
            this.f34382e = null;
        }
        com.smartdigimkt.b1.a.a().a(4, this.f34380b, this.f34379a, null, null);
        com.smartdigimkt.b1.a.a().b(this.f34379a);
        com.smartdigimkt.b1.a.a().b();
        c cVar = this.f34385l;
        if (cVar != null) {
            cVar.h();
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.d1.a$a, reason: collision with other inner class name */
    public class C0455a implements com.smartdigimkt.a1.c {
        public C0455a() {
        }

        @Override // com.smartdigimkt.a1.c
        public void a(List<com.smartdigimkt.x.d> list) {
            if (a.this.j != null) {
                a.this.j.onLoadSuccessed();
            }
            String unused = a.v;
        }

        @Override // com.smartdigimkt.a1.c
        public void closeFullScreen() {
            if (a.this.j != null) {
                a.this.j.closeFullScreen();
                a.this.r = false;
                com.smartdigimkt.b1.a.a().a(3, a.this.f34380b, a.this.f34379a, new d(a.this.g + "x" + a.this.f, a.this.f34383h * 1000), a.this.t);
            }
        }

        @Override // com.smartdigimkt.a1.c
        public void onClick(com.smartdigimkt.x.d dVar) {
            if (a.this.j != null) {
                a.this.j.onClick(dVar);
            }
        }

        @Override // com.smartdigimkt.a1.c
        public void onCloseBanner() {
            if (a.this.j != null) {
                a.this.j.onCloseBanner();
            }
        }

        @Override // com.smartdigimkt.a1.c
        public void onLeaveApp() {
            if (a.this.j != null) {
                a.this.j.onLeaveApp();
            }
        }

        @Override // com.smartdigimkt.a1.c
        public void onShowFailed(String str) {
            a.this.a(str);
        }

        @Override // com.smartdigimkt.a1.c
        public void showFullScreen() {
            if (a.this.j != null) {
                a.this.j.showFullScreen();
                a.this.r = true;
                com.smartdigimkt.b1.a.a().a(2, a.this.f34380b, a.this.f34379a, null, null);
            }
        }

        @Override // com.smartdigimkt.a1.c
        public void a(com.smartdigimkt.x.d dVar, boolean z2) {
            a.this.c();
            if (a.this.j == null || z2) {
                return;
            }
            a.this.j.onLogImpression();
        }

        @Override // com.smartdigimkt.a1.c
        public void a(boolean z2) {
            if (z2) {
                com.smartdigimkt.b1.a.a().a(2, a.this.f34380b, a.this.f34379a, null, null);
                return;
            }
            com.smartdigimkt.b1.a.a().a(3, a.this.f34380b, a.this.f34379a, new d(a.this.g + "x" + a.this.f, a.this.f34383h * 1000), a.this.t);
        }
    }

    public void b(boolean z2) {
        this.f34386n = z2;
        b();
        j();
    }

    public void c(boolean z2) {
        this.o = z2;
        b();
    }

    public void b() {
        k();
        c cVar = this.f34385l;
        if (cVar != null) {
            cVar.b(this.f34386n);
            this.f34385l.d(this.o);
        }
    }

    public void a(i iVar) {
        if (iVar != null) {
            this.f = iVar.a();
            this.g = iVar.b();
        }
    }

    public void a(boolean z2) {
        this.f34381c = z2;
        this.d = z2 ? 1 : 2;
    }

    public void a(e eVar) {
        this.k = eVar;
        com.smartdigimkt.b1.a.a().a(this.f34380b, this.f34379a, eVar, this.t);
    }

    public void a(h hVar) {
        this.j = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        h hVar = this.j;
        if (hVar != null) {
            hVar.onLoadFailed(str);
        }
        c();
    }

    public void a(int i2, int i3, int i4, int i5) {
        c cVar = this.f34385l;
        if (cVar != null) {
            cVar.a(i2, i3, i4, i5);
        }
    }
}
