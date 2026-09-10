package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeou implements zzejg {
    private final zzbhf zza;
    private final zzgyw zzb;
    private final zzfmu zzc;
    private final zzepd zzd;

    public zzeou(zzfmu zzfmuVar, zzgyw zzgywVar, zzbhf zzbhfVar, zzepd zzepdVar) {
        this.zzc = zzfmuVar;
        this.zzb = zzgywVar;
        this.zza = zzbhfVar;
        this.zzd = zzepdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zza(zzfic zzficVar, zzfhr zzfhrVar) {
        zzfhw zzfhwVar;
        return (this.zza == null || (zzfhwVar = zzfhrVar.zzs) == null || zzfhwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final ListenableFuture zzb(zzfic zzficVar, zzfhr zzfhrVar) {
        zzcdt zzcdtVar = new zzcdt();
        zzeoz zzeozVar = new zzeoz();
        zzeozVar.zzd(new zzeos(this, zzcdtVar, zzficVar, zzfhrVar, zzeozVar));
        zzfhw zzfhwVar = zzfhrVar.zzs;
        final zzbha zzbhaVar = new zzbha(zzeozVar, zzfhwVar.zzb, zzfhwVar.zza);
        zzfmo zzfmoVar = zzfmo.CUSTOM_RENDER_SYN;
        zzfmu zzfmuVar = this.zzc;
        Objects.requireNonNull(zzfmuVar);
        return zzfmf.zzd(new zzfma() { // from class: com.google.android.gms.internal.ads.zzeot
            @Override // com.google.android.gms.internal.ads.zzfma
            public final /* synthetic */ void zza() throws RemoteException {
                this.zza.zzc(zzbhaVar);
            }
        }, this.zzb, zzfmoVar, zzfmuVar).zzj(zzfmo.CUSTOM_RENDER_ACK).zze(zzcdtVar).zzi();
    }

    public final /* synthetic */ void zzc(zzbha zzbhaVar) throws RemoteException {
        this.zza.zze(zzbhaVar);
    }

    public final /* synthetic */ zzepd zzd() {
        return this.zzd;
    }
}
