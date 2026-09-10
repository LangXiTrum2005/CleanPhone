package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdp extends zzeq {
    final /* synthetic */ zzfb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzfb zzfbVar) {
        super(zzfbVar, true);
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() throws RemoteException {
        ((zzcr) Preconditions.checkNotNull(this.zza.zzQ())).resetAnalyticsData(this.zzh);
    }
}
