package com.google.firebase.crashlytics.internal.concurrency;

import androidx.arch.core.executor.a;
import androidx.media3.exoplayer.analytics.o;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class CrashlyticsTasks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20374a = new a(1);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        o oVar = new o(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 7);
        a aVar = f20374a;
        task.continueWithTask(aVar, oVar);
        task2.continueWithTask(aVar, oVar);
        return taskCompletionSource.getTask();
    }
}
