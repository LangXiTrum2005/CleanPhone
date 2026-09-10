package sg.bigo.ads.ad.interstitial.a;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ad.interstitial.a.b.c;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements sg.bigo.ads.ad.interstitial.a.b.b, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.b.a f45774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sg.bigo.ads.ad.interstitial.a.b.a.C0801a f45775c = new sg.bigo.ads.ad.interstitial.a.b.a.C0801a();

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a.a$a, reason: collision with other inner class name */
    public final class C0797a implements sg.bigo.ads.ad.interstitial.a.b.b.a {
        private C0797a() {
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a() {
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void b() {
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void c(sg.bigo.ads.api.core.c cVar, long j) {
            a.this.f45775c.a(cVar, 1, j);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void d(sg.bigo.ads.api.core.c cVar, long j) {
            a.this.f45775c.a(cVar, 5, j);
        }

        public /* synthetic */ C0797a(a aVar, byte b2) {
            this();
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a(sg.bigo.ads.api.core.c cVar) {
            a.this.f45775c.a(cVar, 6, 0L);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void b(sg.bigo.ads.api.core.c cVar, long j) {
            a.this.f45775c.a(cVar, 2, j);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final boolean c() {
            return true;
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a(sg.bigo.ads.api.core.c cVar, long j) {
            a.this.f45775c.a(cVar, 0, j);
        }
    }

    public final class b implements c.b {
        private b() {
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.c.b
        public final void a(sg.bigo.ads.api.core.c cVar) {
            a.this.f45775c.a(cVar, 6, 0L);
        }

        public /* synthetic */ b(a aVar, byte b2) {
            this();
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.c.b
        public final void a(sg.bigo.ads.api.core.c cVar, long j) {
            a.this.f45775c.a(cVar, 5, j);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.c.b
        public final void a(sg.bigo.ads.api.core.c cVar, long j, String str, int i2, String str2) {
            a.this.f45775c.a(cVar, 3, j, str, i2, str2, null);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.c.b
        public final void a(sg.bigo.ads.api.core.c cVar, long j, String str, int i2, String str2, String str3) {
            a.this.f45775c.a(cVar, 4, j, str, i2, str2, str3);
        }
    }

    public a(boolean z2, Ad ad, l lVar, sg.bigo.ads.api.core.c cVar, sg.bigo.ads.core.player.c cVar2, p pVar) {
        sg.bigo.ads.core.f.a.a.C0869a c0869aA;
        sg.bigo.ads.core.f.a.a.C0869a c0869aA2;
        sg.bigo.ads.core.f.a.a next;
        String str;
        byte b2 = 0;
        if (!cVar.ar() && !lVar.t()) {
            str = "render companion disable due to slot switch off";
        } else if (z2) {
            str = "render companion disable due to playable";
        } else if (cVar.x() == 3 || cVar.x() == 4 || cVar.x() == 12 || cVar.x() == 20) {
            if (ad instanceof sg.bigo.ads.core.a.a) {
                sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) ad;
                c0869aA = aVar.bn();
                c0869aA2 = aVar.bm();
            } else {
                c0869aA = null;
                c0869aA2 = null;
            }
            if ((c0869aA2 == null || !c0869aA2.a()) && ((c0869aA == null || !c0869aA.a()) && pVar != null)) {
                Iterator<sg.bigo.ads.core.f.a.a> it = pVar.f48526A.iterator();
                while (it.hasNext() && ((next = it.next()) == null || (((c0869aA2 = sg.bigo.ads.core.f.a.a.a(next.f48472b)) == null || !c0869aA2.a()) && ((c0869aA = next.a()) == null || !c0869aA.a())))) {
                }
            }
            sg.bigo.ads.core.f.a.a.C0869a c0869a = c0869aA;
            if (c0869aA2 != null && c0869aA2.a()) {
                sg.bigo.ads.common.t.a.a(0, 3, "EndPageVastCompanion", "render companion init with image.");
                this.f45774b = new sg.bigo.ads.ad.interstitial.a.a.c(ad, cVar, cVar2, pVar, new b(this, b2));
            }
            if (this.f45774b == null && c0869a != null && c0869a.a()) {
                sg.bigo.ads.common.t.a.a(0, 3, "EndPageVastCompanion", "render companion init with html.");
                this.f45774b = new sg.bigo.ads.ad.interstitial.a.a.b(ad, cVar, cVar2, pVar, c0869a, new C0797a(this, b2));
            }
            this.f45773a = this.f45774b != null;
            str = "The ad with slot: " + lVar.l() + ", pid: " + lVar.n() + " isRenderable: " + this.f45773a;
        } else {
            str = "render companion disable due to invalid type";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "EndPageVastCompanion", str);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final View a() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar;
        if (this.f45773a && (aVar = this.f45774b) != null) {
            return aVar.a();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar;
        if (this.f45773a && (aVar = this.f45774b) != null) {
            return aVar.b();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f45774b;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f45774b;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void e() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f45774b;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f45774b;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i2) {
        sg.bigo.ads.ad.interstitial.a.b.a aVar;
        if (this.f45773a && (aVar = this.f45774b) != null) {
            aVar.a(i2);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i2, int i3) {
        sg.bigo.ads.ad.interstitial.a.b.a aVar;
        if (this.f45773a && (aVar = this.f45774b) != null) {
            aVar.a(i2, i3);
        }
    }

    public final void a(h hVar) {
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f45774b;
        if (aVar instanceof sg.bigo.ads.ad.interstitial.a.a.b) {
            ((sg.bigo.ads.ad.interstitial.a.a.b) aVar).g = hVar;
        }
    }

    public final void a(c.a aVar) {
        sg.bigo.ads.ad.interstitial.a.b.a aVar2 = this.f45774b;
        if (aVar2 instanceof sg.bigo.ads.ad.interstitial.a.a.c) {
            ((sg.bigo.ads.ad.interstitial.a.a.c) aVar2).f = aVar;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean a(Context context) {
        sg.bigo.ads.common.t.a.a(0, 3, "EndPageVastCompanion", "tyr to start preload end page resource.");
        if (!this.f45773a) {
            sg.bigo.ads.common.t.a.a(0, 3, "EndPageVastCompanion", "end page resource is unavailable.");
            return false;
        }
        sg.bigo.ads.ad.interstitial.a.b.a aVar = this.f45774b;
        if (aVar != null) {
            return aVar.a(context);
        }
        return false;
    }
}
