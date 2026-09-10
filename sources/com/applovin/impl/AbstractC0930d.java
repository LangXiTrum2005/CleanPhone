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

/* JADX INFO: renamed from: com.applovin.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0930d {

    /* JADX INFO: renamed from: com.applovin.impl.d$a */
    public class a extends AbstractC0926b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f10661a = new WeakReference(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f10662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f10663c;
        final /* synthetic */ C0928c d;

        public a(Class cls, b bVar, C0928c c0928c) {
            this.f10662b = cls;
            this.f10663c = bVar;
            this.d = c0928c;
        }

        @Override // com.applovin.impl.AbstractC0926b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f10662b.isInstance(activity) && this.f10661a.get() == null) {
                this.f10661a = new WeakReference(activity);
                this.f10663c.a(activity);
            }
        }

        @Override // com.applovin.impl.AbstractC0926b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f10662b.isInstance(activity) && !activity.isChangingConfigurations() && this.f10661a.get() == activity) {
                this.d.b(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.d$b */
    public interface b {
        void a(Activity activity);
    }

    public static void a(Context context, Class cls, C0928c c0928c, b bVar) {
        c0928c.a(new a(cls, bVar, c0928c));
        a(context, cls);
    }

    public static void b(Activity activity) {
        WindowInsetsController insetsController;
        if (!AbstractC0953o0.b() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.statusBars());
        }
    }

    public static void c(Activity activity) {
        if (!AbstractC0953o0.b()) {
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
        if (AbstractC0953o0.b() && (insetsController = activity.getWindow().getInsetsController()) != null) {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.navigationBars());
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(4866);
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
        if (!AbstractC0953o0.i()) {
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
                return null;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
