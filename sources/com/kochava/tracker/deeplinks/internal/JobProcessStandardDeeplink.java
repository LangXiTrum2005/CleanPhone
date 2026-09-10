package com.kochava.tracker.deeplinks.internal;

import com.kochava.core.job.internal.Job;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.action.internal.TaskActionListener;
import com.kochava.core.task.internal.TaskApi;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.deeplinks.Deeplink;

/* JADX INFO: loaded from: classes5.dex */
public final class JobProcessStandardDeeplink extends Job {
    public static final ClassLoggerApi p0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobProcessStandardDeeplink");
    public TaskApi n0;
    public transient boolean o0;

    class a implements TaskActionListener {
        public a() {
        }

        @Override // com.kochava.core.task.action.internal.TaskActionListener
        public final void b() {
            JobProcessStandardDeeplink.p0.d("Deeplink process timed out, aborting");
            JsonObject jsonObjectW = JsonObject.w();
            JobProcessStandardDeeplink jobProcessStandardDeeplink = JobProcessStandardDeeplink.this;
            jobProcessStandardDeeplink.getClass();
            Deeplink.a(null, jsonObjectW);
            synchronized (jobProcessStandardDeeplink) {
                try {
                    TaskApi taskApi = jobProcessStandardDeeplink.n0;
                    if (taskApi != null) {
                        taskApi.cancel();
                        jobProcessStandardDeeplink.n0 = null;
                    }
                    if (!jobProcessStandardDeeplink.h() && !jobProcessStandardDeeplink.o0) {
                        System.currentTimeMillis();
                        throw null;
                    }
                    JobProcessStandardDeeplink.p0.d("Already completed, aborting");
                } catch (Throwable th) {
                    throw th;
                }
            }
            jobProcessStandardDeeplink.o0 = true;
        }
    }

    class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
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
        return true;
    }

    public final void z(String str) {
        ClassLoggerApi classLoggerApi = p0;
        classLoggerApi.d("Queuing the click url");
        if (!str.isEmpty()) {
            throw null;
        }
        classLoggerApi.d("No click url, skipping");
    }
}
