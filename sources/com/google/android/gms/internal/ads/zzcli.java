package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcli {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzcli(zzclh zzclhVar, byte[] bArr) {
        this.zza = zzclhVar.zzd();
        this.zzb = zzclhVar.zze();
        this.zzd = zzclhVar.zzg();
        this.zzc = zzclhVar.zzf();
    }

    public static int zzj() {
        return ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzQ)).intValue();
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final WeakReference zzc() {
        return this.zzd;
    }

    public final VersionInfoParcel zzd() {
        return this.zza;
    }

    public final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzc().zze(this.zzb, this.zza.afmaVersion);
    }

    public final zzclf zzf() {
        return new zzclf(this.zzb, this.zza);
    }

    public final com.google.android.gms.ads.internal.zzk zzg() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    public final zzbje zzh() {
        return new zzbje(this.zzb);
    }

    public final long zzi() {
        return this.zzc;
    }
}
