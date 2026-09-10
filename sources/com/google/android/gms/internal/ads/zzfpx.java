package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfpx extends zzfqy {
    public zzfpx(ClientApi clientApi, Context context, int i2, zzfjg zzfjgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfly zzflyVar, zzfpy zzfpyVar, Clock clock) {
        super(clientApi, context, i2, zzfjgVar, zzftVar, zzceVar, scheduledExecutorService, zzflyVar, zzfpyVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final ListenableFuture zza(Context context) {
        zzbsz zzbszVarZzd = this.zzd.zzd();
        if (zzbszVarZzd == null) {
            return zzgym.zzc(new zzfpq(1, "Failed to create an app open ad manager."));
        }
        com.google.android.gms.ads.internal.client.zzbx zzbxVarZzm = this.zza.zzm(ObjectWrapper.wrap(context), com.google.android.gms.ads.internal.client.zzr.zzd(), this.zze.zza, zzbszVarZzd, this.zzc);
        if (zzbxVarZzm == null) {
            return zzgym.zzc(new zzfpq(1, "Failed to create an app open ad manager."));
        }
        zzgzf zzgzfVarZze = zzgzf.zze();
        try {
            zzw(this.zze.zzc);
            zzbxVarZzm.zzJ(new zzfpw(this, zzgzfVarZze, this.zze));
            zzbxVarZzm.zze(this.zze.zzc);
            return zzgzfVarZze;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad.", e2);
            return zzgym.zzc(new zzfpq(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb(Object obj) {
        try {
            return ((zzbed) obj).zzg();
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the app open ad.", e2);
            return null;
        }
    }

    public zzfpx(String str, ClientApi clientApi, Context context, int i2, zzfjg zzfjgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfly zzflyVar, zzfpy zzfpyVar, Clock clock, zzfpp zzfppVar) {
        super(str, clientApi, context, i2, zzfjgVar, zzftVar, zzchVar, scheduledExecutorService, zzflyVar, zzfpyVar, clock, zzfppVar);
    }
}
