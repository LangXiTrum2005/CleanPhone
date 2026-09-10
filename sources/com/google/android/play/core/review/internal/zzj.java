package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzj implements Runnable {
    public final TaskCompletionSource X;

    public zzj() {
        this.X = null;
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e2) {
            TaskCompletionSource taskCompletionSource = this.X;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e2);
            }
        }
    }

    public zzj(TaskCompletionSource taskCompletionSource) {
        this.X = taskCompletionSource;
    }
}
