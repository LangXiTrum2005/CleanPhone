package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: compiled from: NavigationMenu.java */
/* JADX INFO: loaded from: classes3.dex */
public class kowloon extends androidx.appcompat.view.menu.marial {
    public kowloon(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.marial, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        androidx.appcompat.view.menu.competently competentlyVar = (androidx.appcompat.view.menu.competently) attabal(i, i2, i3, charSequence);
        monoploid monoploidVar = new monoploid(gintrap(), this, competentlyVar);
        competentlyVar.rotuma(monoploidVar);
        return monoploidVar;
    }
}
