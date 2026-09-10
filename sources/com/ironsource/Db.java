package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Db implements S5<Cb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ed f25972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0346g1 f25973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25974d;

    public Db(String adm, Ed providerName, InterfaceC0346g1 adapterConfigs, boolean z10) {
        kotlin.jvm.internal.n.f(adm, "adm");
        kotlin.jvm.internal.n.f(providerName, "providerName");
        kotlin.jvm.internal.n.f(adapterConfigs, "adapterConfigs");
        this.f25971a = adm;
        this.f25972b = providerName;
        this.f25973c = adapterConfigs;
        this.f25974d = z10;
    }

    @Override // com.ironsource.S5
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Cb a() throws Exception {
        InterfaceC0461m9 interfaceC0461m9A = this.f25973c.a(this.f25972b);
        new U(this.f25971a, interfaceC0461m9A, this.f25974d).a();
        if (interfaceC0461m9A != null) {
            return new Cb(interfaceC0461m9A.f(), interfaceC0461m9A.e(), interfaceC0461m9A.b(), interfaceC0461m9A.d(), false, 16, null);
        }
        return null;
    }
}
