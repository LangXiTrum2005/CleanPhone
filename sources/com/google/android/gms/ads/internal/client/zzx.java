package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzx extends a {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();
    public final int zza;

    public zzx(int i10) {
        this.zza = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 2, 4);
        parcel.writeInt(i11);
        b.S(parcel, iR);
    }
}
