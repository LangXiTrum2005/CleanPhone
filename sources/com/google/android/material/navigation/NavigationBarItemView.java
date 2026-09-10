package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.ripple.RippleUtils;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {
    public static final int[] u0 = {R.attr.state_checked};
    public static final ActiveIndicatorTransform v0 = new ActiveIndicatorTransform();
    public static final ActiveIndicatorUnlabeledTransform w0 = new ActiveIndicatorUnlabeledTransform();
    public ColorStateList e0;
    public Drawable f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public int l0;
    public int m0;
    public MenuItemImpl n0;
    public ColorStateList o0;
    public Drawable p0;
    public Drawable q0;
    public boolean r0;
    public boolean s0;
    public BadgeDrawable t0;

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarItemView$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnLayoutChangeListener {
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarItemView$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            int[] iArr = NavigationBarItemView.u0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarItemView$3, reason: invalid class name */
    class AnonymousClass3 implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int[] iArr = NavigationBarItemView.u0;
        }
    }

    public static class ActiveIndicatorTransform {
    }

    public static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static void d(TextView textView, int i2) {
        int iRound;
        textView.setTextAppearance(i2);
        Context context = textView.getContext();
        if (i2 == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, com.google.android.material.R.styleable.f19064F);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    private View getIconOrContainer() {
        return null;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i2 = 0;
        for (int i3 = 0; i3 < iIndexOfChild; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i2++;
            }
        }
        return i2;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.t0;
        Math.max(badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.t0.f0.f19108b.x0.intValue(), ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).leftMargin);
        throw null;
    }

    public final void a() {
        MenuItemImpl menuItemImpl = this.n0;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    public final void b() {
        Drawable rippleDrawable = this.f0;
        if (this.e0 != null) {
            getActiveIndicatorDrawable();
            if (this.r0) {
                getActiveIndicatorDrawable();
            }
            if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(RippleUtils.a(this.e0), null, null);
            }
        }
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(true);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void c(MenuItemImpl menuItemImpl) {
        this.n0 = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.f3495e);
        setId(menuItemImpl.f3492a);
        if (!TextUtils.isEmpty(menuItemImpl.q)) {
            setContentDescription(menuItemImpl.q);
        }
        TooltipCompat.a(this, !TextUtils.isEmpty(menuItemImpl.r) ? menuItemImpl.r : menuItemImpl.f3495e);
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return null;
    }

    public BadgeDrawable getBadge() {
        return this.t0;
    }

    public int getItemBackgroundResId() {
        return com.charging.screenshow.battery.animations.themes.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.n0;
    }

    public int getItemDefaultMarginResId() {
        return com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.l0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        throw null;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        MenuItemImpl menuItemImpl = this.n0;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.n0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, u0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.t0;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            MenuItemImpl menuItemImpl = this.n0;
            CharSequence charSequence = menuItemImpl.f3495e;
            if (!TextUtils.isEmpty(menuItemImpl.q)) {
                charSequence = this.n0.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.t0.c()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        accessibilityNodeInfoCompat.l(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 1, getItemVisiblePosition(), 1, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfoCompat.h(AccessibilityNodeInfoCompat.AccessibilityActionCompat.g);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.charging.screenshow.battery.animations.themes.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        post(new AnonymousClass2());
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
    }

    public void setActiveIndicatorEnabled(boolean z2) {
        this.r0 = z2;
        b();
    }

    public void setActiveIndicatorHeight(int i2) {
        getWidth();
    }

    public void setActiveIndicatorLabelPadding(int i2) {
        if (this.i0 != i2) {
            this.i0 = i2;
            a();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i2) {
        getWidth();
    }

    public void setActiveIndicatorResizeable(boolean z2) {
        this.s0 = z2;
    }

    public void setActiveIndicatorWidth(int i2) {
        getWidth();
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        if (this.t0 == badgeDrawable) {
            return;
        }
        this.t0 = badgeDrawable;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
    }

    public void setChecked(boolean z2) {
        throw null;
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        throw null;
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.p0) {
            return;
        }
        this.p0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            Drawable drawableMutate = drawable.mutate();
            this.q0 = drawableMutate;
            ColorStateList colorStateList = this.o0;
            if (colorStateList != null) {
                DrawableCompat.j(drawableMutate, colorStateList);
            }
        }
        throw null;
    }

    public void setIconSize(int i2) {
        throw null;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.o0 = colorStateList;
        if (this.n0 == null || (drawable = this.q0) == null) {
            return;
        }
        DrawableCompat.j(drawable, colorStateList);
        this.q0.invalidateSelf();
    }

    public void setItemBackground(int i2) {
        setItemBackground(i2 == 0 ? null : ContextCompat.getDrawable(getContext(), i2));
    }

    public void setItemPaddingBottom(int i2) {
        if (this.h0 != i2) {
            this.h0 = i2;
            a();
        }
    }

    public void setItemPaddingTop(int i2) {
        if (this.g0 != i2) {
            this.g0 = i2;
            a();
        }
    }

    public void setItemPosition(int i2) {
        this.l0 = i2;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.e0 = colorStateList;
        b();
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.j0 != i2) {
            this.j0 = i2;
            if (this.s0) {
            }
            getWidth();
            a();
        }
    }

    public void setShifting(boolean z2) {
        if (this.k0 != z2) {
            this.k0 = z2;
            a();
        }
    }

    public void setTextAppearanceActive(int i2) {
        this.m0 = i2;
        d(null, i2);
        throw null;
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z2) {
        setTextAppearanceActive(this.m0);
        throw null;
    }

    public void setTextAppearanceInactive(int i2) {
        d(null, i2);
        throw null;
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            throw null;
        }
    }

    public void setTitle(CharSequence charSequence) {
        throw null;
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f0 = drawable;
        b();
    }
}
