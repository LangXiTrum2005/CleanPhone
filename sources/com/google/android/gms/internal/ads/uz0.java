package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uz0 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20967a;

    public uz0(int i10) {
        this.f20967a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz0) && this.f20967a == ((uz0) obj).f20967a;
    }

    public final int hashCode() {
        return this.f20967a;
    }

    public final String toString() {
        int i10 = this.f20967a;
        return l1.d.k(new StringBuilder(String.valueOf(i10).length() + 19), "Mp4AlternateGroup: ", i10);
    }
}
