package com.kochava.core.task.internal;

import android.os.Handler;
import com.kochava.core.task.action.internal.TaskAction;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.manager.internal.TaskManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
public final class Task implements TaskApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f28074c;
    public final Handler d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f28075e;
    public final TaskQueue f;
    public final TaskManager g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TaskAction f28076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f28077i;
    public final Runnable j;
    public final Runnable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f28078l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28072a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28073b = new Object();
    public volatile TaskState m = TaskState.X;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f28079n = false;
    public Future o = null;

    class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Task task = Task.this;
            task.g.f(task);
        }
    }

    class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Task task = Task.this;
            task.g.e(task);
        }
    }

    public final class c implements Runnable {
        public c() {
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.kochava.core.task.internal.TaskCompletedListener, java.lang.Object] */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z2;
            boolean z3;
            synchronized (Task.this.f28072a) {
                try {
                    if (Task.this.e()) {
                        Task task = Task.this;
                        TaskState taskState = TaskState.f0;
                        task.m = taskState;
                        Task task2 = Task.this;
                        synchronized (task2.f28072a) {
                            try {
                                synchronized (task2.f28072a) {
                                    z2 = false;
                                    z3 = task2.m == taskState;
                                }
                                if (z3) {
                                    z2 = task2.f28079n;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        ?? r0 = Task.this.f28077i;
                        if (r0 != 0) {
                            r0.c(z2);
                        }
                        Task task3 = Task.this;
                        task3.g.e(task3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z2;
            synchronized (Task.this.f28072a) {
                try {
                    Task task = Task.this;
                    synchronized (task.f28072a) {
                        z2 = task.m == TaskState.f28081Y;
                    }
                    if (z2) {
                        Task.this.m = TaskState.Z;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Task task2 = Task.this;
            task2.g.f(task2);
        }
    }

    public final class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!Task.this.e()) {
                return;
            }
            try {
                synchronized (Task.this.f28073b) {
                    try {
                        Task.this.f28076h.f28071a.b();
                        if (Task.this.e()) {
                            Task.this.f28079n = true;
                            Task task = Task.this;
                            task.f28074c.post(task.f28078l);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (TaskFailedException unused) {
                Task.this.f28079n = false;
            } catch (Throwable th2) {
                Task.this.f28079n = false;
                Task.this.g.g(Thread.currentThread(), th2);
            }
        }
    }

    public Task(Handler handler, Handler handler2, ExecutorService executorService, TaskQueue taskQueue, TaskManager taskManager, TaskAction taskAction, TaskCompletedListener taskCompletedListener) {
        this.f28074c = handler;
        this.d = handler2;
        this.f28075e = executorService;
        this.f = taskQueue;
        this.g = taskManager;
        this.f28076h = taskAction;
        this.f28077i = taskCompletedListener;
        this.j = taskManager.j(new e());
        this.k = taskManager.j(new d());
        this.f28078l = taskManager.j(new c());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0028 A[Catch: all -> 0x0044, DONT_GENERATE, TryCatch #2 {all -> 0x0044, blocks: (B:4:0x0003, B:5:0x0005, B:12:0x0014, B:13:0x0016, B:32:0x0051, B:22:0x0024, B:23:0x0025, B:24:0x0027, B:25:0x0028, B:28:0x002f, B:31:0x0046, B:36:0x0055, B:14:0x0017, B:17:0x001e, B:6:0x0006, B:10:0x0011), top: B:43:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x002f A[Catch: all -> 0x0044, TryCatch #2 {all -> 0x0044, blocks: (B:4:0x0003, B:5:0x0005, B:12:0x0014, B:13:0x0016, B:32:0x0051, B:22:0x0024, B:23:0x0025, B:24:0x0027, B:25:0x0028, B:28:0x002f, B:31:0x0046, B:36:0x0055, B:14:0x0017, B:17:0x001e, B:6:0x0006, B:10:0x0011), top: B:43:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0046 A[Catch: all -> 0x0044, TryCatch #2 {all -> 0x0044, blocks: (B:4:0x0003, B:5:0x0005, B:12:0x0014, B:13:0x0016, B:32:0x0051, B:22:0x0024, B:23:0x0025, B:24:0x0027, B:25:0x0028, B:28:0x002f, B:31:0x0046, B:36:0x0055, B:14:0x0017, B:17:0x001e, B:6:0x0006, B:10:0x0011), top: B:43:0x0003, inners: #0, #1 }] */
    @Override // com.kochava.core.task.internal.TaskApi
    public final void a(long j) {
        boolean z2;
        boolean z3;
        synchronized (this.f28072a) {
            try {
                synchronized (this.f28072a) {
                    z2 = this.m == TaskState.X;
                }
                if (z2) {
                    synchronized (this.f28076h) {
                        if (j <= 0) {
                            this.m = TaskState.Z;
                            this.f28074c.post(this.g.j(new a()));
                        } else {
                            this.m = TaskState.f28081Y;
                            this.f28074c.postDelayed(this.k, j);
                        }
                    }
                } else {
                    synchronized (this.f28072a) {
                        z3 = this.m == TaskState.f0;
                    }
                    if (z3) {
                        synchronized (this.f28076h) {
                        }
                        if (j <= 0) {
                            this.m = TaskState.Z;
                            this.f28074c.post(this.g.j(new a()));
                        } else {
                            this.m = TaskState.f28081Y;
                            this.f28074c.postDelayed(this.k, j);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.kochava.core.task.internal.TaskApi
    public final void b() {
        synchronized (this.f28072a) {
            try {
                if (c()) {
                    this.m = TaskState.e0;
                    if (this.f == TaskQueue.UI) {
                        this.d.post(this.j);
                    } else {
                        this.o = this.f28075e.submit(this.j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.kochava.core.task.internal.TaskApi
    public final boolean c() {
        boolean z2;
        synchronized (this.f28072a) {
            z2 = this.m == TaskState.Z;
        }
        return z2;
    }

    @Override // com.kochava.core.task.internal.TaskApi
    public final void cancel() {
        boolean z2;
        boolean z3;
        synchronized (this.f28072a) {
            synchronized (this.f28072a) {
                z2 = this.m == TaskState.X;
            }
            if (!z2) {
                synchronized (this.f28072a) {
                    z3 = this.m == TaskState.f28081Y;
                }
                if (!z3 && !c() && !e()) {
                    return;
                }
            }
            d();
            this.m = TaskState.f0;
            this.f28074c.post(this.g.j(new b()));
        }
    }

    public final void d() {
        synchronized (this.f28072a) {
            try {
                this.m = TaskState.X;
                this.f28079n = false;
                synchronized (this.f28076h) {
                }
                this.f28074c.removeCallbacks(this.k);
                this.f28074c.removeCallbacks(this.f28078l);
                this.d.removeCallbacks(this.j);
                Future future = this.o;
                if (future != null) {
                    future.cancel(false);
                    this.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        boolean z2;
        synchronized (this.f28072a) {
            z2 = this.m == TaskState.e0;
        }
        return z2;
    }

    @Override // com.kochava.core.task.internal.TaskApi
    public final TaskQueue getQueue() {
        return this.f;
    }

    @Override // com.kochava.core.task.internal.TaskApi
    public final void start() {
        a(0L);
    }
}
