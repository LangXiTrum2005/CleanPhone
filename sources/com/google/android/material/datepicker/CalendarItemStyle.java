package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class CalendarItemStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f19234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f19235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f19236c;
    public final ColorStateList d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19237e;
    public final ShapeAppearanceModel f;

    public CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        Preconditions.c(rect.left);
        Preconditions.c(rect.top);
        Preconditions.c(rect.right);
        Preconditions.c(rect.bottom);
        this.f19234a = rect;
        this.f19235b = colorStateList2;
        this.f19236c = colorStateList;
        this.d = colorStateList3;
        this.f19237e = i2;
        this.f = shapeAppearanceModel;
    }

    public static CalendarItemStyle a(Context context, int i2) {
        Preconditions.a("Cannot create a CalendarItemStyle with a styleResId of 0", i2 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, R.styleable.q);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListA = MaterialResources.a(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListA2 = MaterialResources.a(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListA3 = MaterialResources.a(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        ShapeAppearanceModel shapeAppearanceModelA = ShapeAppearanceModel.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new CalendarItemStyle(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, shapeAppearanceModelA, rect);
    }

    public final void b(TextView textView) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        ShapeAppearanceModel shapeAppearanceModel = this.f;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable.l(this.f19236c);
        materialShapeDrawable.X.j = this.f19237e;
        materialShapeDrawable.invalidateSelf();
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.X;
        ColorStateList colorStateList = materialShapeDrawableState.d;
        ColorStateList colorStateList2 = this.d;
        if (colorStateList != colorStateList2) {
            materialShapeDrawableState.d = colorStateList2;
            materialShapeDrawable.onStateChange(materialShapeDrawable.getState());
        }
        ColorStateList colorStateList3 = this.f19235b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f19234a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        textView.setBackground(insetDrawable);
    }
}
