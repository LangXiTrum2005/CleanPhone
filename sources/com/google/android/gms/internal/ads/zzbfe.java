package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbfe implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcdt zza;
    final /* synthetic */ zzbff zzb;

    public zzbfe(zzbff zzbffVar, zzcdt zzcdtVar) {
        this.zza = zzcdtVar;
        Objects.requireNonNull(zzbffVar);
        this.zzb = zzbffVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzf()) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
