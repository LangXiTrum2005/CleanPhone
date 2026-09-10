package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class MaterialButtonHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f19143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ShapeAppearanceModel f19144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19145c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19146e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f19148i;
    public ColorStateList j;
    public ColorStateList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f19149l;
    public MaterialShapeDrawable m;
    public boolean q;
    public RippleDrawable s;
    public int t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19150n = false;
    public boolean o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19151p = false;
    public boolean r = true;

    public MaterialButtonHelper(MaterialButton materialButton, ShapeAppearanceModel shapeAppearanceModel) {
        this.f19143a = materialButton;
        this.f19144b = shapeAppearanceModel;
    }

    public final Shapeable a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (Shapeable) this.s.getDrawable(2) : (Shapeable) this.s.getDrawable(1);
    }

    public final MaterialShapeDrawable b(boolean z2) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(ShapeAppearanceModel shapeAppearanceModel) {
        this.f19144b = shapeAppearanceModel;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public final void d(int i2, int i3) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        MaterialButton materialButton = this.f19143a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.f19146e;
        int i5 = this.f;
        this.f = i3;
        this.f19146e = i2;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    public final void e() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f19144b);
        MaterialButton materialButton = this.f19143a;
        materialShapeDrawable.j(materialButton.getContext());
        DrawableCompat.j(materialShapeDrawable, this.j);
        PorterDuff.Mode mode = this.f19148i;
        if (mode != null) {
            DrawableCompat.k(materialShapeDrawable, mode);
        }
        float f = this.f19147h;
        ColorStateList colorStateList = this.k;
        materialShapeDrawable.X.j = f;
        materialShapeDrawable.invalidateSelf();
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.X;
        if (materialShapeDrawableState.d != colorStateList) {
            materialShapeDrawableState.d = colorStateList;
            materialShapeDrawable.onStateChange(materialShapeDrawable.getState());
        }
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f19144b);
        materialShapeDrawable2.setTint(0);
        float f2 = this.f19147h;
        int iB = this.f19150n ? MaterialColors.b(R.attr.colorSurface, materialButton) : 0;
        materialShapeDrawable2.X.j = f2;
        materialShapeDrawable2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB);
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState2 = materialShapeDrawable2.X;
        if (materialShapeDrawableState2.d != colorStateListValueOf) {
            materialShapeDrawableState2.d = colorStateListValueOf;
            materialShapeDrawable2.onStateChange(materialShapeDrawable2.getState());
        }
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f19144b);
        this.m = materialShapeDrawable3;
        DrawableCompat.i(materialShapeDrawable3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.c(this.f19149l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.f19145c, this.f19146e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        MaterialShapeDrawable materialShapeDrawableB = b(false);
        if (materialShapeDrawableB != null) {
            materialShapeDrawableB.k(this.t);
            materialShapeDrawableB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        MaterialShapeDrawable materialShapeDrawableB = b(false);
        MaterialShapeDrawable materialShapeDrawableB2 = b(true);
        if (materialShapeDrawableB != null) {
            float f = this.f19147h;
            ColorStateList colorStateList = this.k;
            materialShapeDrawableB.X.j = f;
            materialShapeDrawableB.invalidateSelf();
            MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawableB.X;
            if (materialShapeDrawableState.d != colorStateList) {
                materialShapeDrawableState.d = colorStateList;
                materialShapeDrawableB.onStateChange(materialShapeDrawableB.getState());
            }
            if (materialShapeDrawableB2 != null) {
                float f2 = this.f19147h;
                int iB = this.f19150n ? MaterialColors.b(R.attr.colorSurface, this.f19143a) : 0;
                materialShapeDrawableB2.X.j = f2;
                materialShapeDrawableB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB);
                MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState2 = materialShapeDrawableB2.X;
                if (materialShapeDrawableState2.d != colorStateListValueOf) {
                    materialShapeDrawableState2.d = colorStateListValueOf;
                    materialShapeDrawableB2.onStateChange(materialShapeDrawableB2.getState());
                }
            }
        }
    }
}
