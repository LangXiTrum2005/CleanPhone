package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    public static final int[] v0 = {R.attr.state_checkable};
    public static final int[] w0 = {R.attr.state_checked};
    public final MaterialButtonHelper h0;
    public final LinkedHashSet i0;
    public OnPressedChangeListener j0;
    public PorterDuff.Mode k0;
    public ColorStateList l0;
    public Drawable m0;
    public String n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public boolean s0;
    public boolean t0;
    public int u0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19142a;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f19142a = propertyMapper.mapInt("iconPadding", com.charging.screenshow.battery.animations.themes.R.attr.iconPadding);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            propertyReader.readInt(this.f19142a, ((MaterialButton) obj).getIconPadding());
        }
    }

    public interface OnCheckedChangeListener {
        void a();
    }

    public interface OnPressedChangeListener {
        void a();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean Z;

        /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.Z = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.Z ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(MaterialThemeOverlay.a(context, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.materialButtonStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Button), attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.materialButtonStyle);
        this.i0 = new LinkedHashSet();
        this.s0 = false;
        this.t0 = false;
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.f19073n, com.charging.screenshow.battery.animations.themes.R.attr.materialButtonStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.r0 = typedArrayD.getDimensionPixelSize(12, 0);
        int i2 = typedArrayD.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.k0 = ViewUtils.f(i2, mode);
        this.l0 = MaterialResources.a(getContext(), typedArrayD, 14);
        this.m0 = MaterialResources.c(getContext(), typedArrayD, 10);
        this.u0 = typedArrayD.getInteger(11, 1);
        this.o0 = typedArrayD.getDimensionPixelSize(13, 0);
        MaterialButtonHelper materialButtonHelper = new MaterialButtonHelper(this, ShapeAppearanceModel.c(context2, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.materialButtonStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Button).a());
        this.h0 = materialButtonHelper;
        materialButtonHelper.f19145c = typedArrayD.getDimensionPixelOffset(1, 0);
        materialButtonHelper.d = typedArrayD.getDimensionPixelOffset(2, 0);
        materialButtonHelper.f19146e = typedArrayD.getDimensionPixelOffset(3, 0);
        materialButtonHelper.f = typedArrayD.getDimensionPixelOffset(4, 0);
        if (typedArrayD.hasValue(8)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(8, -1);
            materialButtonHelper.g = dimensionPixelSize;
            ShapeAppearanceModel.Builder builderF = materialButtonHelper.f19144b.f();
            builderF.c(dimensionPixelSize);
            materialButtonHelper.c(builderF.a());
            materialButtonHelper.f19151p = true;
        }
        materialButtonHelper.f19147h = typedArrayD.getDimensionPixelSize(20, 0);
        materialButtonHelper.f19148i = ViewUtils.f(typedArrayD.getInt(7, -1), mode);
        materialButtonHelper.j = MaterialResources.a(getContext(), typedArrayD, 6);
        materialButtonHelper.k = MaterialResources.a(getContext(), typedArrayD, 19);
        materialButtonHelper.f19149l = MaterialResources.a(getContext(), typedArrayD, 16);
        materialButtonHelper.q = typedArrayD.getBoolean(5, false);
        materialButtonHelper.t = typedArrayD.getDimensionPixelSize(9, 0);
        materialButtonHelper.r = typedArrayD.getBoolean(21, true);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            materialButtonHelper.o = true;
            setSupportBackgroundTintList(materialButtonHelper.j);
            setSupportBackgroundTintMode(materialButtonHelper.f19148i);
        } else {
            materialButtonHelper.e();
        }
        setPaddingRelative(paddingStart + materialButtonHelper.f19145c, paddingTop + materialButtonHelper.f19146e, paddingEnd + materialButtonHelper.d, paddingBottom + materialButtonHelper.f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.r0);
        c(this.m0 != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        MaterialButtonHelper materialButtonHelper = this.h0;
        return (materialButtonHelper == null || materialButtonHelper.o) ? false : true;
    }

    public final void b() {
        int i2 = this.u0;
        boolean z2 = true;
        if (i2 != 1 && i2 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.m0, null, null, null);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            setCompoundDrawablesRelative(null, null, this.m0, null);
        } else if (i2 == 16 || i2 == 32) {
            setCompoundDrawablesRelative(null, this.m0, null, null);
        }
    }

    public final void c(boolean z2) {
        Drawable drawable = this.m0;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.m0 = drawableMutate;
            DrawableCompat.j(drawableMutate, this.l0);
            PorterDuff.Mode mode = this.k0;
            if (mode != null) {
                DrawableCompat.k(this.m0, mode);
            }
            int intrinsicWidth = this.o0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.m0.getIntrinsicWidth();
            }
            int intrinsicHeight = this.o0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.m0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.m0;
            int i2 = this.p0;
            int i3 = this.q0;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.m0.setVisible(true, z2);
        }
        if (z2) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i4 = this.u0;
        if (((i4 == 1 || i4 == 2) && drawable3 != this.m0) || (((i4 == 3 || i4 == 4) && drawable5 != this.m0) || ((i4 == 16 || i4 == 32) && drawable4 != this.m0))) {
            b();
        }
    }

    public final void d(int i2, int i3) {
        if (this.m0 == null || getLayout() == null) {
            return;
        }
        int i4 = this.u0;
        if (!(i4 == 1 || i4 == 2) && i4 != 3 && i4 != 4) {
            if (i4 == 16 || i4 == 32) {
                this.p0 = 0;
                if (i4 == 16) {
                    this.q0 = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.o0;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.m0.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.r0) - getPaddingBottom()) / 2);
                if (this.q0 != iMax) {
                    this.q0 = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.q0 = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.u0;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.p0 = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.o0;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.m0.getIntrinsicWidth();
        }
        int textLayoutWidth = i2 - getTextLayoutWidth();
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.r0) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.u0 == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.p0 != paddingEnd) {
            this.p0 = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.n0)) {
            return this.n0;
        }
        MaterialButtonHelper materialButtonHelper = this.h0;
        return ((materialButtonHelper == null || !materialButtonHelper.q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.h0.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.m0;
    }

    public int getIconGravity() {
        return this.u0;
    }

    public int getIconPadding() {
        return this.r0;
    }

    public int getIconSize() {
        return this.o0;
    }

    public ColorStateList getIconTint() {
        return this.l0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.k0;
    }

    public int getInsetBottom() {
        return this.h0.f;
    }

    public int getInsetTop() {
        return this.h0.f19146e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.h0.f19149l;
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (a()) {
            return this.h0.f19144b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.h0.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.h0.f19147h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.h0.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.h0.f19148i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.s0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            MaterialShapeUtils.c(this, this.h0.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        MaterialButtonHelper materialButtonHelper = this.h0;
        if (materialButtonHelper != null && materialButtonHelper.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, v0);
        }
        if (this.s0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, w0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.s0);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        MaterialButtonHelper materialButtonHelper = this.h0;
        accessibilityNodeInfo.setCheckable(materialButtonHelper != null && materialButtonHelper.q);
        accessibilityNodeInfo.setChecked(this.s0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        setChecked(savedState.Z);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Z = this.s0;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.h0.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.m0 != null) {
            if (this.m0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.n0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (!a()) {
            super.setBackgroundColor(i2);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.h0;
        if (materialButtonHelper.b(false) != null) {
            materialButtonHelper.b(false).setTint(i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        MaterialButtonHelper materialButtonHelper = this.h0;
        materialButtonHelper.o = true;
        ColorStateList colorStateList = materialButtonHelper.j;
        MaterialButton materialButton = materialButtonHelper.f19143a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(materialButtonHelper.f19148i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? AppCompatResources.a(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (a()) {
            this.h0.q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        MaterialButtonHelper materialButtonHelper = this.h0;
        if (materialButtonHelper == null || !materialButtonHelper.q || !isEnabled() || this.s0 == z2) {
            return;
        }
        this.s0 = z2;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z3 = this.s0;
            if (!materialButtonToggleGroup.j0) {
                materialButtonToggleGroup.b(getId(), z3);
            }
        }
        if (this.t0) {
            return;
        }
        this.t0 = true;
        Iterator it = this.i0.iterator();
        while (it.hasNext()) {
            ((OnCheckedChangeListener) it.next()).a();
        }
        this.t0 = false;
    }

    public void setCornerRadius(int i2) {
        if (a()) {
            MaterialButtonHelper materialButtonHelper = this.h0;
            if (materialButtonHelper.f19151p && materialButtonHelper.g == i2) {
                return;
            }
            materialButtonHelper.g = i2;
            materialButtonHelper.f19151p = true;
            ShapeAppearanceModel.Builder builderF = materialButtonHelper.f19144b.f();
            builderF.c(i2);
            materialButtonHelper.c(builderF.a());
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.h0.b(false).k(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.m0 != drawable) {
            this.m0 = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.u0 != i2) {
            this.u0 = i2;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.r0 != i2) {
            this.r0 = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? AppCompatResources.a(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.o0 != i2) {
            this.o0 = i2;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.l0 != colorStateList) {
            this.l0 = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.k0 != mode) {
            this.k0 = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(ContextCompat.getColorStateList(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        MaterialButtonHelper materialButtonHelper = this.h0;
        materialButtonHelper.d(materialButtonHelper.f19146e, i2);
    }

    public void setInsetTop(int i2) {
        MaterialButtonHelper materialButtonHelper = this.h0;
        materialButtonHelper.d(i2, materialButtonHelper.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(OnPressedChangeListener onPressedChangeListener) {
        this.j0 = onPressedChangeListener;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        OnPressedChangeListener onPressedChangeListener = this.j0;
        if (onPressedChangeListener != null) {
            onPressedChangeListener.a();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            MaterialButtonHelper materialButtonHelper = this.h0;
            if (materialButtonHelper.f19149l != colorStateList) {
                materialButtonHelper.f19149l = colorStateList;
                MaterialButton materialButton = materialButtonHelper.f19143a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(RippleUtils.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (a()) {
            setRippleColor(ContextCompat.getColorStateList(getContext(), i2));
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.h0.c(shapeAppearanceModel);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (a()) {
            MaterialButtonHelper materialButtonHelper = this.h0;
            materialButtonHelper.f19150n = z2;
            materialButtonHelper.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            MaterialButtonHelper materialButtonHelper = this.h0;
            if (materialButtonHelper.k != colorStateList) {
                materialButtonHelper.k = colorStateList;
                materialButtonHelper.f();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (a()) {
            setStrokeColor(ContextCompat.getColorStateList(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (a()) {
            MaterialButtonHelper materialButtonHelper = this.h0;
            if (materialButtonHelper.f19147h != i2) {
                materialButtonHelper.f19147h = i2;
                materialButtonHelper.f();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.h0;
        if (materialButtonHelper.j != colorStateList) {
            materialButtonHelper.j = colorStateList;
            if (materialButtonHelper.b(false) != null) {
                DrawableCompat.j(materialButtonHelper.b(false), materialButtonHelper.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.h0;
        if (materialButtonHelper.f19148i != mode) {
            materialButtonHelper.f19148i = mode;
            if (materialButtonHelper.b(false) == null || materialButtonHelper.f19148i == null) {
                return;
            }
            DrawableCompat.k(materialButtonHelper.b(false), materialButtonHelper.f19148i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.h0.r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.s0);
    }
}
