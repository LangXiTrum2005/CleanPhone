package com.kochava.core.job.internal;

import com.kochava.core.task.action.internal.TaskAction;
import com.kochava.core.task.action.internal.TaskActionListener;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.Task;
import com.kochava.core.task.internal.TaskApi;
import com.kochava.core.task.internal.TaskCompletedListener;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.task.manager.internal.TaskManagerApi;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Job implements JobApi, TaskActionListener, TaskCompletedListener {
    public final TaskManagerApi X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f28013Y;
    public final JobCompletedListener Z;
    public final TaskApi f0;
    public final Object e0 = new Object();
    public volatile JobState g0 = JobState.X;
    public volatile long h0 = 0;
    public volatile long i0 = 0;
    public volatile int j0 = 1;
    public volatile long k0 = -1;
    public TaskApi l0 = null;
    public volatile boolean m0 = false;

    class a implements TaskActionListener {

        /* JADX INFO: renamed from: com.kochava.core.job.internal.Job$a$a, reason: collision with other inner class name */
        class RunnableC0304a implements Runnable {
            public RunnableC0304a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                Job.this.y();
            }
        }

        public a() {
        }

        @Override // com.kochava.core.task.action.internal.TaskActionListener
        public final void b() {
            Job job = Job.this;
            job.X.b(new RunnableC0304a());
        }
    }

    class b implements Runnable {
        public final /* synthetic */ boolean X;

        public b(boolean z2) {
            this.X = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Job job = Job.this;
            job.Z.j(job, this.X);
        }
    }

    public Job(String str, TaskManagerApi taskManagerApi, TaskQueue taskQueue, JobCompletedListener jobCompletedListener) {
        this.f28013Y = str;
        this.X = taskManagerApi;
        this.Z = jobCompletedListener;
        this.f0 = taskManagerApi.c(taskQueue, new TaskAction(this), this);
    }

    @Override // com.kochava.core.task.action.internal.TaskActionListener
    public final void b() {
        synchronized (this.e0) {
            p();
        }
    }

    @Override // com.kochava.core.task.internal.TaskCompletedListener
    public final synchronized void c(boolean z2) {
        try {
            this.f0.cancel();
            if (this.m0) {
                return;
            }
            if (z2 || this.k0 < 0) {
                k(z2);
            } else {
                this.j0++;
                g(this.k0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void g(long j) {
        this.f0.cancel();
        this.g0 = JobState.f28015Y;
        this.k0 = -1L;
        if (!v()) {
            k(true);
        } else if (j <= 0) {
            this.f0.start();
        } else {
            this.f0.a(j);
        }
    }

    @Override // com.kochava.core.job.internal.JobApi
    public final String getId() {
        return this.f28013Y;
    }

    @Override // com.kochava.core.job.internal.JobApi
    public final boolean h() {
        return this.g0 == JobState.Z;
    }

    @Override // com.kochava.core.job.internal.JobApi
    public final long i() {
        long jCurrentTimeMillis;
        long j;
        if (this.h0 == 0) {
            return 0L;
        }
        if (this.i0 == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            j = this.h0;
        } else {
            jCurrentTimeMillis = this.i0;
            j = this.h0;
        }
        return jCurrentTimeMillis - j;
    }

    @Override // com.kochava.core.job.internal.JobApi
    public final synchronized boolean j() {
        if (w()) {
            return false;
        }
        return v();
    }

    public final void k(boolean z2) {
        this.i0 = System.currentTimeMillis();
        this.f0.cancel();
        this.g0 = JobState.Z;
        this.X.b(new b(z2));
    }

    public final synchronized void l() {
        if (!w()) {
            this.k0 = -1L;
            throw new TaskFailedException("Job aborted due to not started");
        }
    }

    public final synchronized void m() {
        JobState jobState = this.g0;
        JobState jobState2 = JobState.X;
        if (jobState == jobState2) {
            return;
        }
        this.g0 = jobState2;
        this.h0 = 0L;
        this.i0 = 0L;
        this.f0.cancel();
        x();
        this.k0 = -1L;
        this.m0 = false;
        TaskApi taskApi = this.l0;
        if (taskApi != null) {
            taskApi.cancel();
            this.l0 = null;
        }
    }

    public final synchronized void n(boolean z2) {
        if (w() && this.m0) {
            k(z2);
        }
    }

    public final synchronized void o(long j) {
        this.m0 = false;
        TaskApi taskApi = this.l0;
        if (taskApi != null) {
            taskApi.cancel();
            this.l0 = null;
        }
        u();
        Task taskA = this.X.a(TaskQueue.IO, new TaskAction(new a()));
        this.l0 = taskA;
        taskA.a(j);
    }

    public abstract void p();

    public final synchronized void q() {
        this.k0 = -1L;
        throw new TaskFailedException("Job failed and will not retry");
    }

    public final synchronized void r(long j) {
        this.k0 = j;
        throw new TaskFailedException("Job failed and will retry after " + j + " milliseconds");
    }

    public final synchronized void s(long j) {
        try {
            if (w() && this.m0) {
                if (j < 0) {
                    n(false);
                } else {
                    this.m0 = false;
                    TaskApi taskApi = this.l0;
                    if (taskApi != null) {
                        taskApi.cancel();
                        this.l0 = null;
                    }
                    this.j0++;
                    g(j);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.kochava.core.job.internal.JobApi
    public final synchronized void start() {
        if ((this.g0 == JobState.X) || h()) {
            this.h0 = System.currentTimeMillis();
            if (!v()) {
                k(true);
                return;
            }
            if (h()) {
                m();
            }
            g(t());
        }
    }

    public abstract long t();

    public final synchronized void u() {
        if (w()) {
            this.m0 = true;
        }
    }

    public abstract boolean v();

    public final boolean w() {
        return this.g0 == JobState.f28015Y;
    }

    public final synchronized void x() {
        this.j0 = 1;
    }

    public final synchronized void y() {
        if (w() && this.m0) {
            this.m0 = false;
            g(0L);
        }
    }
}
