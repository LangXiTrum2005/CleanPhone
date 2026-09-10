package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0485nf f26117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S7 f26120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26121e;

    public G0(EnumC0485nf recordType, String advertiserBundleId, String networkInstanceId, S7 adProvider, String adInstanceId) {
        kotlin.jvm.internal.n.f(recordType, "recordType");
        kotlin.jvm.internal.n.f(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.n.f(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.n.f(adProvider, "adProvider");
        kotlin.jvm.internal.n.f(adInstanceId, "adInstanceId");
        this.f26117a = recordType;
        this.f26118b = advertiserBundleId;
        this.f26119c = networkInstanceId;
        this.f26120d = adProvider;
        this.f26121e = adInstanceId;
    }

    public final String a() {
        return this.f26121e;
    }

    public final S7 b() {
        return this.f26120d;
    }

    public final String c() {
        return this.f26118b;
    }

    public final String d() {
        return this.f26119c;
    }

    public final EnumC0485nf e() {
        return this.f26117a;
    }

    public final C0553rc a(Jb<G0, C0553rc> mapper) {
        kotlin.jvm.internal.n.f(mapper, "mapper");
        return mapper.a(this);
    }
}
