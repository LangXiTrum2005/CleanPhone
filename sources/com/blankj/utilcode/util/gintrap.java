package com.blankj.utilcode.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.p001lifecycle.Lifecycle;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: UtilsActivityLifecycleImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class gintrap implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final gintrap f17476adultoid = new gintrap();

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final Activity f17477dovishness = new Activity();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final LinkedList<Activity> f17480kowloon = new LinkedList<>();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final List<adultoid.dern> f17478arytenoidectomy = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Map<Activity, List<adultoid.attabal>> f17482monoploid = new ConcurrentHashMap();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f17483polloi = 0;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f17481molybdenite = 0;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f17479graveside = false;

    /* JADX INFO: compiled from: UtilsActivityLifecycleImpl.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ adultoid.attabal f17484arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Activity f17485kowloon;

        public attabal(Activity activity, adultoid.attabal attabalVar) {
            this.f17485kowloon = activity;
            this.f17484arytenoidectomy = attabalVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            gintrap.this.marial(this.f17485kowloon, this.f17484arytenoidectomy);
        }
    }

    /* JADX INFO: compiled from: UtilsActivityLifecycleImpl.java */
    public class dern implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Object f17487arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Activity f17488kowloon;

        public dern(Activity activity, Object obj) {
            this.f17488kowloon = activity;
            this.f17487arytenoidectomy = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Window window = this.f17488kowloon.getWindow();
                if (window != null) {
                    window.setSoftInputMode(((Integer) this.f17487arytenoidectomy).intValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: compiled from: UtilsActivityLifecycleImpl.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ adultoid.attabal f17490arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Activity f17491kowloon;

        public saneness(Activity activity, adultoid.attabal attabalVar) {
            this.f17491kowloon = activity;
            this.f17490arytenoidectomy = attabalVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            gintrap.this.graveside(this.f17491kowloon, this.f17490arytenoidectomy);
        }
    }

    public static void adultoid() {
        if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                if (((Float) declaredField.get(null)).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    declaredField.set(null, Float.valueOf(1.0f));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final Object apical() {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public final void arytenoidectomy(Activity activity, boolean z) {
        if (this.f17478arytenoidectomy.isEmpty()) {
            return;
        }
        for (adultoid.dern dernVar : this.f17478arytenoidectomy) {
            if (z) {
                dernVar.attabal(activity);
            } else {
                dernVar.saneness(activity);
            }
        }
    }

    public final void beachfront(Activity activity, Lifecycle.Event event) {
        competently(activity, event, this.f17482monoploid.get(activity));
        competently(activity, event, this.f17482monoploid.get(f17477dovishness));
    }

    public final void competently(Activity activity, Lifecycle.Event event, List<adultoid.attabal> list) {
        if (list == null) {
            return;
        }
        for (adultoid.attabal attabalVar : list) {
            attabalVar.competently(activity, event);
            if (event.equals(Lifecycle.Event.ON_CREATE)) {
                attabalVar.attabal(activity);
            } else if (event.equals(Lifecycle.Event.ON_START)) {
                attabalVar.marial(activity);
            } else if (event.equals(Lifecycle.Event.ON_RESUME)) {
                attabalVar.wireman(activity);
            } else if (event.equals(Lifecycle.Event.ON_PAUSE)) {
                attabalVar.dern(activity);
            } else if (event.equals(Lifecycle.Event.ON_STOP)) {
                attabalVar.beachfront(activity);
            } else if (event.equals(Lifecycle.Event.ON_DESTROY)) {
                attabalVar.saneness(activity);
            }
        }
        if (event.equals(Lifecycle.Event.ON_DESTROY)) {
            this.f17482monoploid.remove(activity);
        }
    }

    public final Object cutely() {
        Object objApical = apical();
        return objApical != null ? objApical : formularize();
    }

    public void dern(Activity activity, adultoid.attabal attabalVar) {
        if (activity == null || attabalVar == null) {
            return;
        }
        rotuma.cord(new attabal(activity, attabalVar));
    }

    public final void dovishness(Activity activity) {
        if (!this.f17480kowloon.contains(activity)) {
            this.f17480kowloon.addFirst(activity);
        } else {
            if (this.f17480kowloon.getFirst().equals(activity)) {
                return;
            }
            this.f17480kowloon.remove(activity);
            this.f17480kowloon.addFirst(activity);
        }
    }

    public final Object formularize() {
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public void gintrap(Application application) {
        this.f17480kowloon.clear();
        application.unregisterActivityLifecycleCallbacks(this);
    }

    public final void graveside(Activity activity, adultoid.attabal attabalVar) {
        List<adultoid.attabal> list = this.f17482monoploid.get(activity);
        if (list == null || list.isEmpty()) {
            return;
        }
        list.remove(attabalVar);
    }

    public Application impassible() {
        Object objInvoke;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objCutely = cutely();
            if (objCutely == null || (objInvoke = cls.getMethod("getApplication", null).invoke(objCutely, null)) == null) {
                return null;
            }
            return (Application) objInvoke;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final List<Activity> impromptu() {
        LinkedList linkedList = new LinkedList();
        Activity activity = null;
        try {
            Object objCutely = cutely();
            if (objCutely != null) {
                Field declaredField = objCutely.getClass().getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objCutely);
                if (obj instanceof Map) {
                    for (Object obj2 : ((Map) obj).values()) {
                        Class<?> cls = obj2.getClass();
                        Field declaredField2 = cls.getDeclaredField("activity");
                        declaredField2.setAccessible(true);
                        Activity activity2 = (Activity) declaredField2.get(obj2);
                        if (activity == null) {
                            Field declaredField3 = cls.getDeclaredField(X3.i.e0);
                            declaredField3.setAccessible(true);
                            if (declaredField3.getBoolean(obj2)) {
                                linkedList.addFirst(activity2);
                            } else {
                                activity = activity2;
                            }
                        } else {
                            linkedList.addFirst(activity2);
                        }
                    }
                    if (activity != null) {
                        linkedList.addFirst(activity);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return linkedList;
    }

    public boolean kowloon() {
        return !this.f17479graveside;
    }

    public final void marial(Activity activity, adultoid.attabal attabalVar) {
        List<adultoid.attabal> copyOnWriteArrayList = this.f17482monoploid.get(activity);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f17482monoploid.put(activity, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(attabalVar)) {
            return;
        }
        copyOnWriteArrayList.add(attabalVar);
    }

    public void molybdenite(adultoid.attabal attabalVar) {
        polloi(f17477dovishness, attabalVar);
    }

    public final void monoploid(Activity activity, boolean z) {
        try {
            if (z) {
                Window window = activity.getWindow();
                window.getDecorView().setTag(-123, Integer.valueOf(window.getAttributes().softInputMode));
                window.setSoftInputMode(3);
                return;
            }
            Object tag = activity.getWindow().getDecorView().getTag(-123);
            if (tag instanceof Integer) {
                rotuma.cuirassed(new dern(activity, tag), 100L);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f17480kowloon.size() == 0) {
            arytenoidectomy(activity, true);
        }
        formularize.attabal(activity);
        adultoid();
        dovishness(activity);
        beachfront(activity, Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f17480kowloon.remove(activity);
        rotuma.wireman(activity);
        beachfront(activity, Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        beachfront(activity, Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        dovishness(activity);
        if (this.f17479graveside) {
            this.f17479graveside = false;
            arytenoidectomy(activity, true);
        }
        monoploid(activity, false);
        beachfront(activity, Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (!this.f17479graveside) {
            dovishness(activity);
        }
        int i = this.f17481molybdenite;
        if (i < 0) {
            this.f17481molybdenite = i + 1;
        } else {
            this.f17483polloi++;
        }
        beachfront(activity, Lifecycle.Event.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f17481molybdenite--;
        } else {
            int i = this.f17483polloi - 1;
            this.f17483polloi = i;
            if (i <= 0) {
                this.f17479graveside = true;
                arytenoidectomy(activity, false);
            }
        }
        monoploid(activity, true);
        beachfront(activity, Lifecycle.Event.ON_STOP);
    }

    public void polloi(Activity activity, adultoid.attabal attabalVar) {
        if (activity == null || attabalVar == null) {
            return;
        }
        rotuma.cord(new saneness(activity, attabalVar));
    }

    public List<Activity> taiyuan() {
        if (!this.f17480kowloon.isEmpty()) {
            return new LinkedList(this.f17480kowloon);
        }
        this.f17480kowloon.addAll(impromptu());
        return new LinkedList(this.f17480kowloon);
    }

    public void triweekly(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    public void wireman(adultoid.attabal attabalVar) {
        dern(f17477dovishness, attabalVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
