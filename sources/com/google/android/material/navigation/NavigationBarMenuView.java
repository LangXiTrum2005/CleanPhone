package com.google.android.material.navigation;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {
    public int e0;
    public ColorStateList f0;
    public int g0;
    public ColorStateList h0;
    public int i0;
    public int j0;
    public Drawable k0;
    public ColorStateList l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public boolean q0;
    public int r0;
    public int s0;
    public int t0;
    public ShapeAppearanceModel u0;
    public ColorStateList v0;
    public MenuBuilder w0;

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarMenuView$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((NavigationBarItemView) view).getItemData();
            throw null;
        }
    }

    private NavigationBarItemView getNewItem() {
        throw null;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        if (navigationBarItemView.getId() != -1) {
            throw null;
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public final void a(MenuBuilder menuBuilder) {
        this.w0 = menuBuilder;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.p0;
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return null;
    }

    public ColorStateList getIconTintList() {
        return this.f0;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.v0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.q0;
    }

    public int getItemActiveIndicatorHeight() {
        return this.s0;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.t0;
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.u0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.r0;
    }

    public Drawable getItemBackground() {
        return this.k0;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.m0;
    }

    public int getItemIconSize() {
        return this.g0;
    }

    public int getItemPaddingBottom() {
        return this.o0;
    }

    public int getItemPaddingTop() {
        return this.n0;
    }

    public ColorStateList getItemRippleColor() {
        return this.l0;
    }

    public int getItemTextAppearanceActive() {
        return this.j0;
    }

    public int getItemTextAppearanceInactive() {
        return this.i0;
    }

    public ColorStateList getItemTextColor() {
        return this.h0;
    }

    public int getLabelVisibilityMode() {
        return this.e0;
    }

    public MenuBuilder getMenu() {
        return this.w0;
    }

    public int getSelectedItemId() {
        return 0;
    }

    public int getSelectedItemPosition() {
        return 0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).k(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(1, this.w0.l().size(), 1, false));
    }

    public void setActiveIndicatorLabelPadding(int i2) {
        this.p0 = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f0 = colorStateList;
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.v0 = colorStateList;
    }

    public void setItemActiveIndicatorEnabled(boolean z2) {
        this.q0 = z2;
    }

    public void setItemActiveIndicatorHeight(int i2) {
        this.s0 = i2;
    }

    public void setItemActiveIndicatorMarginHorizontal(int i2) {
        this.t0 = i2;
    }

    public void setItemActiveIndicatorResizeable(boolean z2) {
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        this.u0 = shapeAppearanceModel;
    }

    public void setItemActiveIndicatorWidth(int i2) {
        this.r0 = i2;
    }

    public void setItemBackground(Drawable drawable) {
        this.k0 = drawable;
    }

    public void setItemBackgroundRes(int i2) {
        this.m0 = i2;
    }

    public void setItemIconSize(int i2) {
        this.g0 = i2;
    }

    public void setItemPaddingBottom(int i2) {
        this.o0 = i2;
    }

    public void setItemPaddingTop(int i2) {
        this.n0 = i2;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.l0 = colorStateList;
    }

    public void setItemTextAppearanceActive(int i2) {
        this.j0 = i2;
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.i0 = i2;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.h0 = colorStateList;
    }

    public void setLabelVisibilityMode(int i2) {
        this.e0 = i2;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
    }
}
