package com.adjust.sdk.sig;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f7032a = new m2(x2.f7029b);

    @Override // com.adjust.sdk.sig.r1
    public final l2 a() {
        return this.f7032a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z1.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return x2.f7028a.hashCode();
    }

    @Override // com.adjust.sdk.sig.r1
    public final void a(v2 v2Var, Object obj) {
        if (obj != null) {
            v2Var.a(x2.f7028a, obj);
            return;
        }
        o1 o1Var = v2Var.f7015a.f7024a;
        o1Var.a(o1Var.f6994b, 4);
        "null".getChars(0, 4, o1Var.f6993a, o1Var.f6994b);
        o1Var.f6994b += 4;
    }
}
