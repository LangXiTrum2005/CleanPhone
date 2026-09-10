package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.cc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0285cc extends C0363h0 {
    public /* synthetic */ C0285cc(UUID uuid, String str, C0358gd c0358gd, int i10, kotlin.jvm.internal.g gVar) {
        this(uuid, str, (i10 & 4) != 0 ? null : c0358gd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285cc(UUID adId, String adUnitId, C0358gd c0358gd) {
        super(IronSource.a.NATIVE_AD, adId, adUnitId, c0358gd, null, null, 48, null);
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
    }

    public C0285cc() {
        this(C0638w7.f30930a.a(), "", null, 4, null);
    }
}
