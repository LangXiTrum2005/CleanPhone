package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f23476a = b0.f23308c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23477b;

    public g(String str) {
        this.f23477b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f23476a.equals(gVar.f23476a) && this.f23477b.equals(gVar.f23477b);
    }

    public final int hashCode() {
        return this.f23477b.hashCode() ^ this.f23476a.hashCode();
    }
}
