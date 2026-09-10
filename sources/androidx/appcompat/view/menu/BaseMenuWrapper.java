package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseMenuWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SimpleArrayMap f3468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SimpleArrayMap f3469c;

    public BaseMenuWrapper(Context context) {
        this.f3467a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f3468b == null) {
            this.f3468b = new SimpleArrayMap(0);
        }
        MenuItem menuItem2 = (MenuItem) this.f3468b.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f3467a, supportMenuItem);
        this.f3468b.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f3469c == null) {
            this.f3469c = new SimpleArrayMap(0);
        }
        SubMenu subMenu2 = (SubMenu) this.f3469c.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuWrapperICS subMenuWrapperICS = new SubMenuWrapperICS(this.f3467a, supportSubMenu);
        this.f3469c.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }
}
