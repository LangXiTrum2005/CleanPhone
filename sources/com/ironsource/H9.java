package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class H9 implements InterfaceC0461m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0310e1 f26237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E9 f26238b;

    public H9(C0310e1 adapterConfig, E9 adFormatConfigurations) {
        kotlin.jvm.internal.n.f(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.n.f(adFormatConfigurations, "adFormatConfigurations");
        this.f26237a = adapterConfig;
        this.f26238b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC0328f1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC0612v
    public long b() {
        return this.f26238b.e();
    }

    @Override // com.ironsource.InterfaceC0328f1
    public String c() {
        String strF = this.f26237a.f();
        kotlin.jvm.internal.n.e(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC0328f1
    public boolean d() {
        return !this.f26237a.j();
    }

    @Override // com.ironsource.InterfaceC0328f1
    public String e() {
        String strA = this.f26237a.a();
        kotlin.jvm.internal.n.e(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC0328f1
    public EnumC0515p9 f() {
        return EnumC0515p9.f30001b.a(this.f26237a.d());
    }
}
