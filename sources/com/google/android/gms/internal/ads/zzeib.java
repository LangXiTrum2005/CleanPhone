package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeib implements zzecy {
    private final zzejf zza;
    private final zzdpm zzb;

    public zzeib(zzejf zzejfVar, zzdpm zzdpmVar) {
        this.zza = zzejfVar;
        this.zzb = zzdpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecy
    @Nullable
    public final zzecz zza(String str, JSONObject jSONObject) throws zzfcq {
        zzbrd zzbrdVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbM)).booleanValue()) {
            try {
                zzbrdVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Coundn't create RTB adapter: ", e);
                zzbrdVarZzb = null;
            }
        } else {
            zzbrdVarZzb = this.zza.zza(str);
        }
        if (zzbrdVarZzb == null) {
            return null;
        }
        return new zzecz(zzbrdVarZzb, new zzees(), str);
    }
}
