package com.facebook.bolts;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/bolts/TaskCompletionSource;", "TResult", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public class TaskCompletionSource<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Task f16231a = new Task();

    public final void a(Exception exc) {
        Task task = this.f16231a;
        ReentrantLock reentrantLock = task.f16221a;
        reentrantLock.lock();
        try {
            if (task.f16223c) {
                throw new IllegalStateException("Cannot set the error on a completed task.");
            }
            task.f16223c = true;
            task.f = exc;
            task.f16222b.signalAll();
            task.e();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(Object obj) {
        if (!this.f16231a.g(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
