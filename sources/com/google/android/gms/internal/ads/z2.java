package com.google.android.gms.internal.ads;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3 f22469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3 f22470b;

    public z2(b3 b3Var, b3 b3Var2) {
        this.f22469a = b3Var;
        this.f22470b = b3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z2.class == obj.getClass()) {
            z2 z2Var = (z2) obj;
            if (this.f22469a.equals(z2Var.f22469a) && this.f22470b.equals(z2Var.f22470b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22470b.hashCode() + (this.f22469a.hashCode() * 31);
    }

    public final String toString() {
        b3 b3Var = this.f22469a;
        String string = b3Var.toString();
        b3 b3Var2 = this.f22470b;
        String strConcat = b3Var.equals(b3Var2) ? "" : ", ".concat(b3Var2.toString());
        return d5.u.h(new StringBuilder(com.applovin.impl.ca.i(string.length() + 1, 1, strConcat)), X3.j.f27834d, string, strConcat, X3.j.f27836e);
    }
}
