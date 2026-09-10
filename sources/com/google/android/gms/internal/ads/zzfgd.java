package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfgd {
    final /* synthetic */ zzfgf zza;
    private final Object zzb;

    @Nullable
    private final String zzc;
    private final AI zzd;
    private final List zze;
    private final AI zzf;

    private zzfgd(zzfgf zzfgfVar, Object obj, String str, AI ai, List list, AI ai2) {
        this.zza = zzfgfVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = ai;
        this.zze = list;
        this.zzf = ai2;
    }

    public final zzfft zza() {
        Object obj = this.zzb;
        String strZzf = this.zzc;
        if (strZzf == null) {
            strZzf = this.zza.zzf(obj);
        }
        final zzfft zzfftVar = new zzfft(obj, strZzf, this.zzf);
        this.zza.zzd.zza(zzfftVar);
        AI ai = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzd.zzc(zzfftVar);
            }
        };
        zzgcs zzgcsVar = zzbzw.zzg;
        ai.addListener(runnable, zzgcsVar);
        zzgch.zzr(zzfftVar, new zzfgc(this, zzfftVar), zzgcsVar);
        return zzfftVar;
    }

    public final zzfgd zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfgd zzc(Class cls, zzgbo zzgboVar) {
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzf(this.zzf, cls, zzgboVar, this.zza.zzb));
    }

    public final zzfgd zzd(final AI ai) {
        return zzg(new zzgbo() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return ai;
            }
        }, zzbzw.zzg);
    }

    public final zzfgd zze(final zzffr zzffrVar) {
        return zzf(new zzgbo() { // from class: com.google.android.gms.internal.ads.zzffz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return zzgch.zzh(zzffrVar.zza(obj));
            }
        });
    }

    public final zzfgd zzf(zzgbo zzgboVar) {
        return zzg(zzgboVar, this.zza.zzb);
    }

    public final zzfgd zzg(zzgbo zzgboVar, Executor executor) {
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzn(this.zzf, zzgboVar, executor));
    }

    public final zzfgd zzh(String str) {
        return new zzfgd(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfgd zzi(long j, TimeUnit timeUnit) {
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzo(this.zzf, j, timeUnit, this.zza.zzc));
    }
}
