package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzr {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfzp zzfzpVar = new zzfzp(task, null);
        task.addOnCompleteListener(zzgzd.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfzq
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzfzp zzfzpVar2 = zzfzpVar;
                if (task2.isCanceled()) {
                    zzfzpVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfzpVar2.zza(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfzpVar2.zzb(exception);
            }
        });
        return zzfzpVar;
    }
}
