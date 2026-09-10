package com.smartdigimkt.f5;

import com.smartdigimkt.q8.p;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class g implements com.smartdigimkt.f5.f, com.smartdigimkt.f5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.smartdigimkt.y4.c f35091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.smartdigimkt.w6.f f35092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.smartdigimkt.a7.a f35093c;
    private com.smartdigimkt.f5.a g;
    private int f = 0;
    boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f35094e = false;

    public class a implements Runnable {
        final /* synthetic */ j X;

        public a(j jVar) {
            this.X = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.g != null) {
                g.this.g.onAdShow(this.X);
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ j X;

        public b(j jVar) {
            this.X = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.g != null) {
                g.this.g.onAdClick(this.X);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.g == null || !(g.this.g instanceof com.smartdigimkt.f5.e)) {
                return;
            }
            ((com.smartdigimkt.f5.e) g.this.g).onVideoAdPlayStart();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.g == null || !(g.this.g instanceof com.smartdigimkt.f5.e)) {
                return;
            }
            ((com.smartdigimkt.f5.e) g.this.g).onVideoAdPlayEnd();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.g == null || !(g.this.g instanceof com.smartdigimkt.f5.e)) {
                return;
            }
            ((com.smartdigimkt.f5.e) g.this.g).onRewarded();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.g != null) {
                g.this.g.onAdClosed();
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.f5.g$g, reason: collision with other inner class name */
    public class RunnableC0482g implements Runnable {
        final /* synthetic */ boolean X;

        public RunnableC0482g(boolean z2) {
            this.X = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.g != null) {
                g.this.g.onDeeplinkCallback(this.X);
            }
        }
    }

    public class h implements Runnable {
        final /* synthetic */ com.smartdigimkt.v3.h X;

        public h(com.smartdigimkt.v3.h hVar) {
            this.X = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.g != null) {
                g.this.g.onShowFailed(this.X);
            }
        }
    }

    public class i implements Runnable {
        final /* synthetic */ int X;

        public i(int i2) {
            this.X = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.g == null || !(g.this.g instanceof com.smartdigimkt.f5.h)) {
                return;
            }
            ((com.smartdigimkt.f5.h) g.this.g).a(this.X);
        }
    }

    public g(com.smartdigimkt.y4.c cVar, com.smartdigimkt.f5.a aVar) {
        this.f35091a = cVar;
        this.f35092b = cVar.g();
        this.f35093c = cVar.f();
        this.g = aVar;
    }

    private void b() {
        com.smartdigimkt.w6.f fVar = this.f35092b;
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            if (dVar.X0() == 1) {
                com.smartdigimkt.p6.d.b().c(dVar);
                if (this.f35093c == null || this.d) {
                    return;
                }
                this.d = true;
                com.smartdigimkt.p6.f.c().b(this.f35093c.Y(), dVar);
            }
        }
    }

    @Override // com.smartdigimkt.f5.a
    public void onAdClick(j jVar) {
        this.f++;
        a();
        boolean z2 = this.f35092b.i() != null && this.f <= this.f35092b.i().X();
        if (jVar != null) {
            int i2 = jVar.f35100a;
            int i3 = jVar.f35101b;
            Map<String, Object> mapE = this.f35091a.e();
            if (mapE != null) {
                mapE.put("click_click_type", Integer.valueOf(i2));
                mapE.put("click_click_area", Integer.valueOf(i3));
                mapE.put("imp_native_ad_render_template_id", Integer.valueOf(jVar.f35103e));
                if (z2) {
                    mapE.put("click_tk_type", 28);
                } else {
                    mapE.put("click_tk_type", 6);
                }
            }
            this.f35093c.w(i2);
            this.f35093c.v(i3);
            this.f35093c.g(jVar.f35103e);
            if (z2) {
                this.f35093c.b(true);
            } else {
                this.f35093c.b(false);
            }
        }
        com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(6, this.f35093c);
        if (!z2 || this.f35093c.f0()) {
            com.smartdigimkt.l7.b.a().e(new b(jVar));
        }
    }

    @Override // com.smartdigimkt.f5.a
    public void onAdClosed() {
        com.smartdigimkt.l7.b.a().e(new f());
    }

    @Override // com.smartdigimkt.f5.a
    public void onAdShow(j jVar) {
        b();
        Map<String, Object> mapE = this.f35091a.e();
        if (jVar != null) {
            int iO = this.f35092b.o();
            int i2 = jVar.f35103e;
            if (mapE != null) {
                mapE.put("imp_dp_package_install_state", Integer.valueOf(iO));
                mapE.put("imp_native_ad_render_template_id", Integer.valueOf(jVar.f35103e));
            }
            com.smartdigimkt.a7.a aVar = this.f35093c;
            if (aVar != null) {
                aVar.d(iO);
                this.f35093c.g(i2);
            }
        }
        if (jVar != null) {
            int i3 = this.f35091a.h().f39164b;
            int i4 = 1;
            if (i3 == 1) {
                if (mapE != null) {
                    mapE.put("imp_rv_player_render_type", Integer.valueOf(jVar.f35102c));
                    mapE.put("imp_ad_close_button_style", Integer.valueOf(jVar.g));
                }
                this.f35093c.s(jVar.f35102c);
                this.f35093c.c(jVar.g);
            } else if (i3 == 3 && mapE != null) {
                mapE.put("imp_ad_close_button_style", Integer.valueOf(jVar.g));
                mapE.put("imp_iv_close_button_type", Integer.valueOf(jVar.d));
                if (!jVar.f) {
                    i4 = jVar.d == 1 ? 4 : 2;
                } else if (jVar.d == 1) {
                    i4 = 3;
                }
                mapE.put("imp_iv_render_type", Integer.valueOf(i4));
                this.f35093c.l(jVar.d);
                this.f35093c.c(jVar.g);
                this.f35093c.e(i4);
            }
        }
        com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(4, this.f35093c);
        com.smartdigimkt.a7.a aVar2 = this.f35093c;
        if (aVar2 != null && !aVar2.f0()) {
            p.a(this.f35091a);
        }
        com.smartdigimkt.l7.b.a().e(new a(jVar));
    }

    @Override // com.smartdigimkt.f5.a
    public void onDeeplinkCallback(boolean z2) {
        boolean z3 = this.f35092b.i() != null && this.f <= this.f35092b.i().X();
        if (this.f35093c.f0() || z3) {
            return;
        }
        com.smartdigimkt.l7.b.a().e(new RunnableC0482g(z2));
    }

    @Override // com.smartdigimkt.f5.e
    public void onRewarded() {
        com.smartdigimkt.l7.b.a().e(new e());
    }

    @Override // com.smartdigimkt.f5.a
    public void onShowFailed(com.smartdigimkt.v3.h hVar) {
        com.smartdigimkt.l7.b.a().e(new h(hVar));
    }

    @Override // com.smartdigimkt.f5.e
    public void onVideoAdPlayEnd() {
        com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(9, this.f35093c);
        com.smartdigimkt.l7.b.a().e(new d());
    }

    @Override // com.smartdigimkt.f5.e
    public void onVideoAdPlayStart() {
        com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(8, this.f35093c);
        com.smartdigimkt.l7.b.a().e(new c());
    }

    private void a() {
        com.smartdigimkt.w6.f fVar = this.f35092b;
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            if (dVar.X0() != 1 || this.f35093c == null || this.f35094e) {
                return;
            }
            this.f35094e = true;
            com.smartdigimkt.p6.f.c().a(this.f35093c.Y(), dVar);
        }
    }

    @Override // com.smartdigimkt.f5.h
    public void a(int i2) {
        com.smartdigimkt.l7.b.a().e(new i(i2));
    }
}
