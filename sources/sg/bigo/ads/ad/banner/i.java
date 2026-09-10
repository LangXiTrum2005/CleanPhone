package sg.bigo.ads.ad.banner;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p004ironsource.cs;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends sg.bigo.ads.ad.c<InnerBannerAd, sg.bigo.ads.api.core.c> implements InnerBannerAd, sg.bigo.ads.api.b.d<InnerBannerAd> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private AbstractAdLoader f45564A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private sg.bigo.ads.api.b.d.a<InnerBannerAd> f45565B;
    private a C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    InnerBannerAd f45566w;
    private FrameLayout x;
    private sg.bigo.ads.api.core.g y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private b f45567z;

    public class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AdInteractionListener f45575a;

        public a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f45575a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(AdError adError) {
            AdInteractionListener adInteractionListener = this.f45575a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdError(adError);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            AdInteractionListener adInteractionListener = this.f45575a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
            if (i.this.f45567z != null) {
                final b bVar = i.this.f45567z;
                sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Start auto refreshing after " + (bVar.f45577a / 1000) + " s");
                bVar.f45578b.removeCallbacksAndMessages(null);
                bVar.f45578b.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.banner.i.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.e(i.this);
                    }
                }, (long) bVar.f45577a);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45577a = 20000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Handler f45578b = new Handler(Looper.getMainLooper());

        public b() {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Enable bigo adx banner auto refreshing");
        }
    }

    public i(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.C = new a();
        if (!gVar.f47033b.w() && gVar.f47033b.j()) {
            b bVar = new b();
            this.f45567z = bVar;
            int iK = gVar.f47033b.k();
            if (iK >= 10) {
                bVar.f45577a = iK * 1000;
            }
        }
        InnerBannerAd innerBannerAdB = d.b(gVar);
        this.f45566w = innerBannerAdB;
        if (innerBannerAdB == null) {
            throw new IllegalArgumentException("UnifiedBannerWrapper Illegal adx type.");
        }
    }

    public static /* synthetic */ void e(i iVar) {
        sg.bigo.ads.api.b bVarA = iVar.f45584b.f47034c.a();
        if (bVarA != null) {
            bVarA.f46989c = 1;
            final sg.bigo.ads.controller.e.a.C0859a[] c0859aArr = new sg.bigo.ads.controller.e.a.C0859a[1];
            c0859aArr[0] = BigoAdSdk.a(bVarA, new sg.bigo.ads.controller.c() { // from class: sg.bigo.ads.ad.banner.i.4
                @Override // sg.bigo.ads.controller.e
                public final /* synthetic */ void a(int i2, int i3, int i4, String str, Pair<sg.bigo.ads.api.b, l> pair) {
                    sg.bigo.ads.api.b bVar;
                    int i5;
                    q qVar;
                    q qVar2;
                    q qVar3;
                    q qVar4;
                    Pair<sg.bigo.ads.api.b, l> pair2 = pair;
                    sg.bigo.ads.common.t.a.a(2, "Banner", "Banner auto-refresh failed: ".concat(String.valueOf(str)));
                    String str2 = null;
                    if (pair2 != null) {
                        sg.bigo.ads.api.b bVar2 = (sg.bigo.ads.api.b) pair2.first;
                        if (bVar2 != null) {
                            bVar2.g.a();
                        }
                        bVar = bVar2;
                    } else {
                        bVar = null;
                    }
                    sg.bigo.ads.controller.e.a.C0859a c0859a = c0859aArr[0];
                    l lVar = pair2 != null ? (l) pair2.second : null;
                    if (c0859a == null || (qVar4 = c0859a.g) == null) {
                        i5 = 3;
                    } else {
                        i5 = qVar4.f47059a ? 1 : 0;
                    }
                    boolean z2 = (c0859a == null || (qVar3 = c0859a.g) == null || !qVar3.f47060b) ? false : true;
                    int i6 = (c0859a == null || (qVar2 = c0859a.g) == null) ? 4 : qVar2.f47061c;
                    if (c0859a != null && (qVar = c0859a.g) != null) {
                        str2 = qVar.d;
                    }
                    sg.bigo.ads.core.d.b.a(lVar, bVar, i3, i4, str, 1, 0, i5, z2, i6, str2);
                }

                @Override // sg.bigo.ads.controller.e
                public final /* synthetic */ void a(int i2, sg.bigo.ads.api.b bVar, sg.bigo.ads.api.core.g[] gVarArr) {
                    int i3;
                    q qVar;
                    q qVar2;
                    q qVar3;
                    q qVar4;
                    sg.bigo.ads.api.core.g gVar = (sg.bigo.ads.api.core.g) k.b(gVarArr);
                    gVar.f47034c.g.a();
                    sg.bigo.ads.controller.e.a.C0859a c0859a = c0859aArr[0];
                    sg.bigo.ads.api.core.c[] cVarArr = {gVar.f47032a};
                    sg.bigo.ads.api.b bVar2 = gVar.f47034c;
                    boolean z2 = gVar.f47033b.s() && gVar.f47032a.ac();
                    if (c0859a == null || (qVar4 = c0859a.g) == null) {
                        i3 = 3;
                    } else {
                        i3 = qVar4.f47059a ? 1 : 0;
                    }
                    sg.bigo.ads.core.d.b.a(cVarArr, bVar2, z2, 1, 0, i3, (c0859a == null || (qVar3 = c0859a.g) == null || !qVar3.f47060b) ? false : true, (c0859a == null || (qVar2 = c0859a.g) == null) ? 4 : qVar2.f47061c, (c0859a == null || (qVar = c0859a.g) == null) ? null : qVar.d);
                    i.a(i.this, gVar.f47032a, gVar);
                }
            });
        }
        sg.bigo.ads.common.t.a.a(0, 3, "Banner", "Start auto refreshing for bigo adx banner");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View x() {
        if (this.x == null) {
            this.x = new FrameLayout(this.f45584b.f47035e);
        }
        if (this.f45566w == null) {
            return null;
        }
        this.x.removeAllViews();
        u.a(this.f45566w.adView(), this.x, null, -1);
        return this.x;
    }

    @Override // sg.bigo.ads.api.b.a, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(Ad ad) {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            return innerBannerAd.compareTo(ad);
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        String str;
        if (!sg.bigo.ads.common.n.d.b()) {
            t.a("adView() must run on UI thread");
        }
        if (isExpired()) {
            str = "The ad is expired.";
        } else {
            if (!this.f45588i) {
                FrameLayout frameLayout = this.x;
                return frameLayout != null ? frameLayout : x();
            }
            str = "The ad is destroyed.";
        }
        b(2000, 1, str);
        return null;
    }

    @Override // sg.bigo.ads.api.b.a
    public final int b_() {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            return innerBannerAd.updateFormOpenTimes();
        }
        return 0;
    }

    @Override // sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            innerBannerAd.destroy();
        }
        b bVar = this.f45567z;
        if (bVar != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "bigo adx banner auto refreshing stop");
            bVar.f45578b.removeCallbacksAndMessages(null);
        }
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    public final AdBid getBid() {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            return innerBannerAd.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            return innerBannerAd.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    public final String getExtraInfo(String str) {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            return innerBannerAd.getExtraInfo(str);
        }
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            return innerBannerAd.getHeight();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.api.core.c getInnerBannerAdData() {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            return innerBannerAd.getInnerBannerAdData();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd == null) {
            return null;
        }
        return innerBannerAd.getWebView();
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            return innerBannerAd.getWidth();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar) {
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            return innerBannerAd.isExpired();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            return innerBannerAd.isInnerBannerAdFromAutoRefresh();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.api.core.c cVar) {
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(adInteractionListener);
        a aVar = this.C;
        aVar.f45575a = adInteractionListener;
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            innerBannerAd.setAdInteractionListener(aVar);
        }
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        return 0;
    }

    public static /* synthetic */ void b(i iVar) {
        if (iVar.f45566w != null) {
            iVar.a();
            iVar.f45584b = iVar.y;
            iVar.f45566w.setAdInteractionListener(iVar.C);
            sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.banner.i.3
                @Override // java.lang.Runnable
                public final void run() {
                    i.this.x();
                }
            });
        }
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.a
    public final sg.bigo.ads.api.core.c f() {
        return getInnerBannerAdData();
    }

    public static /* synthetic */ void a(i iVar, final InnerBannerAd innerBannerAd) {
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.banner.i.2
            @Override // java.lang.Runnable
            public final void run() {
                InnerBannerAd innerBannerAd2 = innerBannerAd;
                if (innerBannerAd2 != null) {
                    innerBannerAd2.destroy();
                }
            }
        });
    }

    public static /* synthetic */ void a(i iVar, sg.bigo.ads.api.core.c cVar, sg.bigo.ads.api.core.g gVar) {
        InnerBannerAd innerBannerAdB = d.b(gVar);
        if (innerBannerAdB != null) {
            iVar.y = gVar;
            innerBannerAdB.markFromAutoFresh(cVar);
            innerBannerAdB.handleInnerBannerAdResponse(iVar.f45565B);
        }
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.d
    public final void a(final sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar) {
        super.a(aVar);
        if (this.f45564A == null && (aVar instanceof AbstractAdLoader.b)) {
            this.f45564A = ((AbstractAdLoader.b) aVar).a();
        }
        sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar2 = new sg.bigo.ads.api.b.d.a<InnerBannerAd>() { // from class: sg.bigo.ads.ad.banner.i.1
            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad) {
                InnerBannerAd innerBannerAd = (InnerBannerAd) ad;
                if (i.this.f45566w != null && i.this.f45566w != innerBannerAd) {
                    i.a(i.this, i.this.f45566w);
                }
                i.this.f45566w = innerBannerAd;
                if (!innerBannerAd.isInnerBannerAdFromAutoRefresh()) {
                    aVar.a(i.this);
                    return;
                }
                i.b(i.this);
                if (i.this.f45564A != null) {
                    i.this.f45564A.a((Ad) i.this, true);
                }
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad, int i2, int i3, String str) {
                InnerBannerAd innerBannerAd = (InnerBannerAd) ad;
                if (innerBannerAd == null || !innerBannerAd.isInnerBannerAdFromAutoRefresh()) {
                    aVar.a(i.this, i2, i3, str);
                } else {
                    i.this.a(i2, i3, str);
                }
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad, boolean z2, int i2, int i3, String str, boolean z3) {
                aVar.a(i.this, z2, i2, i3, str, z3);
            }
        };
        this.f45565B = aVar2;
        InnerBannerAd innerBannerAd = this.f45566w;
        if (innerBannerAd != null) {
            innerBannerAd.handleInnerBannerAdResponse(aVar2);
        } else {
            aVar.a(this, 1005, cs.c.INSTANCE_LOAD_FAILED, "banner adx_type error");
        }
    }
}
