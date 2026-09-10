package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzghr extends zzfuf {
    private final zzgcf zzb;

    public zzghr(Context context, Executor executor, zzgcf zzgcfVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzgcfVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final Task zzb(int i2, long j) {
        this.zzb.zzb(i2, j, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final Task zzc(int i2, long j, Exception exc) {
        this.zzb.zzb(i2, j, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final Task zze(int i2, String str) {
        this.zzb.zzb(i2, -1L, null, str);
        return zzh();
    }
}
