package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeeb implements zzedc {
    private final Context zza;
    private final zzcpq zzb;
    private final Executor zzc;

    public zzeeb(Context context, zzcpq zzcpqVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcpqVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfcaVar, final zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq, zzegu {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() && zzfboVar.zzag) {
            zzbpn zzbpnVarZzc = ((zzfdh) zzeczVar.zzb).zzc();
            if (zzbpnVarZzc == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcq(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbpnVarZzc.zze());
                boolean zZzf = zzbpnVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfcq(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgch.zzn(zzgch.zzh(null), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzedz
                            @Override // com.google.android.gms.internal.ads.zzgbo
                            public final AI zza(Object obj) {
                                return this.zza.zzc(viewZza, zzfboVar, obj);
                            }
                        }, zzbzw.zzf).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfcq(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfcq(e2);
            }
        } else {
            viewZza = ((zzfdh) zzeczVar.zzb).zza();
        }
        zzcpq zzcpqVar = this.zzb;
        zzcrp zzcrpVar = new zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza);
        final zzfdh zzfdhVar = (zzfdh) zzeczVar.zzb;
        Objects.requireNonNull(zzfdhVar);
        zzcon zzconVarZza = zzcpqVar.zza(zzcrpVar, new zzcot(viewZza, null, new zzcqx() { // from class: com.google.android.gms.internal.ads.zzeea
            @Override // com.google.android.gms.internal.ads.zzcqx
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                return zzfdhVar.zzb();
            }
        }, (zzfbp) zzfboVar.zzu.get(0)));
        zzconVarZza.zzg().zza(viewZza);
        zzconVarZza.zzd().zzo(new zzcma((zzfdh) zzeczVar.zzb), this.zzc);
        ((zzees) zzeczVar.zzc).zzc(zzconVarZza.zzk());
        return zzconVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        com.google.android.gms.ads.internal.client.zzs zzsVar2 = zzfcaVar.zza.zza.zze;
        if (zzsVar2.zzn) {
            zzsVar = new com.google.android.gms.ads.internal.client.zzs(this.zza, com.google.android.gms.ads.zzc.zzd(zzsVar2.zze, zzsVar2.zzb));
        } else {
            zzsVar = (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() && zzfboVar.zzag) ? new com.google.android.gms.ads.internal.client.zzs(this.zza, com.google.android.gms.ads.zzc.zze(zzsVar2.zze, zzsVar2.zzb)) : zzfcp.zza(this.zza, zzfboVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzs zzsVar3 = zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() && zzfboVar.zzag) {
            Object obj = zzeczVar.zzb;
            ((zzfdh) obj).zzn(this.zza, zzsVar3, zzfcaVar.zza.zza.zzd, zzfboVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzfboVar.zzs), (zzbpk) zzeczVar.zzc);
            return;
        }
        Object obj2 = zzeczVar.zzb;
        ((zzfdh) obj2).zzm(this.zza, zzsVar3, zzfcaVar.zza.zza.zzd, zzfboVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzfboVar.zzs), (zzbpk) zzeczVar.zzc);
    }

    public final /* synthetic */ AI zzc(View view, zzfbo zzfboVar, Object obj) throws Exception {
        return zzgch.zzh(zzcql.zza(this.zza, view, zzfboVar));
    }
}
