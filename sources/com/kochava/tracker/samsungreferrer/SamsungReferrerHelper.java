package com.kochava.tracker.samsungreferrer;

import android.content.Context;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.action.internal.TaskAction;
import com.kochava.core.task.action.internal.TaskActionListener;
import com.kochava.core.task.internal.TaskApi;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.task.manager.internal.TaskManagerApi;
import com.kochava.tracker.BuildConfig;
import com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient;
import com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerStateListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SamsungReferrerHelper implements SamsungReferrerHelperApi, TaskActionListener {
    public static final ClassLoggerApi l0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "SamsungReferrerHelper");
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final WeakReference f28317Y;
    public final int Z;
    public final long e0;
    public final long f0;
    public final TaskApi g0;
    public final TaskApi h0;
    public boolean i0 = false;
    public InstallReferrerClient j0 = null;
    public SamsungReferrerStatus k0 = SamsungReferrerStatus.TimedOut;

    class a implements TaskActionListener {
        public a() {
        }

        @Override // com.kochava.core.task.action.internal.TaskActionListener
        public final void b() {
            synchronized (SamsungReferrerHelper.this) {
                SamsungReferrerHelper.l0.d("Samsung Referrer timed out, aborting");
                SamsungReferrerHelper.this.c();
            }
        }
    }

    class b implements InstallReferrerStateListener {
    }

    public SamsungReferrerHelper(Context context, TaskManagerApi taskManagerApi, JobSamsungReferrer jobSamsungReferrer, int i2, long j, long j2) {
        this.X = context;
        this.f28317Y = new WeakReference(jobSamsungReferrer);
        this.Z = i2;
        this.e0 = j;
        this.f0 = j2;
        this.g0 = taskManagerApi.a(TaskQueue.UI, new TaskAction(this));
        this.h0 = taskManagerApi.a(TaskQueue.IO, new TaskAction(new a()));
    }

    public final void a() {
        try {
            InstallReferrerClient installReferrerClient = this.j0;
            if (installReferrerClient != null) {
                installReferrerClient.endConnection();
            }
        } catch (Throwable th) {
            l0.d("Unable to close the referrer client: " + th.getMessage());
        }
        this.j0 = null;
    }

    @Override // com.kochava.core.task.action.internal.TaskActionListener
    public final synchronized void b() {
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this.X).build();
            this.j0 = installReferrerClientBuild;
            installReferrerClientBuild.startConnection(new b());
        } catch (Throwable th) {
            l0.d("Unable to create referrer client: " + th.getMessage());
            this.k0 = SamsungReferrerStatus.MissingDependency;
            c();
        }
    }

    public final void c() {
        if (this.i0) {
            return;
        }
        this.i0 = true;
        this.g0.cancel();
        this.h0.cancel();
        a();
        double dCurrentTimeMillis = (System.currentTimeMillis() - this.e0) / 1000.0d;
        WeakReference weakReference = this.f28317Y;
        SamsungReferrerRetrievedListener samsungReferrerRetrievedListener = (SamsungReferrerRetrievedListener) weakReference.get();
        if (samsungReferrerRetrievedListener == null) {
            return;
        }
        SamsungReferrerStatus samsungReferrerStatus = this.k0;
        SamsungReferrerStatus samsungReferrerStatus2 = SamsungReferrerStatus.Ok;
        if (samsungReferrerStatus != samsungReferrerStatus2) {
            samsungReferrerRetrievedListener.e(new SamsungReferrer(System.currentTimeMillis(), this.Z, dCurrentTimeMillis, samsungReferrerStatus, null, null, null));
        } else {
            samsungReferrerRetrievedListener.e(new SamsungReferrer(System.currentTimeMillis(), this.Z, dCurrentTimeMillis, samsungReferrerStatus2, "", -1L, -1L));
        }
        weakReference.clear();
    }
}
