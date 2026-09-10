package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.applovin.adview.AppLovinFullscreenActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.applovin.impl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f7676a = new WeakReference(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f7677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f7678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f7679d;

        public a(Class cls, b bVar, c cVar) {
            this.f7677b = cls;
            this.f7678c = bVar;
            this.f7679d = cVar;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f7677b.isInstance(activity) && this.f7676a.get() == null) {
                this.f7676a = new WeakReference(activity);
                this.f7678c.a(activity);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f7677b.isInstance(activity) && !activity.isChangingConfigurations() && this.f7676a.get() == activity) {
                this.f7679d.b(this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(Activity activity);
    }

    public static void a(Context context, Class cls, c cVar, b bVar) {
        cVar.a(new a(cls, bVar, cVar));
        a(context, cls);
    }

    public static void b(Activity activity) {
        WindowInsetsController insetsController;
        if (!p0.b() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 5380);
        } else {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.statusBars());
        }
    }

    public static void c(Activity activity) {
        if (!p0.b()) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        WindowInsetsController insetsController = activity.getWindow().getInsetsController();
        if (insetsController == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
        } else {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.systemBars());
        }
    }

    public static boolean d(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || activity.isDestroyed();
    }

    public static void e(Activity activity) {
        WindowInsetsController insetsController;
        if (!p0.b() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() & (-4611));
        } else {
            insetsController.show(WindowInsets.Type.navigationBars());
        }
    }

    public static void f(Activity activity) {
        WindowInsetsController insetsController;
        if (!p0.b() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() & (-5125));
        } else {
            insetsController.show(WindowInsets.Type.statusBars());
        }
    }

    public static void a(Context context, Class cls) {
        Intent intent = new Intent(context, (Class<?>) cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static String b(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        try {
            return appLovinFullscreenActivity.getPackageManager().getActivityInfo(new ComponentName(appLovinFullscreenActivity, appLovinFullscreenActivity.getClass()), 0).taskAffinity;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Activity activity) {
        WindowInsetsController insetsController;
        if (p0.b() && (insetsController = activity.getWindow().getInsetsController()) != null) {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.navigationBars());
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 4866);
        }
    }

    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String a(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        ComponentName componentName;
        if (!p0.g()) {
            return null;
        }
        try {
            List<ActivityManager.AppTask> appTasks = ((ActivityManager) appLovinFullscreenActivity.getSystemService("activity")).getAppTasks();
            if (appTasks != null && !appTasks.isEmpty()) {
                Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                while (it.hasNext()) {
                    ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
                    ComponentName componentName2 = taskInfo.topActivity;
                    String name = appLovinFullscreenActivity.getClass().getName();
                    if (componentName2 != null && componentName2.getClassName().equals(name) && (componentName = taskInfo.baseActivity) != null) {
                        return appLovinFullscreenActivity.getPackageManager().getActivityInfo(componentName, 0).taskAffinity;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
