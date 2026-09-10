package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import androidx.p001lifecycle.Lifecycle;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class adultoid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static Application f17473attabal;

    /* JADX INFO: compiled from: Utils.java */
    public interface dern {
        void attabal(Activity activity);

        void saneness(Activity activity);
    }

    /* JADX INFO: compiled from: Utils.java */
    public interface saneness<T> {
        void accept(T t);
    }

    public static Application attabal() {
        Application application = f17473attabal;
        if (application != null) {
            return application;
        }
        saneness(rotuma.impromptu());
        if (f17473attabal == null) {
            throw new NullPointerException("reflect failed.");
        }
        rotuma.taiyuan();
        return f17473attabal;
    }

    public static void saneness(Application application) {
        if (application == null) {
            return;
        }
        Application application2 = f17473attabal;
        if (application2 == null) {
            f17473attabal = application;
            rotuma.kowloon(application);
            rotuma.gintrap();
        } else {
            if (application2.equals(application)) {
                return;
            }
            rotuma.stratoscope(f17473attabal);
            f17473attabal = application;
            rotuma.kowloon(application);
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public static class attabal {
        public void attabal(Activity activity) {
        }

        public void beachfront(Activity activity) {
        }

        public void dern(Activity activity) {
        }

        public void marial(Activity activity) {
        }

        public void saneness(Activity activity) {
        }

        public void wireman(Activity activity) {
        }

        public void competently(Activity activity, Lifecycle.Event event) {
        }
    }
}
