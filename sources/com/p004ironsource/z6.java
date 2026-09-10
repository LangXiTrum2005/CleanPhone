package com.p004ironsource;

import com.smartdigimkt.h5.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/z6;", "Lcom/ironsource/cj;", "", "b", "Lcom/ironsource/ej;", "c", "", "a", f.j, "d", "", "e", "Lcom/ironsource/a3;", "Lcom/ironsource/a3;", "adapterConfig", "Lcom/ironsource/u6;", "Lcom/ironsource/u6;", "adFormatConfigurations", "<init>", "(Lcom/ironsource/a3;Lcom/ironsource/u6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class z6 implements cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 adapterConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u6 adFormatConfigurations;

    public z6(a3 adapterConfig, u6 adFormatConfigurations) {
        Intrinsics.f(adapterConfig, "adapterConfig");
        Intrinsics.f(adFormatConfigurations, "adFormatConfigurations");
        this.adapterConfig = adapterConfig;
        this.adFormatConfigurations = adFormatConfigurations;
    }

    @Override // com.p004ironsource.b3
    public boolean a() {
        return !this.adapterConfig.j();
    }

    @Override // com.p004ironsource.b3
    public String b() {
        String strA = this.adapterConfig.a();
        Intrinsics.e(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.p004ironsource.b3
    public ej c() {
        return ej.INSTANCE.a(this.adapterConfig.d());
    }

    @Override // com.p004ironsource.b3
    public boolean d() {
        return true;
    }

    @Override // com.p004ironsource.InterfaceC3383t
    public long e() {
        return this.adFormatConfigurations.b();
    }

    @Override // com.p004ironsource.b3
    public String f() {
        String strF = this.adapterConfig.f();
        Intrinsics.e(strF, "adapterConfig.providerName");
        return strF;
    }
}
