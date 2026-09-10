package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t2 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a3[] f24951a;

    @Override // com.google.protobuf.a3
    public final z2 a(Class cls) {
        for (a3 a3Var : this.f24951a) {
            if (a3Var.b(cls)) {
                return a3Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.a3
    public final boolean b(Class cls) {
        for (a3 a3Var : this.f24951a) {
            if (a3Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
