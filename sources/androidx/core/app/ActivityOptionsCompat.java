package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ActivityOptionsCompat {

    public static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActivityOptions f4165a;

        public ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.f4165a = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public final Bundle b() {
            return this.f4165a.toBundle();
        }
    }

    public static class Api21Impl {
        public static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        public static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        public static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    public static class Api23Impl {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        public static ActivityOptions b(View view, int i2, int i3, int i4, int i5) {
            return ActivityOptions.makeClipRevealAnimation(view, i2, i3, i4, i5);
        }

        public static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    public static class Api24Impl {
        public static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        public static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    public static class Api34Impl {
        public static ActivityOptions a(ActivityOptions activityOptions, boolean z2) {
            return activityOptions.setShareIdentityEnabled(z2);
        }
    }

    public static ActivityOptionsCompat a(Activity activity, int i2, int i3) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(activity, i2, i3));
    }

    public Bundle b() {
        return null;
    }
}
