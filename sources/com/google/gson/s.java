package com.google.gson;

import com.ironsource.X3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f24759a;

    public s(t tVar) {
        this.f24759a = tVar;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) {
        if (aVar.H() != 9) {
            return this.f24759a.b(aVar);
        }
        aVar.D();
        return null;
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.s();
        } else {
            this.f24759a.c(bVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f24759a + X3.j.f27836e;
    }
}
