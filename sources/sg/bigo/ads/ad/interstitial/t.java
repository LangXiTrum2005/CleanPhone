package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.os.SystemClock;
import android.util.Pair;
import android.webkit.ValueCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes7.dex */
public class t extends k<sg.bigo.ads.core.a.a> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.b f46643A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.a f46644B;
    b C;
    l D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final a f46645E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Map<sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.interstitial.multi_img.b> f46646F;
    private final Map<sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.interstitial.multi_img.b> G;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public sg.bigo.ads.ad.b.c f46647z;

    public class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AdInteractionListener f46652a;

        public a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f46652a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
            k.b bVar = ((k) t.this).x;
            if (bVar != null) {
                bVar.C();
            }
            if (t.this.D != null) {
                t.this.D.k = SystemClock.elapsedRealtime();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
            AdInteractionListener adInteractionListener = this.f46652a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClosed();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(AdError adError) {
            k.b bVar;
            if (this.f46652a != null) {
                if (adError.getCode() == 2002 && t.this.n()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialNativeImpl", "don't call onAdError when video has impressed");
                } else {
                    this.f46652a.onAdError(adError);
                }
            }
            if (adError.getCode() != 2002 || (bVar = ((k) t.this).x) == null) {
                return;
            }
            bVar.b(adError.getMessage());
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            AdInteractionListener adInteractionListener = this.f46652a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
            if (t.this.D != null) {
                t.this.D.f46355l = SystemClock.elapsedRealtime();
            }
            sg.bigo.ads.ad.interstitial.multi_img.b bVarC = t.this.C();
            if (bVarC != null) {
                bVarC.b();
            }
            sg.bigo.ads.ad.interstitial.multi_img.b bVarD = t.this.D();
            if (bVarD != null) {
                bVarD.b();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
            AdInteractionListener adInteractionListener = this.f46652a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdOpened();
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Map<NativeAd, Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a>> f46654a;

        public b() {
        }
    }

    public t(sg.bigo.ads.api.core.g gVar) {
        sg.bigo.ads.api.core.c cVar;
        sg.bigo.ads.api.a.m mVarE;
        int iA;
        super(gVar);
        a aVar = new a();
        this.f46645E = aVar;
        this.f46646F = new HashMap();
        this.G = new HashMap();
        sg.bigo.ads.ad.b.c cVarA = null;
        if (gVar != null && (cVar = gVar.f47032a) != null && (mVarE = cVar.e()) != null && ((33 == (iA = mVarE.a("video_play_page.ad_component_layout")) && !gVar.f47032a.ar()) || (6 == iA && gVar.f47032a.ar()))) {
            int iW = gVar.f47032a.w();
            if (iW == 1) {
                cVarA = new sg.bigo.ads.ad.b.a.f(gVar);
            } else if (iW == 2) {
                cVarA = new sg.bigo.ads.ad.b.a.g(gVar);
            }
        }
        cVarA = cVarA == null ? sg.bigo.ads.ad.b.a.a(gVar) : cVarA;
        if (cVarA == null) {
            throw new IllegalArgumentException("Illegal adx type.");
        }
        this.f46647z = cVarA;
        cVarA.a(true);
        if (this.f46647z instanceof sg.bigo.ads.ad.b.b) {
            this.C = new b();
        }
        this.f46647z.setAdInteractionListener(aVar);
        a((sg.bigo.ads.api.b.a) cVarA);
    }

    public static /* synthetic */ Pair a(t tVar, NativeAd nativeAd, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.core.c cVar) {
        int i2;
        boolean z2 = nativeAd instanceof sg.bigo.ads.ad.b.d;
        sg.bigo.ads.ad.interstitial.a.b bVar = new sg.bigo.ads.ad.interstitial.a.b(tVar, lVar, cVar, z2 ? ((sg.bigo.ads.ad.b.d) nativeAd).f45479J : null, z2 ? ((sg.bigo.ads.ad.b.d) nativeAd).K : null);
        sg.bigo.ads.ad.interstitial.a.a aVar = new sg.bigo.ads.ad.interstitial.a.a(bVar.f45819a, tVar, lVar, cVar, z2 ? ((sg.bigo.ads.ad.b.d) nativeAd).f45479J : null, z2 ? ((sg.bigo.ads.ad.b.d) nativeAd).K : null);
        if (bVar.f45819a) {
            i2 = 1;
        } else {
            i2 = aVar.f45773a ? 2 : 0;
        }
        if (cVar.e() != null) {
            i2 = cVar.h() ? i2 : 0;
        }
        cVar.d(i2);
        cVar.e((bVar.f45819a || (aVar.f45774b instanceof sg.bigo.ads.ad.interstitial.a.a.b)) ? 1 : 2);
        return new Pair(bVar, aVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public Class<? extends sg.bigo.ads.controller.e.b<?>> A() {
        if (G()) {
            return sg.bigo.ads.ad.interstitial.h.a.class;
        }
        if (y()) {
            return F() ? sg.bigo.ads.ad.interstitial.j.a.class : z.class;
        }
        return y.class;
    }

    public final sg.bigo.ads.ad.interstitial.multi_img.b C() {
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        if (cVar instanceof sg.bigo.ads.ad.b.b) {
            return null;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVarB = this.f46646F.get(cVar);
        if (bVarB == null) {
            sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f46647z.f();
            if (aVar != null) {
                bVarB = sg.bigo.ads.ad.interstitial.multi_img.b.b(this.f46647z, aVar.e());
            }
            if (bVarB != null) {
                this.f46646F.put(this.f46647z, bVarB);
            }
        }
        return bVarB;
    }

    public final sg.bigo.ads.ad.interstitial.multi_img.b D() {
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        if (cVar instanceof sg.bigo.ads.ad.b.b) {
            return null;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVarA = this.G.get(cVar);
        if (bVarA == null) {
            sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f46647z.f();
            if (aVar != null) {
                bVarA = sg.bigo.ads.ad.interstitial.multi_img.b.a(this.f46647z, aVar.e());
            }
            if (bVarA != null) {
                this.G.put(this.f46647z, bVarA);
            }
        }
        return bVarA;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final sg.bigo.ads.core.a.a f() {
        return (sg.bigo.ads.core.a.a) this.f46647z.f();
    }

    public final boolean F() {
        return ((sg.bigo.ads.core.a.a) this.f46647z.f()).aS();
    }

    public boolean G() {
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        return (cVar instanceof sg.bigo.ads.ad.b.a.f) || (cVar instanceof sg.bigo.ads.ad.b.a.g);
    }

    @Override // sg.bigo.ads.ad.c
    public final <ValueType> ValueType b(String str, ValueType valuetype) {
        return (ValueType) this.f46647z.b(str, valuetype);
    }

    @Override // sg.bigo.ads.api.b.a
    public final sg.bigo.ads.api.core.p c_() {
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        return cVar != null ? cVar.c_() : this.W;
    }

    @Override // sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.f46647z.destroy();
        this.C = null;
    }

    @Override // sg.bigo.ads.api.Ad
    public String getCreativeId() {
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        return cVar != null ? cVar.getCreativeId() : "";
    }

    @Override // sg.bigo.ads.ad.c
    public final boolean n() {
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        return (cVar != null && cVar.n()) || super.n();
    }

    @Override // sg.bigo.ads.ad.c
    public final void s() {
        this.f46647z.s();
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(adInteractionListener);
        this.f46645E.f46652a = adInteractionListener;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final boolean y() {
        return ((sg.bigo.ads.core.a.a) this.f46647z.f()).aR();
    }

    @Override // sg.bigo.ads.api.b.a
    public final void b(int i2) {
        super.b(i2);
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        if (cVar != null) {
            cVar.b(i2);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void b(Activity activity) {
        super.b(activity);
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        if (cVar != null) {
            cVar.b(activity);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i2) {
        super.a(i2);
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        if (cVar != null) {
            cVar.a(i2);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public void b(final sg.bigo.ads.api.b.d.a<InterstitialAd> aVar) {
        sg.bigo.ads.api.a.m mVarE;
        sg.bigo.ads.api.a.m mVarE2;
        sg.bigo.ads.api.a.m mVarE3;
        sg.bigo.ads.api.a.m mVarE4;
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        sg.bigo.ads.api.a.m mVarE5 = f().e();
        boolean z2 = true;
        if ((mVarE5 == null || (mVarE5.a("video_play_page.cta_color") != 3 && mVarE5.a("video_play_page.background_colour") != 3 && mVarE5.a("video_play_page.mediaview_colour") != 3 && mVarE5.a("video_play_page.ad_component_colour") != 3)) && (((mVarE = f().e()) == null || mVarE.a("mid_page.cta_color") != 3) && (((mVarE2 = f().e()) == null || (mVarE2.a("endpage.cta_color") != 3 && mVarE2.a("endpage.background_colour") != 3 && mVarE2.a("endpage.mediaview_colour") != 3)) && (((mVarE3 = f().e()) == null || (mVarE3.a("layer.cta_color") != 3 && mVarE3.a("layer.mediaview_colour") != 3)) && ((mVarE4 = f().e()) == null || (mVarE4.a("video_play_page.is_widget") != 1 && mVarE4.a("endpage.is_widget") != 1)))))) {
            z2 = false;
        }
        cVar.b(z2);
        this.f46647z.a(new sg.bigo.ads.api.b.d.a<NativeAd>() { // from class: sg.bigo.ads.ad.interstitial.t.1
            private void a(int i2, int i3, String str) {
                t tVar = t.this;
                if (tVar.f45586e || tVar.f) {
                    return;
                }
                aVar.a(tVar, i2, i3, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad, int i2, int i3, String str) {
                a(i2, i3, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad, boolean z3, int i2, int i3, String str, boolean z4) {
                sg.bigo.ads.ad.b.b.a aVar2;
                final NativeAd nativeAd = (NativeAd) ad;
                t tVar = t.this;
                if (tVar.f45586e || tVar.f || !(nativeAd instanceof sg.bigo.ads.ad.b.d)) {
                    return;
                }
                boolean z5 = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.b.d) nativeAd).f()).bh() != null || z3;
                if (!(t.this.f46647z instanceof sg.bigo.ads.ad.b.b)) {
                    if (z5) {
                        a(nativeAd);
                        return;
                    } else {
                        if (z4) {
                            a(i2, i3, str);
                            return;
                        }
                        return;
                    }
                }
                final sg.bigo.ads.ad.b.b bVar = (sg.bigo.ads.ad.b.b) t.this.f46647z;
                if (z5) {
                    sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.b.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (b.this.f45436z != null) {
                                b.this.f45436z.a(nativeAd);
                            }
                        }
                    });
                } else {
                    if (!z4 || (aVar2 = bVar.f45436z) == null) {
                        return;
                    }
                    aVar2.a(i2, i3, str);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r6v3, types: [sg.bigo.ads.api.core.c] */
            /* JADX WARN: Type inference failed for: r9v0, types: [sg.bigo.ads.api.core.c] */
            @Override // sg.bigo.ads.api.b.d.a
            public void a(NativeAd nativeAd) {
                Set<Map.Entry<NativeAd, Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a>>> setEntrySet;
                Map.Entry<NativeAd, Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a>> next;
                sg.bigo.ads.api.core.g gVar = t.this.f45584b;
                if (t.this.C != null) {
                    b bVar = t.this.C;
                    sg.bigo.ads.ad.b.c cVar2 = t.this.f46647z;
                    sg.bigo.ads.api.a.l lVar = gVar.f47033b;
                    HashMap map = new HashMap();
                    bVar.f46654a = map;
                    boolean z3 = false;
                    if (cVar2 instanceof sg.bigo.ads.ad.b.b) {
                        sg.bigo.ads.ad.b.b bVar2 = (sg.bigo.ads.ad.b.b) cVar2;
                        sg.bigo.ads.ad.b.d dVar = bVar2.x;
                        sg.bigo.ads.ad.b.d dVar2 = bVar2.y;
                        if (dVar != null) {
                            map.put(cVar2, t.a(t.this, dVar, lVar, (sg.bigo.ads.api.core.c) dVar.f()));
                            z3 = true;
                        }
                        if (dVar2 != null) {
                            bVar.f46654a.put(cVar2, t.a(t.this, dVar2, lVar, (sg.bigo.ads.api.core.c) dVar2.f()));
                            z3 = true;
                        }
                    }
                    if (z3) {
                        b bVar3 = t.this.C;
                        Map<NativeAd, Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a>> map2 = bVar3.f46654a;
                        Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a> value = null;
                        if (map2 != null && !map2.isEmpty() && (setEntrySet = bVar3.f46654a.entrySet()) != null && !setEntrySet.isEmpty() && (next = setEntrySet.iterator().next()) != null) {
                            value = next.getValue();
                        }
                        if (value != null) {
                            t.this.f46643A = (sg.bigo.ads.ad.interstitial.a.b) value.first;
                            t.this.f46644B = (sg.bigo.ads.ad.interstitial.a.a) value.second;
                        }
                    }
                }
                if (t.this.f46643A == null || t.this.f46644B == null) {
                    Pair pairA = t.a(t.this, nativeAd, gVar.f47033b, gVar.f47032a);
                    t.this.f46643A = (sg.bigo.ads.ad.interstitial.a.b) pairA.first;
                    t.this.f46644B = (sg.bigo.ads.ad.interstitial.a.a) pairA.second;
                }
                t tVar = t.this;
                if (tVar.f45586e || tVar.f) {
                    return;
                }
                tVar.a(tVar.f46647z, 0);
                aVar.a(t.this);
            }
        }, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void a(int i2, int i3) {
        super.a(i2, i3);
        l lVar = this.D;
        if (lVar != null) {
            lVar.s = true;
            lVar.m = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(sg.bigo.ads.ad.b.c cVar, int i2) {
        while (cVar != null && i2 <= 5) {
            if (!(cVar instanceof sg.bigo.ads.ad.b.b)) {
                sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) cVar.f();
                sg.bigo.ads.api.a.m mVarE = aVar.e();
                sg.bigo.ads.ad.interstitial.multi_img.b bVarB = sg.bigo.ads.ad.interstitial.multi_img.b.b(cVar, mVarE);
                if (bVarB != null) {
                    this.f46646F.put(cVar, bVarB);
                }
                sg.bigo.ads.ad.interstitial.multi_img.b bVarA = sg.bigo.ads.ad.interstitial.multi_img.b.a(cVar, mVarE);
                if (bVarA != null) {
                    this.G.put(cVar, bVarA);
                }
                if (bVarB == null && bVarA == null) {
                    return;
                }
                if (bVarB != null && bVarB.g == 1) {
                    bVarB.b();
                    return;
                }
                if (bVarA != null && bVarA.g == 1) {
                    bVarA.b();
                    return;
                }
                if (bVarB != null && bVarB.g == 2) {
                    a(aVar, bVarB);
                    return;
                } else {
                    if (bVarA == null || bVarA.g != 2) {
                        return;
                    }
                    a(aVar, bVarA);
                    return;
                }
            }
            sg.bigo.ads.ad.b.b bVar = (sg.bigo.ads.ad.b.b) cVar;
            i2++;
            a(bVar.x, i2);
            cVar = bVar.y;
        }
    }

    private void a(sg.bigo.ads.core.a.a aVar, final sg.bigo.ads.ad.interstitial.multi_img.b bVar) {
        if (aVar.aR()) {
            sg.bigo.ads.core.player.b.a().a(aVar.aP(), new ValueCallback<Boolean>() { // from class: sg.bigo.ads.ad.interstitial.t.2
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Boolean bool) {
                    if (!bool.booleanValue()) {
                        bVar.b();
                    }
                }
            });
            return;
        }
        if (sg.bigo.ads.common.p.h.a.f47427a.a(aVar.aT())) {
            return;
        }
        bVar.b();
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(boolean z2, boolean z3) {
        super.a(z2, z3);
        sg.bigo.ads.ad.b.c cVar = this.f46647z;
        if (cVar != null) {
            cVar.a(z2, z3);
        }
    }
}
