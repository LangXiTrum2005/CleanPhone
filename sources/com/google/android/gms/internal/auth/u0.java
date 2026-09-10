package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends v0 {
    @Override // com.google.android.gms.internal.auth.v0
    public final void a(long j10, Object obj) {
        d0 d0Var = (d0) ((n0) x1.d(j10, obj));
        if (d0Var.f22802a) {
            d0Var.f22802a = false;
        }
    }

    @Override // com.google.android.gms.internal.auth.v0
    public final void b(Object obj, long j10, Object obj2) {
        n0 n0VarF = (n0) x1.d(j10, obj);
        n0 n0Var = (n0) x1.d(j10, obj2);
        int size = n0VarF.size();
        int size2 = n0Var.size();
        if (size > 0 && size2 > 0) {
            if (!((d0) n0VarF).f22802a) {
                n0VarF = n0VarF.f(size2 + size);
            }
            n0VarF.addAll(n0Var);
        }
        if (size > 0) {
            n0Var = n0VarF;
        }
        x1.j(obj, j10, n0Var);
    }
}
