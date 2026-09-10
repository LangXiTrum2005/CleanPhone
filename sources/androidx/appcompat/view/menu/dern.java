package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.splinterproof;

/* JADX INFO: compiled from: BaseMenuWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f4912attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public splinterproof<julian.dern, SubMenu> f4913dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public splinterproof<julian.saneness, MenuItem> f4914saneness;

    public dern(Context context) {
        this.f4912attabal = context;
    }

    public final void beachfront(int i) {
        if (this.f4914saneness == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f4914saneness.getSize()) {
            if (this.f4914saneness.competently(i2).getGroupId() == i) {
                this.f4914saneness.taiyuan(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void competently(int i) {
        if (this.f4914saneness == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f4914saneness.getSize(); i2++) {
            if (this.f4914saneness.competently(i2).getItemId() == i) {
                this.f4914saneness.taiyuan(i2);
                return;
            }
        }
    }

    public final MenuItem dern(MenuItem menuItem) {
        if (!(menuItem instanceof julian.saneness)) {
            return menuItem;
        }
        julian.saneness sanenessVar = (julian.saneness) menuItem;
        if (this.f4914saneness == null) {
            this.f4914saneness = new splinterproof<>();
        }
        MenuItem menuItem2 = this.f4914saneness.get(sanenessVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        impromptu impromptuVar = new impromptu(this.f4912attabal, sanenessVar);
        this.f4914saneness.put(sanenessVar, impromptuVar);
        return impromptuVar;
    }

    public final void marial() {
        splinterproof<julian.saneness, MenuItem> splinterproofVar = this.f4914saneness;
        if (splinterproofVar != null) {
            splinterproofVar.clear();
        }
        splinterproof<julian.dern, SubMenu> splinterproofVar2 = this.f4913dern;
        if (splinterproofVar2 != null) {
            splinterproofVar2.clear();
        }
    }

    public final SubMenu wireman(SubMenu subMenu) {
        if (!(subMenu instanceof julian.dern)) {
            return subMenu;
        }
        julian.dern dernVar = (julian.dern) subMenu;
        if (this.f4913dern == null) {
            this.f4913dern = new splinterproof<>();
        }
        SubMenu subMenu2 = this.f4913dern.get(dernVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        monoploid monoploidVar = new monoploid(this.f4912attabal, dernVar);
        this.f4913dern.put(dernVar, monoploidVar);
        return monoploidVar;
    }
}
