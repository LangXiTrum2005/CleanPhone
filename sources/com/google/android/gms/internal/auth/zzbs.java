package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes4.dex */
final class zzbs extends zzbj {
    public zzbs(zzbt zzbtVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.internal.auth.zzbj
    public final void zza(Context context, zzbh zzbhVar) throws RemoteException {
        zzbhVar.zzd(new zzbr(this));
    }
}
