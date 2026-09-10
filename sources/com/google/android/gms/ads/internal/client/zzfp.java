package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Objects;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfp extends a {
    public static final Parcelable.Creator<zzfp> CREATOR = new zzfq();
    public final String zza;
    public final int zzb;
    public final zzm zzc;
    public final int zzd;
    public final boolean zze;

    public zzfp(String str, int i10, zzm zzmVar, int i11, boolean z10) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = zzmVar;
        this.zzd = i11;
        this.zze = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfp) {
            zzfp zzfpVar = (zzfp) obj;
            if (this.zza.equals(zzfpVar.zza) && this.zzb == zzfpVar.zzb && this.zzc.zza(zzfpVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iR = b.R(parcel, 20293);
        b.J(parcel, 1, str);
        int i11 = this.zzb;
        b.Q(parcel, 2, 4);
        parcel.writeInt(i11);
        b.I(parcel, 3, this.zzc, i10);
        int i12 = this.zzd;
        b.Q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.zze;
        b.Q(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        b.S(parcel, iR);
    }

    public final zzfp zza(int i10) {
        if (i10 <= 0) {
            i10 = this.zzd;
        }
        zzm zzmVar = this.zzc;
        int i11 = this.zzb;
        return new zzfp(this.zza, i11, zzmVar, i10, this.zze);
    }
}
