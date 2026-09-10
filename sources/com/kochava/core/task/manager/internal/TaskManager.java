package com.kochava.core.task.manager.internal;

import android.os.Handler;
import com.kochava.core.task.action.internal.TaskAction;
import com.kochava.core.task.internal.Task;
import com.kochava.core.task.internal.TaskApi;
import com.kochava.core.task.internal.TaskCompletedListener;
import com.kochava.core.task.internal.TaskManagementListener;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.ObjectUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public final class TaskManager implements TaskManagerApi, TaskManagementListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kochava.core.task.manager.internal.a f28083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f28084c;
    public final List d;

    class a implements Runnable {
        public final /* synthetic */ Runnable X;

        public a(Runnable runnable) {
            this.X = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.X.run();
            } catch (Throwable th) {
                TaskManager.this.g(Thread.currentThread(), th);
            }
        }
    }

    public TaskManager() {
        Object obj = new Object();
        this.f28082a = obj;
        this.f28084c = new HashMap();
        this.d = androidx.media3.extractor.text.ttml.a.u();
        this.f28083b = new com.kochava.core.task.manager.internal.a();
        synchronized (obj) {
            try {
                for (TaskQueue taskQueue : TaskQueue.values()) {
                    this.f28084c.put(taskQueue, new ArrayList());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.kochava.core.task.manager.internal.TaskManagerApi
    public final Task a(TaskQueue taskQueue, TaskAction taskAction) {
        com.kochava.core.task.manager.internal.a aVar = this.f28083b;
        Handler handler = aVar.f28089b;
        Handler handler2 = aVar.f28088a;
        ExecutorService executorService = com.kochava.core.task.manager.internal.a.f28087e;
        if (executorService != null) {
            return new Task(handler, handler2, executorService, taskQueue, this, taskAction, null);
        }
        throw new RuntimeException("Failed to start threadpool");
    }

    @Override // com.kochava.core.task.manager.internal.TaskManagerApi
    public final void b(Runnable runnable) {
        this.f28083b.f28089b.post(new a(runnable));
    }

    @Override // com.kochava.core.task.manager.internal.TaskManagerApi
    public final Task c(TaskQueue taskQueue, TaskAction taskAction, TaskCompletedListener taskCompletedListener) {
        com.kochava.core.task.manager.internal.a aVar = this.f28083b;
        Handler handler = aVar.f28089b;
        Handler handler2 = aVar.f28088a;
        ExecutorService executorService = com.kochava.core.task.manager.internal.a.f28087e;
        if (executorService != null) {
            return new Task(handler, handler2, executorService, taskQueue, this, taskAction, taskCompletedListener);
        }
        throw new RuntimeException("Failed to start threadpool");
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f28082a) {
            try {
                for (Map.Entry entry : this.f28084c.entrySet()) {
                    TaskQueue taskQueue = (TaskQueue) entry.getKey();
                    for (TaskApi taskApi : (List) entry.getValue()) {
                        if (taskApi.c()) {
                            arrayList.add(taskApi);
                        }
                        if (taskQueue.X) {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TaskApi) it.next()).b();
        }
    }

    public final void e(TaskApi taskApi) {
        synchronized (this.f28082a) {
            try {
                List list = (List) this.f28084c.get(taskApi.getQueue());
                if (list != null) {
                    list.remove(taskApi);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d();
    }

    public final void f(TaskApi taskApi) {
        synchronized (this.f28082a) {
            try {
                List list = (List) this.f28084c.get(taskApi.getQueue());
                if (list != null) {
                    list.add(taskApi);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d();
    }

    public final void g(Thread thread, Throwable th) {
        ArrayList arrayListQ = ObjectUtil.q(this.d);
        if (arrayListQ.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayListQ.iterator();
            while (it.hasNext()) {
                ((UncaughtExceptionHandler) it.next()).e(thread, th);
            }
        } catch (Throwable unused) {
        }
    }

    public final void h(Runnable runnable) {
        this.f28083b.getClass();
        ExecutorService executorService = com.kochava.core.task.manager.internal.a.f28087e;
        if (executorService == null) {
            throw new RuntimeException("Failed to start threadpool");
        }
        executorService.execute(new a(runnable));
    }

    public final void i(Runnable runnable) {
        this.f28083b.f28088a.post(new a(runnable));
    }

    public final Runnable j(Runnable runnable) {
        return new a(runnable);
    }
}
