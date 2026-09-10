package o;

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
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class m implements Menu {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f46958y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f46960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f46963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f46964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f46965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f46967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f46968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46969k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f46970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f46971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f46972o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f46979v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f46981x;
    public int l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f46973p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46974q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f46975r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f46976s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f46977t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f46978u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f46980w = false;

    public m(Context context) {
        boolean z10 = false;
        this.f46959a = context;
        Resources resources = context.getResources();
        this.f46960b = resources;
        this.f46964f = new ArrayList();
        this.f46965g = new ArrayList();
        this.f46966h = true;
        this.f46967i = new ArrayList();
        this.f46968j = new ArrayList();
        this.f46969k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z10 = true;
        }
        this.f46962d = z10;
    }

    public final o a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f46958y[i14] << 16) | (65535 & i12);
        o oVar = new o(this, i10, i11, i12, i15, charSequence, this.l);
        ArrayList arrayList = this.f46964f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((o) arrayList.get(size)).f46988d <= i15) {
                i13 = size + 1;
                arrayList.add(i13, oVar);
                p(true);
                return oVar;
            }
        }
        i13 = 0;
        arrayList.add(i13, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f46959a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o oVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            oVarA.setIcon(resolveInfo.loadIcon(packageManager));
            oVarA.f46991g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = oVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f46978u.add(new WeakReference(yVar));
        yVar.g(context, this);
        this.f46969k = true;
    }

    public final void c(boolean z10) {
        if (this.f46976s) {
            return;
        }
        this.f46976s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f46978u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.b(this, z10);
            }
        }
        this.f46976s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f46979v;
        if (oVar != null) {
            d(oVar);
        }
        this.f46964f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f46971n = null;
        this.f46970m = null;
        this.f46972o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f46978u;
        boolean zF = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f46979v == oVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar != null) {
                    zF = yVar.f(oVar);
                    if (zF) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zF) {
                this.f46979v = null;
            }
        }
        return zF;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f46963e;
        return kVar != null && kVar.c(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f46978u;
        boolean zD = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar != null) {
                zD = yVar.d(oVar);
                if (zD) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zD) {
            this.f46979v = oVar;
        }
        return zD;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f46964f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (oVar.f46985a == i10) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (menuItemFindItem = oVar.f46998o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final o g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f46977t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean zN = n();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            char c4 = zN ? oVar.f46994j : oVar.f46992h;
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (zN && c4 == '\b' && i10 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f46964f.get(i10);
    }

    public final void h(List list, int i10, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f46964f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                o oVar = (o) arrayList.get(i11);
                if (oVar.hasSubMenu()) {
                    oVar.f46998o.h(list, i10, keyEvent);
                }
                char c4 = zN ? oVar.f46994j : oVar.f46992h;
                if ((modifiers & 69647) == ((zN ? oVar.f46995k : oVar.f46993i) & 69647) && c4 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c4 == cArr[0] || c4 == cArr[2] || (zN && c4 == '\b' && i10 == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f46981x) {
            return true;
        }
        ArrayList arrayList = this.f46964f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((o) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f46969k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f46978u;
            boolean zH = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zH |= yVar.h();
                }
            }
            ArrayList arrayList = this.f46967i;
            ArrayList arrayList2 = this.f46968j;
            if (zH) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i10 = 0; i10 < size; i10++) {
                    o oVar = (o) arrayListL.get(i10);
                    if ((oVar.f47007x & 32) == 32) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f46969k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z10 = this.f46966h;
        ArrayList arrayList = this.f46965g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f46964f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList2.get(i10);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f46966h = false;
        this.f46969k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f46980w;
    }

    public boolean n() {
        return this.f46961c;
    }

    public boolean o() {
        return this.f46962d;
    }

    public final void p(boolean z10) {
        if (this.f46973p) {
            this.f46974q = true;
            if (z10) {
                this.f46975r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f46966h = true;
            this.f46969k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f46978u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.c();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        o oVarG = g(i10, keyEvent);
        boolean zQ = oVarG != null ? q(oVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, y yVar, int i10) {
        p pVar;
        boolean zExpandActionView;
        p pVar2;
        boolean z10;
        e0 e0Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        y yVar2;
        o oVar = (o) menuItem;
        boolean zI = false;
        if (oVar == null || !oVar.isEnabled()) {
            return false;
        }
        m mVar = oVar.f46997n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oVar.f46999p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oVar)) && !mVar.e(mVar, oVar)) {
            Intent intent = oVar.f46991g;
            if (intent != null) {
                try {
                    mVar.f46959a.startActivity(intent);
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                    pVar = oVar.A;
                    if (pVar == null) {
                    }
                    zExpandActionView = false;
                    pVar2 = oVar.A;
                    if (pVar2 == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (oVar.e()) {
                        zExpandActionView |= oVar.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (oVar.hasSubMenu()) {
                        if ((i10 & 4) == 0) {
                            c(false);
                        }
                        if (!oVar.hasSubMenu()) {
                            e0 e0Var2 = new e0(this.f46959a, this, oVar);
                            oVar.f46998o = e0Var2;
                            e0Var2.setHeaderTitle(oVar.f46989e);
                        }
                        e0Var = oVar.f46998o;
                        if (z10) {
                            pVar2.f47011b.onPrepareSubMenu(e0Var);
                        }
                        copyOnWriteArrayList = this.f46978u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (yVar != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zI) {
                                    zI = yVar2.i(e0Var);
                                }
                            }
                        }
                        zExpandActionView |= zI;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i10 & 4) == 0) {
                            c(false);
                        }
                        if (!oVar.hasSubMenu()) {
                            e0 e0Var3 = new e0(this.f46959a, this, oVar);
                            oVar.f46998o = e0Var3;
                            e0Var3.setHeaderTitle(oVar.f46989e);
                        }
                        e0Var = oVar.f46998o;
                        if (z10) {
                            pVar2.f47011b.onPrepareSubMenu(e0Var);
                        }
                        copyOnWriteArrayList = this.f46978u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zI = yVar != null ? yVar.i(e0Var) : false;
                            while (r8.hasNext()) {
                                yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zI) {
                                    zI = yVar2.i(e0Var);
                                }
                            }
                        }
                        zExpandActionView |= zI;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                pVar = oVar.A;
                if (pVar == null && pVar.f47011b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        pVar2 = oVar.A;
        if (pVar2 == null && pVar2.f47011b.hasSubMenu()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (oVar.e()) {
            zExpandActionView |= oVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (oVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!oVar.hasSubMenu()) {
                e0 e0Var4 = new e0(this.f46959a, this, oVar);
                oVar.f46998o = e0Var4;
                e0Var4.setHeaderTitle(oVar.f46989e);
            }
            e0Var = oVar.f46998o;
            if (z10) {
                pVar2.f47011b.onPrepareSubMenu(e0Var);
            }
            copyOnWriteArrayList = this.f46978u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (yVar != null) {
                }
                while (r8.hasNext()) {
                    yVar2 = (y) weakReference.get();
                    if (yVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zI) {
                        zI = yVar2.i(e0Var);
                    }
                }
            }
            zExpandActionView |= zI;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i10 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f46978u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f46964f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((o) arrayList.get(i12)).f46986b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((o) arrayList.get(i12)).f46986b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f46964f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((o) arrayList.get(i11)).f46985a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i11);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f46964f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = this.f46964f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (oVar.f46986b == i10) {
                oVar.f47007x = (oVar.f47007x & (-5)) | (z11 ? 4 : 0);
                oVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f46980w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f46964f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (oVar.f46986b == i10) {
                oVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList arrayList = this.f46964f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (oVar.f46986b == i10) {
                int i12 = oVar.f47007x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                oVar.f47007x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f46961c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f46964f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f46964f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
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
                ((e0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f46972o = view;
            this.f46970m = null;
            this.f46971n = null;
        } else {
            if (i10 > 0) {
                this.f46970m = this.f46960b.getText(i10);
            } else if (charSequence != null) {
                this.f46970m = charSequence;
            }
            if (i11 > 0) {
                this.f46971n = this.f46959a.getDrawable(i11);
            } else if (drawable != null) {
                this.f46971n = drawable;
            }
            this.f46972o = null;
        }
        p(false);
    }

    public final void v() {
        this.f46973p = false;
        if (this.f46974q) {
            this.f46974q = false;
            p(this.f46975r);
        }
    }

    public final void w() {
        if (this.f46973p) {
            return;
        }
        this.f46973p = true;
        this.f46974q = false;
        this.f46975r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f46960b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f46960b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        o oVarA = a(i10, i11, i12, charSequence);
        e0 e0Var = new e0(this.f46959a, this, oVarA);
        oVarA.f46998o = e0Var;
        e0Var.setHeaderTitle(oVarA.f46989e);
        return e0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f46960b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f46960b.getString(i13));
    }

    public m k() {
        return this;
    }
}
