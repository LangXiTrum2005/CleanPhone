package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class M extends Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f22960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Yd f22961b;

    public M(N adImpressionCallbackHandler, Yd yd) {
        Intrinsics.f(adImpressionCallbackHandler, "adImpressionCallbackHandler");
        this.f22960a = adImpressionCallbackHandler;
        this.f22961b = yd;
    }

    @Override // com.inmobi.media.Z1
    public final void a(C3107l2 click) {
        Intrinsics.f(click, "click");
        this.f22960a.a(this.f22961b);
    }

    @Override // com.inmobi.media.Z1
    public final void a(C3107l2 click, String error) {
        Intrinsics.f(click, "click");
        Intrinsics.f(error, "error");
        LinkedHashMap linkedHashMapA = this.f22961b.a();
        linkedHashMapA.put("networkType", L3.q());
        linkedHashMapA.put("errorCode", (short) 2178);
        linkedHashMapA.put("reason", error);
        Pd pd = Pd.f23077a;
        Pd.b("AdImpressionSuccessful", linkedHashMapA, Td.SDK);
    }
}
