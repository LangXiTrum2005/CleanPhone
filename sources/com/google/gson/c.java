package com.google.gson;

import be.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f24741a = null;

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) {
        t tVar = this.f24741a;
        if (tVar != null) {
            return tVar.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) {
        t tVar = this.f24741a;
        if (tVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        tVar.c(bVar, obj);
    }

    @Override // be.c0
    public final t d() {
        t tVar = this.f24741a;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
