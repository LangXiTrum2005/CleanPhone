package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbpj implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcdt zza;
    final /* synthetic */ zzbpl zzb;

    public zzbpj(zzbpl zzbplVar, zzcdt zzcdtVar) {
        this.zza = zzcdtVar;
        Objects.requireNonNull(zzbplVar);
        this.zzb = zzbplVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (DeadObjectException e2) {
            this.zza.zzd(e2);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        this.zza.zzd(new RuntimeException(androidx.datastore.preferences.protobuf.a.g(i2, "onConnectionSuspended: ", new StringBuilder(String.valueOf(i2).length() + 23))));
    }
}
