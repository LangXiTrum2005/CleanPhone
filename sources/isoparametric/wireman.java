package isoparametric;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: AppFrontBackHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static saneness f29010attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Application.ActivityLifecycleCallbacks f29011saneness = new attabal();

    /* JADX INFO: compiled from: AppFrontBackHelper.java */
    public interface saneness {
        void attabal(Activity activity);

        void saneness();
    }

    public static void saneness(Application application, saneness sanenessVar) {
        f29010attabal = sanenessVar;
        application.registerActivityLifecycleCallbacks(f29011saneness);
    }

    /* JADX INFO: compiled from: AppFrontBackHelper.java */
    public class attabal implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f29012kowloon = 0;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i = this.f29012kowloon + 1;
            this.f29012kowloon = i;
            if (i != 1 || wireman.f29010attabal == null) {
                return;
            }
            wireman.f29010attabal.attabal(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i = this.f29012kowloon - 1;
            this.f29012kowloon = i;
            if (i != 0 || wireman.f29010attabal == null) {
                return;
            }
            wireman.f29010attabal.saneness();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
