package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.thinkup.core.common.n.mo;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdsc implements zzbnn {
    private final zzblc zza;
    private final zzdsp zzb;
    private final zzija zzc;

    public zzdsc(zzdnw zzdnwVar, zzdnm zzdnmVar, zzdsp zzdspVar, zzija zzijaVar) {
        this.zza = zzdnwVar.zzg(zzdnmVar.zzS());
        this.zzb = zzdspVar;
        this.zzc = zzijaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbks) this.zzc.zzb(), str);
        } catch (RemoteException e2) {
            String strS = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, mo.ono);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strS, e2);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
