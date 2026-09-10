package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f4195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f4196c;

    public w0(l1 l1Var, t tVar, a aVar) {
        this.f4195b = l1Var;
        tVar.getClass();
        this.f4196c = tVar;
        this.f4194a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void a(Object obj, Object obj2) {
        e1.k(this.f4195b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void b(Object obj) {
        this.f4195b.getClass();
        k1 k1Var = ((b0) obj).unknownFields;
        if (k1Var.f4121e) {
            k1Var.f4121e = false;
        }
        this.f4196c.getClass();
        defpackage.e.z(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean c(Object obj) {
        this.f4196c.getClass();
        defpackage.e.z(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final b0 d() {
        a aVar = this.f4194a;
        return aVar instanceof b0 ? ((b0) aVar).i() : ((z) ((b0) aVar).c(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void e(Object obj, n0 n0Var) {
        this.f4196c.getClass();
        defpackage.e.z(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void f(Object obj, n nVar, s sVar) {
        this.f4195b.getClass();
        l1.a(obj);
        this.f4196c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final int g(b0 b0Var) {
        this.f4195b.getClass();
        k1 k1Var = b0Var.unknownFields;
        int i10 = k1Var.f4120d;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < k1Var.f4117a; i11++) {
            int i12 = k1Var.f4118b[i11] >>> 3;
            iR += p.R(3, (j) k1Var.f4119c[i11]) + p.U(i12) + p.T(2) + (p.T(1) * 2);
        }
        k1Var.f4120d = iR;
        return iR;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final int h(b0 b0Var) {
        this.f4195b.getClass();
        return b0Var.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean i(b0 b0Var, b0 b0Var2) {
        this.f4195b.getClass();
        return b0Var.unknownFields.equals(b0Var2.unknownFields);
    }
}
