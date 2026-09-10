package com.kochava.tracker.huaweireferrer.internal;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.action.internal.TaskAction;
import com.kochava.core.task.action.internal.TaskActionListener;
import com.kochava.core.task.internal.TaskApi;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.task.manager.internal.TaskManagerApi;
import com.kochava.tracker.BuildConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public final class HuaweiReferrerHelper implements HuaweiReferrerHelperApi, TaskActionListener {
    public static final ClassLoggerApi l0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "HuaweiReferrerHelper");
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final WeakReference f28176Y;
    public final int Z;
    public final long e0;
    public final long f0;
    public final TaskApi g0;
    public final TaskApi h0;
    public boolean i0 = false;
    public InstallReferrerClient j0 = null;
    public HuaweiReferrerStatus k0 = HuaweiReferrerStatus.TimedOut;

    class a implements TaskActionListener {
        public a() {
        }

        @Override // com.kochava.core.task.action.internal.TaskActionListener
        public final void b() {
            synchronized (HuaweiReferrerHelper.this) {
                HuaweiReferrerHelper.l0.d("Huawei Referrer timed out, aborting");
                HuaweiReferrerHelper.this.c();
            }
        }
    }

    class b implements InstallReferrerStateListener {
    }

    public HuaweiReferrerHelper(Context context, TaskManagerApi taskManagerApi, JobHuaweiReferrer jobHuaweiReferrer, int i2, long j, long j2) {
        this.X = context;
        this.f28176Y = new WeakReference(jobHuaweiReferrer);
        this.Z = i2;
        this.e0 = j;
        this.f0 = j2;
        TaskQueue taskQueue = TaskQueue.IO;
        this.g0 = taskManagerApi.a(taskQueue, new TaskAction(this));
        this.h0 = taskManagerApi.a(taskQueue, new TaskAction(new a()));
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
    public final void b() {
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this.X).build();
            this.j0 = installReferrerClientBuild;
            installReferrerClientBuild.startConnection(new b());
        } catch (Throwable th) {
            l0.d("Unable to create referrer client: " + th.getMessage());
            this.k0 = HuaweiReferrerStatus.MissingDependency;
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
        WeakReference weakReference = this.f28176Y;
        HuaweiReferrerRetrievedListener huaweiReferrerRetrievedListener = (HuaweiReferrerRetrievedListener) weakReference.get();
        if (huaweiReferrerRetrievedListener == null) {
            return;
        }
        HuaweiReferrerStatus huaweiReferrerStatus = this.k0;
        HuaweiReferrerStatus huaweiReferrerStatus2 = HuaweiReferrerStatus.Ok;
        if (huaweiReferrerStatus != huaweiReferrerStatus2) {
            huaweiReferrerRetrievedListener.a(new HuaweiReferrer(this.Z, dCurrentTimeMillis, huaweiReferrerStatus, null, null, null));
        } else {
            huaweiReferrerRetrievedListener.a(new HuaweiReferrer(this.Z, dCurrentTimeMillis, huaweiReferrerStatus2, "", -1L, -1L));
        }
        weakReference.clear();
    }
}
