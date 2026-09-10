package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class k9 implements j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f14338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f14339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s4 f14340c;
    public final n0 d;

    public static final class a implements t4 {
        @Override // com.chartboost.sdk.impl.t4
        public void a(String str) {
            za.b("onCompleteRequestFailure " + str, (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.t4
        public void a(JSONObject jSONObject) {
            za.b("onCompleteRequestSuccess " + jSONObject, (Throwable) null, 2, (Object) null);
        }
    }

    public k9(z adUnit, y adType, s4 completeRequest, n0 adUnitRendererImpressionCallback) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(completeRequest, "completeRequest");
        Intrinsics.f(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        this.f14338a = adUnit;
        this.f14339b = adType;
        this.f14340c = completeRequest;
        this.d = adUnitRendererImpressionCallback;
    }

    @Override // com.chartboost.sdk.impl.j9
    public void a() {
        y yVar = this.f14339b;
        if (yVar == y.b.g) {
            za.b("didCompleteInterstitial delegate used to be sent here", (Throwable) null, 2, (Object) null);
        } else if (yVar == y.c.g) {
            this.d.a(this.f14338a.m(), this.f14338a.v());
        }
    }

    @Override // com.chartboost.sdk.impl.j9
    public void a(String location, Float f, Float f2) {
        Intrinsics.f(location, "location");
        this.f14340c.a(new a(), new r4(location, this.f14338a.a(), this.f14338a.g(), this.f14338a.v(), this.f14338a.w(), f, f2));
    }
}
