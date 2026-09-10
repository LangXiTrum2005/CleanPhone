package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fv extends l9.a {
    public static final Parcelable.Creator<fv> CREATOR = new gj(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14566c;

    public fv(int i10, int i11, int i12) {
        this.f14564a = i10;
        this.f14565b = i11;
        this.f14566c = i12;
    }

    public static fv b(VersionInfo versionInfo) {
        return new fv(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fv)) {
            fv fvVar = (fv) obj;
            if (fvVar.f14566c == this.f14566c && fvVar.f14565b == this.f14565b && fvVar.f14564a == this.f14564a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f14564a, this.f14565b, this.f14566c});
    }

    public final String toString() {
        int i10 = this.f14564a;
        int length = String.valueOf(i10).length();
        int i11 = this.f14565b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f14566c;
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length, 1, length2, 1, String.valueOf(i12).length()));
        l1.d.o(sb2, i10, ".", i11, ".");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f14564a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f14565b);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f14566c);
        r9.b.S(parcel, iR);
    }
}
