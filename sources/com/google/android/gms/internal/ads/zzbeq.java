package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbeq implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzber zza;

    public zzbeq(zzber zzberVar) {
        Objects.requireNonNull(zzberVar);
        this.zza = zzberVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzber zzberVar = this.zza;
        synchronized (zzberVar.zzh()) {
            try {
                zzberVar.zzk(null);
                if (zzberVar.zzi() != null) {
                    zzberVar.zzj(null);
                }
                zzberVar.zzh().notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
