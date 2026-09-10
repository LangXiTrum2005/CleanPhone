package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.pi1;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzba extends a {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();
    public final String zza;
    public final int zzb;

    public zzba(String str, int i10) {
        this.zza = str == null ? "" : str;
        this.zzb = i10;
    }

    public static zzba zza(Throwable th2) {
        com.google.android.gms.ads.internal.client.zze zzeVarC = pi1.c(th2);
        return new zzba(pi1.l(th2.getMessage()) ? zzeVarC.zzb : th2.getMessage(), zzeVarC.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iR = b.R(parcel, 20293);
        b.J(parcel, 1, str);
        int i11 = this.zzb;
        b.Q(parcel, 2, 4);
        parcel.writeInt(i11);
        b.S(parcel, iR);
    }

    public final zzaz zzb() {
        return new zzaz(this.zza, this.zzb);
    }
}
