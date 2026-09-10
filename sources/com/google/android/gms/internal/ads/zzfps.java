package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfps extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfpu zza;

    public zzfps(zzfpu zzfpuVar) {
        Objects.requireNonNull(zzfpuVar);
        this.zza = zzfpuVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzk(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzk(false);
    }
}
