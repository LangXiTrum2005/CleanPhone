package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzccx extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcda zza;

    public zzccx(zzcda zzcdaVar) {
        Objects.requireNonNull(zzcdaVar);
        this.zza = zzcdaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzC().set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzC().set(false);
    }
}
