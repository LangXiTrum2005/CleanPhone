package mullein;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: MaterialAttributes.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {
    public static TypedValue attabal(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int beachfront(Context context, int i, String str) {
        return competently(context, i, str).data;
    }

    public static TypedValue competently(Context context, int i, String str) {
        TypedValue typedValueAttabal = attabal(context, i);
        if (typedValueAttabal != null) {
            return typedValueAttabal;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static int dern(Context context, int i, int i2) {
        TypedValue typedValueAttabal = attabal(context, i);
        return (int) ((typedValueAttabal == null || typedValueAttabal.type != 5) ? context.getResources().getDimension(i2) : typedValueAttabal.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static TypedValue impromptu(View view, int i) {
        return competently(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static int marial(Context context) {
        return dern(context, bubbles.dern.minTouchTargetSize, bubbles.marial.mtrl_min_touch_target_size);
    }

    public static boolean saneness(Context context, int i, boolean z) {
        TypedValue typedValueAttabal = attabal(context, i);
        if (typedValueAttabal == null || typedValueAttabal.type != 18) {
            return z;
        }
        return typedValueAttabal.data != 0;
    }

    public static int wireman(Context context, int i, int i2) {
        TypedValue typedValueAttabal = attabal(context, i);
        return (typedValueAttabal == null || typedValueAttabal.type != 16) ? i2 : typedValueAttabal.data;
    }
}
