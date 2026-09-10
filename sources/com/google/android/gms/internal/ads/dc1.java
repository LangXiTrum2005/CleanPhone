package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dc1 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dc1 f13493c = new dc1(new int[0], 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f13494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13495b;

    public dc1(int[] iArr, int i10) {
        this.f13494a = iArr;
        this.f13495b = i10;
    }

    public final int a(int i10) {
        ps1.f0(i10, this.f13495b);
        return this.f13494a[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dc1)) {
            return false;
        }
        dc1 dc1Var = (dc1) obj;
        int i10 = dc1Var.f13495b;
        int i11 = this.f13495b;
        if (i11 != i10) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (a(i12) != dc1Var.a(i12)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = 0; i10 < this.f13495b; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f13494a[i10]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.f13495b;
        if (i10 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.f13494a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
