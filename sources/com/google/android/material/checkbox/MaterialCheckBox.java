package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.smartdigimkt.v0.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int[] C0 = {R.attr.state_indeterminate};
    public static final int[] D0 = {R.attr.state_error};
    public static final int[][] E0 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int F0 = Resources.getSystem().getIdentifier("btn_check_material_anim", k.d, "android");
    public final AnimatedVectorDrawableCompat A0;
    public final Animatable2Compat.AnimationCallback B0;
    public final LinkedHashSet i0;
    public final LinkedHashSet j0;
    public ColorStateList k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public CharSequence o0;
    public Drawable p0;
    public Drawable q0;
    public boolean r0;
    public ColorStateList s0;
    public ColorStateList t0;
    public PorterDuff.Mode u0;
    public int v0;
    public int[] w0;
    public boolean x0;
    public CharSequence y0;
    public CompoundButton.OnCheckedChangeListener z0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void a();
    }

    public interface OnErrorChangedListener {
        void a();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int X;

        /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.X = ((Integer) parcel.readValue(SavedState.class.getClassLoader())).intValue();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i2 = this.X;
            if (i2 != 1) {
                str = i2 != 2 ? "unchecked" : "indeterminate";
            } else {
                str = "checked";
            }
            return a.r(sb, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Integer.valueOf(this.X));
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(MaterialThemeOverlay.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.i0 = new LinkedHashSet();
        this.j0 = new LinkedHashSet();
        this.A0 = AnimatedVectorDrawableCompat.a(getContext());
        this.B0 = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public final void a(Drawable drawable) {
                ColorStateList colorStateList = MaterialCheckBox.this.s0;
                if (colorStateList != null) {
                    DrawableCompat.j(drawable, colorStateList);
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public final void b(Drawable drawable) {
                MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                ColorStateList colorStateList = materialCheckBox.s0;
                if (colorStateList != null) {
                    DrawableCompat.i(drawable, colorStateList.getColorForState(materialCheckBox.w0, colorStateList.getDefaultColor()));
                }
            }
        };
        Context context2 = getContext();
        this.p0 = CompoundButtonCompat.a(this);
        this.s0 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = com.google.android.material.R.styleable.s;
        ThemeEnforcement.a(context2, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        ThemeEnforcement.b(context2, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        TintTypedArray tintTypedArray = new TintTypedArray(context2, typedArrayObtainStyledAttributes);
        this.q0 = tintTypedArray.b(2);
        if (this.p0 != null && MaterialAttributes.b(context2, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == F0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p0 = AppCompatResources.a(context2, R.drawable.mtrl_checkbox_button);
                this.r0 = true;
                if (this.q0 == null) {
                    this.q0 = AppCompatResources.a(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.t0 = MaterialResources.b(context2, tintTypedArray, 3);
        this.u0 = ViewUtils.f(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.l0 = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.m0 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.n0 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.o0 = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        tintTypedArray.f();
        b();
    }

    private String getButtonStateDescription() {
        int i2 = this.v0;
        if (i2 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.k0 == null) {
            int iB = MaterialColors.b(R.attr.colorControlActivated, this);
            int iB2 = MaterialColors.b(R.attr.colorError, this);
            int iB3 = MaterialColors.b(R.attr.colorSurface, this);
            int iB4 = MaterialColors.b(R.attr.colorOnSurface, this);
            this.k0 = new ColorStateList(E0, new int[]{MaterialColors.e(1.0f, iB3, iB2), MaterialColors.e(1.0f, iB3, iB), MaterialColors.e(0.54f, iB3, iB4), MaterialColors.e(0.38f, iB3, iB4), MaterialColors.e(0.38f, iB3, iB4)});
        }
        return this.k0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.s0;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        this.p0 = DrawableUtils.b(this.p0, this.s0, CompoundButtonCompat.c(this));
        this.q0 = DrawableUtils.b(this.q0, this.t0, this.u0);
        if (this.r0) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.A0;
            if (animatedVectorDrawableCompat != null) {
                Animatable2Compat.AnimationCallback animationCallback = this.B0;
                animatedVectorDrawableCompat.c(animationCallback);
                animatedVectorDrawableCompat.b(animationCallback);
            }
            Drawable drawable = this.p0;
            if ((drawable instanceof AnimatedStateListDrawable) && animatedVectorDrawableCompat != null) {
                ((AnimatedStateListDrawable) drawable).addTransition(R.id.checked, R.id.unchecked, animatedVectorDrawableCompat, false);
                ((AnimatedStateListDrawable) this.p0).addTransition(R.id.indeterminate, R.id.unchecked, animatedVectorDrawableCompat, false);
            }
        }
        Drawable drawable2 = this.p0;
        if (drawable2 != null && (colorStateList2 = this.s0) != null) {
            DrawableCompat.j(drawable2, colorStateList2);
        }
        Drawable drawable3 = this.q0;
        if (drawable3 != null && (colorStateList = this.t0) != null) {
            DrawableCompat.j(drawable3, colorStateList);
        }
        super.setButtonDrawable(DrawableUtils.a(this.p0, this.q0, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.p0;
    }

    public Drawable getButtonIconDrawable() {
        return this.q0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.t0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.u0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.s0;
    }

    public int getCheckedState() {
        return this.v0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.o0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.v0 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l0 && this.s0 == null && this.t0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C0);
        }
        if (this.n0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D0);
        }
        this.w0 = DrawableUtils.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.m0 || !TextUtils.isEmpty(getText()) || (drawableA = CompoundButtonCompat.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (ViewUtils.e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            DrawableCompat.g(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.o0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.X);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.X = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(AppCompatResources.a(getContext(), i2));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.q0 = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i2) {
        setButtonIconDrawable(AppCompatResources.a(getContext(), i2));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.t0 == colorStateList) {
            return;
        }
        this.t0 = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.u0 == mode) {
            return;
        }
        this.u0 = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.s0 == colorStateList) {
            return;
        }
        this.s0 = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.m0 = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i2) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.v0 != i2) {
            this.v0 = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.y0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.x0) {
                return;
            }
            this.x0 = true;
            LinkedHashSet linkedHashSet = this.j0;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((OnCheckedStateChangedListener) it.next()).a();
                }
            }
            if (this.v0 != 2 && (onCheckedChangeListener = this.z0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.x0 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.o0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i2) {
        setErrorAccessibilityLabel(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.n0 == z2) {
            return;
        }
        this.n0 = z2;
        refreshDrawableState();
        Iterator it = this.i0.iterator();
        while (it.hasNext()) {
            ((OnErrorChangedListener) it.next()).a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.z0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.y0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.l0 = z2;
        if (z2) {
            CompoundButtonCompat.d(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.p0 = drawable;
        this.r0 = false;
        b();
    }
}
