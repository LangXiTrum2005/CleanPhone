package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbpk implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcdt zza;

    public zzbpk(zzbpl zzbplVar, zzcdt zzcdtVar) {
        this.zza = zzcdtVar;
        Objects.requireNonNull(zzbplVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
