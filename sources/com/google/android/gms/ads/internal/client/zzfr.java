package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfr extends a {
    public static final Parcelable.Creator<zzfr> CREATOR = new zzfs();
    public final int zza;
    public final int zzb;

    public zzfr(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = this.zzb;
        b.Q(parcel, 2, 4);
        parcel.writeInt(i12);
        b.S(parcel, iR);
    }

    public zzfr(RequestConfiguration requestConfiguration) {
        this.zza = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzb = requestConfiguration.getTagForUnderAgeOfConsent();
    }
}
