package be;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements com.google.gson.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f5595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f5596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.t f5597c;

    public a1(Class cls, Class cls2, com.google.gson.t tVar) {
        this.f5595a = cls;
        this.f5596b = cls2;
        this.f5597c = tVar;
    }

    @Override // com.google.gson.u
    public final com.google.gson.t create(com.google.gson.d dVar, fe.a aVar) {
        Class cls = aVar.f40809a;
        if (cls == this.f5595a || cls == this.f5596b) {
            return this.f5597c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f5596b.getName() + "+" + this.f5595a.getName() + ",adapter=" + this.f5597c + X3.j.f27836e;
    }
}
