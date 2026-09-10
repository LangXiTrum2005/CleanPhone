package sg.bigo.ads.ad.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends d {
    public d x;
    public d y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a f45436z;

    public abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final sg.bigo.ads.api.b.d.a<NativeAd> f45439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final sg.bigo.ads.api.b.d.a<NativeAd> f45440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final sg.bigo.ads.api.b.d.a<NativeAd> f45441c;
        final List<d> d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f45442e = {"", ""};
        private final List<sg.bigo.ads.common.p.g> k = new ArrayList();
        protected int f = 0;
        protected int g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected boolean f45443h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected boolean f45444i = false;

        public a(final sg.bigo.ads.api.b.d.a<NativeAd> aVar) {
            this.f45441c = aVar;
            this.f45439a = new sg.bigo.ads.api.b.d.a<NativeAd>() { // from class: sg.bigo.ads.ad.b.b.a.1
                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad) {
                    final NativeAd nativeAd = (NativeAd) ad;
                    sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.b.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.a(nativeAd);
                        }
                    });
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* bridge */ /* synthetic */ void a(Ad ad, int i2, int i3, String str) {
                    a.this.a(i2, i3, str);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* bridge */ /* synthetic */ void a(Ad ad, boolean z2, int i2, int i3, String str, boolean z3) {
                    aVar.a((NativeAd) ad, z2, i2, i3, str, z3);
                }
            };
            this.f45440b = new sg.bigo.ads.api.b.d.a<NativeAd>() { // from class: sg.bigo.ads.ad.b.b.a.2
                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad) {
                    final NativeAd nativeAd = (NativeAd) ad;
                    sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.b.a.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.a(nativeAd);
                        }
                    });
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* bridge */ /* synthetic */ void a(Ad ad, int i2, int i3, String str) {
                    a.this.a(i2, i3, str);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* bridge */ /* synthetic */ void a(Ad ad, boolean z2, int i2, int i3, String str, boolean z3) {
                    aVar.a((NativeAd) ad, z2, i2, i3, str, z3);
                }
            };
        }

        public final sg.bigo.ads.api.b.d.a<NativeAd> a() {
            return this.f45439a;
        }

        public final sg.bigo.ads.api.b.d.a<NativeAd> b() {
            return this.f45440b;
        }

        public abstract void c();

        public final void a(final int i2, final int i3, final String str) {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.b.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) b.this.f();
                    if (aVar != null) {
                        String str2 = str;
                        if (str2 == null) {
                            str2 = "";
                        }
                        aVar.c(str2);
                    }
                    a aVar2 = a.this;
                    int i4 = aVar2.g + 1;
                    aVar2.g = i4;
                    if (aVar2.f45443h || aVar2.f45444i) {
                        return;
                    }
                    int i5 = aVar2.f;
                    if (i4 + i5 == 2) {
                        sg.bigo.ads.api.b.d.a<NativeAd> aVar3 = aVar2.f45441c;
                        b bVar = b.this;
                        if (i5 > 0) {
                            aVar3.a(bVar);
                            a.this.f45443h = true;
                        } else {
                            aVar3.a(bVar, i2, i3, str);
                            a.this.f45444i = true;
                        }
                    }
                }
            });
        }

        private void a(final d dVar) {
            final String strAT;
            sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) dVar.f();
            if (aVar != null) {
                strAT = aVar.aT();
                if (TextUtils.isEmpty(strAT) || !URLUtil.isNetworkUrl(strAT)) {
                    strAT = aVar.az();
                }
            } else {
                strAT = null;
            }
            if (TextUtils.isEmpty(strAT) || !URLUtil.isNetworkUrl(strAT)) {
                return;
            }
            sg.bigo.ads.common.p.g gVar = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.b.b.a.3
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i2, String str, String str2) {
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                    if (dVar == b.this.x) {
                        a.this.f45442e[0] = strAT;
                    } else if (dVar == b.this.y) {
                        a.this.f45442e[1] = strAT;
                    }
                }
            };
            this.k.add(gVar);
            sg.bigo.ads.common.p.e.a(b.this.f45584b.f47035e, strAT, aVar.al(), gVar);
        }

        public final void a(NativeAd nativeAd) {
            if ((nativeAd instanceof d) && !this.d.contains(nativeAd)) {
                d dVar = (d) nativeAd;
                if (nativeAd == b.this.x) {
                    this.d.add(0, dVar);
                } else {
                    this.d.add(dVar);
                }
                a(dVar);
            }
            c();
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.b$b, reason: collision with other inner class name */
    public class C0785b extends a {
        public C0785b(sg.bigo.ads.api.b.d.a<NativeAd> aVar) {
            super(aVar);
        }

        @Override // sg.bigo.ads.ad.b.b.a
        public final void c() {
            int i2 = this.f + 1;
            this.f = i2;
            if (this.f45443h || this.f45444i || i2 + this.g != 2) {
                return;
            }
            this.f45441c.a(b.this);
            this.f45443h = true;
        }
    }

    public class c extends a {
        public c(sg.bigo.ads.api.b.d.a<NativeAd> aVar) {
            super(aVar);
        }

        @Override // sg.bigo.ads.ad.b.b.a
        public final void c() {
            this.f++;
            if (this.f45443h || this.f45444i) {
                return;
            }
            this.f45441c.a(b.this);
            this.f45443h = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [sg.bigo.ads.api.core.c] */
    public b(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        ?? F2 = f();
        List<sg.bigo.ads.api.core.c> listAm = F2.am();
        this.x = new d(gVar.a(F2));
        if (listAm == null || listAm.size() <= 0) {
            return;
        }
        this.y = new d(gVar.a(listAm.get(0)));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [sg.bigo.ads.api.core.c] */
    @Override // sg.bigo.ads.ad.b.d, sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        d dVar = this.x;
        if (dVar != null) {
            dVar.destroy();
        }
        d dVar2 = this.y;
        if (dVar2 != null) {
            dVar2.destroy();
        }
        if (this.q) {
            return;
        }
        this.q = true;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) f(), SystemClock.elapsedRealtime() - this.k);
    }

    @Override // sg.bigo.ads.ad.b.d, sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(adInteractionListener);
        d dVar = this.x;
        if (dVar != null) {
            dVar.setAdInteractionListener(adInteractionListener);
        }
        d dVar2 = this.y;
        if (dVar2 != null) {
            dVar2.setAdInteractionListener(adInteractionListener);
        }
    }

    public final List<d> x() {
        a aVar = this.f45436z;
        if (aVar != null) {
            return aVar.d;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i2) {
        super.a(i2);
        d dVar = this.x;
        if (dVar != null) {
            dVar.a(i2);
        }
        d dVar2 = this.y;
        if (dVar2 != null) {
            dVar2.a(i2);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void b(int i2) {
        super.b(i2);
        d dVar = this.x;
        if (dVar != null) {
            dVar.b(i2);
        }
        d dVar2 = this.y;
        if (dVar2 != null) {
            dVar2.b(i2);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void c(int i2) {
        super.c(i2);
        d dVar = this.x;
        if (dVar != null) {
            dVar.c(i2);
        }
        d dVar2 = this.y;
        if (dVar2 != null) {
            dVar2.c(i2);
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void a(sg.bigo.ads.api.b.a aVar) {
        super.a(aVar);
        d dVar = this.x;
        if (dVar != null) {
            dVar.a(aVar);
        }
        d dVar2 = this.y;
        if (dVar2 != null) {
            dVar2.a(aVar);
        }
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void b(Activity activity) {
        super.b(activity);
        d dVar = this.x;
        if (dVar != null) {
            dVar.b(activity);
        }
        d dVar2 = this.y;
        if (dVar2 != null) {
            dVar2.b(activity);
        }
    }

    @Override // sg.bigo.ads.ad.b.d, sg.bigo.ads.ad.b.c
    public final void a(sg.bigo.ads.api.b.d.a<NativeAd> aVar, int i2) {
        m mVarE;
        if (aVar == null) {
            return;
        }
        d dVar = this.x;
        d dVar2 = this.y;
        int iA = 0;
        int i3 = dVar == null ? 0 : 1;
        if (dVar2 != null) {
            i3++;
        }
        if (i3 == 0) {
            aVar.a(this, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, 10205, "Double video empty ads.");
            return;
        }
        if (i3 == 1) {
            if (dVar == null) {
                dVar = dVar2;
            }
            dVar.a(aVar, i2);
            return;
        }
        sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) f();
        if (aVar2 != null && (mVarE = aVar2.e()) != null) {
            iA = mVarE.a("multi_ads.ad_fill_tactic");
        }
        a c0785b = iA == 2 ? new C0785b(aVar) : new c(aVar);
        dVar.a(c0785b.a(), i2);
        dVar2.a(c0785b.b(), i2);
        this.f45436z = c0785b;
    }

    @Override // sg.bigo.ads.ad.b.e
    public final void b(boolean z2) {
        super.b(z2);
        d dVar = this.x;
        if (dVar != null) {
            dVar.b(z2);
        }
        d dVar2 = this.y;
        if (dVar2 != null) {
            dVar2.b(z2);
        }
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void a(boolean z2) {
        super.a(z2);
        d dVar = this.x;
        if (dVar != null) {
            dVar.a(z2);
        }
        d dVar2 = this.y;
        if (dVar2 != null) {
            dVar2.a(z2);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(boolean z2, boolean z3) {
        super.a(z2, z3);
        d dVar = this.x;
        if (dVar != null) {
            dVar.a(z2, z3);
        }
        d dVar2 = this.y;
        if (dVar2 != null) {
            dVar2.a(z2, z3);
        }
    }
}
