package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialResources {
    public static ColorStateList a(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateList;
    }

    public static ColorStateList b(Context context, TintTypedArray tintTypedArray, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = tintTypedArray.f3646b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(context, resourceId)) == null) ? tintTypedArray.a(i2) : colorStateList;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableA;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableA = AppCompatResources.a(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableA;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
