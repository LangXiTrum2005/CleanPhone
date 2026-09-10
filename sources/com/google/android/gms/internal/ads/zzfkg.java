package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfkg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfkg> CREATOR = new zzfkh();

    @Nullable
    public final Context zza;
    public final zzfkd zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfkd[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfkg(int i2, int i3, int i4, int i5, String str, int i6, int i7) {
        zzfkd[] zzfkdVarArrValues = zzfkd.values();
        this.zzh = zzfkdVarArrValues;
        int[] iArrZza = zzfke.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfkf.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i2;
        this.zzb = zzfkdVarArrValues[i2];
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = str;
        this.zzj = i6;
        this.zzg = iArrZza[i6];
        this.zzk = i7;
        int i8 = iArrZza2[i7];
    }

    @Nullable
    public static zzfkg zza(zzfkd zzfkdVar, Context context) {
        if (zzfkdVar == zzfkd.Rewarded) {
            return new zzfkg(context, zzfkdVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhh)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhn)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhp)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhr), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhj), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhl));
        }
        if (zzfkdVar == zzfkd.Interstitial) {
            return new zzfkg(context, zzfkdVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhi)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzho)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhq)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhs), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhk), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhm));
        }
        if (zzfkdVar != zzfkd.AppOpen) {
            return null;
        }
        return new zzfkg(context, zzfkdVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhv)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhx)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhy)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzht), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhu), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhw));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfkg(@Nullable Context context, zzfkd zzfkdVar, int i2, int i3, int i4, String str, String str2, String str3) {
        this.zzh = zzfkd.values();
        this.zzl = zzfke.zza();
        this.zzm = zzfkf.zza();
        this.zza = context;
        this.zzi = zzfkdVar.ordinal();
        this.zzb = zzfkdVar;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        int i5 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i5;
        this.zzj = i5 - 1;
        this.zzk = 0;
    }
}
