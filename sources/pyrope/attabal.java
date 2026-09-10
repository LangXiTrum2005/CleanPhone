package pyrope;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import monroe.dern;
import mullein.saneness;

/* JADX INFO: compiled from: MaterialColors.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {
    public static int apical(View view, int i, int i2, float f) {
        return cutely(wireman(view, i), wireman(view, i2), f);
    }

    public static int attabal(int i, int i2) {
        return dern.apical(i, (Color.alpha(i) * i2) / 255);
    }

    public static Integer beachfront(Context context, int i) {
        TypedValue typedValueAttabal = saneness.attabal(context, i);
        if (typedValueAttabal != null) {
            return Integer.valueOf(formularize(context, typedValueAttabal));
        }
        return null;
    }

    public static ColorStateList competently(Context context, int i) {
        TypedValue typedValueAttabal = saneness.attabal(context, i);
        if (typedValueAttabal == null) {
            return null;
        }
        int i2 = typedValueAttabal.resourceId;
        if (i2 != 0) {
            return picketboat.saneness.getColorStateList(context, i2);
        }
        int i3 = typedValueAttabal.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    public static int cutely(int i, int i2, float f) {
        return taiyuan(i, dern.apical(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int dern(Context context, int i, String str) {
        return formularize(context, saneness.competently(context, i, str));
    }

    public static int formularize(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? picketboat.saneness.getColor(context, i) : typedValue.data;
    }

    public static boolean impromptu(int i) {
        return i != 0 && dern.wireman(i) > 0.5d;
    }

    public static int marial(View view, int i, int i2) {
        return saneness(view.getContext(), i, i2);
    }

    public static int saneness(Context context, int i, int i2) {
        Integer numBeachfront = beachfront(context, i);
        return numBeachfront != null ? numBeachfront.intValue() : i2;
    }

    public static int taiyuan(int i, int i2) {
        return dern.competently(i2, i);
    }

    public static int wireman(View view, int i) {
        return formularize(view.getContext(), saneness.impromptu(view, i));
    }
}
