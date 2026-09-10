package com.google.android.material.materialswitch;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.drawable.DrawableUtils;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int[] k1 = {R.attr.state_with_icon};
    public Drawable X0;
    public Drawable Y0;
    public int Z0;
    public Drawable a1;
    public Drawable b1;
    public ColorStateList c1;
    public ColorStateList d1;
    public PorterDuff.Mode e1;
    public ColorStateList f1;
    public ColorStateList g1;
    public PorterDuff.Mode h1;
    public int[] i1;
    public int[] j1;

    public static void g(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        DrawableCompat.i(drawable, ColorUtils.b(f, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
    }

    public final void e() {
        this.X0 = DrawableUtils.b(this.X0, this.c1, getThumbTintMode());
        this.Y0 = DrawableUtils.b(this.Y0, this.d1, this.e1);
        h();
        Drawable drawable = this.X0;
        Drawable drawable2 = this.Y0;
        int i2 = this.Z0;
        super.setThumbDrawable(DrawableUtils.a(drawable, drawable2, i2, i2));
        refreshDrawableState();
    }

    public final void f() {
        this.a1 = DrawableUtils.b(this.a1, this.f1, getTrackTintMode());
        this.b1 = DrawableUtils.b(this.b1, this.g1, this.h1);
        h();
        Drawable layerDrawable = this.a1;
        if (layerDrawable != null && this.b1 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.a1, this.b1});
        } else if (layerDrawable == null) {
            layerDrawable = this.b1;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.X0;
    }

    public Drawable getThumbIconDrawable() {
        return this.Y0;
    }

    public int getThumbIconSize() {
        return this.Z0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.d1;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.e1;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.c1;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.b1;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.g1;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.h1;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.a1;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f1;
    }

    public final void h() {
        if (this.c1 == null && this.d1 == null && this.f1 == null && this.g1 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.c1;
        if (colorStateList != null) {
            g(this.X0, colorStateList, this.i1, this.j1, thumbPosition);
        }
        ColorStateList colorStateList2 = this.d1;
        if (colorStateList2 != null) {
            g(this.Y0, colorStateList2, this.i1, this.j1, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f1;
        if (colorStateList3 != null) {
            g(this.a1, colorStateList3, this.i1, this.j1, thumbPosition);
        }
        ColorStateList colorStateList4 = this.g1;
        if (colorStateList4 != null) {
            g(this.b1, colorStateList4, this.i1, this.j1, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        h();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.Y0 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, k1);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i3 = 0;
        for (int i4 : iArrOnCreateDrawableState) {
            if (i4 != 16842912) {
                iArr[i3] = i4;
                i3++;
            }
        }
        this.i1 = iArr;
        this.j1 = DrawableUtils.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.X0 = drawable;
        e();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.Y0 = drawable;
        e();
    }

    public void setThumbIconResource(int i2) {
        setThumbIconDrawable(AppCompatResources.a(getContext(), i2));
    }

    public void setThumbIconSize(int i2) {
        if (this.Z0 != i2) {
            this.Z0 = i2;
            e();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.d1 = colorStateList;
        e();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.e1 = mode;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.c1 = colorStateList;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        e();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.b1 = drawable;
        f();
    }

    public void setTrackDecorationResource(int i2) {
        setTrackDecorationDrawable(AppCompatResources.a(getContext(), i2));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.g1 = colorStateList;
        f();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.h1 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.a1 = drawable;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        f();
    }
}
