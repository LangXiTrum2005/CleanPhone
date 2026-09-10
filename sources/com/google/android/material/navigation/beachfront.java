package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: NavigationBarMenu.java */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront extends androidx.appcompat.view.menu.marial {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public final boolean f20616oilcan;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final Class<?> f20617stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public final int f20618trm;

    public beachfront(Context context, Class<?> cls, int i, boolean z) {
        super(context);
        this.f20617stratoscope = cls;
        this.f20618trm = i;
        this.f20616oilcan = z;
    }

    @Override // androidx.appcompat.view.menu.marial, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        if (this.f20616oilcan) {
            androidx.appcompat.view.menu.competently competentlyVar = (androidx.appcompat.view.menu.competently) attabal(i, i2, i3, charSequence);
            taiyuan taiyuanVar = new taiyuan(gintrap(), this, competentlyVar);
            competentlyVar.rotuma(taiyuanVar);
            return taiyuanVar;
        }
        throw new UnsupportedOperationException(this.f20617stratoscope.getSimpleName() + " does not support submenus");
    }

    @Override // androidx.appcompat.view.menu.marial
    public MenuItem attabal(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.f20618trm) {
            nosophobia();
            MenuItem menuItemAttabal = super.attabal(i, i2, i3, charSequence);
            lerp();
            return menuItemAttabal;
        }
        String simpleName = this.f20617stratoscope.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f20618trm + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }
}
