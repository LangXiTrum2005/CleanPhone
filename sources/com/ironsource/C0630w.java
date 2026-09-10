package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0630w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0485nf f30871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S7 f30875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30876f;

    public C0630w(EnumC0485nf recordType, String advertiserBundleId, String networkInstanceId, String adUnitId, S7 adProvider, String adInstanceId) {
        kotlin.jvm.internal.n.f(recordType, "recordType");
        kotlin.jvm.internal.n.f(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.n.f(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(adProvider, "adProvider");
        kotlin.jvm.internal.n.f(adInstanceId, "adInstanceId");
        this.f30871a = recordType;
        this.f30872b = advertiserBundleId;
        this.f30873c = networkInstanceId;
        this.f30874d = adUnitId;
        this.f30875e = adProvider;
        this.f30876f = adInstanceId;
    }

    public final String a() {
        return this.f30876f;
    }

    public final S7 b() {
        return this.f30875e;
    }

    public final String c() {
        return this.f30874d;
    }

    public final String d() {
        return this.f30872b;
    }

    public final String e() {
        return this.f30873c;
    }

    public final EnumC0485nf f() {
        return this.f30871a;
    }

    public final G0 a(Jb<C0630w, G0> mapper) {
        kotlin.jvm.internal.n.f(mapper, "mapper");
        return mapper.a(this);
    }
}
