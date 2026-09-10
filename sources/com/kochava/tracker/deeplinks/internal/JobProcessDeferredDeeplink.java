package com.kochava.tracker.deeplinks.internal;

import com.kochava.core.job.internal.Job;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.action.internal.TaskActionListener;
import com.kochava.core.task.internal.TaskApi;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.attribution.RetrievedInstallAttributionListener;
import com.kochava.tracker.deeplinks.Deeplink;

/* JADX INFO: loaded from: classes5.dex */
public final class JobProcessDeferredDeeplink extends Job implements RetrievedInstallAttributionListener {
    public static final ClassLoggerApi q0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobProcessDeferredDeeplink");
    public long n0;
    public TaskApi o0;
    public transient boolean p0;

    class a implements TaskActionListener {
        public a() {
        }

        @Override // com.kochava.core.task.action.internal.TaskActionListener
        public final void b() {
            JobProcessDeferredDeeplink.q0.d("Deeplink process timed out, aborting");
            Deeplink.a("", JsonObject.w());
            JobProcessDeferredDeeplink jobProcessDeferredDeeplink = JobProcessDeferredDeeplink.this;
            synchronized (jobProcessDeferredDeeplink) {
                try {
                    TaskApi taskApi = jobProcessDeferredDeeplink.o0;
                    if (taskApi != null) {
                        taskApi.cancel();
                        jobProcessDeferredDeeplink.o0 = null;
                    }
                    if (!jobProcessDeferredDeeplink.h() && !jobProcessDeferredDeeplink.p0) {
                        System.currentTimeMillis();
                        throw null;
                    }
                    JobProcessDeferredDeeplink.q0.d("Already completed, aborting");
                } catch (Throwable th) {
                    throw th;
                }
            }
            jobProcessDeferredDeeplink.p0 = true;
        }
    }

    class b implements Runnable {
        public b(Deeplink deeplink) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            JobProcessDeferredDeeplink.this.getClass();
            throw null;
        }
    }

    class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            JobProcessDeferredDeeplink.this.getClass();
            throw null;
        }
    }

    @Override // com.kochava.tracker.attribution.RetrievedInstallAttributionListener
    public final void d() {
        boolean zH = h();
        ClassLoggerApi classLoggerApi = q0;
        if (zH || this.p0) {
            classLoggerApi.d("Already completed, ignoring install attribution response");
        } else {
            classLoggerApi.d("Retrieved install attribution, resuming");
            y();
        }
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        throw null;
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        return 0L;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        throw null;
    }
}
