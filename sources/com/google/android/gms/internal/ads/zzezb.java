package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzezb {
    private final zzfdw zza;
    private final zzcuz zzb;
    private final Executor zzc;
    private zzeyz zzd;

    public zzezb(zzfdw zzfdwVar, zzcuz zzcuzVar, Executor executor) {
        this.zza = zzfdwVar;
        this.zzb = zzcuzVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfeg zze() {
        zzfcj zzfcjVarZzg = this.zzb.zzg();
        return this.zza.zzc(zzfcjVarZzg.zzd, zzfcjVarZzg.zzf, zzfcjVarZzg.zzj);
    }

    public final AI zzc() {
        AI aiZzh;
        zzeyz zzeyzVar = this.zzd;
        if (zzeyzVar != null) {
            return zzgch.zzh(zzeyzVar);
        }
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            aiZzh = (zzgby) zzgch.zze((zzgby) zzgch.zzm(zzgby.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzeyy(this), this.zzc), zzdyh.class, new zzeyx(this), this.zzc);
        } else {
            zzeyz zzeyzVar2 = new zzeyz(null, zze(), null);
            this.zzd = zzeyzVar2;
            aiZzh = zzgch.zzh(zzeyzVar2);
        }
        return zzgch.zzm(aiZzh, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzeyw
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return (zzeyz) obj;
            }
        }, this.zzc);
    }
}
