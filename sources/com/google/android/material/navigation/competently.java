package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: NavigationBarMenuBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.appcompat.view.menu.marial f20619attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f20620dern = 0;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f20623wireman = 0;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f20621marial = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<MenuItem> f20622saneness = new ArrayList();

    public competently(androidx.appcompat.view.menu.marial marialVar) {
        this.f20619attabal = marialVar;
        beachfront();
    }

    public int attabal() {
        return this.f20620dern;
    }

    public void beachfront() {
        this.f20622saneness.clear();
        this.f20620dern = 0;
        this.f20623wireman = 0;
        this.f20621marial = 0;
        for (int i = 0; i < this.f20619attabal.size(); i++) {
            MenuItem item = this.f20619attabal.getItem(i);
            if (item.hasSubMenu()) {
                if (!this.f20622saneness.isEmpty()) {
                    List<MenuItem> list = this.f20622saneness;
                    if (!(list.get(list.size() - 1) instanceof attabal) && item.isVisible()) {
                        this.f20622saneness.add(new attabal());
                    }
                }
                this.f20622saneness.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.f20622saneness.add(item2);
                    this.f20620dern++;
                    if (item2.isVisible()) {
                        this.f20623wireman++;
                    }
                }
                this.f20622saneness.add(new attabal());
            } else {
                this.f20622saneness.add(item);
                this.f20620dern++;
                if (item.isVisible()) {
                    this.f20623wireman++;
                    this.f20621marial++;
                }
            }
        }
        if (this.f20622saneness.isEmpty()) {
            return;
        }
        List<MenuItem> list2 = this.f20622saneness;
        if (list2.get(list2.size() - 1) instanceof attabal) {
            List<MenuItem> list3 = this.f20622saneness;
            list3.remove(list3.size() - 1);
        }
    }

    public int competently() {
        return this.f20622saneness.size();
    }

    public int dern() {
        return this.f20623wireman;
    }

    public boolean marial(MenuItem menuItem, androidx.appcompat.view.menu.apical apicalVar, int i) {
        return this.f20619attabal.creditor(menuItem, apicalVar, i);
    }

    public MenuItem saneness(int i) {
        return this.f20622saneness.get(i);
    }

    public int wireman() {
        return this.f20621marial;
    }
}
