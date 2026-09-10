package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.restrictive;

/* JADX INFO: compiled from: ThemeEnforcement.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f20457attabal = {beachfront.attabal.colorPrimary};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f20458saneness = {bubbles.dern.colorPrimaryVariant};

    public static void attabal(Context context) {
        marial(context, f20457attabal, "Theme.AppCompat");
    }

    public static boolean beachfront(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i3, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean competently(Context context) {
        return mullein.saneness.saneness(context, bubbles.dern.isMaterial3Theme, false);
    }

    public static restrictive cutely(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        saneness(context, attributeSet, i, i2);
        wireman(context, attributeSet, iArr, i, i2, iArr2);
        return restrictive.dovishness(context, attributeSet, iArr, i, i2);
    }

    public static void dern(Context context) {
        marial(context, f20458saneness, "Theme.MaterialComponents");
    }

    public static boolean impromptu(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static void marial(Context context, int[] iArr, String str) {
        if (impromptu(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static void saneness(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bubbles.impassible.ThemeEnforcement, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(bubbles.impassible.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(bubbles.dern.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                dern(context);
            }
        }
        attabal(context);
    }

    public static TypedArray taiyuan(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        saneness(context, attributeSet, i, i2);
        wireman(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void wireman(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean zBeachfront;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bubbles.impassible.ThemeEnforcement, i, i2);
        if (!typedArrayObtainStyledAttributes.getBoolean(bubbles.impassible.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zBeachfront = typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            zBeachfront = beachfront(context, attributeSet, iArr, i, i2, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zBeachfront) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }
}
