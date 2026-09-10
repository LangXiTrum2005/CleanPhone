package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g01 extends l9.a {
    public static final Parcelable.Creator<g01> CREATOR = new gj(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public je f14643b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f14644c;

    public g01(int i10, byte[] bArr) {
        this.f14642a = i10;
        this.f14644c = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f14642a);
        byte[] bArrB = this.f14644c;
        if (bArrB == null) {
            bArrB = this.f14643b.b();
        }
        r9.b.D(parcel, 2, bArrB);
        r9.b.S(parcel, iR);
    }

    public final void zzb() {
        je jeVar = this.f14643b;
        if (jeVar != null || this.f14644c == null) {
            if (jeVar == null || this.f14644c != null) {
                if (jeVar != null && this.f14644c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (jeVar != null || this.f14644c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }
}
