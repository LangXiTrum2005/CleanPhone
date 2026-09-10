package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0[] f24587a;

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final y0 a(Class cls) {
        for (o0 o0Var : this.f24587a) {
            if (o0Var.b(cls)) {
                return o0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final boolean b(Class cls) {
        for (o0 o0Var : this.f24587a) {
            if (o0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
