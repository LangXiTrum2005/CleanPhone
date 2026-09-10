package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f18290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zq1 f18291b;

    public /* synthetic */ oj1(Class cls, zq1 zq1Var) {
        this.f18290a = cls;
        this.f18291b = zq1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oj1)) {
            return false;
        }
        oj1 oj1Var = (oj1) obj;
        return oj1Var.f18290a.equals(this.f18290a) && oj1Var.f18291b.equals(this.f18291b);
    }

    public final int hashCode() {
        return Objects.hash(this.f18290a, this.f18291b);
    }

    public final String toString() {
        String simpleName = this.f18290a.getSimpleName();
        String strValueOf = String.valueOf(this.f18291b);
        return q4.a.j(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
