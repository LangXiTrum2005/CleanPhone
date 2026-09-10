package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.f3;
import com.applovin.impl.f6;
import com.applovin.impl.j;
import com.applovin.impl.k5;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.t3;
import com.applovin.impl.u1;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.a.InterfaceC0015a, j.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f8532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.i f8535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxNativeAdListener f8537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f8538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f8539h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f8540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f8541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f8542c;

        public a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f8540a = maxNativeAd;
            this.f8541b = list;
            this.f8542c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8540a.prepareForInteraction(this.f8541b, this.f8542c)) {
                return;
            }
            p.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f8544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f3 f8545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f8546c;

        public b(MaxNativeAdView maxNativeAdView, f3 f3Var, MaxNativeAd maxNativeAd) {
            this.f8544a = maxNativeAdView;
            this.f8545b = f3Var;
            this.f8546c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.f8544a);
            }
            MaxNativeAdLoaderImpl.this.sdk.z().d(this.f8545b);
            this.f8544a.render(this.f8545b, MaxNativeAdLoaderImpl.this.f8532a, MaxNativeAdLoaderImpl.this.sdk);
            this.f8546c.setNativeAdView(this.f8544a);
            if (this.f8546c.prepareForInteraction(this.f8544a.getClickableViews(), this.f8544a)) {
                return;
            }
            this.f8546c.prepareViewForInteraction(this.f8544a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.applovin.impl.mediation.ads.a.InterfaceC0010a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f8537f);
            }
            v2.a(MaxNativeAdLoaderImpl.this.f8537f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f8537f);
            }
            v2.a(MaxNativeAdLoaderImpl.this.f8537f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new i(0, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            v2.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        public /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            f3 f3Var = (f3) maxAd;
            f3Var.g(MaxNativeAdLoaderImpl.this.f8533b);
            f3Var.f(MaxNativeAdLoaderImpl.this.f8534c);
            synchronized (MaxNativeAdLoaderImpl.this.f8536e) {
                MaxNativeAdLoaderImpl.this.f8539h.add(f3Var);
            }
            MaxNativeAdView maxNativeAdViewA = MaxNativeAdLoaderImpl.this.a(f3Var.N());
            if (maxNativeAdViewA == null) {
                p pVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (p.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                p pVar3 = MaxNativeAdLoaderImpl.this.logger;
                if (p.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl3.logger.a(maxNativeAdLoaderImpl3.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f8537f);
                }
                v2.a(MaxNativeAdLoaderImpl.this.f8537f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(f3Var);
                return;
            }
            a(maxNativeAdViewA);
            MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA, f3Var, f3Var.getNativeAd());
            p pVar4 = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + maxNativeAdViewA + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f8537f);
            }
            v2.a(MaxNativeAdLoaderImpl.this.f8537f, maxNativeAdViewA, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(f3Var);
            MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA);
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            f3 f3VarB;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (f3VarB = adViewTracker.b()) == null) {
                return;
            }
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(f3VarB);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }
    }

    public MaxNativeAdLoaderImpl(String str, l lVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", lVar);
        this.f8532a = new c(this, null);
        this.f8535d = com.applovin.impl.i.PUBLISHER_INITIATED;
        this.f8536e = new Object();
        this.f8538g = new HashMap();
        this.f8539h = new HashSet();
        lVar.k().a(this);
        if (p.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f8537f = null;
        this.sdk.k().b(this);
        synchronized (this.f8536e) {
            this.f8538g.clear();
            this.f8539h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.f8533b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((f3) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (p.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.c();
        } else if (p.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(@Nullable MaxNativeAdView maxNativeAdView) {
        if (p.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f8532a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.Z().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f8535d, this.localExtraParameters, this.extraParameters, l.p(), this.f8532a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0015a
    public void onAdExpired(u1 u1Var) {
        if (p.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (p.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + u1Var + "), listener=" + this.f8537f);
        }
        v2.b(this.f8537f, (MaxAd) u1Var, true);
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        f3 f3Var;
        Iterator it = this.f8539h.iterator();
        do {
            if (!it.hasNext()) {
                f3Var = null;
                break;
            }
            f3Var = (f3) it.next();
        } while (!f3Var.T().equalsIgnoreCase(str));
        if (f3Var != null) {
            f3Var.h(str2);
            v2.b(this.adReviewListener, str2, f3Var);
            synchronized (this.f8536e) {
                this.f8539h.remove(f3Var);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        f3 f3Var = (f3) maxAd;
        MaxNativeAd nativeAd = f3Var.getNativeAd();
        if (nativeAd == null) {
            if (p.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        f3Var.a(viewGroup);
        this.sdk.z().d(f3Var);
        a((a3) f3Var);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(f3Var, viewGroup, this.f8532a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.s0().a((k5) new u6(this.sdk, "renderMaxNativeAd", aVar), f6.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof f3)) {
            p.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            p.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        f3 f3Var = (f3) maxAd;
        MaxNativeAd nativeAd = f3Var.getNativeAd();
        if (nativeAd == null) {
            if (p.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(t3.Y7)).booleanValue()) {
            p.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, f3Var, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        q7.b(str, this.tag);
        this.f8534c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof com.applovin.impl.i)) {
            this.f8535d = (com.applovin.impl.i) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (p.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f8537f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f8533b = str;
    }

    @NonNull
    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f8537f + ", revenueListener=" + this.revenueListener + '}';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(f3 f3Var) {
        if (f3Var.x0().get()) {
            return;
        }
        this.sdk.f().a(f3Var, this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f8536e) {
            this.f8538g.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof f3) {
            f3 f3Var = (f3) maxAd;
            if (f3Var.A0()) {
                if (p.a()) {
                    this.logger.a(this.tag, "Native ad (" + f3Var + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.f8536e) {
                this.f8539h.remove(f3Var);
            }
            MaxNativeAdView maxNativeAdViewV0 = f3Var.v0();
            if (maxNativeAdViewV0 != null && (adViewTracker = maxNativeAdViewV0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                maxNativeAdViewV0.recycle();
            }
            MaxNativeAd nativeAd = f3Var.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(f3Var);
            this.sdk.Z().destroyAd(f3Var);
            if (this.sdk.T() != null) {
                this.sdk.T().c(this.adUnitId, f3Var.N());
                return;
            } else {
                this.sdk.S().c(this.adUnitId, f3Var.N());
                return;
            }
        }
        if (p.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f8536e) {
            maxNativeAdView = (MaxNativeAdView) this.f8538g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView, f3 f3Var, MaxNativeAd maxNativeAd) {
        f3Var.a(maxNativeAdView);
        a((a3) f3Var);
        b bVar = new b(maxNativeAdView, f3Var, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.s0().a((k5) new u6(this.sdk, "renderMaxNativeAd", bVar), f6.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null || !maxNativeAdView.isAttachedToWindow()) {
            return;
        }
        adViewTracker.c();
    }
}
