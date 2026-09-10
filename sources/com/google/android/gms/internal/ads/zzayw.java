package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayw {
    private NetworkCapabilities zza;

    public zzayw(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzayv(this));
            } catch (RuntimeException unused) {
                synchronized (zzayw.class) {
                    this.zza = null;
                }
            }
        }
    }

    public static zzayw zza(Context context) {
        if (context != null) {
            return new zzayw((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }

    public final long zzc() {
        synchronized (zzayw.class) {
            try {
                NetworkCapabilities networkCapabilities = this.zza;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.zza.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.zza.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzd(NetworkCapabilities networkCapabilities) {
        this.zza = networkCapabilities;
    }
}
