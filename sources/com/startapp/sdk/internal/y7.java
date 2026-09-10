package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class y7 extends com.startapp.sdk.adsbase.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(Context context, o8 ad, AdEventListener adEventListener, lb networkApiExecutor, lb eventTracer, lb webViewCacheLoader, String adm) {
        super(ad, networkApiExecutor, context, adEventListener, adm);
        Intrinsics.f(context, "context");
        Intrinsics.f(ad, "ad");
        Intrinsics.f(networkApiExecutor, "networkApiExecutor");
        Intrinsics.f(eventTracer, "eventTracer");
        Intrinsics.f(webViewCacheLoader, "webViewCacheLoader");
        Intrinsics.f(adm, "adm");
    }

    @Override // com.startapp.sdk.adsbase.d
    public Object a(String adm) {
        Intrinsics.f(adm, "adm");
        try {
            Ad ad = this.f40651a;
            Intrinsics.d(ad, "null cannot be cast to non-null type com.startapp.sdk.adsbase.HtmlAd");
            o8 o8Var = (o8) ad;
            o8Var.d(adm);
            u0.a(o8Var.a(), 0);
            return o8Var;
        } catch (Throwable unused) {
            return null;
        }
    }
}
