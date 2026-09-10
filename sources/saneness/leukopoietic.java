package saneness;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class leukopoietic {
    public static String attabal(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    public static boolean dern(View view) {
        Activity activity;
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return activity.isInPictureInPictureMode();
                }
                return false;
            }
        }
        activity = null;
        if (activity != null) {
            return activity.isInPictureInPictureMode();
        }
        return false;
    }

    public static float saneness(View view) {
        return view.getZ();
    }

    public static boolean wireman(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return false;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return true;
    }
}
