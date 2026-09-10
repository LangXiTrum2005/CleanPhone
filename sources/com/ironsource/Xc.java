package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Xc implements InterfaceC0531q7, InterfaceC0531q7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0510p4 f27917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J7 f27918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Wc> f27919c;

    public Xc(InterfaceC0510p4 currentTimeProvider, J7 repository) {
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(repository, "repository");
        this.f27917a = currentTimeProvider;
        this.f27918b = repository;
        this.f27919c = new LinkedHashMap();
    }

    public final Map<String, Wc> a() {
        return this.f27919c;
    }

    @Override // com.ironsource.InterfaceC0531q7.a
    public void b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        if (this.f27919c.get(identifier) == null) {
            return;
        }
        this.f27918b.a(this.f27917a.a(), identifier);
    }

    private final boolean a(Wc wc2, String str) {
        Long lA = this.f27918b.a(str);
        return lA != null && this.f27917a.a() - lA.longValue() < wc2.a();
    }

    @Override // com.ironsource.InterfaceC0531q7
    public G3 a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        Wc wc2 = this.f27919c.get(identifier);
        if (wc2 == null) {
            return new G3(false, null, 2, null);
        }
        if (a(wc2, identifier)) {
            return new G3(true, I3.Pacing);
        }
        return new G3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC0531q7.a
    public Object a(String identifier, I3 cappingType, InterfaceC0495o7 cappingConfig) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        kotlin.jvm.internal.n.f(cappingType, "cappingType");
        kotlin.jvm.internal.n.f(cappingConfig, "cappingConfig");
        Object objB = cappingConfig.b();
        boolean z10 = objB instanceof wj.g;
        wj.r rVar = wj.r.f53297a;
        if (z10) {
            Throwable thA = wj.h.a(objB);
            if (thA != null) {
                return t9.e.c(thA);
            }
        } else {
            Wc wc2 = (Wc) objB;
            if (wc2 != null) {
                this.f27919c.put(identifier, wc2);
                return rVar;
            }
        }
        return rVar;
    }
}
