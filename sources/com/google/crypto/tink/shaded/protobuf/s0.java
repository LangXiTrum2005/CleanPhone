package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.ur1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f24637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f24638c;

    public s0(d1 d1Var, q qVar, a aVar) {
        this.f24637b = d1Var;
        qVar.getClass();
        this.f24638c = qVar;
        this.f24636a = aVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final void a(Object obj, Object obj2) {
        a1.k(this.f24637b, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final void b(Object obj) {
        this.f24637b.getClass();
        c1 c1Var = ((x) obj).unknownFields;
        if (c1Var.f24548e) {
            c1Var.f24548e = false;
        }
        this.f24638c.getClass();
        defpackage.e.z(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final boolean c(Object obj) {
        this.f24638c.getClass();
        defpackage.e.z(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final Object d() {
        a aVar = this.f24636a;
        return aVar instanceof x ? ((x) aVar).r() : aVar.c().b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final int e(x xVar) {
        this.f24637b.getClass();
        c1 c1Var = xVar.unknownFields;
        int i10 = c1Var.f24547d;
        if (i10 != -1) {
            return i10;
        }
        int iA0 = 0;
        for (int i11 = 0; i11 < c1Var.f24544a; i11++) {
            int i12 = c1Var.f24545b[i11] >>> 3;
            iA0 += l.a0(3, (i) c1Var.f24546c[i11]) + l.f0(i12) + l.e0(2) + (l.e0(1) * 2);
        }
        c1Var.f24547d = iA0;
        return iA0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final void f(Object obj, k0 k0Var) {
        this.f24638c.getClass();
        defpackage.e.z(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final boolean g(x xVar, x xVar2) {
        this.f24637b.getClass();
        return xVar.unknownFields.equals(xVar2.unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final int h(x xVar) {
        this.f24637b.getClass();
        return xVar.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final void i(Object obj, byte[] bArr, int i10, int i11, ur1 ur1Var) {
        x xVar = (x) obj;
        if (xVar.unknownFields == c1.f24543f) {
            xVar.unknownFields = c1.c();
        }
        throw q4.a.h(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final void j(Object obj, androidx.datastore.preferences.protobuf.n nVar, p pVar) {
        this.f24637b.getClass();
        d1.a(obj);
        this.f24638c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
