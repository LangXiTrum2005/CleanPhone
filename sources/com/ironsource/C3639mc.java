package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3639mc {
    private final EnumC3427af a;
    private final String b;
    private final Q7 c;
    private final String d;

    public C3639mc(EnumC3427af recordType, String advertiserBundleId, Q7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = advertiserBundleId;
        this.c = adProvider;
        this.d = adInstanceId;
    }

    public final String a() {
        return this.d;
    }

    public final Q7 b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final EnumC3427af d() {
        return this.a;
    }

    public final C3557i1 a(Fb<C3639mc, C3557i1> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
