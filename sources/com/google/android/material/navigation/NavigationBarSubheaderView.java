package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.formularize;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationBarSubheaderView extends FrameLayout implements impromptu {
    private boolean expanded;
    private androidx.appcompat.view.menu.competently itemData;
    boolean onlyShowWhenExpanded;
    private final TextView subheaderLabel;
    private ColorStateList textColor;

    public NavigationBarSubheaderView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(bubbles.taiyuan.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.subheaderLabel = (TextView) findViewById(bubbles.competently.navigation_menu_subheader_label);
    }

    private void updateVisibility() {
        androidx.appcompat.view.menu.competently competentlyVar = this.itemData;
        if (competentlyVar != null) {
            setVisibility((!competentlyVar.isVisible() || (!this.expanded && this.onlyShowWhenExpanded)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.formularize.attabal
    public androidx.appcompat.view.menu.competently getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.formularize.attabal
    public void initialize(androidx.appcompat.view.menu.competently competentlyVar, int i) {
        this.itemData = competentlyVar;
        competentlyVar.setCheckable(false);
        this.subheaderLabel.setText(competentlyVar.getTitle());
        updateVisibility();
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean isOnlyVisibleWhenExpanded() {
        return this.onlyShowWhenExpanded;
    }

    @Override // androidx.appcompat.view.menu.formularize.attabal
    public boolean prefersCondensedTitle() {
        return false;
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

    public void setTextAppearance(int i) {
        formularize.impassible(this.subheaderLabel, i);
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            this.subheaderLabel.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
        if (colorStateList != null) {
            this.subheaderLabel.setTextColor(colorStateList);
        }
    }

    public boolean showsIcon() {
        return false;
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
