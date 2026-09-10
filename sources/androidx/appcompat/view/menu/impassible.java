package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: MenuWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
public class impassible extends dern implements Menu {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final julian.attabal f4915wireman;

    public impassible(Context context, julian.attabal attabalVar) {
        super(context);
        if (attabalVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f4915wireman = attabalVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return dern(this.f4915wireman.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f4915wireman.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = dern(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return wireman(this.f4915wireman.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        marial();
        this.f4915wireman.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f4915wireman.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return dern(this.f4915wireman.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return dern(this.f4915wireman.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f4915wireman.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f4915wireman.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f4915wireman.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f4915wireman.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        beachfront(i);
        this.f4915wireman.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        competently(i);
        this.f4915wireman.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f4915wireman.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f4915wireman.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f4915wireman.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f4915wireman.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f4915wireman.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return dern(this.f4915wireman.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return wireman(this.f4915wireman.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return dern(this.f4915wireman.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return wireman(this.f4915wireman.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return dern(this.f4915wireman.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return wireman(this.f4915wireman.addSubMenu(i, i2, i3, i4));
    }
}
