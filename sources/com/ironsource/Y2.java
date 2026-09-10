package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y2 extends C0483nd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0506p0 f27956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ISBannerSize f27957c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(C0506p0 adTools, ISBannerSize size, String placement) {
        super(placement);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(size, "size");
        kotlin.jvm.internal.n.f(placement, "placement");
        this.f27956b = adTools;
        this.f27957c = size;
    }

    @Override // com.ironsource.C0483nd, com.ironsource.E0
    public Map<String, Object> a(C0 c4) {
        LinkedHashMap linkedHashMapY = xj.b0.Y(super.a(c4));
        this.f27956b.a(linkedHashMapY, this.f27957c);
        return linkedHashMapY;
    }
}
