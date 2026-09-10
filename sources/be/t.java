package be;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends com.google.gson.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f5674b = new s(new t(com.google.gson.r.f24757b), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.gson.r f5675a;

    public t(com.google.gson.r rVar) {
        this.f5675a = rVar;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        int iH = aVar.H();
        int iC = v0.i.c(iH);
        if (iC == 5 || iC == 6) {
            return this.f5675a.a(aVar);
        }
        if (iC == 8) {
            aVar.D();
            return null;
        }
        throw new com.google.gson.m("Expecting number, got: " + d5.u.z(iH) + "; at path " + aVar.r());
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        bVar.A((Number) obj);
    }
}
