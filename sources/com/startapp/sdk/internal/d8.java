package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d8 extends com.startapp.sdk.adsbase.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(Context context, qd qdVar, AdEventListener adEventListener, lb networkApiExecutor, lb eventTracer, String adm) {
        super(qdVar, networkApiExecutor, context, adEventListener, adm);
        Intrinsics.f(context, "context");
        Intrinsics.f(networkApiExecutor, "networkApiExecutor");
        Intrinsics.f(eventTracer, "eventTracer");
        Intrinsics.f(adm, "adm");
    }

    @Override // com.startapp.sdk.adsbase.d
    public final Object a(String adm) {
        Intrinsics.f(adm, "adm");
        try {
            Object objFromJson = JsonParser.fromJson(adm, GetAdResponse.class);
            GetAdResponse getAdResponse = (GetAdResponse) objFromJson;
            Ad ad = this.f40651a;
            Intrinsics.c(ad);
            gb gbVar = (gb) ad;
            gbVar.setAdInfoOverride(getAdResponse.c());
            gbVar.a(u0.a(this.f40653c, getAdResponse.d(), 0, new HashSet(), true));
            return (GetAdResponse) objFromJson;
        } catch (Throwable unused) {
            return null;
        }
    }
}
