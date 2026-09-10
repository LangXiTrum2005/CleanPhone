package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l01 extends l9.a {
    public static final Parcelable.Creator<l01> CREATOR = new gj(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16618c;

    public l01(byte[] bArr, int i10, int i11) {
        this.f16616a = i10;
        this.f16617b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f16618c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f16616a);
        r9.b.D(parcel, 2, this.f16617b);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f16618c);
        r9.b.S(parcel, iR);
    }

    public l01() {
        this(null, 1, 1);
    }
}
