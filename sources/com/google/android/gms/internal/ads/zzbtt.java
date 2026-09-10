package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbtt implements InitializationCompleteCallback {
    final /* synthetic */ zzbpq zza;

    public zzbtt(zzbua zzbuaVar, zzbpq zzbpqVar) {
        this.zza = zzbpqVar;
        Objects.requireNonNull(zzbuaVar);
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zze();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }
}
