package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzeqs implements zzddb {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zza.set(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfey.zza(this.zza, new zzfex() { // from class: com.google.android.gms.internal.ads.zzeqr
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
            }
        });
    }
}
