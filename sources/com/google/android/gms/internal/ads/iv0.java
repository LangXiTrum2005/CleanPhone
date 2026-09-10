package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class iv0 implements gv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15861a;

    public iv0(String str) {
        this.f15861a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iv0) {
            return this.f15861a.equals(((iv0) obj).f15861a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15861a.hashCode();
    }

    public final String toString() {
        return this.f15861a;
    }
}
