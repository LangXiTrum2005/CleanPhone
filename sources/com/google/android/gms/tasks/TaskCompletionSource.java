package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class TaskCompletionSource<TResult> {
    private final zzw zza = new zzw();

    public TaskCompletionSource() {
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(@NonNull Exception exc) {
        this.zza.zzc(exc);
    }

    public void setResult(@Nullable TResult tresult) {
        this.zza.zza(tresult);
    }

    public boolean trySetException(@NonNull Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(@Nullable TResult tresult) {
        return this.zza.zzb(tresult);
    }

    public final /* synthetic */ zzw zza() {
        return this.zza;
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }
}
