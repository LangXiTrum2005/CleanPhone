package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczt {
    private final Context zza;
    private final zzfik zzb;
    private final Bundle zzc;
    private final zzfid zzd;
    private final zzczl zze;
    private final zzejl zzf;
    private final int zzg;

    public /* synthetic */ zzczt(zzczs zzczsVar, byte[] bArr) {
        this.zza = zzczsVar.zzi();
        this.zzb = zzczsVar.zzj();
        this.zzc = zzczsVar.zzk();
        this.zzd = zzczsVar.zzl();
        this.zze = zzczsVar.zzm();
        this.zzf = zzczsVar.zzn();
        this.zzg = zzczsVar.zzo();
    }

    public final zzczs zza() {
        zzczs zzczsVar = new zzczs();
        zzczsVar.zza(this.zza);
        zzczsVar.zzb(this.zzb);
        zzczsVar.zzc(this.zzc);
        zzczsVar.zzd(this.zze);
        zzczsVar.zzg(this.zzf);
        return zzczsVar;
    }

    public final zzfik zzb() {
        return this.zzb;
    }

    public final zzfid zzc() {
        return this.zzd;
    }

    public final Bundle zzd() {
        return this.zzc;
    }

    public final zzczl zze() {
        return this.zze;
    }

    public final Context zzf(Context context) {
        return this.zza;
    }

    public final zzejl zzg(String str) {
        zzejl zzejlVar = this.zzf;
        return zzejlVar != null ? zzejlVar : new zzejl(str);
    }

    public final int zzh() {
        return this.zzg;
    }
}
