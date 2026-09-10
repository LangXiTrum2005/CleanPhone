package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: SubMenuBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class arytenoidectomy extends marial implements SubMenu {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public marial f4841stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public competently f4842trm;

    public arytenoidectomy(Context context, marial marialVar, competently competentlyVar) {
        super(context);
        this.f4841stratoscope = marialVar;
        this.f4842trm = competentlyVar;
    }

    @Override // androidx.appcompat.view.menu.marial
    public boolean beachfront(competently competentlyVar) {
        return this.f4841stratoscope.beachfront(competentlyVar);
    }

    @Override // androidx.appcompat.view.menu.marial
    public String dovishness() {
        competently competentlyVar = this.f4842trm;
        int itemId = competentlyVar != null ? competentlyVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.dovishness() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f4842trm;
    }

    @Override // androidx.appcompat.view.menu.marial
    public boolean impassible(competently competentlyVar) {
        return this.f4841stratoscope.impassible(competentlyVar);
    }

    @Override // androidx.appcompat.view.menu.marial
    public boolean impromptu(marial marialVar, MenuItem menuItem) {
        return super.impromptu(marialVar, menuItem) || this.f4841stratoscope.impromptu(marialVar, menuItem);
    }

    public Menu lotta() {
        return this.f4841stratoscope;
    }

    @Override // androidx.appcompat.view.menu.marial
    public boolean merc() {
        return this.f4841stratoscope.merc();
    }

    @Override // androidx.appcompat.view.menu.marial
    public void overspeculate(marial.attabal attabalVar) {
        this.f4841stratoscope.overspeculate(attabalVar);
    }

    @Override // androidx.appcompat.view.menu.marial
    public boolean polder() {
        return this.f4841stratoscope.polder();
    }

    @Override // androidx.appcompat.view.menu.marial
    public boolean restrictive() {
        return this.f4841stratoscope.restrictive();
    }

    @Override // androidx.appcompat.view.menu.marial
    public marial sealless() {
        return this.f4841stratoscope.sealless();
    }

    @Override // androidx.appcompat.view.menu.marial, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f4841stratoscope.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.cultivated(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.milliradian(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.treadless(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f4842trm.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.marial, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f4841stratoscope.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.permissivist(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.timberyard(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f4842trm.setIcon(i);
        return this;
    }
}
