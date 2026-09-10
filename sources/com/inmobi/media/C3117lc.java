package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3117lc extends GestureDetectorOnGestureListenerC3005ec {
    public final byte c1;
    public final InterfaceC3333z5 d1;
    public final String e1;
    public final GestureDetectorOnGestureListenerC3005ec f1;
    public final C3101kc g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3117lc(Context context, byte b2, InterfaceC3333z5 interfaceC3333z5, Q adMetaData, tf webViewFactory, Cc route) {
        super(context, b2, null, null, false, adMetaData.s, 0L, adMetaData.t, interfaceC3333z5, route, webViewFactory, adMetaData, 92);
        Intrinsics.f(context, "context");
        Intrinsics.f(adMetaData, "adMetaData");
        Intrinsics.f(webViewFactory, "webViewFactory");
        Intrinsics.f(route, "route");
        this.c1 = b2;
        this.d1 = interfaceC3333z5;
        this.e1 = "RenderViewSibling - " + route.f22751b;
        this.f1 = (GestureDetectorOnGestureListenerC3005ec) webViewFactory.f24017b.get("default");
        this.g1 = new C3101kc(this, webViewFactory, route);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GestureDetectorOnGestureListenerC3005ec getAdRenderView() {
        InterfaceC3333z5 interfaceC3333z5;
        if (this.f1 == null && (interfaceC3333z5 = this.d1) != null) {
            ((A5) interfaceC3333z5).b(this.e1, "Ad RenderView not found for id: " + getRoute().f22751b);
        }
        return this.f1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3005ec, com.inmobi.media.InterfaceC3295x
    public final void b() {
        h();
        removeAllViews();
        destroy();
    }

    public final InterfaceC3333z5 getLogger() {
        return this.d1;
    }

    public final byte getMPlacementType() {
        return this.c1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3005ec, com.inmobi.media.InterfaceC3295x
    public Xe getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new O5(this, this, new S4(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getMAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.d1), this.d1));
        }
        Xe mViewableAd = getMViewableAd();
        Intrinsics.c(mViewableAd);
        return mViewableAd;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3005ec
    public final void i() {
        InterfaceC3333z5 interfaceC3333z5 = this.d1;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a(this.e1, "dismissCurrentViewContainer " + this);
        }
        F7 mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            C3271v7 c3271v7 = mediaProcessor.f22819c;
            if (c3271v7 != null) {
                c3271v7.b();
            }
            mediaProcessor.f22819c = null;
        }
        if ("Default".equals(getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3005ec
    public final void m() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3005ec
    public final void o() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3005ec, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        tf webViewFactory = getWebViewFactory();
        String id = getRoute().f22750a;
        webViewFactory.getClass();
        Intrinsics.f(id, "id");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webViewFactory.f24017b.get(id);
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            a(gestureDetectorOnGestureListenerC3005ec, getRoute().f22751b);
            return;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.d1;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b(this.e1, "Not able to give show success as the source view is not present");
        }
    }

    public final void a(AdConfig adConfig) {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        Intrinsics.f(adConfig, "adConfig");
        InterfaceC3333z5 interfaceC3333z5 = this.d1;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a(this.e1, "initialize RenderViewSibling");
        }
        a(this.g1, adConfig);
        GestureDetectorOnGestureListenerC3005ec adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        GestureDetectorOnGestureListenerC3005ec adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        GestureDetectorOnGestureListenerC3005ec adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof C3117lc)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        InterfaceC3333z5 interfaceC3333z6 = this.d1;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a(this.e1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(MapsKt.s(linkedHashMap));
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3005ec
    public final void a(C3210ra orientationProperties) {
        Intrinsics.f(orientationProperties, "orientationProperties");
        InterfaceC3333z5 interfaceC3333z5 = this.d1;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a(this.e1, "setOrientationProperties " + this);
        }
        setOrientationProperties(orientationProperties);
    }
}
