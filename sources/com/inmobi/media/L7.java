package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class L7 extends Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T7 f22948a;

    public L7(T7 t7) {
        this.f22948a = t7;
    }

    @Override // com.inmobi.media.Z1
    public final void a(C3107l2 click) {
        Intrinsics.f(click, "click");
        T7 t7 = this.f22948a;
        LinkedHashMap linkedHashMap = t7.f23210R;
        Yd yd = new Yd(linkedHashMap != null ? (U0) linkedHashMap.get("AdImpressionSuccessful") : null, t7.f23216i.f, t7.getCreativeId(), "inmobiJson");
        yd.f23382e = "nativeBeacon";
        P0 p0 = this.f22948a.f23221w;
        if (p0 != null) {
            yd.f23382e = "nativeBeacon";
            if (p0.f23058a.Z()) {
                yd.b();
            } else {
                p0.f23058a.D.a(yd);
            }
        }
    }

    @Override // com.inmobi.media.Z1
    public final void a(C3107l2 click, String error) {
        Intrinsics.f(click, "click");
        Intrinsics.f(error, "error");
        T7 t7 = this.f22948a;
        LinkedHashMap linkedHashMap = t7.f23210R;
        Yd yd = new Yd(linkedHashMap != null ? (U0) linkedHashMap.get("AdImpressionSuccessful") : null, t7.f23216i.f, t7.getCreativeId(), "inmobiJson");
        yd.f23382e = "nativeBeacon";
        LinkedHashMap linkedHashMapA = yd.a();
        linkedHashMapA.put("networkType", L3.q());
        linkedHashMapA.put("errorCode", (short) 2178);
        linkedHashMapA.put("reason", error);
        Pd pd = Pd.f23077a;
        Pd.b("AdImpressionSuccessful", linkedHashMapA, Td.SDK);
    }
}
