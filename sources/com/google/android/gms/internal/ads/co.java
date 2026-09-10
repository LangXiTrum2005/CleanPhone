package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ni f13216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f13218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f13219e;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public co(ni niVar, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = niVar.f17829a;
        this.f13215a = i10;
        ps1.v(i10 == iArr.length && i10 == zArr.length);
        this.f13216b = niVar;
        this.f13217c = z10 && i10 > 1;
        this.f13218d = (int[]) iArr.clone();
        this.f13219e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && co.class == obj.getClass()) {
            co coVar = (co) obj;
            if (this.f13217c == coVar.f13217c && this.f13216b.equals(coVar.f13216b) && Arrays.equals(this.f13218d, coVar.f13218d) && Arrays.equals(this.f13219e, coVar.f13219e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13219e) + ((Arrays.hashCode(this.f13218d) + (((this.f13216b.hashCode() * 31) + (this.f13217c ? 1 : 0)) * 31)) * 31);
    }
}
