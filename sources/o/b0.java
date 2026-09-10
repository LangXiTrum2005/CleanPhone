package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.gms.internal.ads.q00;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends q00 implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f46893c;

    public b0(Context context, m mVar) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f46893c = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return h(this.f46893c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f46893c.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = h(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f46893c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        x.i iVar = (x.i) this.f18848b;
        if (iVar != null) {
            iVar.clear();
        }
        this.f46893c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f46893c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return h(this.f46893c.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return h(this.f46893c.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f46893c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f46893c.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f46893c.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f46893c.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((x.i) this.f18848b) != null) {
            int i11 = 0;
            while (true) {
                x.i iVar = (x.i) this.f18848b;
                if (i11 >= iVar.f53506c) {
                    break;
                }
                if (((h0.a) iVar.f(i11)).getGroupId() == i10) {
                    ((x.i) this.f18848b).h(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f46893c.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((x.i) this.f18848b) != null) {
            int i11 = 0;
            while (true) {
                x.i iVar = (x.i) this.f18848b;
                if (i11 >= iVar.f53506c) {
                    break;
                }
                if (((h0.a) iVar.f(i11)).getItemId() == i10) {
                    ((x.i) this.f18848b).h(i11);
                    break;
                }
                i11++;
            }
        }
        this.f46893c.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f46893c.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f46893c.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        this.f46893c.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f46893c.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f46893c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return this.f46893c.addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return h(this.f46893c.add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f46893c.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return h(this.f46893c.a(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return this.f46893c.addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return h(this.f46893c.add(i10, i11, i12, i13));
    }
}
