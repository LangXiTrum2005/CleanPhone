package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3644n extends D5 {
    private final IronSource.a a;
    private final UUID b;
    private final String c;

    public C3644n(IronSource.a adFormat, UUID adId, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.a = adFormat;
        this.b = adId;
        this.c = adUnitId;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        return a(new C3538h0(this.a, this.b, this.c, null, null, null, 56, null));
    }
}
