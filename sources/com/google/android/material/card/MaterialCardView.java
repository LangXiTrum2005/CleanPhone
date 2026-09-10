package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {
    public static final int[] q0 = {R.attr.state_checkable};
    public static final int[] r0 = {R.attr.state_checked};
    public static final int[] s0 = {com.charging.screenshow.battery.animations.themes.R.attr.state_dragged};
    public final MaterialCardViewHelper l0;
    public final boolean m0;
    public boolean n0;
    public boolean o0;
    public OnCheckedChangeListener p0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OnCheckedChangeListener {
        void a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(MaterialThemeOverlay.a(context, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.materialCardViewStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_CardView), attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.materialCardViewStyle);
        this.n0 = false;
        this.o0 = false;
        this.m0 = true;
        TypedArray typedArrayD = ThemeEnforcement.d(getContext(), attributeSet, com.google.android.material.R.styleable.r, com.charging.screenshow.battery.animations.themes.R.attr.materialCardViewStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_CardView, new int[0]);
        MaterialCardViewHelper materialCardViewHelper = new MaterialCardViewHelper(this, attributeSet);
        this.l0 = materialCardViewHelper;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.f19160c;
        materialShapeDrawable.l(cardBackgroundColor);
        materialCardViewHelper.f19159b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        materialCardViewHelper.l();
        MaterialCardView materialCardView = materialCardViewHelper.f19158a;
        ColorStateList colorStateListA = MaterialResources.a(materialCardView.getContext(), typedArrayD, 11);
        materialCardViewHelper.f19165n = colorStateListA;
        if (colorStateListA == null) {
            materialCardViewHelper.f19165n = ColorStateList.valueOf(-1);
        }
        materialCardViewHelper.f19162h = typedArrayD.getDimensionPixelSize(12, 0);
        boolean z2 = typedArrayD.getBoolean(0, false);
        materialCardViewHelper.s = z2;
        materialCardView.setLongClickable(z2);
        materialCardViewHelper.f19164l = MaterialResources.a(materialCardView.getContext(), typedArrayD, 6);
        materialCardViewHelper.g(MaterialResources.c(materialCardView.getContext(), typedArrayD, 2));
        materialCardViewHelper.f = typedArrayD.getDimensionPixelSize(5, 0);
        materialCardViewHelper.f19161e = typedArrayD.getDimensionPixelSize(4, 0);
        materialCardViewHelper.g = typedArrayD.getInteger(3, 8388661);
        ColorStateList colorStateListA2 = MaterialResources.a(materialCardView.getContext(), typedArrayD, 7);
        materialCardViewHelper.k = colorStateListA2;
        if (colorStateListA2 == null) {
            materialCardViewHelper.k = ColorStateList.valueOf(MaterialColors.b(com.charging.screenshow.battery.animations.themes.R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList colorStateListA3 = MaterialResources.a(materialCardView.getContext(), typedArrayD, 1);
        MaterialShapeDrawable materialShapeDrawable2 = materialCardViewHelper.d;
        materialShapeDrawable2.l(colorStateListA3 == null ? ColorStateList.valueOf(0) : colorStateListA3);
        RippleDrawable rippleDrawable = materialCardViewHelper.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(materialCardViewHelper.k);
        }
        materialShapeDrawable.k(materialCardView.getCardElevation());
        float f = materialCardViewHelper.f19162h;
        ColorStateList colorStateList = materialCardViewHelper.f19165n;
        materialShapeDrawable2.X.j = f;
        materialShapeDrawable2.invalidateSelf();
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable2.X;
        if (materialShapeDrawableState.d != colorStateList) {
            materialShapeDrawableState.d = colorStateList;
            materialShapeDrawable2.onStateChange(materialShapeDrawable2.getState());
        }
        materialCardView.setBackgroundInternal(materialCardViewHelper.d(materialShapeDrawable));
        Drawable drawableC = materialCardViewHelper.j() ? materialCardViewHelper.c() : materialShapeDrawable2;
        materialCardViewHelper.f19163i = drawableC;
        materialCardView.setForeground(materialCardViewHelper.d(drawableC));
        typedArrayD.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.l0.f19160c.getBounds());
        return rectF;
    }

    public final void e() {
        MaterialCardViewHelper materialCardViewHelper;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (materialCardViewHelper = this.l0).o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i2 = bounds.bottom;
        materialCardViewHelper.o.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
        materialCardViewHelper.o.setBounds(bounds.left, bounds.top, bounds.right, i2);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.l0.f19160c.X.f19419c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.l0.d.X.f19419c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.l0.j;
    }

    public int getCheckedIconGravity() {
        return this.l0.g;
    }

    public int getCheckedIconMargin() {
        return this.l0.f19161e;
    }

    public int getCheckedIconSize() {
        return this.l0.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.l0.f19164l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.l0.f19159b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.l0.f19159b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.l0.f19159b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.l0.f19159b.top;
    }

    public float getProgress() {
        return this.l0.f19160c.X.f19422i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.l0.f19160c.h();
    }

    public ColorStateList getRippleColor() {
        return this.l0.k;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.l0.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.l0.f19165n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.l0.f19165n;
    }

    public int getStrokeWidth() {
        return this.l0.f19162h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        materialCardViewHelper.k();
        MaterialShapeUtils.c(this, materialCardViewHelper.f19160c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        if (materialCardViewHelper != null && materialCardViewHelper.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, q0);
        }
        if (this.n0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r0);
        }
        if (this.o0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, s0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.n0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        accessibilityNodeInfo.setCheckable(materialCardViewHelper != null && materialCardViewHelper.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.n0);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.l0.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.m0) {
            MaterialCardViewHelper materialCardViewHelper = this.l0;
            if (!materialCardViewHelper.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                materialCardViewHelper.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.l0.f19160c.l(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        materialCardViewHelper.f19160c.k(materialCardViewHelper.f19158a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.l0.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.l(colorStateList);
    }

    public void setCheckable(boolean z2) {
        this.l0.s = z2;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.n0 != z2) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.l0.g(drawable);
    }

    public void setCheckedIconGravity(int i2) {
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        if (materialCardViewHelper.g != i2) {
            materialCardViewHelper.g = i2;
            MaterialCardView materialCardView = materialCardViewHelper.f19158a;
            materialCardViewHelper.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i2) {
        this.l0.f19161e = i2;
    }

    public void setCheckedIconMarginResource(int i2) {
        if (i2 != -1) {
            this.l0.f19161e = getResources().getDimensionPixelSize(i2);
        }
    }

    public void setCheckedIconResource(int i2) {
        this.l0.g(AppCompatResources.a(getContext(), i2));
    }

    public void setCheckedIconSize(int i2) {
        this.l0.f = i2;
    }

    public void setCheckedIconSizeResource(int i2) {
        if (i2 != 0) {
            this.l0.f = getResources().getDimensionPixelSize(i2);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        materialCardViewHelper.f19164l = colorStateList;
        Drawable drawable = materialCardViewHelper.j;
        if (drawable != null) {
            DrawableCompat.j(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        if (materialCardViewHelper != null) {
            materialCardViewHelper.k();
        }
    }

    public void setDragged(boolean z2) {
        if (this.o0 != z2) {
            this.o0 = z2;
            refreshDrawableState();
            e();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.l0.m();
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.p0 = onCheckedChangeListener;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        materialCardViewHelper.m();
        materialCardViewHelper.l();
    }

    public void setProgress(float f) {
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        materialCardViewHelper.f19160c.m(f);
        MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.m(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = materialCardViewHelper.q;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.m(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        ShapeAppearanceModel.Builder builderF = materialCardViewHelper.m.f();
        builderF.c(f);
        materialCardViewHelper.h(builderF.a());
        materialCardViewHelper.f19163i.invalidateSelf();
        if (materialCardViewHelper.i()) {
            materialCardViewHelper.l();
        } else if (materialCardViewHelper.f19158a.getPreventCornerOverlap()) {
            MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.f19160c;
            if (!materialShapeDrawable.X.f19417a.e(materialShapeDrawable.g())) {
                materialCardViewHelper.l();
            }
        }
        if (materialCardViewHelper.i()) {
            materialCardViewHelper.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        materialCardViewHelper.k = colorStateList;
        RippleDrawable rippleDrawable = materialCardViewHelper.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), i2);
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        materialCardViewHelper.k = colorStateList;
        RippleDrawable rippleDrawable = materialCardViewHelper.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.e(getBoundsAsRectF()));
        this.l0.h(shapeAppearanceModel);
    }

    public void setStrokeColor(int i2) {
        setStrokeColor(ColorStateList.valueOf(i2));
    }

    public void setStrokeWidth(int i2) {
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        if (i2 != materialCardViewHelper.f19162h) {
            materialCardViewHelper.f19162h = i2;
            MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.d;
            ColorStateList colorStateList = materialCardViewHelper.f19165n;
            materialShapeDrawable.X.j = i2;
            materialShapeDrawable.invalidateSelf();
            MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.X;
            if (materialShapeDrawableState.d != colorStateList) {
                materialShapeDrawableState.d = colorStateList;
                materialShapeDrawable.onStateChange(materialShapeDrawable.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        materialCardViewHelper.m();
        materialCardViewHelper.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        if (materialCardViewHelper != null && materialCardViewHelper.s && isEnabled()) {
            this.n0 = !this.n0;
            refreshDrawableState();
            e();
            materialCardViewHelper.f(this.n0, true);
            OnCheckedChangeListener onCheckedChangeListener = this.p0;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.a();
            }
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.l0;
        if (materialCardViewHelper.f19165n != colorStateList) {
            materialCardViewHelper.f19165n = colorStateList;
            MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.d;
            materialShapeDrawable.X.j = materialCardViewHelper.f19162h;
            materialShapeDrawable.invalidateSelf();
            MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.X;
            if (materialShapeDrawableState.d != colorStateList) {
                materialShapeDrawableState.d = colorStateList;
                materialShapeDrawable.onStateChange(materialShapeDrawable.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i2) {
        this.l0.f19160c.l(ColorStateList.valueOf(i2));
    }
}
