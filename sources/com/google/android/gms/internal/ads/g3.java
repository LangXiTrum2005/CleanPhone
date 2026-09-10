package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14693d;

    public g3(int i10, byte[] bArr, int i11, int i12) {
        this.f14690a = i10;
        this.f14691b = bArr;
        this.f14692c = i11;
        this.f14693d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g3.class == obj.getClass()) {
            g3 g3Var = (g3) obj;
            if (this.f14690a == g3Var.f14690a && this.f14692c == g3Var.f14692c && this.f14693d == g3Var.f14693d && Arrays.equals(this.f14691b, g3Var.f14691b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f14691b) + (this.f14690a * 31)) * 31) + this.f14692c) * 31) + this.f14693d;
    }
}
