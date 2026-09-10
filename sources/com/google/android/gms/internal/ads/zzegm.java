package com.google.android.gms.internal.ads;

import android.os.Bundle;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegm extends zzegf {
    private final zzcgx zza;
    private final zzcva zzb;
    private final zzdbm zzc;
    private final zzegq zzd;

    @Nullable
    private final zzfcb zze;
    private final zzedb zzf;

    public zzegm(zzcgx zzcgxVar, zzcva zzcvaVar, zzdbm zzdbmVar, @Nullable zzfcb zzfcbVar, zzegq zzegqVar, zzedb zzedbVar) {
        this.zza = zzcgxVar;
        this.zzb = zzcvaVar;
        this.zzc = zzdbmVar;
        this.zze = zzfcbVar;
        this.zzd = zzegqVar;
        this.zzf = zzedbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegf
    public final AI zzc(zzfcj zzfcjVar, Bundle bundle, zzfbo zzfboVar, zzfca zzfcaVar) {
        zzfcb zzfcbVar;
        zzcva zzcvaVar = this.zzb;
        zzcvaVar.zzk(zzfcjVar);
        zzcvaVar.zzg(bundle);
        zzcvaVar.zzh(new zzcut(zzfcaVar, zzfboVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdG)).booleanValue() && (zzfcbVar = this.zze) != null) {
            this.zzb.zzj(zzfcbVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        zzcgx zzcgxVar = this.zza;
        zzcva zzcvaVar2 = this.zzb;
        zzdoe zzdoeVarZzi = zzcgxVar.zzi();
        zzdoeVarZzi.zzd(zzcvaVar2.zzl());
        zzdoeVarZzi.zzc(this.zzc);
        zzcsd zzcsdVarZzb = zzdoeVarZzi.zze().zzb();
        return zzcsdVarZzb.zzh(zzcsdVarZzb.zzi());
    }
}
