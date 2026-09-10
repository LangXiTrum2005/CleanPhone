package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 extends h3 {
    public final String O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final t9 f15249P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final qc f15250Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final z6 f15251R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Context context, String location, kb mtype, String adUnitParameters, a8 fileCache, z2 z2Var, lh uiPoster, e3 e3Var, Mediation mediation, String str, hd openMeasurementImpressionCallback, n0 adUnitRendererCallback, t9 impressionInterface, dk webViewTimeoutInterface, qc nativeBridgeCommand, z6 eventTracker) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, z2Var, e3Var, mediation, str, openMeasurementImpressionCallback, adUnitRendererCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(location, "location");
        Intrinsics.f(mtype, "mtype");
        Intrinsics.f(adUnitParameters, "adUnitParameters");
        Intrinsics.f(fileCache, "fileCache");
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.f(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.f(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.f(eventTracker, "eventTracker");
        this.O = str;
        this.f15249P = impressionInterface;
        this.f15250Q = nativeBridgeCommand;
        this.f15251R = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.h3
    public ij b(Context context) {
        Intrinsics.f(context, "context");
        this.f15250Q.a(this.f15249P);
        String str = this.O;
        if (str == null || StringsKt.w(str)) {
            za.b("templateHtml must not be null or blank", (Throwable) null, 2, (Object) null);
            return null;
        }
        try {
            return new mc(context, this.O, j(), this.f15249P, h(), this.f15250Q, this.f15251R, null, 128, null);
        } catch (Exception e2) {
            c("Can't instantiate MraidWebViewBase: " + e2);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.h3, com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        super.mo189track(event);
    }

    @Override // com.chartboost.sdk.impl.h3
    public void w() {
    }
}
