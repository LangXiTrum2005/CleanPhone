package igbo;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: ActivityRecreator.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Class<?> f28385attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Method f28386beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Handler f28387competently = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Field f28388dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Method f28389marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Field f28390saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Method f28391wireman;

    /* JADX INFO: compiled from: ActivityRecreator.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Object f28392arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ C0643wireman f28393kowloon;

        public attabal(C0643wireman c0643wireman, Object obj) {
            this.f28393kowloon = c0643wireman;
            this.f28392arytenoidectomy = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28393kowloon.f28400kowloon = this.f28392arytenoidectomy;
        }
    }

    /* JADX INFO: compiled from: ActivityRecreator.java */
    public class dern implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Object f28394arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Object f28395kowloon;

        public dern(Object obj, Object obj2) {
            this.f28395kowloon = obj;
            this.f28394arytenoidectomy = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = wireman.f28391wireman;
                if (method != null) {
                    method.invoke(this.f28395kowloon, this.f28394arytenoidectomy, Boolean.FALSE, "AppCompat recreation");
                } else {
                    wireman.f28389marial.invoke(this.f28395kowloon, this.f28394arytenoidectomy, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: ActivityRecreator.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ C0643wireman f28396arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Application f28397kowloon;

        public saneness(Application application, C0643wireman c0643wireman) {
            this.f28397kowloon = application;
            this.f28396arytenoidectomy = c0643wireman;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28397kowloon.unregisterActivityLifecycleCallbacks(this.f28396arytenoidectomy);
        }
    }

    static {
        Class<?> clsAttabal = attabal();
        f28385attabal = clsAttabal;
        f28390saneness = saneness();
        f28388dern = beachfront();
        f28391wireman = wireman(clsAttabal);
        f28389marial = dern(clsAttabal);
        f28386beachfront = marial(clsAttabal);
    }

    public static Class<?> attabal() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field beachfront() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean competently() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static Method dern(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean impromptu(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f28388dern.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f28387competently.postAtFrontOfQueue(new dern(f28390saneness.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static Method marial(Class<?> cls) {
        if (competently() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field saneness() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean taiyuan(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (competently() && f28386beachfront == null) {
            return false;
        }
        if (f28389marial == null && f28391wireman == null) {
            return false;
        }
        try {
            Object obj2 = f28388dern.get(activity);
            if (obj2 == null || (obj = f28390saneness.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0643wireman c0643wireman = new C0643wireman(activity);
            application.registerActivityLifecycleCallbacks(c0643wireman);
            f28387competently.post(new attabal(c0643wireman, obj2));
            try {
                if (competently()) {
                    Method method = f28386beachfront;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f28387competently.post(new saneness(application, c0643wireman));
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Method wireman(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: igbo.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityRecreator.java */
    public static final class C0643wireman implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public Activity f28398arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Object f28400kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final int f28402monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public boolean f28403polloi = false;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public boolean f28401molybdenite = false;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public boolean f28399graveside = false;

        public C0643wireman(Activity activity) {
            this.f28398arytenoidectomy = activity;
            this.f28402monoploid = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f28398arytenoidectomy == activity) {
                this.f28398arytenoidectomy = null;
                this.f28401molybdenite = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f28401molybdenite || this.f28399graveside || this.f28403polloi || !wireman.impromptu(this.f28400kowloon, this.f28402monoploid, activity)) {
                return;
            }
            this.f28399graveside = true;
            this.f28400kowloon = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f28398arytenoidectomy == activity) {
                this.f28403polloi = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
