package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MenuBuilder implements SupportMenu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f3479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3480c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Callback f3481e;
    public final ArrayList f;
    public final ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f3483i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f3485n;
    public View o;
    public MenuItemImpl v;
    public boolean x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3484l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3486p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f3487u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3488w = false;

    public interface Callback {
        boolean a(MenuBuilder menuBuilder, MenuItem menuItem);

        void b(MenuBuilder menuBuilder);
    }

    public interface ItemInvoker {
        boolean d(MenuItemImpl menuItemImpl);
    }

    public MenuBuilder(Context context) {
        boolean z2 = false;
        this.f3478a = context;
        Resources resources = context.getResources();
        this.f3479b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.f3482h = true;
        this.f3483i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfigurationCompat.e(ViewConfiguration.get(context), context)) {
            z2 = true;
        }
        this.d = z2;
    }

    public MenuItemImpl a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (y[i6] << 16) | (65535 & i4);
        MenuItemImpl menuItemImpl = new MenuItemImpl(this, i2, i3, i4, i7, charSequence, this.f3484l);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((MenuItemImpl) arrayList.get(size)).d <= i7) {
                i5 = size + 1;
                arrayList.add(i5, menuItemImpl);
                p(true);
                return menuItemImpl;
            }
        }
        i5 = 0;
        arrayList.add(i5, menuItemImpl);
        p(true);
        return menuItemImpl;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f3478a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemImpl menuItemImplA = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            menuItemImplA.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemImplA.g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = menuItemImplA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(MenuPresenter menuPresenter, Context context) {
        this.f3487u.add(new WeakReference(menuPresenter));
        menuPresenter.i(context, this);
        this.k = true;
    }

    public final void c(boolean z2) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3487u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                menuPresenter.b(this, z2);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemImpl menuItemImpl = this.v;
        if (menuItemImpl != null) {
            d(menuItemImpl);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f3485n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(MenuItemImpl menuItemImpl) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3487u;
        boolean zD = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == menuItemImpl) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter != null) {
                    zD = menuPresenter.d(menuItemImpl);
                    if (zD) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zD) {
                this.v = null;
            }
        }
        return zD;
    }

    public boolean e(MenuBuilder menuBuilder, MenuItem menuItem) {
        Callback callback = this.f3481e;
        return callback != null && callback.a(menuBuilder, menuItem);
    }

    public boolean f(MenuItemImpl menuItemImpl) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3487u;
        boolean zF = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter != null) {
                zF = menuPresenter.f(menuItemImpl);
                if (zF) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zF) {
            this.v = menuItemImpl;
        }
        return zF;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i3);
            if (menuItemImpl.f3492a == i2) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (menuItemFindItem = menuItemImpl.o.findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final MenuItemImpl g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemImpl) arrayList.get(0);
        }
        boolean zN = n();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i3);
            char c2 = zN ? menuItemImpl.j : menuItemImpl.f3496h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zN && c2 == '\b' && i2 == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f.get(i2);
    }

    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList2.get(i3);
                if (menuItemImpl.hasSubMenu()) {
                    menuItemImpl.o.h(arrayList, i2, keyEvent);
                }
                char c2 = zN ? menuItemImpl.j : menuItemImpl.f3496h;
                if ((modifiers & 69647) == ((zN ? menuItemImpl.k : menuItemImpl.f3497i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zN && c2 == '\b' && i2 == 67)) && menuItemImpl.isEnabled()) {
                        arrayList.add(menuItemImpl);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((MenuItemImpl) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3487u;
            boolean zH = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zH |= menuPresenter.h();
                }
            }
            ArrayList arrayList = this.f3483i;
            ArrayList arrayList2 = this.j;
            if (zH) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListL.get(i2);
                    if ((menuItemImpl.x & 32) == 32) {
                        arrayList.add(menuItemImpl);
                    } else {
                        arrayList2.add(menuItemImpl);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuBuilder k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.f3482h;
        ArrayList arrayList = this.g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList2.get(i2);
            if (menuItemImpl.isVisible()) {
                arrayList.add(menuItemImpl);
            }
        }
        this.f3482h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f3488w;
    }

    public boolean n() {
        return this.f3480c;
    }

    public boolean o() {
        return this.d;
    }

    public void p(boolean z2) {
        if (this.f3486p) {
            this.q = true;
            if (z2) {
                this.r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f3482h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3487u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                menuPresenter.g(z2);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return q(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        MenuItemImpl menuItemImplG = g(i2, keyEvent);
        boolean zQ = menuItemImplG != null ? q(menuItemImplG, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, MenuPresenter menuPresenter, int i2) {
        ActionProvider actionProvider;
        boolean zExpandActionView;
        ActionProvider actionProvider2;
        boolean z2;
        SubMenuBuilder subMenuBuilder;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        MenuPresenter menuPresenter2;
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        boolean zE = false;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemImpl.f3500p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemImpl)) {
            MenuBuilder menuBuilder = menuItemImpl.f3499n;
            if (menuBuilder.e(menuBuilder, menuItemImpl)) {
                zExpandActionView = true;
            } else {
                Intent intent = menuItemImpl.g;
                if (intent != null) {
                    try {
                        menuBuilder.f3478a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                        actionProvider = menuItemImpl.f3490A;
                        if (actionProvider == null) {
                        }
                        zExpandActionView = false;
                        actionProvider2 = menuItemImpl.f3490A;
                        if (actionProvider2 == null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (menuItemImpl.e()) {
                            zExpandActionView |= menuItemImpl.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (menuItemImpl.hasSubMenu()) {
                            if ((i2 & 4) == 0) {
                                c(false);
                            }
                            if (!menuItemImpl.hasSubMenu()) {
                                SubMenuBuilder subMenuBuilder2 = new SubMenuBuilder(this.f3478a, this, menuItemImpl);
                                menuItemImpl.o = subMenuBuilder2;
                                subMenuBuilder2.setHeaderTitle(menuItemImpl.f3495e);
                            }
                            subMenuBuilder = menuItemImpl.o;
                            if (z2) {
                                actionProvider2.f(subMenuBuilder);
                            }
                            copyOnWriteArrayList = this.f3487u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (menuPresenter != null) {
                                }
                                for (WeakReference weakReference : copyOnWriteArrayList) {
                                    menuPresenter2 = (MenuPresenter) weakReference.get();
                                    if (menuPresenter2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zE) {
                                        zE = menuPresenter2.e(subMenuBuilder);
                                    }
                                }
                            }
                            zExpandActionView |= zE;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i2 & 4) == 0) {
                                c(false);
                            }
                            if (!menuItemImpl.hasSubMenu()) {
                                SubMenuBuilder subMenuBuilder3 = new SubMenuBuilder(this.f3478a, this, menuItemImpl);
                                menuItemImpl.o = subMenuBuilder3;
                                subMenuBuilder3.setHeaderTitle(menuItemImpl.f3495e);
                            }
                            subMenuBuilder = menuItemImpl.o;
                            if (z2) {
                                actionProvider2.f(subMenuBuilder);
                            }
                            copyOnWriteArrayList = this.f3487u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zE = menuPresenter != null ? menuPresenter.e(subMenuBuilder) : false;
                                while (r8.hasNext()) {
                                    menuPresenter2 = (MenuPresenter) weakReference.get();
                                    if (menuPresenter2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zE) {
                                        zE = menuPresenter2.e(subMenuBuilder);
                                    }
                                }
                            }
                            zExpandActionView |= zE;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    actionProvider = menuItemImpl.f3490A;
                    if (actionProvider == null && actionProvider.e()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        actionProvider2 = menuItemImpl.f3490A;
        if (actionProvider2 == null && actionProvider2.a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (menuItemImpl.e()) {
            zExpandActionView |= menuItemImpl.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                c(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                SubMenuBuilder subMenuBuilder4 = new SubMenuBuilder(this.f3478a, this, menuItemImpl);
                menuItemImpl.o = subMenuBuilder4;
                subMenuBuilder4.setHeaderTitle(menuItemImpl.f3495e);
            }
            subMenuBuilder = menuItemImpl.o;
            if (z2) {
                actionProvider2.f(subMenuBuilder);
            }
            copyOnWriteArrayList = this.f3487u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (menuPresenter != null) {
                }
                while (r8.hasNext()) {
                    menuPresenter2 = (MenuPresenter) weakReference.get();
                    if (menuPresenter2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zE) {
                        zE = menuPresenter2.e(subMenuBuilder);
                    }
                }
            }
            zExpandActionView |= zE;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i2 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(MenuPresenter menuPresenter) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3487u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((MenuItemImpl) arrayList.get(i4)).f3493b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((MenuItemImpl) arrayList.get(i4)).f3493b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemImpl) arrayList.get(i3)).f3492a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).s(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i3);
            if (menuItemImpl.f3493b == i2) {
                menuItemImpl.f(z3);
                menuItemImpl.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3488w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i3);
            if (menuItemImpl.f3493b == i2) {
                menuItemImpl.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i3);
            if (menuItemImpl.f3493b == i2) {
                int i4 = menuItemImpl.x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                menuItemImpl.x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f3480c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.f3485n = null;
        } else {
            if (i2 > 0) {
                this.m = this.f3479b.getText(i2);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i3 > 0) {
                this.f3485n = ContextCompat.getDrawable(this.f3478a, i3);
            } else if (drawable != null) {
                this.f3485n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3486p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.f3486p) {
            return;
        }
        this.f3486p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f3479b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f3479b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        MenuItemImpl menuItemImplA = a(i2, i3, i4, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.f3478a, this, menuItemImplA);
        menuItemImplA.o = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(menuItemImplA.f3495e);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f3479b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f3479b.getString(i5));
    }
}
