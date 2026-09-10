package com.facebook.bolts;

import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/facebook/bolts/Task;", "Ljava/lang/Void;", "TResult", "task", "then"}, k = 3, mv = {1, 5, 1})
final class Task$makeVoid$1<TTaskResult, TContinuationResult> implements Continuation {
    @Override // com.facebook.bolts.Continuation
    public final Object a(Task task) {
        Intrinsics.f(task, "task");
        if (task.c()) {
            ExecutorService executorService = Task.f16218h;
            Task task2 = Task.f16220l;
            if (task2 != null) {
                return task2;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.bolts.Task<TResult>");
        }
        if (task.d()) {
            ExecutorService executorService2 = Task.f16218h;
            Exception excB = task.b();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.a(excB);
            return taskCompletionSource.f16231a;
        }
        ExecutorService executorService3 = Task.f16218h;
        Task task3 = Task.k;
        if (task3 != null) {
            return task3;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.bolts.Task<TResult>");
    }
}
