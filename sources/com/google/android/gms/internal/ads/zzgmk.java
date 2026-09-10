package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgmk extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzgmm zza;

    public zzgmk(zzgmm zzgmmVar) {
        Objects.requireNonNull(zzgmmVar);
        this.zza = zzgmmVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgmm zzgmmVar = this.zza;
        synchronized (zzgmmVar) {
            zzgmmVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgmm zzgmmVar = this.zza;
        synchronized (zzgmmVar) {
            zzgmmVar.zzf(null);
        }
    }
}
