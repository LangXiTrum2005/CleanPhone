package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3461cd extends AbstractC3648n3 {
    private String e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3461cd(int i, String placementName, boolean z, String rewardName, int i2, C3479dd c3479dd) {
        super(i, placementName, z, c3479dd);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f = i2;
        this.e = rewardName;
    }

    public final int e() {
        return this.f;
    }

    public final String f() {
        return this.e;
    }

    @Override // com.ironsource.AbstractC3648n3
    public String toString() {
        return super.toString() + ", reward name: " + this.e + " , amount: " + this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3461cd(AbstractC3648n3 placement) {
        super(placement.b(), placement.c(), placement.d(), placement.a());
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.e = "";
    }
}
