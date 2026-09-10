package gown;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import molet.impassible;

/* JADX INFO: compiled from: MotionUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class apical {
    public static float attabal(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static int beachfront(Context context, int i, int i2) {
        return mullein.saneness.wireman(context, i, i2);
    }

    public static TimeInterpolator competently(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return wireman(strValueOf) ? dern(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    public static TimeInterpolator dern(String str) {
        if (!marial(str, "cubic-bezier")) {
            if (marial(str, "path")) {
                return new PathInterpolator(monroe.beachfront.marial(saneness(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = saneness(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(attabal(strArrSplit, 0), attabal(strArrSplit, 1), attabal(strArrSplit, 2), attabal(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static impassible impromptu(Context context, int i, int i2) {
        TypedValue typedValueAttabal = mullein.saneness.attabal(context, i);
        TypedArray typedArrayObtainStyledAttributes = typedValueAttabal == null ? context.obtainStyledAttributes(null, bubbles.impassible.MaterialSpring, 0, i2) : context.obtainStyledAttributes(typedValueAttabal.resourceId, bubbles.impassible.MaterialSpring);
        impassible impassibleVar = new impassible();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(bubbles.impassible.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(bubbles.impassible.MaterialSpring_damping, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            impassibleVar.impromptu(f);
            impassibleVar.beachfront(f2);
            typedArrayObtainStyledAttributes.recycle();
            return impassibleVar;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean marial(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static String saneness(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static boolean wireman(String str) {
        return marial(str, "cubic-bezier") || marial(str, "path");
    }
}
