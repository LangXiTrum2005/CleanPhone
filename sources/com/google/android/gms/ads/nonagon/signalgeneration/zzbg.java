package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcuw;
import com.google.android.gms.internal.ads.zzcux;
import com.google.android.gms.internal.ads.zzcvk;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzdre;
import com.google.android.gms.internal.ads.zzfgh;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhez;
import com.google.android.gms.internal.ads.zzhfj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbg implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;

    public zzbg(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6, zzhfj zzhfjVar7, zzhfj zzhfjVar8, zzhfj zzhfjVar9) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
        this.zze = zzhfjVar5;
        this.zzf = zzhfjVar6;
        this.zzg = zzhfjVar7;
        this.zzh = zzhfjVar8;
        this.zzi = zzhfjVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        AI aiZza;
        zzau zzauVar = (zzau) this.zza.zzb();
        zzfgn zzfgnVar = (zzfgn) this.zzb.zzb();
        zzbi zzbiVarZzb = ((zzbj) this.zzc).zzb();
        zzcuw zzcuwVarZzb = ((zzcux) this.zzd).zzb();
        zzdeh zzdehVar = (zzdeh) this.zze.zzb();
        zzb zzbVar = (zzb) this.zzf.zzb();
        zzbyy zzbyyVar = (zzbyy) this.zzg.zzb();
        int iIntValue = ((Integer) this.zzh.zzb()).intValue();
        Bundle bundle = ((zzcvk) this.zzi).zza().zzs;
        zzbk zzbkVarZza = null;
        if (iIntValue == 1 && zzbyyVar != null) {
            AbstractC3888ke0.o(bundle, zzdre.READ_FROM_DISK_START.zza());
            zzbkVarZza = zzbVar.zza(zzbyyVar, zzauVar, bundle);
            AbstractC3888ke0.o(bundle, zzdre.READ_FROM_DISK_END.zza());
        }
        if (zzbkVarZza != null) {
            zzdehVar.zza(zzbkVarZza);
            aiZza = zzgch.zzh(zzbkVarZza);
        } else {
            aiZza = zzfgnVar.zzb(zzfgh.GENERATE_SIGNALS, zzcuwVarZzb.zzc()).zzf(zzbiVarZzb).zzi(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfy)).intValue(), TimeUnit.SECONDS).zza();
            zzgch.zzr(aiZza, new zzaw(zzdehVar), zzbzw.zza);
        }
        zzhez.zzb(aiZza);
        return aiZza;
    }
}
