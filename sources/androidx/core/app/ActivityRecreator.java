package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ActivityRecreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f4166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f4167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f4168c;
    public static final Method d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f4169e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    public static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {
        public Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Activity f4173Y;
        public final int Z;
        public boolean e0 = false;
        public boolean f0 = false;
        public boolean g0 = false;

        public LifecycleCheckCallbacks(Activity activity) {
            this.f4173Y = activity;
            this.Z = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f4173Y == activity) {
                this.f4173Y = null;
                this.f0 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f0 || this.g0 || this.e0) {
                return;
            }
            Object obj = this.X;
            try {
                final Object obj2 = ActivityRecreator.f4168c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.Z) {
                    final Object obj3 = ActivityRecreator.f4167b.get(activity);
                    ActivityRecreator.g.postAtFrontOfQueue(new Runnable() { // from class: androidx.core.app.ActivityRecreator.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                Method method = ActivityRecreator.d;
                                Object obj4 = obj2;
                                Object obj5 = obj3;
                                if (method != null) {
                                    method.invoke(obj5, obj4, Boolean.FALSE, "AppCompat recreation");
                                } else {
                                    ActivityRecreator.f4169e.invoke(obj5, obj4, Boolean.FALSE);
                                }
                            } catch (RuntimeException e2) {
                                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                                    throw e2;
                                }
                            } catch (Throwable th) {
                                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                            }
                        }
                    });
                    this.g0 = true;
                    this.X = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f4173Y == activity) {
                this.e0 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f4166a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f4167b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f4168c = declaredField2;
        Class cls2 = f4166a;
        Class cls3 = Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        d = declaredMethod;
        Class cls4 = f4166a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f4169e = declaredMethod2;
        Class cls5 = f4166a;
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 == 26 || i2 == 27) && cls5 != null) {
            try {
                Class cls6 = Integer.TYPE;
                Class cls7 = Boolean.TYPE;
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls6, cls7, Configuration.class, Configuration.class, cls7, cls7);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f = method;
    }
}
