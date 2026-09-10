package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.p004ironsource.mediationsdk.metadata.a;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {
    public static final int[] K0 = {R.attr.state_checked};
    public boolean A0;
    public boolean B0;
    public final boolean C0;
    public final CheckedTextView D0;
    public FrameLayout E0;
    public MenuItemImpl F0;
    public ColorStateList G0;
    public boolean H0;
    public Drawable I0;
    public final AccessibilityDelegateCompat J0;
    public int z0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C0 = true;
        AccessibilityDelegateCompat accessibilityDelegateCompat = new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                View.AccessibilityDelegate accessibilityDelegate = this.f4417a;
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.B0);
            }
        };
        this.J0 = accessibilityDelegateCompat;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.charging.screenshow.battery.animations.themes.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.design_menu_item_text);
        this.D0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.z(checkedTextView, accessibilityDelegateCompat);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.E0 == null) {
                this.E0 = (FrameLayout) ((ViewStub) findViewById(com.charging.screenshow.battery.animations.themes.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.E0.removeAllViews();
            this.E0.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void c(MenuItemImpl menuItemImpl) {
        StateListDrawable stateListDrawable;
        this.F0 = menuItemImpl;
        int i2 = menuItemImpl.f3492a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(K0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            setBackground(stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.f3495e);
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.q);
        TooltipCompat.a(this, menuItemImpl.r);
        MenuItemImpl menuItemImpl2 = this.F0;
        CharSequence charSequence = menuItemImpl2.f3495e;
        CheckedTextView checkedTextView = this.D0;
        if (charSequence == null && menuItemImpl2.getIcon() == null && this.F0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.E0;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.E0.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.E0;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.E0.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.F0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        MenuItemImpl menuItemImpl = this.F0;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.F0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.B0 != z2) {
            this.B0 = z2;
            this.J0.h(this.D0, a.f25965n);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.D0;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.C0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.H0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                DrawableCompat.j(drawable, this.G0);
            }
            int i2 = this.z0;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.A0) {
            if (this.I0 == null) {
                Drawable drawableB = ResourcesCompat.b(getResources(), com.charging.screenshow.battery.animations.themes.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.I0 = drawableB;
                if (drawableB != null) {
                    int i3 = this.z0;
                    drawableB.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.I0;
        }
        this.D0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.D0.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.z0 = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.G0 = colorStateList;
        this.H0 = colorStateList != null;
        MenuItemImpl menuItemImpl = this.F0;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.D0.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.A0 = z2;
    }

    public void setTextAppearance(int i2) {
        this.D0.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.D0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.D0.setText(charSequence);
    }
}
