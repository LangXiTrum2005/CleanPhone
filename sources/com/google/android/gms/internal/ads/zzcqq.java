package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcqq implements zzdbf {
    private final zzfji zza;

    public zzcqq(zzfji zzfjiVar) {
        this.zza = zzfjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zza(Context context) {
        try {
            this.zza.zzi();
        } catch (zzfir e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzb(Context context) {
        try {
            zzfji zzfjiVar = this.zza;
            zzfjiVar.zzj();
            if (context != null) {
                zzfjiVar.zzp(context);
            }
        } catch (zzfir e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onResume for the mediation adapter.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzc(Context context) {
        try {
            this.zza.zzf();
        } catch (zzfir e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e2);
        }
    }
}
