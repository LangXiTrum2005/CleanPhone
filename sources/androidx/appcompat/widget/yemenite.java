package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: ThemeUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class yemenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f5596attabal = new ThreadLocal<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f5603saneness = {-16842910};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int[] f5600dern = {R.attr.state_focused};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int[] f5605wireman = {R.attr.state_activated};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int[] f5602marial = {R.attr.state_pressed};

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int[] f5597beachfront = {R.attr.state_checked};

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final int[] f5598competently = {R.attr.state_selected};

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final int[] f5601impromptu = {-16842919, -16842908};

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final int[] f5604taiyuan = new int[0];

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final int[] f5599cutely = new int[1];

    public static void attabal(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(beachfront.cutely.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(beachfront.cutely.AppCompatTheme_windowActionBar)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static TypedValue beachfront() {
        ThreadLocal<TypedValue> threadLocal = f5596attabal;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static int dern(Context context, int i) {
        int[] iArr = f5599cutely;
        iArr[0] = i;
        restrictive restrictiveVarAdultoid = restrictive.adultoid(context, null, iArr);
        try {
            return restrictiveVarAdultoid.saneness(0, 0);
        } finally {
            restrictiveVarAdultoid.rotuma();
        }
    }

    public static ColorStateList marial(Context context, int i) {
        int[] iArr = f5599cutely;
        iArr[0] = i;
        restrictive restrictiveVarAdultoid = restrictive.adultoid(context, null, iArr);
        try {
            return restrictiveVarAdultoid.dern(0);
        } finally {
            restrictiveVarAdultoid.rotuma();
        }
    }

    public static int saneness(Context context, int i) {
        ColorStateList colorStateListMarial = marial(context, i);
        if (colorStateListMarial != null && colorStateListMarial.isStateful()) {
            return colorStateListMarial.getColorForState(f5603saneness, colorStateListMarial.getDefaultColor());
        }
        TypedValue typedValueBeachfront = beachfront();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueBeachfront, true);
        return wireman(context, i, typedValueBeachfront.getFloat());
    }

    public static int wireman(Context context, int i, float f) {
        int iDern = dern(context, i);
        return monroe.dern.apical(iDern, Math.round(Color.alpha(iDern) * f));
    }
}
