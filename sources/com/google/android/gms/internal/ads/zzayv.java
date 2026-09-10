package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzayv extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzayw zza;

    public zzayv(zzayw zzaywVar) {
        Objects.requireNonNull(zzaywVar);
        this.zza = zzaywVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzayw.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzayw.class) {
            this.zza.zzd(null);
        }
    }
}
