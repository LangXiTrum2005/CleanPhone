package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import l9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc extends a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzaa zzi;
    public final boolean zzj;
    public final Bundle zzk;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z10, Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzaa) b.y1(b.x1(iBinder));
        this.zzj = z10;
        this.zzk = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 2, str);
        r9.b.J(parcel, 3, this.zzb);
        r9.b.J(parcel, 4, this.zzc);
        r9.b.J(parcel, 5, this.zzd);
        r9.b.J(parcel, 6, this.zze);
        r9.b.J(parcel, 7, this.zzf);
        r9.b.J(parcel, 8, this.zzg);
        r9.b.I(parcel, 9, this.zzh, i10);
        r9.b.F(parcel, 10, new b(this.zzi));
        boolean z10 = this.zzj;
        r9.b.Q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r9.b.C(parcel, 12, this.zzk);
        r9.b.S(parcel, iR);
    }

    public zzc(Intent intent, zzaa zzaaVar) {
        this(null, null, null, null, null, null, null, intent, new b(zzaaVar), false, new Bundle());
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzaa zzaaVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new b(zzaaVar), false, new Bundle());
    }
}
