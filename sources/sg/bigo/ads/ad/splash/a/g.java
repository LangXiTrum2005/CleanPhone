package sg.bigo.ads.ad.splash.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.b f46875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.a f46876c;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.ad.splash.b f46878h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46874a = c.a.f46853a;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46877e = 1;
    public boolean f = false;

    public static class a implements sg.bigo.ads.ad.banner.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f46881a = 13;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46882b = 6;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.ad.splash.b f46883c;

        public a(sg.bigo.ads.ad.splash.b bVar) {
            this.f46883c = bVar;
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a() {
            this.f46883c.d(this.f46882b);
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void b() {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(String str) {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.e eVar) {
            this.f46883c.x.a(iVar, this.f46881a, this.f46882b, eVar);
        }
    }

    public g(final sg.bigo.ads.ad.splash.b bVar, l lVar, sg.bigo.ads.api.core.c cVar) {
        int i2 = 0;
        int i3 = 1;
        this.g = 0;
        this.f46878h = bVar;
        sg.bigo.ads.ad.b.c cVar2 = bVar.x;
        boolean z2 = cVar2 instanceof sg.bigo.ads.ad.b.d;
        sg.bigo.ads.ad.interstitial.a.b bVar2 = new sg.bigo.ads.ad.interstitial.a.b(cVar2, lVar, cVar, z2 ? ((sg.bigo.ads.ad.b.d) cVar2).f45479J : null, z2 ? ((sg.bigo.ads.ad.b.d) cVar2).K : null);
        this.f46875b = bVar2;
        sg.bigo.ads.ad.interstitial.a.a aVar = new sg.bigo.ads.ad.interstitial.a.a(bVar2.f45819a, cVar2, lVar, cVar, z2 ? ((sg.bigo.ads.ad.b.d) cVar2).f45479J : null, z2 ? ((sg.bigo.ads.ad.b.d) cVar2).K : null);
        this.f46876c = aVar;
        if (this.f46875b.f45819a) {
            i2 = 1;
        } else if (aVar.f45773a) {
            i2 = 2;
        }
        this.g = i2;
        cVar.d(i2);
        if (!this.f46875b.f45819a && !(this.f46876c.f45774b instanceof sg.bigo.ads.ad.interstitial.a.a.b)) {
            i3 = 2;
        }
        cVar.e(i3);
        sg.bigo.ads.ad.interstitial.a.b bVar3 = this.f46875b;
        if (bVar3 != null) {
            bVar3.a(new a(bVar));
            this.f46875b.a(bVar.f45584b.f);
        }
        sg.bigo.ads.ad.interstitial.a.a aVar2 = this.f46876c;
        if (aVar2 != null) {
            aVar2.a(new a(bVar));
            this.f46876c.a(new sg.bigo.ads.ad.interstitial.a.b.c.a() { // from class: sg.bigo.ads.ad.splash.a.g.1
                @Override // sg.bigo.ads.ad.interstitial.a.b.c.a
                public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.e eVar) {
                    bVar.x.a(iVar, 15, 9, eVar);
                }
            });
            this.f46876c.a(bVar.f45584b.f);
        }
    }

    private boolean f() {
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f46875b;
        if (bVar == null || !bVar.f45819a || !bVar.b()) {
            return false;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar2 = this.f46875b;
        return (bVar2.f45820b || bVar2.f.f45783i == null) ? false : true;
    }

    private boolean g() {
        sg.bigo.ads.ad.interstitial.a.a aVar = this.f46876c;
        return aVar != null && aVar.f45773a && aVar.b() && this.f46876c.a() != null;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void c() {
        this.f46874a = c.a.d;
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f46875b;
        if (bVar != null) {
            bVar.e();
            this.f46875b = null;
        }
        sg.bigo.ads.ad.interstitial.a.a aVar = this.f46876c;
        if (aVar != null) {
            aVar.e();
            this.f46876c = null;
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final int d() {
        return this.f46874a;
    }

    public final boolean e() {
        return f() || g();
    }

    public final void a(Runnable runnable) {
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f46875b;
        if (bVar != null) {
            bVar.a(runnable);
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z2) {
        if (z2) {
            if (this.f) {
                sg.bigo.ads.ad.interstitial.a.b bVar = this.f46875b;
                if (bVar != null) {
                    bVar.f.c();
                    return;
                }
                return;
            }
            sg.bigo.ads.ad.interstitial.a.a aVar = this.f46876c;
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        if (this.f) {
            sg.bigo.ads.ad.interstitial.a.b bVar2 = this.f46875b;
            if (bVar2 != null) {
                bVar2.f.d();
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.a.a aVar2 = this.f46876c;
        if (aVar2 != null) {
            aVar2.d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [sg.bigo.ads.api.core.c] */
    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z2, ViewGroup viewGroup, int i2) {
        int i3;
        this.f46874a = z2 ? c.a.f46854b : c.a.f46855c;
        if (z2) {
            if (this.f46877e == 2) {
                viewGroup.removeViewAt(1);
            }
            if (f()) {
                View view = this.f46875b.f.f45783i;
                viewGroup.addView(view, 1, new FrameLayout.LayoutParams(-1, -1));
                if (view != null) {
                    view.setTag(19);
                }
                this.f46875b.a(1);
                this.d = true;
                this.f = true;
                i3 = 5;
            } else {
                View viewA = this.f46876c.a();
                viewGroup.addView(viewA, 1, new FrameLayout.LayoutParams(-1, -1));
                if (viewA != null) {
                    viewA.setTag(20);
                }
                this.f46876c.a(1);
                this.d = true;
                i3 = 7;
            }
            int i4 = this.f46877e == 2 ? 9 : 8;
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) this.f46878h.x.f(), i3, i2);
            this.f46878h.x.a(viewGroup, (MediaView) null, (ImageView) null, (AdOptionsView) null, (List<View>) null, i4, null);
        }
    }
}
