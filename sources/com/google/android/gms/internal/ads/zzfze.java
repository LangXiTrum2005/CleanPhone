package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfze {
    public static final zzfzc zza(final ExecutorService executorService) {
        Intrinsics.f(executorService, "executorService");
        return new zzfzc() { // from class: com.google.android.gms.internal.ads.zzfzd
            @Override // com.google.android.gms.internal.ads.zzfzc
            public final CoroutineScope zza() {
                return CoroutineScopeKt.a(new ExecutorCoroutineDispatcherImpl(executorService));
            }
        };
    }
}
