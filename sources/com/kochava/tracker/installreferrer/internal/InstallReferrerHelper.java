package com.kochava.tracker.installreferrer.internal;

import android.content.Context;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
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
public final class InstallReferrerHelper implements InstallReferrerHelperApi, TaskActionListener {
    public static final ClassLoggerApi s0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "InstallReferrerHelper");
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final WeakReference f28243Y;
    public final int Z;
    public final long e0;
    public final long f0;
    public final TaskApi g0;
    public final TaskApi h0;
    public boolean i0 = false;
    public InstallReferrerClient j0 = null;
    public InstallReferrerStatus k0 = InstallReferrerStatus.TimedOut;
    public String l0 = "";
    public long m0 = -1;
    public long n0 = -1;
    public Boolean o0 = null;
    public Long p0 = null;
    public Long q0 = null;
    public String r0 = null;

    class a implements TaskActionListener {
        public a() {
        }

        @Override // com.kochava.core.task.action.internal.TaskActionListener
        public final void b() {
            synchronized (InstallReferrerHelper.this) {
                InstallReferrerHelper.s0.d("Install Referrer timed out, aborting");
                InstallReferrerHelper.this.c();
            }
        }
    }

    class b implements InstallReferrerStateListener {
        public b() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            synchronized (InstallReferrerHelper.this) {
                InstallReferrerHelper.s0.d("Referrer client disconnected");
                InstallReferrerHelper installReferrerHelper = InstallReferrerHelper.this;
                installReferrerHelper.k0 = InstallReferrerStatus.ServiceDisconnected;
                installReferrerHelper.c();
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(int i2) {
            InstallReferrerHelper installReferrerHelper;
            InstallReferrerStatus installReferrerStatus;
            synchronized (InstallReferrerHelper.this) {
                try {
                    InstallReferrerHelper installReferrerHelper2 = InstallReferrerHelper.this;
                    ClassLoggerApi classLoggerApi = InstallReferrerHelper.s0;
                    installReferrerHelper2.getClass();
                    if (i2 == -1) {
                        installReferrerStatus = InstallReferrerStatus.ServiceDisconnected;
                    } else if (i2 == 0) {
                        installReferrerStatus = InstallReferrerStatus.Ok;
                    } else if (i2 == 1) {
                        installReferrerStatus = InstallReferrerStatus.ServiceUnavailable;
                    } else if (i2 != 2) {
                        installReferrerStatus = i2 != 3 ? InstallReferrerStatus.OtherError : InstallReferrerStatus.DeveloperError;
                    } else {
                        installReferrerStatus = InstallReferrerStatus.FeatureNotSupported;
                    }
                    installReferrerHelper2.k0 = installReferrerStatus;
                    InstallReferrerHelper.s0.d("Setup finished with status " + InstallReferrerHelper.this.k0);
                    InstallReferrerHelper installReferrerHelper3 = InstallReferrerHelper.this;
                    if (installReferrerHelper3.k0 == InstallReferrerStatus.Ok) {
                        InstallReferrerHelper.a(installReferrerHelper3);
                    }
                    installReferrerHelper = InstallReferrerHelper.this;
                } catch (Throwable th) {
                    try {
                        InstallReferrerHelper.s0.d("Unable to read the referrer: " + th.getMessage());
                        installReferrerHelper = InstallReferrerHelper.this;
                        installReferrerHelper.k0 = InstallReferrerStatus.MissingDependency;
                    } catch (Throwable th2) {
                        InstallReferrerHelper installReferrerHelper4 = InstallReferrerHelper.this;
                        ClassLoggerApi classLoggerApi2 = InstallReferrerHelper.s0;
                        installReferrerHelper4.c();
                        throw th2;
                    }
                }
                installReferrerHelper.c();
            }
        }
    }

    public InstallReferrerHelper(Context context, TaskManagerApi taskManagerApi, JobInstallReferrer jobInstallReferrer, int i2, long j, long j2) {
        this.X = context;
        this.f28243Y = new WeakReference(jobInstallReferrer);
        this.Z = i2;
        this.e0 = j;
        this.f0 = j2;
        this.g0 = taskManagerApi.a(TaskQueue.UI, new TaskAction(this));
        this.h0 = taskManagerApi.a(TaskQueue.IO, new TaskAction(new a()));
    }

    public static void a(InstallReferrerHelper installReferrerHelper) throws RemoteException {
        ClassLoggerApi classLoggerApi = s0;
        InstallReferrerClient installReferrerClient = installReferrerHelper.j0;
        InstallReferrerStatus installReferrerStatus = InstallReferrerStatus.MissingDependency;
        if (installReferrerClient == null) {
            installReferrerHelper.k0 = installReferrerStatus;
            return;
        }
        ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
        if (installReferrer == null) {
            installReferrerHelper.k0 = installReferrerStatus;
            return;
        }
        installReferrerHelper.k0 = InstallReferrerStatus.Ok;
        installReferrerHelper.l0 = installReferrer.getInstallReferrer();
        installReferrerHelper.m0 = installReferrer.getInstallBeginTimestampSeconds();
        installReferrerHelper.n0 = installReferrer.getReferrerClickTimestampSeconds();
        try {
            installReferrer.getClass().getMethod("getGooglePlayInstantParam", new Class[0]);
            installReferrerHelper.o0 = Boolean.valueOf(installReferrer.getGooglePlayInstantParam());
        } catch (Throwable unused) {
            classLoggerApi.a("Old version of the Google installreferrer library detected, upgrade to version 2.1 or newer for full functionality");
        }
        try {
            installReferrer.getClass().getMethod("getInstallBeginTimestampServerSeconds", new Class[0]);
            installReferrerHelper.p0 = Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds());
            installReferrer.getClass().getMethod("getReferrerClickTimestampServerSeconds", new Class[0]);
            installReferrerHelper.q0 = Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds());
            installReferrer.getClass().getMethod("getInstallVersion", new Class[0]);
            installReferrerHelper.r0 = installReferrer.getInstallVersion();
        } catch (Throwable unused2) {
            classLoggerApi.a("Old version of the Google installreferrer library detected, upgrade to version 2.1 or newer for full functionality");
        }
    }

    @Override // com.kochava.core.task.action.internal.TaskActionListener
    public final synchronized void b() {
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this.X).build();
            this.j0 = installReferrerClientBuild;
            installReferrerClientBuild.startConnection(new b());
        } catch (Throwable th) {
            s0.d("Unable to create referrer client: " + th.getMessage());
            this.k0 = InstallReferrerStatus.MissingDependency;
            c();
        }
    }

    public final void c() {
        Long l2;
        if (this.i0) {
            return;
        }
        this.i0 = true;
        this.g0.cancel();
        this.h0.cancel();
        try {
            InstallReferrerClient installReferrerClient = this.j0;
            if (installReferrerClient != null) {
                installReferrerClient.endConnection();
            }
        } catch (Throwable th) {
            s0.d(androidx.datastore.preferences.protobuf.a.o(th, new StringBuilder("Unable to close the referrer client: ")));
        }
        this.j0 = null;
        double dCurrentTimeMillis = (System.currentTimeMillis() - this.e0) / 1000.0d;
        WeakReference weakReference = this.f28243Y;
        InstallReferrerRetrievedListener installReferrerRetrievedListener = (InstallReferrerRetrievedListener) weakReference.get();
        if (installReferrerRetrievedListener == null) {
            return;
        }
        InstallReferrerStatus installReferrerStatus = this.k0;
        InstallReferrerStatus installReferrerStatus2 = InstallReferrerStatus.Ok;
        if (installReferrerStatus != installReferrerStatus2) {
            installReferrerRetrievedListener.f(new InstallReferrer(this.Z, dCurrentTimeMillis, installReferrerStatus, null, null, null, null, null, null, null));
        } else {
            Boolean bool = this.o0;
            if (bool == null) {
                installReferrerRetrievedListener.f(new InstallReferrer(this.Z, dCurrentTimeMillis, installReferrerStatus2, this.l0, Long.valueOf(this.m0), null, Long.valueOf(this.n0), null, null, null));
            } else {
                Long l3 = this.p0;
                if (l3 == null || (l2 = this.q0) == null || this.r0 == null) {
                    installReferrerRetrievedListener.f(new InstallReferrer(this.Z, dCurrentTimeMillis, installReferrerStatus2, this.l0, Long.valueOf(this.m0), null, Long.valueOf(this.n0), null, bool, null));
                } else {
                    String str = this.l0;
                    long j = this.m0;
                    long j2 = this.n0;
                    l2.getClass();
                    Boolean bool2 = this.o0;
                    bool2.getClass();
                    installReferrerRetrievedListener.f(new InstallReferrer(this.Z, dCurrentTimeMillis, installReferrerStatus2, str, Long.valueOf(j), l3, Long.valueOf(j2), l2, bool2, this.r0));
                }
            }
        }
        weakReference.clear();
    }
}
