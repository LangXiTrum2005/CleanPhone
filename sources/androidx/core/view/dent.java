package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: VelocityTrackerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class dent {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static Map<VelocityTracker, permissivist> f9298attabal = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: compiled from: VelocityTrackerCompat.java */
    public static class attabal {
        public static float attabal(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }
    }

    public static void attabal(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f9298attabal.containsKey(velocityTracker)) {
                f9298attabal.put(velocityTracker, new permissivist());
            }
            f9298attabal.get(velocityTracker).attabal(motionEvent);
        }
    }

    public static void dern(VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        permissivist permissivistVarMarial = marial(velocityTracker);
        if (permissivistVarMarial != null) {
            permissivistVarMarial.dern(i, f);
        }
    }

    public static permissivist marial(VelocityTracker velocityTracker) {
        return f9298attabal.get(velocityTracker);
    }

    public static void saneness(VelocityTracker velocityTracker, int i) {
        dern(velocityTracker, i, Float.MAX_VALUE);
    }

    public static float wireman(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return attabal.attabal(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        permissivist permissivistVarMarial = marial(velocityTracker);
        return permissivistVarMarial != null ? permissivistVarMarial.wireman(i) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
