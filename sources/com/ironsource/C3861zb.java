package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3861zb implements P5<C3844yb> {
    private final String a;
    private final InterfaceC3727rd b;
    private final InterfaceC3521g1 c;
    private final boolean d;

    public C3861zb(String adm, InterfaceC3727rd providerName, InterfaceC3521g1 adapterConfigs, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.a = adm;
        this.b = providerName;
        this.c = adapterConfigs;
        this.d = z;
    }

    @Override // com.ironsource.P5
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3844yb a() throws Exception {
        InterfaceC3600k9 interfaceC3600k9A = this.c.a(this.b);
        new U(this.a, interfaceC3600k9A, this.d).a();
        if (interfaceC3600k9A != null) {
            return new C3844yb(interfaceC3600k9A.f(), interfaceC3600k9A.e(), interfaceC3600k9A.b(), interfaceC3600k9A.d(), false, 16, null);
        }
        return null;
    }
}
