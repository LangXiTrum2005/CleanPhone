package com.google.android.gms.common.providers;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class PooledExecutorsProvider {
    private static PooledExecutorFactory zza;

    public interface PooledExecutorFactory {
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    @Deprecated
    public static synchronized PooledExecutorFactory getInstance() {
        try {
            if (zza == null) {
                zza = new zza();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
