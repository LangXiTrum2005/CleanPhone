package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbep implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzber zza;

    public zzbep(zzber zzberVar) {
        Objects.requireNonNull(zzberVar);
        this.zza = zzberVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzber zzberVar = this.zza;
        synchronized (zzberVar.zzh()) {
            try {
                if (zzberVar.zzi() != null) {
                    zzberVar.zzk(zzberVar.zzi().zzq());
                }
            } catch (DeadObjectException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e2);
                this.zza.zzg();
            }
            this.zza.zzh().notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        zzber zzberVar = this.zza;
        synchronized (zzberVar.zzh()) {
            zzberVar.zzk(null);
            zzberVar.zzh().notifyAll();
        }
    }
}
