package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1095Bm<K> extends C2532nh<K, V>.Itr<K> {
    public final /* synthetic */ C2532nh A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1095Bm(final C2532nh this$0) {
        super(this$0, null);
        this.A00 = this$0;
    }

    @ParametricNullness
    public final K A03(int i) {
        return (K) this.A00.A0E(i);
    }
}
