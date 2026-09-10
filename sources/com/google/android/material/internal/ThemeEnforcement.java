package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ThemeEnforcement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f19350a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f19351b = {R.attr.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f19065I, i2, i3);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, "Theme.MaterialComponents", f19351b);
            }
        }
        c(context, "Theme.AppCompat", f19350a);
    }

    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f19065I, i2, i3);
        boolean z2 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            int length = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z2 = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i4], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i4++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z2 = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z2) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void c(Context context, String str, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(a.n("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        a(context, attributeSet, i2, i3);
        b(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }
}
