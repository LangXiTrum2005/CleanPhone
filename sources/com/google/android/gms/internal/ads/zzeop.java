package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeop implements zzejg {
    private final Context zza;
    private final zzcuh zzb;
    private final zzbhf zzc;
    private final zzgyw zzd;
    private final zzfmu zze;

    public zzeop(Context context, zzcuh zzcuhVar, zzfmu zzfmuVar, zzgyw zzgywVar, zzbhf zzbhfVar) {
        this.zza = context;
        this.zzb = zzcuhVar;
        this.zze = zzfmuVar;
        this.zzd = zzgywVar;
        this.zzc = zzbhfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zza(zzfic zzficVar, zzfhr zzfhrVar) {
        zzfhw zzfhwVar;
        return (this.zzc == null || (zzfhwVar = zzfhrVar.zzs) == null || zzfhwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final ListenableFuture zzb(zzfic zzficVar, zzfhr zzfhrVar) {
        zzeol zzeolVar = new zzeol(this, new View(this.zza), null, zzeon.zza, (zzfhs) zzfhrVar.zzu.get(0));
        zzctd zzctdVarZzf = this.zzb.zzf(new zzcwa(zzficVar, zzfhrVar, null), zzeolVar);
        zzeoo zzeooVarZzl = zzctdVarZzf.zzl();
        zzfhw zzfhwVar = zzfhrVar.zzs;
        final zzbha zzbhaVar = new zzbha(zzeooVarZzl, zzfhwVar.zzb, zzfhwVar.zza);
        zzfmo zzfmoVar = zzfmo.CUSTOM_RENDER_SYN;
        zzfmu zzfmuVar = this.zze;
        Objects.requireNonNull(zzfmuVar);
        return zzfmf.zzd(new zzfma() { // from class: com.google.android.gms.internal.ads.zzeom
            @Override // com.google.android.gms.internal.ads.zzfma
            public final /* synthetic */ void zza() throws RemoteException {
                this.zza.zzc(zzbhaVar);
            }
        }, this.zzd, zzfmoVar, zzfmuVar).zzj(zzfmo.CUSTOM_RENDER_ACK).zze(zzgym.zza(zzctdVarZzf.zzi())).zzi();
    }

    public final /* synthetic */ void zzc(zzbha zzbhaVar) throws RemoteException {
        this.zzc.zze(zzbhaVar);
    }
}
