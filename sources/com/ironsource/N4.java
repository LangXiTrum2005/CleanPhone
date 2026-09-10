package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class N4 implements InterfaceC0531q7, InterfaceC0531q7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, K4> f26642a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC0531q7
    public G3 a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        K4 k8 = this.f26642a.get(identifier);
        return (k8 == null || k8.a()) ? new G3(false, null, 2, null) : new G3(true, I3.Delivery);
    }

    @Override // com.ironsource.InterfaceC0531q7.a
    public void b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC0531q7.a
    public Object a(String identifier, I3 cappingType, InterfaceC0495o7 cappingConfig) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        kotlin.jvm.internal.n.f(cappingType, "cappingType");
        kotlin.jvm.internal.n.f(cappingConfig, "cappingConfig");
        Object objA = cappingConfig.a();
        boolean z10 = objA instanceof wj.g;
        wj.r rVar = wj.r.f53297a;
        if (z10) {
            Throwable thA = wj.h.a(objA);
            if (thA != null) {
                return t9.e.c(thA);
            }
        } else {
            K4 k8 = (K4) objA;
            if (k8 != null) {
                this.f26642a.put(identifier, k8);
                return rVar;
            }
        }
        return rVar;
    }
}
