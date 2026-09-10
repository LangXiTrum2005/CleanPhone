package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeob implements zzeji {
    private final zzepf zza;
    private final zzduu zzb;

    public zzeob(zzepf zzepfVar, zzduu zzduuVar) {
        this.zza = zzepfVar;
        this.zzb = zzduuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final zzejj zza(String str, JSONObject jSONObject) throws zzfir {
        zzbuy zzbuyVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzci)).booleanValue()) {
            try {
                zzbuyVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e2);
                zzbuyVarZzb = null;
            }
        } else {
            zzbuyVarZzb = this.zza.zzb(str);
        }
        if (zzbuyVarZzb == null) {
            return null;
        }
        return new zzejj(zzbuyVarZzb, new zzekv(), str);
    }
}
