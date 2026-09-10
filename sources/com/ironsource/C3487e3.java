package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3487e3 extends AbstractC3648n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3487e3(int i, String placementName, boolean z, C3479dd c3479dd) {
        super(i, placementName, z, c3479dd);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.AbstractC3648n3
    public String toString() {
        return super.toString() + ", placementId: " + b();
    }
}
