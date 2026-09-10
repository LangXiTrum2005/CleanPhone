package be;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements com.google.gson.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.t f5692c;

    public /* synthetic */ y0(Object obj, com.google.gson.t tVar, int i10) {
        this.f5690a = i10;
        this.f5691b = obj;
        this.f5692c = tVar;
    }

    @Override // com.google.gson.u
    public final com.google.gson.t create(com.google.gson.d dVar, fe.a aVar) {
        switch (this.f5690a) {
            case 0:
                if (aVar.f40809a == ((Class) this.f5691b)) {
                    return this.f5692c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f40809a;
                if (((Class) this.f5691b).isAssignableFrom(cls)) {
                    return new c(this, cls);
                }
                return null;
            default:
                if (aVar.equals((fe.a) this.f5691b)) {
                    return this.f5692c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f5690a) {
            case 0:
                return "Factory[type=" + ((Class) this.f5691b).getName() + ",adapter=" + this.f5692c + X3.j.f27836e;
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f5691b).getName() + ",adapter=" + this.f5692c + X3.j.f27836e;
            default:
                return super.toString();
        }
    }
}
