package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.rc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0553rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0485nf f30160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S7 f30162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30163d;

    public C0553rc(EnumC0485nf recordType, String advertiserBundleId, S7 adProvider, String adInstanceId) {
        kotlin.jvm.internal.n.f(recordType, "recordType");
        kotlin.jvm.internal.n.f(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.n.f(adProvider, "adProvider");
        kotlin.jvm.internal.n.f(adInstanceId, "adInstanceId");
        this.f30160a = recordType;
        this.f30161b = advertiserBundleId;
        this.f30162c = adProvider;
        this.f30163d = adInstanceId;
    }

    public final String a() {
        return this.f30163d;
    }

    public final S7 b() {
        return this.f30162c;
    }

    public final String c() {
        return this.f30161b;
    }

    public final EnumC0485nf d() {
        return this.f30160a;
    }

    public final C0382i1 a(Jb<C0553rc, C0382i1> mapper) {
        kotlin.jvm.internal.n.f(mapper, "mapper");
        return mapper.a(this);
    }
}
