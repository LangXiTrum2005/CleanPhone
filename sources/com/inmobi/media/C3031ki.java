package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3031ki extends GestureDetectorOnGestureListenerC2829ci {
    public final byte i1;
    public final C3097n9 j1;
    public final String k1;
    public final GestureDetectorOnGestureListenerC2829ci l1;
    public final C3006ji m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3031ki(Context context, byte b, C3097n9 c3097n9, C3113o0 adMetaData, ko webViewFactory, Di route, AdConfig adConfig) {
        super(context, b, null, null, adMetaData.r, 0L, adMetaData.s, c3097n9, route, webViewFactory, adMetaData, adConfig, 92);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adMetaData, "adMetaData");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.i1 = b;
        this.j1 = c3097n9;
        this.k1 = "RenderViewSibling - " + route.b;
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
        this.l1 = (GestureDetectorOnGestureListenerC2829ci) webViewFactory.b.get(BuildConfig.FLAVOR);
        this.m1 = new C3006ji(this, webViewFactory, route);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GestureDetectorOnGestureListenerC2829ci getAdRenderView() {
        C3097n9 c3097n9;
        if (this.l1 == null && (c3097n9 = this.j1) != null) {
            c3097n9.b(this.k1, "Ad RenderView not found for id: " + getRoute().b);
        }
        return this.l1;
    }

    public final void Z() {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        C3097n9 c3097n9 = this.j1;
        if (c3097n9 != null) {
            c3097n9.a(this.k1, "initialize RenderViewSibling");
        }
        a(this.m1);
        GestureDetectorOnGestureListenerC2829ci adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        GestureDetectorOnGestureListenerC2829ci adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        GestureDetectorOnGestureListenerC2829ci adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof C3031ki)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C3097n9 c3097n10 = this.j1;
        if (c3097n10 != null) {
            c3097n10.a(this.k1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(seminary.stratoscope(linkedHashMap));
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2829ci
    public final void a(Ff orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        C3097n9 c3097n9 = this.j1;
        if (c3097n9 != null) {
            c3097n9.a(this.k1, "setOrientationProperties " + this);
        }
        setOrientationProperties(orientationProperties);
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2829ci, com.inmobi.media.C
    public final void b() {
        j();
        removeAllViews();
        Intrinsics.competently(this, "null cannot be cast to non-null type android.webkit.WebView");
        destroy();
    }

    public final InterfaceC3072m9 getLogger() {
        return this.j1;
    }

    public final byte getMPlacementType() {
        return this.i1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2829ci, com.inmobi.media.C
    public Fn getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new D9(this, this, new C3170q7(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.j1), this.j1));
        }
        Fn mViewableAd = getMViewableAd();
        Intrinsics.beachfront(mViewableAd);
        return mViewableAd;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2829ci
    public final void m() {
        C3097n9 c3097n9 = this.j1;
        if (c3097n9 != null) {
            c3097n9.a(this.k1, "dismissCurrentViewContainer " + this);
        }
        C3324wc mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            C2951hc c2951hc = mediaProcessor.c;
            if (c2951hc != null) {
                c2951hc.b();
            }
            mediaProcessor.c = null;
        }
        if (Intrinsics.wireman("Default", getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2829ci, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        ko webViewFactory = getWebViewFactory();
        String id = getRoute().a;
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) webViewFactory.b.get(id);
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            c(gestureDetectorOnGestureListenerC2829ci, getRoute().b);
            return;
        }
        C3097n9 c3097n9 = this.j1;
        if (c3097n9 != null) {
            c3097n9.b(this.k1, "Not able to give show success as the source view is not present");
        }
    }

    private static /* synthetic */ void getOverrideListener$annotations() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2829ci
    public final void C() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2829ci
    public final void u() {
    }
}
