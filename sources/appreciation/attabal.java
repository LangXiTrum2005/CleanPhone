package appreciation;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import monroe.dern;

/* JADX INFO: compiled from: RippleUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f14331attabal = {R.attr.state_pressed};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f14335saneness = {R.attr.state_focused};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int[] f14333dern = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int[] f14336wireman = {R.attr.state_selected};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int[] f14334marial = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final String f14332beachfront = attabal.class.getSimpleName();

    public static ColorStateList attabal(ColorStateList colorStateList) {
        int[] iArr = f14335saneness;
        return new ColorStateList(new int[][]{f14336wireman, iArr, StateSet.NOTHING}, new int[]{dern(colorStateList, f14333dern), dern(colorStateList, iArr), dern(colorStateList, f14331attabal)});
    }

    public static int dern(ColorStateList colorStateList, int[] iArr) {
        return saneness(colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0);
    }

    public static boolean marial(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public static int saneness(int i) {
        return dern.apical(i, Math.min(Color.alpha(i) * 2, 255));
    }

    public static ColorStateList wireman(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f14334marial, 0));
        }
        return colorStateList;
    }
}
