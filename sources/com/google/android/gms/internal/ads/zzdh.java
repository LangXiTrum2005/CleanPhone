package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdh {
    private static Executor zza;

    public static synchronized Executor zza() {
        try {
            if (zza == null) {
                zza = zzfj.zzf("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
