package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class J2 extends C0363h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LevelPlayAdSize f26328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Boolean f26329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Long f26330i;

    public /* synthetic */ J2(UUID uuid, String str, C0358gd c0358gd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, Tf tf, Double d10, int i10, kotlin.jvm.internal.g gVar) {
        this(uuid, str, (i10 & 4) != 0 ? null : c0358gd, (i10 & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : l, (i10 & 64) != 0 ? null : tf, (i10 & 128) != 0 ? null : d10);
    }

    public final LevelPlayAdSize i() {
        return this.f26328g;
    }

    public final Boolean j() {
        return this.f26329h;
    }

    public final Long k() {
        return this.f26330i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(UUID adId, String adUnitId, C0358gd c0358gd, LevelPlayAdSize adSize, Boolean bool, Long l, Tf tf, Double d10) {
        super(IronSource.a.BANNER, adId, adUnitId, c0358gd, tf, d10);
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(adSize, "adSize");
        this.f26328g = adSize;
        this.f26329h = bool;
        this.f26330i = l;
    }

    public J2() {
        this(C0638w7.f30930a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
