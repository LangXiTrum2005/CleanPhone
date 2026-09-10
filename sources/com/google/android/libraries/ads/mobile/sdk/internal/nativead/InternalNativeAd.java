package com.google.android.libraries.ads.mobile.sdk.internal.nativead;

import ads_mobile_sdk.a22;
import ads_mobile_sdk.e2;
import ads_mobile_sdk.f51;
import ads_mobile_sdk.fj1;
import ads_mobile_sdk.gk2;
import ads_mobile_sdk.gm1;
import ads_mobile_sdk.h1;
import ads_mobile_sdk.hj1;
import ads_mobile_sdk.l13;
import ads_mobile_sdk.om1;
import ads_mobile_sdk.ur;
import ads_mobile_sdk.v21;
import ads_mobile_sdk.wb0;
import ads_mobile_sdk.x12;
import ads_mobile_sdk.yj1;
import android.view.ViewGroup;
import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import com.google.gson.Gson;
import java.util.List;
import java.util.Optional;
import kotlinx.coroutines.saran;
import monocoque.attabal;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.loun;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/nativead/InternalNativeAd;", "Lads_mobile_sdk/v21;", "Ljava/util/Optional;", "Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/PerAdNativeJavscriptEngineJsContext;", "jsEngineContext", "Ljava/util/Optional;", "localJsEngineContext", "Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/PerAdNativeJavscriptEngineJsContext;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public class InternalNativeAd extends v21 {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saran f19431attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final f51 f19432beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Gson f19433competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final yj1 f19434dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final loun f19435impromptu;
    private final Optional<PerAdNativeJavscriptEngineJsContext> jsEngineContext;
    private PerAdNativeJavscriptEngineJsContext localJsEngineContext;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final om1 f19436marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final hj1 f19437saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final gm1 f19438wireman;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalNativeAd(saran uiScope, String adId, h1 adConfiguration, ur commonConfiguration, l13 traceMetaSet, Optional webView, e2 adEventEmitter, wb0 delegatingAdListener, hj1 nativeAdAssets, yj1 nativeAdCore, gm1 nativeAdViewPopulator, om1 nativeAdViewabilityTracker, f51 internalMediaContent, Optional jsEngineContext, x12 phantomReferences, gk2 safeBrowsingManager, Gson gson, loun traceLogger, a22 placementIdWrapper) {
        super(adId, adConfiguration, commonConfiguration, traceMetaSet, webView, adEventEmitter, delegatingAdListener, phantomReferences, safeBrowsingManager, placementIdWrapper);
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(delegatingAdListener, "delegatingAdListener");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(nativeAdViewPopulator, "nativeAdViewPopulator");
        Intrinsics.checkNotNullParameter(nativeAdViewabilityTracker, "nativeAdViewabilityTracker");
        Intrinsics.checkNotNullParameter(internalMediaContent, "internalMediaContent");
        Intrinsics.checkNotNullParameter(jsEngineContext, "jsEngineContext");
        Intrinsics.checkNotNullParameter(phantomReferences, "phantomReferences");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        this.f19431attabal = uiScope;
        this.f19437saneness = nativeAdAssets;
        this.f19434dern = nativeAdCore;
        this.f19438wireman = nativeAdViewPopulator;
        this.f19436marial = nativeAdViewabilityTracker;
        this.f19432beachfront = internalMediaContent;
        this.jsEngineContext = jsEngineContext;
        this.f19433competently = gson;
        this.f19435impromptu = traceLogger;
        this.localJsEngineContext = (PerAdNativeJavscriptEngineJsContext) attabal.saneness(jsEngineContext);
    }

    @Override // ads_mobile_sdk.v21, saneness.imperceivable
    public final Object a(dern dernVar) {
        this.localJsEngineContext = (PerAdNativeJavscriptEngineJsContext) attabal.saneness(this.jsEngineContext);
        Object objA = super.a(dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public final void attabal(ViewGroup mediaViewContainer) {
        Intrinsics.checkNotNullParameter(mediaViewContainer, "mediaViewContainer");
        if (this.f19437saneness.b != fj1.CUSTOM_NATIVE || this.f19438wireman.a(mediaViewContainer)) {
            return;
        }
        mediaViewContainer.removeAllViews();
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final gm1 getF19438wireman() {
        return this.f19438wireman;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final om1 getF19436marial() {
        return this.f19436marial;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final f51 getF19432beachfront() {
        return this.f19432beachfront;
    }

    @Override // ads_mobile_sdk.v21, saneness.imperceivable
    public final void destroy() {
        super.destroy();
        this.f19434dern.a();
    }

    public final void impromptu() {
        this.f19434dern.k();
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final yj1 getF19434dern() {
        return this.f19434dern;
    }

    public final void saneness() {
        List list = this.f19437saneness.p;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final hj1 getF19437saneness() {
        return this.f19437saneness;
    }
}
