package sg.bigo.ads.ad.interstitial.a;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.core.c;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.ad.interstitial.a.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45819a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f45821c;
    public InterfaceC0800b d;
    public final sg.bigo.ads.ad.interstitial.a.a.b f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45820b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final sg.bigo.ads.ad.interstitial.a.b.a.C0801a f45822e = new sg.bigo.ads.ad.interstitial.a.b.a.C0801a();

    public final class a implements sg.bigo.ads.ad.interstitial.a.b.b.a {
        private a() {
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a() {
            Runnable runnable = b.this.f45821c;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void b() {
            InterfaceC0800b interfaceC0800b = b.this.d;
            if (interfaceC0800b != null) {
                interfaceC0800b.a();
            }
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void c(c cVar, long j) {
            b.this.f45822e.a(cVar, 1, j);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void d(c cVar, long j) {
            b.this.f45822e.a(cVar, 5, j);
        }

        public /* synthetic */ a(b bVar, byte b2) {
            this();
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a(c cVar) {
            b.this.f45822e.a(cVar, 6, 0L);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void b(c cVar, long j) {
            b.this.f45822e.a(cVar, 2, j);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final boolean c() {
            return false;
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a(c cVar, long j) {
            b.this.f45822e.a(cVar, 0, j);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0800b {
        void a();
    }

    public b(Ad ad, l lVar, c cVar, sg.bigo.ads.core.player.c cVar2, p pVar) {
        sg.bigo.ads.core.f.a.a next;
        byte b2 = 0;
        sg.bigo.ads.core.f.a.a.C0869a c0869aBn = ad instanceof sg.bigo.ads.core.a.a ? ((sg.bigo.ads.core.a.a) ad).bn() : null;
        if ((c0869aBn == null || !c0869aBn.a()) && pVar != null) {
            Iterator<sg.bigo.ads.core.f.a.a> it = pVar.f48526A.iterator();
            while (it.hasNext() && ((next = it.next()) == null || (c0869aBn = next.a()) == null || !c0869aBn.a())) {
            }
        }
        sg.bigo.ads.core.f.a.a.C0869a c0869a = c0869aBn;
        boolean zS = lVar.s();
        boolean zAc = cVar.ac();
        boolean z2 = c0869a != null && c0869a.a();
        int iX = cVar.x();
        boolean z3 = (zS || cVar.ar()) && zAc && z2 && (iX == 3 || iX == 4 || iX == 12 || iX == 20);
        this.f45819a = z3;
        this.f = z3 ? new sg.bigo.ads.ad.interstitial.a.a.b(ad, cVar, cVar2, pVar, c0869a, new a(this, b2)) : new sg.bigo.ads.ad.interstitial.a.a.b(ad, cVar, null, null, null, null);
        sg.bigo.ads.common.t.a.a(0, 3, "PlayableAdCompanion", "The ad with slot: " + lVar.l() + ", pid: " + lVar.n() + " is playable: " + z3);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final View a() {
        return this.f.f45783i;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        if (this.f45819a) {
            return this.f.b();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        this.f.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        this.f.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void e() {
        this.f.e();
        this.d = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        this.f.f();
    }

    public b(Ad ad, l lVar, sg.bigo.ads.core.f.a.a.C0869a c0869a, c cVar, sg.bigo.ads.core.player.c cVar2, p pVar) {
        byte b2 = 0;
        boolean z2 = cVar.x() == 3 || cVar.x() == 4 || cVar.x() == 20;
        this.f45819a = z2;
        if (z2) {
            this.f = new sg.bigo.ads.ad.interstitial.a.a.b(ad, cVar, cVar2, pVar, c0869a, new a(this, b2));
        } else {
            this.f = new sg.bigo.ads.ad.interstitial.a.a.b(ad, cVar, null, null, null, null);
        }
        sg.bigo.ads.common.t.a.a(0, 3, "PlayableAdCompanion", "The ad with slot: " + lVar.l() + ", pid: " + lVar.n() + " is playable: " + z2);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i2) {
        if (i2 == 1) {
            this.f45820b = true;
        }
        this.f.a(i2);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i2, int i3) {
        this.f.a(i2, i3);
    }

    public final void a(Runnable runnable) {
        if (this.f45821c == runnable) {
            this.f45821c = null;
        }
    }

    public final void a(h hVar) {
        this.f.g = hVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean a(Context context) {
        if (this.f45819a) {
            return this.f.a(context);
        }
        return false;
    }
}
