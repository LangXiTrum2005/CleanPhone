package com.google.android.gms.internal.ads;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzry {
    final /* synthetic */ zzrz zza;
    private final Handler zzb;
    private final AudioTrack$StreamEventCallback zzc;

    public /* synthetic */ zzry(zzrz zzrzVar, byte[] bArr) {
        Objects.requireNonNull(zzrzVar);
        this.zza = zzrzVar;
        final Handler handlerZzc = zzfj.zzc(null);
        this.zzb = handlerZzc;
        zzrw zzrwVar = new zzrw(this);
        this.zzc = zzrwVar;
        Objects.requireNonNull(handlerZzc);
        zzrzVar.zzr().registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzrx
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handlerZzc.post(runnable);
            }
        }, zzrwVar);
    }

    public final /* synthetic */ void zza() {
        this.zza.zzr().unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
