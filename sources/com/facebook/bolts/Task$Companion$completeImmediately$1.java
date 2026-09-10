package com.facebook.bolts;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "TContinuationResult", "TResult", "run"}, k = 3, mv = {1, 5, 1})
final class Task$Companion$completeImmediately$1 implements Runnable {
    public final /* synthetic */ TaskCompletionSource X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Continuation f16227Y;
    public final /* synthetic */ Task Z;

    public Task$Companion$completeImmediately$1(TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
        this.X = taskCompletionSource;
        this.f16227Y = continuation;
        this.Z = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TaskCompletionSource taskCompletionSource = this.X;
        try {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                taskCompletionSource.b(((Task$Companion$completeAfterTask$1.AnonymousClass1) this.f16227Y).a(this.Z));
            } catch (CancellationException unused) {
                if (!taskCompletionSource.f16231a.f()) {
                    throw new IllegalStateException("Cannot cancel a completed task.");
                }
            } catch (Exception e2) {
                taskCompletionSource.a(e2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
