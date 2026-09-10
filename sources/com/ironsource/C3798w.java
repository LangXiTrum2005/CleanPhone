package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3798w {
    private final EnumC3427af a;
    private final String b;
    private final String c;
    private final String d;
    private final Q7 e;
    private final String f;

    public C3798w(EnumC3427af recordType, String advertiserBundleId, String networkInstanceId, String adUnitId, Q7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = advertiserBundleId;
        this.c = networkInstanceId;
        this.d = adUnitId;
        this.e = adProvider;
        this.f = adInstanceId;
    }

    public final String a() {
        return this.f;
    }

    public final Q7 b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final EnumC3427af f() {
        return this.a;
    }

    public final G0 a(Fb<C3798w, G0> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
