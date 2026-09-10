package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfqa extends zzfqy {
    public zzfqa(ClientApi clientApi, Context context, int i2, zzfjg zzfjgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfly zzflyVar, zzfpy zzfpyVar, Clock clock) {
        super(clientApi, context, i2, zzfjgVar, zzftVar, zzceVar, scheduledExecutorService, zzflyVar, zzfpyVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final ListenableFuture zza(Context context) {
        zzbsz zzbszVarZzd = this.zzd.zzd();
        if (zzbszVarZzd == null) {
            return zzgym.zzc(new zzfpq(1, "Failed to create an interstitial ad manager."));
        }
        com.google.android.gms.ads.internal.client.zzbx zzbxVarZzc = this.zza.zzc(ObjectWrapper.wrap(context), new com.google.android.gms.ads.internal.client.zzr(), this.zze.zza, zzbszVarZzd, this.zzc);
        if (zzbxVarZzc == null) {
            return zzgym.zzc(new zzfpq(1, "Failed to create an interstitial ad manager."));
        }
        zzgzf zzgzfVarZze = zzgzf.zze();
        try {
            zzw(this.zze.zzc);
            zzbxVarZzc.zzQ(this.zze.zzc, new zzfpz(this, zzgzfVarZze, zzbxVarZzc));
            return zzgzfVarZze;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad.", e2);
            return zzgym.zzc(new zzfpq(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbx) obj).zzt();
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for  the interstitial ad.", e2);
            return null;
        }
    }

    public zzfqa(String str, ClientApi clientApi, Context context, int i2, zzfjg zzfjgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfly zzflyVar, zzfpy zzfpyVar, Clock clock, zzfpp zzfppVar) {
        super(str, clientApi, context, i2, zzfjgVar, zzftVar, zzchVar, scheduledExecutorService, zzflyVar, zzfpyVar, clock, zzfppVar);
    }
}
