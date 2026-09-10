package com.kochava.tracker;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.process.Process;
import com.kochava.core.profile.internal.ProfileLoadedListener;
import com.kochava.core.task.manager.internal.TaskManager;
import com.kochava.core.util.internal.AppUtil;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.attribution.RetrievedInstallAttributionListener;
import com.kochava.tracker.attribution.internal.JobRetrieveInstallAttribution;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.controller.internal.MutableState;
import com.kochava.tracker.controller.internal.SdkVersion;
import com.kochava.tracker.log.LogLevel;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class Tracker implements TrackerApi {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ClassLoggerApi f28090i = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, BuildConfig.SDK_MODULE_NAME);
    public static final Object j = new Object();
    public static Tracker k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkVersion f28091a = new SdkVersion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskManager f28092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState f28093c;
    public final ArrayBlockingQueue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayBlockingQueue f28094e;
    public final ArrayBlockingQueue f;
    public Boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Controller f28095h;

    class a implements ProfileLoadedListener {
    }

    class b implements Runnable {
        public final /* synthetic */ Controller X;

        public b(Controller controller) {
            this.X = controller;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x004e  */
        @Override // java.lang.Runnable
        public final void run() {
            Tracker tracker;
            Controller controller;
            byte b2;
            while (true) {
                tracker = Tracker.this;
                Bundle bundle = (Bundle) tracker.f.poll();
                controller = this.X;
                if (bundle == null) {
                    break;
                }
                try {
                    String string = bundle.getString("method", "");
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1145074941) {
                        if (iHashCode != -1053259179) {
                            if (iHashCode == -97843184 && string.equals("setPushNotificationsWatchedValuesOverride")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (string.equals("setActiveStateOverride")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (string.equals("setInstallWatchedValuesOverride")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        boolean z2 = bundle.getBoolean("activeState", false);
                        synchronized (controller) {
                            controller.f28107e.d(z2);
                            controller.d(z2);
                        }
                    } else if (b2 == 1) {
                        JsonObject jsonObjectX = JsonObject.x(bundle.getString("installWatchedValues", ""), true);
                        synchronized (controller) {
                            JsonObject jsonObjectC = controller.d.l().k().c();
                            jsonObjectC.b(jsonObjectX);
                            controller.d.l().y(jsonObjectC);
                        }
                    } else if (b2 == 2) {
                        JsonObject jsonObjectX2 = JsonObject.x(bundle.getString("pushNotificationsWatchedValues", ""), true);
                        synchronized (controller) {
                            JsonObject jsonObjectC2 = controller.d.h().c().c();
                            jsonObjectC2.b(jsonObjectX2);
                            controller.d.h().e(jsonObjectC2);
                        }
                    }
                } catch (Throwable th) {
                    ClassLoggerApi classLoggerApi = Tracker.f28090i;
                    classLoggerApi.c("action failed, unknown error occurred");
                    classLoggerApi.c(th);
                }
            }
            while (((c) tracker.f28094e.poll()) != null) {
                try {
                    synchronized (controller) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    ClassLoggerApi classLoggerApi2 = Tracker.f28090i;
                    classLoggerApi2.c("processDeeplink failed, unknown error occurred");
                    classLoggerApi2.c(th2);
                }
            }
            while (true) {
                RetrievedInstallAttributionListener retrievedInstallAttributionListener = (RetrievedInstallAttributionListener) tracker.d.poll();
                if (retrievedInstallAttributionListener == null) {
                    return;
                }
                try {
                    synchronized (controller) {
                        try {
                            controller.q.offer(new JobRetrieveInstallAttribution(controller, controller.d, controller.x, controller.f28105b, controller.f28107e, retrievedInstallAttributionListener));
                            controller.m(controller.q);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    ClassLoggerApi classLoggerApi3 = Tracker.f28090i;
                    classLoggerApi3.c("retrieveAttribution failed, unknown error occurred");
                    classLoggerApi3.c(th4);
                }
            }
        }
    }

    public static class c {
    }

    public Tracker() {
        if (com.kochava.tracker.task.internal.TaskManager.f28327b == null) {
            synchronized (com.kochava.tracker.task.internal.TaskManager.f28326a) {
                if (com.kochava.tracker.task.internal.TaskManager.f28327b == null) {
                    com.kochava.tracker.task.internal.TaskManager.f28327b = new TaskManager();
                }
            }
        }
        TaskManager taskManager = com.kochava.tracker.task.internal.TaskManager.f28327b;
        this.f28092b = taskManager;
        this.f28093c = new MutableState(taskManager);
        this.d = new ArrayBlockingQueue(100);
        this.f28094e = new ArrayBlockingQueue(100);
        this.f = new ArrayBlockingQueue(100);
        this.g = null;
        this.f28095h = null;
    }

    public final void a(Context context) {
        boolean z2;
        String strA;
        LogLevel logLevel;
        if (context == null || context.getApplicationContext() == null) {
            f28090i.b("start failed, invalid context");
            return;
        }
        if (Process.f28052b == null) {
            synchronized (Process.f28051a) {
                try {
                    if (Process.f28052b == null) {
                        Process.f28052b = new Process();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Process process = Process.f28052b;
        Context applicationContext = context.getApplicationContext();
        synchronized (process) {
            String packageName = applicationContext.getPackageName();
            String strA2 = AppUtil.a(applicationContext);
            z2 = strA2.equals(packageName) || strA2.equals(null);
        }
        if (!z2) {
            f28090i.c("start failed, not running in the primary process");
            return;
        }
        if (this.f28095h != null) {
            f28090i.c("start failed, already started");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SystemClock.elapsedRealtime();
        Context applicationContext2 = context.getApplicationContext();
        synchronized (this.f28091a) {
        }
        synchronized (this.f28091a) {
            strA = TimeUtil.a(new Date(BuildConfig.SDK_BUILD_TIME_MILLIS));
        }
        if (this.g == null) {
            this.g = Boolean.valueOf(AppUtil.b(applicationContext2));
        }
        InstanceState instanceState = new InstanceState(jCurrentTimeMillis, applicationContext2, this.f28092b, UUID.randomUUID().toString().substring(0, 5), this.g.booleanValue(), this.g.booleanValue() ? "android-instantapp" : "android", this.f28093c, this.f28091a.a());
        ClassLoggerApi classLoggerApi = f28090i;
        com.kochava.tracker.log.internal.Logger.c(classLoggerApi, "Started SDK AndroidTracker 4.3.0 published " + strA);
        StringBuilder sb = new StringBuilder("The log level is set to ");
        int i2 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).f28027b;
        if (i2 == 2) {
            logLevel = LogLevel.g0;
        } else if (i2 == 3) {
            logLevel = LogLevel.f0;
        } else if (i2 == 5) {
            logLevel = LogLevel.Z;
        } else if (i2 != 6) {
            logLevel = i2 != 7 ? LogLevel.e0 : LogLevel.X;
        } else {
            logLevel = LogLevel.f28246Y;
        }
        sb.append(logLevel);
        com.kochava.tracker.log.internal.Logger.c(classLoggerApi, sb.toString());
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "The kochava app GUID provided was kom21-ani4k-anime-wallpaper-hd-2zca3");
        classLoggerApi.d(BuildConfig.SDK_VERSION_DECLARATION);
        try {
            Controller controller = new Controller(instanceState);
            this.f28095h = controller;
            controller.u();
        } catch (Throwable th2) {
            ClassLoggerApi classLoggerApi2 = f28090i;
            classLoggerApi2.b("start failed, unknown error occurred");
            classLoggerApi2.b(th2);
        }
        Controller controller2 = this.f28095h;
        if (controller2 == null) {
            f28090i.d("Cannot flush queue, SDK not started");
        } else {
            controller2.x.f28117c.b(new b(controller2));
        }
    }
}
