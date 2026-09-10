package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k81 extends g81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16375a;

    public k81(Object obj) {
        this.f16375a = obj;
    }

    @Override // com.google.android.gms.internal.ads.g81
    public final Object d() {
        return this.f16375a;
    }

    @Override // com.google.android.gms.internal.ads.g81
    public final g81 e(d81 d81Var) {
        Object objApply = d81Var.apply(this.f16375a);
        ps1.e0(objApply, "the Function passed to Optional.transform() must not return null.");
        return new k81(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k81) {
            return this.f16375a.equals(((k81) obj).f16375a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16375a.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f16375a.toString();
        return q4.a.j(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }
}
