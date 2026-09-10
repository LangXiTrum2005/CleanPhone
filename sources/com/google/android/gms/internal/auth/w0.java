package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1[] f22912a;

    public w0(b1... b1VarArr) {
        this.f22912a = b1VarArr;
    }

    @Override // com.google.android.gms.internal.auth.b1
    public final k1 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            b1 b1Var = this.f22912a[i10];
            if (b1Var.b(cls)) {
                return b1Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.b1
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f22912a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
