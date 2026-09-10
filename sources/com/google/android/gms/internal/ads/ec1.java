package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ec1 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ec1 f13930c = new ec1(new long[0], 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f13931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13932b;

    public ec1(long[] jArr, int i10) {
        this.f13931a = jArr;
        this.f13932b = i10;
    }

    public final long a(int i10) {
        ps1.f0(i10, this.f13932b);
        return this.f13931a[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ec1)) {
            return false;
        }
        ec1 ec1Var = (ec1) obj;
        int i10 = ec1Var.f13932b;
        int i11 = this.f13932b;
        if (i11 != i10) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (a(i12) != ec1Var.a(i12)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = 0; i10 < this.f13932b; i10++) {
            iHashCode = (iHashCode * 31) + Long.hashCode(this.f13931a[i10]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.f13932b;
        if (i10 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        long[] jArr = this.f13931a;
        sb2.append(jArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(jArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
