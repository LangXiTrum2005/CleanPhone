package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Q8 extends C2984d8 {
    public final P8 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q8(String assetId, String assetName, C3001e8 assetStyle, P8 timer) {
        super(assetId, assetName, "TIMER", assetStyle, 16);
        Intrinsics.f(assetId, "assetId");
        Intrinsics.f(assetName, "assetName");
        Intrinsics.f(assetStyle, "assetStyle");
        Intrinsics.f(timer, "timer");
        this.x = timer;
    }

    public final void a(boolean z2) {
        this.y = z2;
    }
}
