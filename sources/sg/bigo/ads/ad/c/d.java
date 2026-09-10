package sg.bigo.ads.ad.c;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.ImageView;
import sg.bigo.ads.ad.c.a.a.AnonymousClass2;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.i;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.p.e;
import sg.bigo.ads.common.p.f;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements sg.bigo.ads.ad.b.c.b, InnerBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sg.bigo.ads.ad.b.c f45637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sg.bigo.ads.ad.c.b f45638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f45639c;
    private b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sg.bigo.ads.ad.c.a.a f45640e;
    private c f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45642i;
    private final g j;
    private long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private sg.bigo.ads.api.b.d.a<InnerBannerAd> f45643l;
    private final a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private sg.bigo.ads.ad.b.c.a f45644n;

    public class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AdInteractionListener f45647a;

        public a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f45647a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(AdError adError) {
            if (this.f45647a != null) {
                if (adError.getCode() == 2002 && d.g(d.this)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "don't call onAdError when video has impressed");
                } else {
                    this.f45647a.onAdError(adError);
                }
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            d.this.k = SystemClock.elapsedRealtime();
            if (d.this.f45640e != null && d.this.f != null) {
                d.this.f45640e.a(d.this.f.f45635b);
            }
            if (d.this.f45637a != null) {
                d.this.f45637a.a(d.this.f45644n);
            }
            AdInteractionListener adInteractionListener = this.f45647a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        sg.bigo.ads.api.b.d.a<NativeAd> f45649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        sg.bigo.ads.api.b.d.a<NativeAd> f45650b;

        public b(final sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar) {
            this.f45649a = new sg.bigo.ads.api.b.d.a<NativeAd>() { // from class: sg.bigo.ads.ad.c.d.b.1
                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad) {
                    boolean z2 = false;
                    if (d.this.f45640e == null) {
                        d.c(d.this);
                        d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, false);
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "native-banner icon load success");
                    d.d(d.this);
                    if (d.this.f45638b != null) {
                        sg.bigo.ads.ad.c.a.a aVar2 = d.this.f45640e;
                        ImageView imageView = d.this.f45638b.f45630a;
                        if (d.this.f45637a != null && d.this.f45637a.n()) {
                            z2 = true;
                        }
                        aVar2.a(imageView, z2);
                    }
                    d.this.a(1, 3);
                    d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, true);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad, int i2, int i3, String str) {
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "native-banner icon load failed");
                    d.c(d.this);
                    if (i3 == 10103) {
                        d.this.a(1, 1);
                    } else {
                        d.this.a(1, 4);
                    }
                    d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, false);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* bridge */ /* synthetic */ void a(Ad ad, boolean z2, int i2, int i3, String str, boolean z3) {
                }
            };
            this.f45650b = new sg.bigo.ads.api.b.d.a<NativeAd>() { // from class: sg.bigo.ads.ad.c.d.b.2
                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad) {
                    NativeAd nativeAd = (NativeAd) ad;
                    boolean z2 = false;
                    if (d.this.f45640e == null) {
                        d.c(d.this);
                        d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, false);
                        return;
                    }
                    d.d(d.this);
                    b.a(b.this, nativeAd, 3);
                    sg.bigo.ads.ad.c.a.a aVar2 = d.this.f45640e;
                    aVar2.a(aVar2.new AnonymousClass2(), nativeAd instanceof sg.bigo.ads.ad.b.a.a);
                    sg.bigo.ads.ad.c.a.a aVar3 = d.this.f45640e;
                    if (d.this.f45637a != null && d.this.f45637a.n()) {
                        z2 = true;
                    }
                    aVar3.a(z2);
                    d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, true);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad, int i2, int i3, String str) {
                    b bVar;
                    int i4;
                    NativeAd nativeAd = (NativeAd) ad;
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "native-banner main media load failed");
                    d.c(d.this);
                    if (i3 == 1401 || i3 == 10074 || i3 == 10103 || i3 == 1300) {
                        bVar = b.this;
                        i4 = 1;
                    } else {
                        bVar = b.this;
                        i4 = 4;
                    }
                    b.a(bVar, nativeAd, i4);
                    d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, false);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* bridge */ /* synthetic */ void a(Ad ad, boolean z2, int i2, int i3, String str, boolean z3) {
                }
            };
        }

        public final void a() {
            this.f45649a = null;
            this.f45650b = null;
        }

        public static /* synthetic */ void a(b bVar, NativeAd nativeAd, int i2) {
            d dVar;
            int i3;
            if (nativeAd instanceof sg.bigo.ads.ad.b.a.b) {
                dVar = d.this;
                i3 = 3;
            } else {
                if (!(nativeAd instanceof sg.bigo.ads.ad.b.a.a)) {
                    return;
                }
                dVar = d.this;
                i3 = 2;
            }
            dVar.a(i3, i2);
        }
    }

    public d(g gVar) {
        this.g = 0;
        this.f45641h = 0;
        this.f45642i = false;
        a aVar = new a();
        this.m = aVar;
        this.f45644n = new sg.bigo.ads.ad.b.c.a() { // from class: sg.bigo.ads.ad.c.d.1
            @Override // sg.bigo.ads.ad.b.c.a
            public final void a() {
                if (d.this.f45640e != null) {
                    d.this.f45640e.f();
                }
            }
        };
        this.j = gVar;
        sg.bigo.ads.ad.b.c cVarA = sg.bigo.ads.ad.b.a.a(gVar);
        this.f45637a = cVarA;
        if (cVarA != null) {
            cVarA.setAdInteractionListener(aVar);
            this.f = new c(gVar);
            this.f45638b = new sg.bigo.ads.ad.c.b(this.f45637a);
            i.b bVarAw = ((sg.bigo.ads.core.a.a) this.f45637a.f()).aw();
            sg.bigo.ads.ad.b.c cVar = this.f45637a;
            this.f45640e = cVar != null ? sg.bigo.ads.ad.c.a.a.a(cVar, cVar.f45584b.f, bVarAw) : null;
            this.f45639c = Boolean.FALSE;
            this.d = null;
            this.g = 0;
            this.f45641h = 0;
            this.f45642i = false;
        }
    }

    public static /* synthetic */ int c(d dVar) {
        int i2 = dVar.f45641h;
        dVar.f45641h = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int d(d dVar) {
        int i2 = dVar.g;
        dVar.g = i2 + 1;
        return i2;
    }

    private int e() {
        c cVar = this.f;
        return (cVar == null || cVar.f45636c != 2) ? 3 : 1;
    }

    public static /* synthetic */ boolean g(d dVar) {
        sg.bigo.ads.ad.b.c cVar = dVar.f45637a;
        return cVar != null && cVar.n();
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        if (!sg.bigo.ads.common.n.d.b()) {
            t.a("adView() must run on UI thread");
        }
        if (this.f45637a == null) {
            return null;
        }
        if (isExpired()) {
            this.f45637a.b(2000, 1, "The ad is expired.");
            return null;
        }
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar.f45588i) {
            cVar.b(2000, 1, "The ad is destroyed.");
            return null;
        }
        sg.bigo.ads.ad.c.a.a aVar = this.f45640e;
        if (aVar != null) {
            return aVar.e();
        }
        cVar.a(2000, "mNativeBannerRender is null.");
        return null;
    }

    @Override // sg.bigo.ads.ad.b.c.b
    public final void b() {
        this.f45642i = true;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Ad ad) {
        Ad ad2 = ad;
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar != null) {
            return cVar.compareTo(ad2);
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public final void destroy() {
        destroyInMainThread();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [sg.bigo.ads.api.core.c] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void destroyInMainThread() {
        if (sg.bigo.ads.common.n.d.b()) {
            c();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.c.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.c();
                }
            });
        }
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar != null) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) cVar.f(), SystemClock.elapsedRealtime() - this.k);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final AdBid getBid() {
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar != null) {
            return cVar.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        return cVar != null ? cVar.getCreativeId() : "";
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getExtraInfo(String str) {
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar != null) {
            return cVar.getExtraInfo(str);
        }
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        sg.bigo.ads.ad.c.a.a aVar = this.f45640e;
        if (aVar != null) {
            return aVar.j();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.c] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.api.core.c getInnerBannerAdData() {
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar != null) {
            return cVar.f();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        sg.bigo.ads.ad.c.a.a aVar = this.f45640e;
        if (aVar != null) {
            return aVar.i();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar) {
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar == null) {
            aVar.a(this, 1005, 1253, "native banner mNativeAd is null");
            return;
        }
        cVar.b(true);
        this.f45643l = aVar;
        if (this.d == null) {
            this.d = new b(aVar);
        }
        a(1, 2);
        a(2, 2);
        a(3, 2);
        sg.bigo.ads.ad.b.c cVar2 = this.f45637a;
        if (cVar2 != null) {
            cVar2.a((sg.bigo.ads.ad.b.c.b) this);
            this.f45637a.a(this.d.f45650b, 0);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar != null) {
            return cVar.isExpired();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar != null) {
            return ((sg.bigo.ads.core.a.a) cVar.f()).bl();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.api.core.c cVar) {
        if (cVar instanceof o) {
            ((o) cVar).bk();
        }
        sg.bigo.ads.ad.b.c cVar2 = this.f45637a;
        if (cVar2 != null) {
            cVar2.a();
        }
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.m.f45647a = adInteractionListener;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar != null) {
            return cVar.b_();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a();
            this.d = null;
        }
        sg.bigo.ads.ad.c.a.a aVar = this.f45640e;
        if (aVar != null) {
            aVar.h();
        }
        sg.bigo.ads.ad.c.b bVar2 = this.f45638b;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    private void d() {
        sg.bigo.ads.ad.c.b bVar;
        sg.bigo.ads.ad.c.a.a aVar = this.f45640e;
        if (aVar == null || (bVar = this.f45638b) == null) {
            return;
        }
        aVar.a(bVar.f45630a, e());
    }

    @Override // sg.bigo.ads.ad.b.c.b
    public final void a() {
        a(this.f45643l, 2, false);
        final sg.bigo.ads.ad.c.b bVar = this.f45638b;
        final sg.bigo.ads.api.b.d.a<NativeAd> aVar = this.d.f45649a;
        sg.bigo.ads.ad.b.c cVar = bVar.f45631b;
        if (cVar != null) {
            sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) cVar.f();
            if (aVar2.av() == null) {
                aVar.a(bVar.f45631b, 3001, 10103, "banner icon is empty");
                return;
            }
            String strC = aVar2.av().c();
            if (q.a((CharSequence) strC)) {
                aVar.a(bVar.f45631b, 3001, 10103, "banner icon url is empty");
            } else if (sg.bigo.ads.api.a.i.f46986a.n().a(9) && URLUtil.isHttpUrl(strC)) {
                aVar.a(bVar.f45631b, 3001, 10118, "Invalid http banner icon url");
            } else {
                e.b(bVar.f45631b.f45584b.f47035e, sg.bigo.ads.common.u.a.e.j(), strC, aVar2.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.c.b.1

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ sg.bigo.ads.api.b.d.a f45632a;

                    public AnonymousClass1() {
                        aVar = aVar;
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i2, String str, String str2) {
                        sg.bigo.ads.api.b.d.a aVar3;
                        b bVar2 = b.this;
                        sg.bigo.ads.ad.b.c cVar2 = bVar2.f45631b;
                        if (cVar2 == null || bVar2.f45630a == null || (aVar3 = aVar) == null) {
                            return;
                        }
                        aVar3.a(cVar2, i2, 3001, str);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(Bitmap bitmap, f fVar) {
                        b bVar2 = b.this;
                        sg.bigo.ads.ad.b.c cVar2 = bVar2.f45631b;
                        if (cVar2 == null || bVar2.f45630a == null || aVar == null) {
                            return;
                        }
                        cVar2.a(bitmap, 1);
                        b.this.f45630a.setImageBitmap(bitmap);
                        aVar.a(b.this.f45631b);
                    }
                });
            }
        }
    }

    public final void a(int i2, int i3) {
        Integer numValueOf;
        String str;
        sg.bigo.ads.ad.b.c cVar = this.f45637a;
        if (cVar == null) {
            return;
        }
        if (i2 == 1) {
            numValueOf = Integer.valueOf(i3);
            str = "icon_sta";
        } else if (i2 == 2) {
            numValueOf = Integer.valueOf(i3);
            str = "img_sta";
        } else {
            if (i2 != 3 || !(cVar instanceof sg.bigo.ads.ad.b.a.b)) {
                return;
            }
            numValueOf = Integer.valueOf(i3);
            str = "vid_sta";
        }
        cVar.a(str, numValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar, int i2, boolean z2) {
        if (aVar == null) {
            return;
        }
        if (this.f45639c.booleanValue()) {
            return;
        }
        c cVar = this.f;
        int i3 = 2;
        if (cVar != null && cVar.f45634a == 2 && i2 == 2) {
            d();
            aVar.a(this);
            this.f45639c = Boolean.TRUE;
            return;
        }
        sg.bigo.ads.ad.b.c cVar2 = this.f45637a;
        if (cVar2 != null && ((sg.bigo.ads.core.a.a) cVar2.f()).aR()) {
            i3 = 3;
        }
        if (!z2) {
            if (this.f45641h == i3 || this.f45642i) {
                if (this.f45642i) {
                    aVar.a(this, 1005, 1006, "native banner VAST parse failed");
                } else {
                    aVar.a(this, 1005, 1253, "native banner download icon & main resources all failed");
                }
            }
        }
        d();
        aVar.a(this);
        this.f45639c = Boolean.TRUE;
    }
}
