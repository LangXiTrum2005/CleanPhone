package com.facebook.bolts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/bolts/Task;", "TResult", "", "Companion", "TaskCompletionSource", "UnobservedExceptionHandler", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Task<TResult> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ExecutorService f16218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f16219i;
    public static final Executor j;
    public static final Task k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Task f16220l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f16221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Condition f16222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16223c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f16224e;
    public Exception f;
    public ArrayList g;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/bolts/Task$Companion;", "", "Ljava/util/concurrent/ExecutorService;", "BACKGROUND_EXECUTOR", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/Executor;", "IMMEDIATE_EXECUTOR", "Ljava/util/concurrent/Executor;", "Lcom/facebook/bolts/Task;", "TASK_CANCELLED", "Lcom/facebook/bolts/Task;", "", "TASK_FALSE", "TASK_NULL", "TASK_TRUE", "UI_THREAD_EXECUTOR", "Lcom/facebook/bolts/Task$UnobservedExceptionHandler;", "unobservedExceptionHandler", "Lcom/facebook/bolts/Task$UnobservedExceptionHandler;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/bolts/Task$TaskCompletionSource;", "Lcom/facebook/bolts/TaskCompletionSource;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    @Deprecated
    public final class TaskCompletionSource extends com.facebook.bolts.TaskCompletionSource<TResult> {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/bolts/Task$UnobservedExceptionHandler;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface UnobservedExceptionHandler {
    }

    static {
        BoltsExecutors boltsExecutors = BoltsExecutors.d;
        f16218h = boltsExecutors.f16215a;
        f16219i = boltsExecutors.f16217c;
        j = AndroidExecutors.f16212b.f16214a;
        k = new Task((Boolean) null);
        new Task(Boolean.TRUE);
        new Task(Boolean.FALSE);
        f16220l = new Task(0);
    }

    public Task() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f16221a = reentrantLock;
        this.f16222b = reentrantLock.newCondition();
        this.g = new ArrayList();
    }

    public final Task a(final Continuation continuation) {
        ArrayList arrayList;
        Intrinsics.f(continuation, "continuation");
        final Executor executor = f16219i;
        Intrinsics.f(executor, "executor");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.f16221a;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            try {
                boolean z2 = this.f16223c;
                reentrantLock.unlock();
                booleanRef.X = z2;
                if (!z2 && (arrayList = this.g) != null) {
                    arrayList.add(new Continuation() { // from class: com.facebook.bolts.Task$continueWith$$inlined$withLock$lambda$1
                        @Override // com.facebook.bolts.Continuation
                        public final Object a(Task task) {
                            Intrinsics.f(task, "task");
                            ExecutorService executorService = Task.f16218h;
                            TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                            Continuation continuation2 = continuation;
                            try {
                                ((BoltsExecutors.ImmediateExecutor) executor).execute(new Task$Companion$completeImmediately$1(taskCompletionSource2, continuation2, task));
                                return null;
                            } catch (Exception e2) {
                                taskCompletionSource2.a(new ExecutorException("An exception was thrown by an Executor", e2));
                                return null;
                            }
                        }
                    });
                }
                reentrantLock.unlock();
                if (booleanRef.X) {
                    try {
                        ((BoltsExecutors.ImmediateExecutor) executor).execute(new Task$Companion$completeImmediately$1(taskCompletionSource, continuation, this));
                    } catch (Exception e2) {
                        taskCompletionSource.a(new ExecutorException("An exception was thrown by an Executor", e2));
                    }
                }
                return taskCompletionSource.f16231a;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Exception b() {
        ReentrantLock reentrantLock = this.f16221a;
        reentrantLock.lock();
        try {
            return this.f;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c() {
        ReentrantLock reentrantLock = this.f16221a;
        reentrantLock.lock();
        try {
            return this.d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean d() {
        ReentrantLock reentrantLock = this.f16221a;
        reentrantLock.lock();
        try {
            return this.f != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e() {
        ReentrantLock reentrantLock = this.f16221a;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((Continuation) it.next()).a(this);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            this.g = null;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean f() {
        ReentrantLock reentrantLock = this.f16221a;
        reentrantLock.lock();
        try {
            if (this.f16223c) {
                return false;
            }
            this.f16223c = true;
            this.d = true;
            this.f16222b.signalAll();
            e();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean g(Object obj) {
        ReentrantLock reentrantLock = this.f16221a;
        reentrantLock.lock();
        try {
            if (this.f16223c) {
                return false;
            }
            this.f16223c = true;
            this.f16224e = obj;
            this.f16222b.signalAll();
            e();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public Task(Boolean bool) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f16221a = reentrantLock;
        this.f16222b = reentrantLock.newCondition();
        this.g = new ArrayList();
        g(bool);
    }

    public Task(int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f16221a = reentrantLock;
        this.f16222b = reentrantLock.newCondition();
        this.g = new ArrayList();
        f();
    }
}
