package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C2998ja;
import com.inmobi.media.EnumC2765a6;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import kotlinx.coroutines.saran;
import org.json.JSONException;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2998ja extends AbstractC3039l1 {
    public int F;
    public boolean G;
    public final Pj H;
    public Function0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2998ja(Context context, C3287v0 adPlacement, C3048la c3048la) {
        super(context, adPlacement, c3048la);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        this.H = new Pj();
        Intrinsics.checkNotNullExpressionValue("ja", "TAG");
        long j = adPlacement.a;
        a(context, adPlacement, c3048la);
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        super.K();
    }

    public static final void c(C2998ja c2998ja) {
        c2998ja.g(c2998ja.m());
    }

    public static final Unit d(C2998ja c2998ja) throws JSONException {
        c2998ja.Y();
        return Unit.f29295attabal;
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void C() {
        if (V()) {
            super.C();
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void F() {
        super.F();
        if (!Intrinsics.wireman(s(), "html") && !Intrinsics.wireman(s(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
            return;
        }
        if (this.b == 2) {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                c3097n9.a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + this.l);
            }
            AbstractC2915g1 abstractC2915g1M = m();
            if (abstractC2915g1M != null) {
                C3097n9 c3097n10 = this.i;
                if (c3097n10 != null) {
                    Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                    c3097n10.a("ja", "callback - onFetchSuccess");
                }
                c(abstractC2915g1M);
                return;
            }
            c((short) 2188);
            C3097n9 c3097n11 = this.i;
            if (c3097n11 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n11.b("ja", "listener is null");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void I() throws JSONException {
        super.I();
        this.F = 0;
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void K() {
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        super.K();
    }

    public final boolean V() throws JSONException {
        if (E()) {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n9.a("ja", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M == null || h(abstractC2915g1M)) {
            return false;
        }
        if (4 == this.b) {
            if (!z()) {
                C3097n9 c3097n10 = this.i;
                if (c3097n10 != null) {
                    Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                    c3097n10.a("ja", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC2915g1 abstractC2915g1M2 = m();
                if (abstractC2915g1M2 == null) {
                    C3097n9 c3097n11 = this.i;
                    if (c3097n11 != null) {
                        c3097n11.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                } else {
                    c(abstractC2915g1M2);
                    d(abstractC2915g1M2);
                }
                return false;
            }
            super.d();
            this.I = null;
        }
        D();
        return true;
    }

    public final int W() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet adSetR = r();
        if (adSetR != null) {
            int podSuccessCount = adSetR.getPodSuccessCount();
            Integer numValueOf = Integer.valueOf(podSuccessCount);
            if (podSuccessCount < 1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        AdSet adSetR2 = r();
        if (adSetR2 != null && (ads = adSetR2.getAds()) != null) {
            int size = ads.size();
            Integer numValueOf2 = size > 0 ? Integer.valueOf(size) : null;
            if (numValueOf2 != null) {
                return numValueOf2.intValue();
            }
        }
        return 1;
    }

    public final void X() throws JSONException {
        AdConfig adConfig;
        if (Intrinsics.wireman(this.l.f, "AB") && (adConfig = this.c) != null && adConfig.getSkipNetCheckHB()) {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n9.a("ja", "renderAd without internet check");
            }
            Y();
            return;
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3097n10.a("ja", "renderAd");
        }
        a(new Function0() { // from class: adsuki.orometer
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2998ja.d(this.f3564kowloon);
            }
        }, new Function1() { // from class: adsuki.tau
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2998ja.a(this.f3703kowloon, (EnumC2765a6) obj);
            }
        });
    }

    public final void Y() throws JSONException {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3097n9.a("ja", "renderAdPostInternetCheck");
        }
        super.I();
        this.F = 0;
        try {
            if (M()) {
                return;
            }
            C3188r1 c3188r1 = this.z;
            c3188r1.getClass();
            c3188r1.g = SystemClock.elapsedRealtime();
            String strS = s();
            if (!Intrinsics.wireman(strS, "html") && !Intrinsics.wireman(strS, "htmlUrl")) {
                C3097n9 c3097n10 = this.i;
                if (c3097n10 != null) {
                    Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                    c3097n10.a("ja", "Cannot handle markupType: " + s());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2121);
                return;
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: adsuki.isoparametric
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2998ja.e(this.f3491kowloon);
                    }
                });
            }
        } catch (IllegalStateException e) {
            C3097n9 c3097n11 = this.i;
            if (c3097n11 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n11.a("ja", "Exception while loading ad.", e);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void Z() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3097n9.d("ja", "AdUnit " + this + " state - READY");
        }
        c((byte) 4);
        C3188r1 c3188r1 = this.z;
        c3188r1.getClass();
        c3188r1.i = SystemClock.elapsedRealtime();
        P();
        S();
        this.H.a = true;
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M != null) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n10.a("ja", "signaling Success");
            }
            d(abstractC2915g1M);
        }
    }

    @Override // com.inmobi.media.InterfaceC3312w0
    public final void a(int i, GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    public final void a0() {
        short s;
        MetaInfo metaInfo;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c3097n9.c("l1", "submitAdNotReady " + this);
        }
        Pj pj = this.H;
        C3188r1 c3188r1 = this.z;
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        String creativeType = (adP == null || (metaInfo = adP.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        AdSet adSetR = r();
        Boolean boolValueOf = adSetR != null ? Boolean.valueOf(adSetR.getIsRewarded()) : null;
        String strS = s();
        String impressionId = null;
        Boolean bool = boolValueOf;
        byte b = this.b;
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null) {
            impressionId = adP2.getImpressionId();
        }
        C3237t0 adNotReadyMetadata = new C3237t0(c3188r1, creativeType, bool, strS, b, impressionId);
        pj.getClass();
        Intrinsics.checkNotNullParameter(adNotReadyMetadata, "adNotReadyMetadata");
        HashMap map = new HashMap();
        long j = c3188r1.c;
        saran saranVar = AbstractC2984il.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        if (b == 0) {
            s = 2204;
        } else if (b == 1) {
            s = 2282;
        } else if (b == 2) {
            s = 2283;
        } else if (b == 3) {
            s = 2284;
        } else if (b == 6) {
            s = 2285;
        } else if (b == 7) {
            s = 2209;
        } else {
            s = b == 8 ? (short) 2242 : (short) 2210;
        }
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        map.put("markupType", strS);
        if (creativeType != null) {
            map.put("creativeType", creativeType);
        }
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        if (bool != null) {
            map.put("isRewarded", bool);
        }
        String strA = c3188r1.a();
        if (strA.length() > 0) {
            map.put("metadataBlob", strA);
        }
        map.put("adType", c3188r1.a.l());
        map.put("networkType", C3342x5.m());
        map.put("plId", Long.valueOf(c3188r1.a.l.a));
        map.put("isAdLoaded", Boolean.valueOf(pj.a));
        String str = c3188r1.a.l.f;
        if (str != null) {
            map.put("plType", str);
        }
        Wj wj = Wj.a;
        Wj.b("AdNotReady", map, EnumC2779ak.SDK);
    }

    public final short b(Context context) {
        int i;
        try {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n9.a("ja", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            GestureDetectorOnGestureListenerC2829ci container = i();
            if (container == null) {
                return (short) 2155;
            }
            if (Intrinsics.wireman("unknown", container.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.k;
            Intrinsics.checkNotNullParameter(container, "container");
            int iHashCode = container.hashCode();
            InMobiAdActivity.k.put(iHashCode, container);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            C3097n9 obj = this.i;
            if (obj != null) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                HashMap map = P8.a;
                String key = string.toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(obj, "obj");
                P8.a.put(key, new WeakReference(obj));
                intent.putExtra("loggerCacheKey", string.toString());
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String strS = s();
            if (Intrinsics.wireman(strS, "html")) {
                i = 200;
            } else {
                i = Intrinsics.wireman(strS, "htmlUrl") ? 202 : 201;
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", i);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (this.s) {
                if (this.q == -1) {
                    this.q = System.currentTimeMillis();
                }
                if (this.o > 0) {
                    intent.setFlags(603979776);
                }
            }
            Context context2 = Ji.a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
            return (short) 0;
        } catch (Exception e) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                c3097n10.b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
            return (short) 2154;
        }
    }

    public final void b0() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            c3097n9.a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + this.l);
        }
        h();
        Z();
    }

    public final void e(short s) {
        if (this.b == 2) {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                c3097n9.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + this.l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    public final void f(AbstractC2915g1 abstractC2915g1) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3097n9.c("ja", "handleAdScreenDismissed " + ((int) this.b));
        }
        byte b = this.b;
        if (b == 7) {
            int i = this.F - 1;
            this.F = i;
            if (i == 1) {
                c((byte) 6);
                C3097n9 c3097n10 = this.i;
                if (c3097n10 != null) {
                    Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                    c3097n10.d("ja", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (b == 6 || b == 8) {
            this.F--;
            C3097n9 c3097n11 = this.i;
            if (c3097n11 != null) {
                c3097n11.a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this.l);
            }
            if (abstractC2915g1 != null) {
                abstractC2915g1.a();
                return;
            }
            C3097n9 c3097n12 = this.i;
            if (c3097n12 != null) {
                c3097n12.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    public final void g(AbstractC2915g1 abstractC2915g1) {
        byte b = this.b;
        if (b != 6) {
            if (b == 7) {
                this.F++;
                return;
            }
            return;
        }
        int i = this.F + 1;
        this.F = i;
        if (i != 1) {
            c((byte) 7);
            return;
        }
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            c3097n9.a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + this.l);
        }
        if (abstractC2915g1 != null) {
            b((byte) 4);
            a(abstractC2915g1);
        }
    }

    public final boolean h(AbstractC2915g1 abstractC2915g1) {
        byte b = this.b;
        if (b == 1) {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                c3097n9.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
            return true;
        }
        if (b == 7 || b == 6) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                c3097n10.b("InMobiInterstitial", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            return true;
        }
        if (b != 2) {
            return false;
        }
        if (Intrinsics.wireman("html", s()) || Intrinsics.wireman("htmlUrl", s())) {
            C3097n9 c3097n11 = this.i;
            if (c3097n11 != null) {
                c3097n11.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
        } else {
            c(abstractC2915g1);
        }
        return true;
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final String l() {
        return "int";
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void o(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        super.o(gestureDetectorOnGestureListenerC2829ci);
        if (!this.s) {
            if (this.b == 2) {
                b((byte) 1);
                b0();
                return;
            }
            return;
        }
        int iIndexOf = this.h.indexOf(gestureDetectorOnGestureListenerC2829ci);
        if (iIndexOf < this.p) {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n9.a("ja", "Ignoring loaded ad with index " + iIndexOf + " as current rendering index is " + this.p);
                return;
            }
            return;
        }
        this.r.add(Integer.valueOf(iIndexOf));
        if (this.b == 2) {
            int iW = W();
            for (int i = 0; i < iW && i < this.h.size(); i++) {
                if (this.h.get(i) == null || !this.r.contains(Integer.valueOf(i))) {
                    return;
                }
            }
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n10.a("ja", "Providing success based on index " + iIndexOf);
            }
            b((byte) 1);
            this.p = 0;
            b0();
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void p(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (!this.s || !a(renderView)) {
            U();
        }
        super.p(renderView);
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final GestureDetectorOnGestureListenerC2829ci q() {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (this.h.size() <= 0 || this.p >= this.h.size()) ? null : (GestureDetectorOnGestureListenerC2829ci) this.h.get(this.p);
        if (this.G && gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.k();
        }
        return gestureDetectorOnGestureListenerC2829ci;
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final byte t() {
        return (byte) 1;
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void a(byte[] bArr) {
        if (V()) {
            super.a(bArr);
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void d() throws JSONException {
        super.d();
        this.I = null;
    }

    public final void a(final C3048la c3048la, final Activity activity) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a((AbstractC2915g1) c3048la, (Context) activity);
        } else {
            ((Wb) AbstractC3119o6.e.getValue()).a.post(new Runnable() { // from class: adsuki.cinefilm
                @Override // java.lang.Runnable
                public final void run() {
                    C2998ja.a(this.f3360kowloon, c3048la, activity);
                }
            });
        }
    }

    public static final void e(C2998ja c2998ja) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        c2998ja.N();
        if (c2998ja.s) {
            AdSet adSetR = c2998ja.r();
            int size = (adSetR == null || (ads = adSetR.getAds()) == null) ? 0 : ads.size();
            for (int i = 1; i < size; i++) {
                c2998ja.o++;
                c2998ja.N();
            }
        }
    }

    public static final void a(C2998ja c2998ja, AbstractC2915g1 abstractC2915g1, Context context) {
        c2998ja.a(abstractC2915g1, context);
    }

    public static final void a(final C2998ja c2998ja, final GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, Context context) {
        final int iIndexOf = c2998ja.h.indexOf(gestureDetectorOnGestureListenerC2829ci);
        ArrayList list = c2998ja.h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (iIndexOf < 0 || iIndexOf >= list.size()) {
            return;
        }
        short sB = c2998ja.b(context);
        if (sB != 0) {
            c2998ja.e(iIndexOf);
        }
        c2998ja.b(iIndexOf, sB == 0);
        Handler handler = c2998ja.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: adsuki.canonical
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C2998ja.a(gestureDetectorOnGestureListenerC2829ci, c2998ja, iIndexOf);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final synchronized void e(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.e(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: adsuki.couple
                @Override // java.lang.Runnable
                public final void run() {
                    C2998ja.b(this.f3379kowloon);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final synchronized void f(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.f(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: adsuki.shimmery
                @Override // java.lang.Runnable
                public final void run() {
                    C2998ja.c(this.f3665kowloon);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1, com.inmobi.media.InterfaceC3312w0
    public final void a(GestureDetectorOnGestureListenerC2829ci renderView, Activity activity) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c3097n9.c("l1", "closeCurrentPodAd " + this);
        }
        if (this.s) {
            Integer num = (Integer) this.r.higher(Integer.valueOf(this.h.indexOf(renderView)));
            if (num != null) {
                a(num.intValue(), renderView, activity);
            } else {
                b();
            }
        }
    }

    public final void a(AbstractC2915g1 abstractC2915g1, Context context) {
        if (abstractC2915g1 == null) {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                c3097n9.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a((short) 2151);
            return;
        }
        Function0 function0 = this.I;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        byte b = this.b;
        if (b == 8) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n10.b("ja", "unload has been called on this ad. Dont show. ");
            }
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            Kb.a((byte) 2, "ja", "Failed to show Ad as creative has called unload() on the Ad");
            a((short) 2239);
            return;
        }
        if (b == 4) {
            e(abstractC2915g1);
            c((byte) 6);
            if (z()) {
                a((short) 2153);
                c((byte) 0);
                GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciI = i();
                if (gestureDetectorOnGestureListenerC2829ciI != null) {
                    gestureDetectorOnGestureListenerC2829ciI.b();
                    return;
                }
                return;
            }
            if (context == null) {
                context = n();
            }
            short sB = b(context);
            if (sB != 0) {
                a(sB);
                return;
            } else {
                abstractC2915g1.c();
                return;
            }
        }
        Kb.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        C3097n9 c3097n11 = this.i;
        if (c3097n11 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3097n11.b("ja", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        }
        Intrinsics.checkNotNullExpressionValue("ja", "TAG");
        Kb.a((byte) 1, "ja", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        a((short) 2152);
    }

    @Override // com.inmobi.media.InterfaceC3312w0
    public final void b() {
        if (this.s) {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n9.a("ja", "Closing the ad as closeAll is called");
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: adsuki.leukopoietic
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        C2998ja.a(this.f3515kowloon);
                    }
                });
            }
        }
    }

    public static final void b(C2998ja c2998ja) {
        c2998ja.f(c2998ja.m());
    }

    @Override // com.inmobi.media.AbstractC3039l1, com.inmobi.media.InterfaceC3312w0
    public final boolean a(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.s) {
            if (((Integer) this.r.higher(Integer.valueOf(this.h.indexOf(renderView)))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC3039l1, com.inmobi.media.InterfaceC3083mk
    public final void a(byte b) throws JSONException {
        if (b == 1) {
            if (this.s) {
                if (this.b == 2) {
                    C3097n9 c3097n9 = this.i;
                    if (c3097n9 != null) {
                        Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                        c3097n9.b("ja", "RenderView time out");
                    }
                    int iW = W();
                    int i = 0;
                    for (int i2 = 0; i2 < iW; i2++) {
                        if (!this.r.contains(Integer.valueOf(i2))) {
                            i = i2;
                            break;
                        }
                    }
                    a((GestureDetectorOnGestureListenerC2829ci) null, Integer.valueOf(i), 2);
                    f();
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                    return;
                }
                f();
                return;
            }
            super.a(b);
            return;
        }
        super.a(b);
    }

    @Override // com.inmobi.media.AbstractC3039l1, com.inmobi.media.InterfaceC3312w0
    public final void a(int i, final GestureDetectorOnGestureListenerC2829ci renderView, final Context context) {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (!this.s) {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                c3097n9.a("ja", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (this.r.contains(Integer.valueOf(i)) && i > this.h.indexOf(renderView) && i < this.h.size() && this.h.get(i) != null && ((gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) this.h.get(i)) == null || gestureDetectorOnGestureListenerC2829ci.B0)) {
            if (context == null) {
                context = n();
            }
            super.a(i, renderView, context);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: adsuki.swimathon
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2998ja.a(this.f3698kowloon, renderView, context);
                    }
                });
                return;
            }
            return;
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3097n10.a("ja", "Cannot show an pod ad with invalid index passed");
        }
        b(this.h.indexOf(renderView), false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public static final Unit a(C2998ja c2998ja, EnumC2765a6 errorCode) {
        short s;
        Intrinsics.checkNotNullParameter(errorCode, "it");
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int iOrdinal = errorCode.ordinal();
        if (iOrdinal == 0) {
            s = 2122;
        } else if (iOrdinal != 21) {
            switch (iOrdinal) {
                case 12:
                    s = 2123;
                    break;
                case 13:
                    s = 2124;
                    break;
                case 14:
                    s = 2125;
                    break;
                case 15:
                    s = 2126;
                    break;
                case 16:
                    s = 2127;
                    break;
                default:
                    s = 2122;
                    break;
            }
        } else {
            s = 2229;
        }
        c2998ja.a(inMobiAdRequestStatus, true, s);
        return Unit.f29295attabal;
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, short s) throws JSONException {
        super.a(gestureDetectorOnGestureListenerC2829ci, s);
        if (this.s) {
            int iIndexOf = this.h.indexOf(gestureDetectorOnGestureListenerC2829ci);
            if (iIndexOf < W()) {
                a(gestureDetectorOnGestureListenerC2829ci, (Integer) null, s == 2137 ? 1 : 3);
                e(s);
            }
            a(iIndexOf, true);
            return;
        }
        e(s);
    }

    public static final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, C2998ja c2998ja, int i) throws JSONException {
        gestureDetectorOnGestureListenerC2829ci.l();
        c2998ja.a(i, false);
    }

    public static final void a(C2998ja c2998ja) throws JSONException {
        c2998ja.e();
        C3097n9 c3097n9 = c2998ja.i;
        if (c3097n9 != null) {
            c3097n9.c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + c2998ja.l);
        }
        if (c2998ja.m() != null) {
            AbstractC2915g1 abstractC2915g1M = c2998ja.m();
            if (abstractC2915g1M != null) {
                abstractC2915g1M.a();
                return;
            }
            return;
        }
        C3097n9 c3097n10 = c2998ja.i;
        if (c3097n10 != null) {
            c3097n10.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1, com.inmobi.media.AbstractC2880ei
    public final void a(GestureDetectorOnGestureListenerC2829ci renderView, boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z);
        byte b = this.b;
        if (b == 4) {
            final short s = z ? (short) 2220 : (short) 2219;
            this.I = new Function0() { // from class: adsuki.bohunk
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2998ja.a(this.f3346kowloon, s);
                }
            };
            return;
        }
        if (b != 6) {
            if (b == 7) {
                short s2 = z ? (short) 2224 : (short) 2223;
                Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                C3097n9 c3097n9 = this.i;
                if (c3097n9 != null) {
                    Intrinsics.checkNotNullExpressionValue("ja", "TAG");
                    c3097n9.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                renderView.a(z, s2);
                renderView.x();
                f(m());
                return;
            }
            return;
        }
        short s3 = z ? (short) 2222 : (short) 2221;
        Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3097n10.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        renderView.x();
        if (this.F == 0) {
            a(s3);
        } else {
            renderView.a(z, s3);
            f(m());
        }
    }

    public static final Unit a(C2998ja c2998ja, short s) {
        Kb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3097n9 c3097n9 = c2998ja.i;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("ja", "TAG");
            c3097n9.b("ja", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        c2998ja.a(s);
        c2998ja.I = null;
        return Unit.f29295attabal;
    }
}
