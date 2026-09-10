package com.google.android.material.navigation;

import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class NavigationBarMenu extends MenuBuilder {
    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final MenuItemImpl a(int i2, int i3, int i4, CharSequence charSequence) {
        if (this.f.size() + 1 > 0) {
            throw null;
        }
        w();
        MenuItemImpl menuItemImplA = super.a(i2, i3, i4, charSequence);
        menuItemImplA.f(true);
        v();
        return menuItemImplA;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        throw null;
    }
}
