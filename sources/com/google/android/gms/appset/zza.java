package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zza extends a {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public zza(@Nullable String str, @Nullable String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.J(parcel, 1, this.zza);
        b.J(parcel, 2, this.zzb);
        b.S(parcel, iR);
    }
}
