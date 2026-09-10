package com.kochava.core.activity.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.kochava.core.task.action.internal.TaskAction;
import com.kochava.core.task.action.internal.TaskActionListener;
import com.kochava.core.task.internal.TaskApi;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.task.manager.internal.TaskManagerApi;
import com.kochava.core.util.internal.ObjectUtil;
import com.smartdigimkt.u2.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivityMonitor implements ActivityMonitorApi, Application.ActivityLifecycleCallbacks, ComponentCallbacks2, TaskActionListener {
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final TaskManagerApi f28006Y;
    public final TaskApi Z;
    public volatile boolean f0;
    public final List e0 = androidx.media3.extractor.text.ttml.a.u();
    public WeakReference g0 = null;

    class a implements Runnable {
        public final /* synthetic */ ArrayList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ boolean f28007Y;

        public a(ArrayList arrayList, boolean z2) {
            this.X = arrayList;
            this.f28007Y = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((ActivityMonitorChangedListener) it.next()).d(this.f28007Y);
            }
        }
    }

    class b implements Runnable {
        public final /* synthetic */ ArrayList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Activity f28008Y;

        public b(ArrayList arrayList, Activity activity) {
            this.X = arrayList;
            this.f28008Y = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((ActivityMonitorChangedListener) it.next()).g();
            }
        }
    }

    public ActivityMonitor(Context context, TaskManagerApi taskManagerApi) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        this.f0 = false;
        this.X = context;
        this.f28006Y = taskManagerApi;
        this.Z = taskManagerApi.a(TaskQueue.Worker, new TaskAction(this));
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
            context.registerComponentCallbacks(this);
        }
        try {
            String packageName = context.getPackageName();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && packageName != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null && runningAppProcessInfo.importance == 100) {
                        String[] strArr = runningAppProcessInfo.pkgList;
                        if (strArr != null) {
                            for (String str : strArr) {
                                if (!packageName.equals(str)) {
                                }
                            }
                        }
                    }
                }
                return;
            }
        } catch (Throwable unused) {
        }
        this.f0 = true;
    }

    public final void a(ActivityMonitorChangedListener activityMonitorChangedListener) {
        List list = this.e0;
        list.remove(activityMonitorChangedListener);
        list.add(activityMonitorChangedListener);
    }

    @Override // com.kochava.core.task.action.internal.TaskActionListener
    public final synchronized void b() {
        if (this.f0) {
            this.f0 = false;
            ArrayList arrayListQ = ObjectUtil.q(this.e0);
            if (!arrayListQ.isEmpty()) {
                this.f28006Y.b(new a(arrayListQ, false));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        if (this.g0 == null) {
            this.g0 = new WeakReference(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.g0 == null) {
                this.g0 = new WeakReference(activity);
            }
            this.Z.cancel();
            if (!this.f0) {
                this.f0 = true;
                ArrayList arrayListQ = ObjectUtil.q(this.e0);
                if (!arrayListQ.isEmpty()) {
                    this.f28006Y.b(new a(arrayListQ, true));
                }
            }
            ArrayList arrayListQ2 = ObjectUtil.q(this.e0);
            if (!arrayListQ2.isEmpty()) {
                this.f28006Y.b(new b(arrayListQ2, activity));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        this.g0 = new WeakReference(activity);
        this.Z.cancel();
        if (!this.f0) {
            this.f0 = true;
            ArrayList arrayListQ = ObjectUtil.q(this.e0);
            if (!arrayListQ.isEmpty()) {
                this.f28006Y.b(new a(arrayListQ, true));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        WeakReference weakReference;
        Activity activity2;
        try {
            if (this.f0 && (weakReference = this.g0) != null && (activity2 = (Activity) weakReference.get()) != null && activity2.equals(activity)) {
                this.Z.cancel();
                this.Z.a(m.D0);
            }
            this.g0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i2) {
        if (this.f0 && i2 == 20) {
            this.Z.cancel();
            if (this.f0) {
                this.f0 = false;
                ArrayList arrayListQ = ObjectUtil.q(this.e0);
                if (!arrayListQ.isEmpty()) {
                    this.f28006Y.b(new a(arrayListQ, false));
                }
            }
        }
    }
}
