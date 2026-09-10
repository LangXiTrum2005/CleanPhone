package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
final class zzcbs extends zzcbx {
    final zzijp zza;
    final zzijp zzb;
    final zzijp zzc;
    final zzijp zzd;
    final zzijp zze;
    final zzijp zzf;
    final zzijp zzg;
    final zzijp zzh;
    private final Clock zzj;

    public zzcbs(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcbw zzcbwVar) {
        this.zzj = clock;
        zzijg zzijgVarZza = zzijh.zza(context);
        this.zza = zzijgVarZza;
        zzijg zzijgVarZza2 = zzijh.zza(zzgVar);
        this.zzb = zzijgVarZza2;
        this.zzc = zzijf.zza(zzcbm.zza(zzijgVarZza, zzijgVarZza2));
        zzijg zzijgVarZza3 = zzijh.zza(clock);
        this.zzd = zzijgVarZza3;
        zzijg zzijgVarZza4 = zzijh.zza(zzcbwVar);
        this.zze = zzijgVarZza4;
        zzijp zzijpVarZza = zzijf.zza(zzcbo.zza(zzijgVarZza3, zzijgVarZza2, zzijgVarZza4));
        this.zzf = zzijpVarZza;
        zzcbq zzcbqVarZzc = zzcbq.zzc(zzijgVarZza3, zzijpVarZza);
        this.zzg = zzcbqVarZzc;
        this.zzh = zzijf.zza(zzccd.zza(zzijgVarZza, zzcbqVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final zzcbp zza() {
        return new zzcbp(this.zzj, (zzcbn) this.zzf.zzb());
    }
}
