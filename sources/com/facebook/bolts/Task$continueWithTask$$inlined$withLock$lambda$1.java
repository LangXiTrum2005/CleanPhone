package com.facebook.bolts;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "TContinuationResult", "TResult", "task", "Lcom/facebook/bolts/Task;", "then", "com/facebook/bolts/Task$continueWithTask$1$1"}, k = 3, mv = {1, 5, 1})
final class Task$continueWithTask$$inlined$withLock$lambda$1<TTaskResult, TContinuationResult> implements Continuation {
    @Override // com.facebook.bolts.Continuation
    public final Object a(final Task task) {
        final TaskCompletionSource taskCompletionSource = null;
        byte b2 = 0;
        Intrinsics.f(task, "task");
        ExecutorService executorService = Task.f16218h;
        try {
            final byte b3 = b2 == true ? 1 : 0;
            new Runnable() { // from class: com.facebook.bolts.Task$Companion$completeAfterTask$1

                /* JADX INFO: renamed from: com.facebook.bolts.Task$Companion$completeAfterTask$1$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "TContinuationResult", "TResult", "task", "Lcom/facebook/bolts/Task;", "then"}, k = 3, mv = {1, 5, 1})
                final class AnonymousClass1<TTaskResult, TContinuationResult> implements Continuation {
                    public AnonymousClass1() {
                    }

                    @Override // com.facebook.bolts.Continuation
                    public final Object a(Task task) {
                        Intrinsics.f(task, "task");
                        Task$Companion$completeAfterTask$1 task$Companion$completeAfterTask$1 = Task$Companion$completeAfterTask$1.this;
                        boolean zC = task.c();
                        TaskCompletionSource taskCompletionSource = taskCompletionSource;
                        if (zC) {
                            if (taskCompletionSource.f16231a.f()) {
                                return null;
                            }
                            throw new IllegalStateException("Cannot cancel a completed task.");
                        }
                        if (task.d()) {
                            taskCompletionSource.a(task.b());
                            return null;
                        }
                        ReentrantLock reentrantLock = task.f16221a;
                        reentrantLock.lock();
                        try {
                            Object obj = task.f16224e;
                            reentrantLock.unlock();
                            taskCompletionSource.b(obj);
                            return null;
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    try {
                        if (CrashShieldHandler.b(this)) {
                            return;
                        }
                        try {
                            Task task2 = (Task) ((Task$onSuccessTask$1) b3).a(task);
                            if (task2 == null || task2.a(new AnonymousClass1()) == null) {
                                taskCompletionSource2.b(null);
                            }
                        } catch (CancellationException unused) {
                            if (!taskCompletionSource2.f16231a.f()) {
                                throw new IllegalStateException("Cannot cancel a completed task.");
                            }
                        } catch (Exception e2) {
                            taskCompletionSource2.a(e2);
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.a(this, th);
                    }
                }
            };
            throw null;
        } catch (Exception e2) {
            new ExecutorException("An exception was thrown by an Executor", e2);
            throw null;
        }
    }
}
