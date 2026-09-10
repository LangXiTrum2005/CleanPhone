package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0469n extends E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f29772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f29773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29774c;

    public C0469n(IronSource.a adFormat, UUID adId, String adUnitId) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        this.f29772a = adFormat;
        this.f29773b = adId;
        this.f29774c = adUnitId;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c4) {
        return a(new C0363h0(this.f29772a, this.f29773b, this.f29774c, null, null, null, 56, null));
    }
}
