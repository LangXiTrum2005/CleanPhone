package com.google.android.material.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationBarDividerView extends FrameLayout implements impromptu {
    private boolean dividersEnabled;
    private boolean expanded;
    boolean onlyShowWhenExpanded;

    public NavigationBarDividerView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(bubbles.taiyuan.m3_navigation_menu_divider, (ViewGroup) this, true);
        updateVisibility();
    }

    @Override // androidx.appcompat.view.menu.formularize.attabal
    public androidx.appcompat.view.menu.competently getItemData() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.formularize.attabal
    public void initialize(androidx.appcompat.view.menu.competently competentlyVar, int i) {
        updateVisibility();
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean isOnlyVisibleWhenExpanded() {
        return this.onlyShowWhenExpanded;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.view.menu.formularize.attabal
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setDividersEnabled(boolean z) {
        this.dividersEnabled = z;
        updateVisibility();
    }

    @Override // com.google.android.material.navigation.impromptu
    public void setExpanded(boolean z) {
        this.expanded = z;
        updateVisibility();
    }

    @Override // com.google.android.material.navigation.impromptu
    public void setOnlyShowWhenExpanded(boolean z) {
        this.onlyShowWhenExpanded = z;
        updateVisibility();
    }

    public boolean showsIcon() {
        return false;
    }

    public void updateVisibility() {
        setVisibility((!this.dividersEnabled || (!this.expanded && this.onlyShowWhenExpanded)) ? 8 : 0);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void setShortcut(boolean z, char c) {
    }
}
