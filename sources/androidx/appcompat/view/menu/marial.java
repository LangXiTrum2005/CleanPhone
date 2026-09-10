package androidx.appcompat.view.menu;

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
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.treadless;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MenuBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class marial implements julian.attabal {

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public static final int[] f4949cuirassed = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public View f4952arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f4953attabal;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public boolean f4956cord;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f4958dern;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f4963impassible;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Drawable f4965kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public attabal f4966marial;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public competently f4971rotuma;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Resources f4972saneness;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public CharSequence f4974triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f4975wireman;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f4960formularize = 0;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f4968monoploid = false;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f4969polloi = false;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f4967molybdenite = false;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f4962graveside = false;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f4950adultoid = false;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public ArrayList<competently> f4959dovishness = new ArrayList<>();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<apical>> f4961gintrap = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public boolean f4970preprohormone = false;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public ArrayList<competently> f4954beachfront = new ArrayList<>();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public ArrayList<competently> f4955competently = new ArrayList<>();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f4964impromptu = true;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public ArrayList<competently> f4973taiyuan = new ArrayList<>();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public ArrayList<competently> f4957cutely = new ArrayList<>();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f4951apical = true;

    /* JADX INFO: compiled from: MenuBuilder.java */
    public interface attabal {
        boolean attabal(marial marialVar, MenuItem menuItem);

        void saneness(marial marialVar);
    }

    /* JADX INFO: compiled from: MenuBuilder.java */
    public interface saneness {
        boolean invokeItem(competently competentlyVar);
    }

    public marial(Context context) {
        this.f4953attabal = context;
        this.f4972saneness = context.getResources();
        coffeecake(true);
    }

    public static int arytenoidectomy(ArrayList<competently> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).beachfront() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public static int oilcan(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f4949cuirassed;
            if (i2 < iArr.length) {
                return (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return attabal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f4953attabal.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public ArrayList<competently> adultoid() {
        graveside();
        return this.f4973taiyuan;
    }

    public final void apical(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.f4961gintrap.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<apical> weakReference : this.f4961gintrap) {
            apical apicalVar = weakReference.get();
            if (apicalVar == null) {
                this.f4961gintrap.remove(weakReference);
            } else {
                int id = apicalVar.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = apicalVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public MenuItem attabal(int i, int i2, int i3, CharSequence charSequence) {
        int iOilcan = oilcan(i3);
        competently competentlyVarCompetently = competently(i, i2, i3, iOilcan, charSequence, this.f4960formularize);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f4963impassible;
        if (contextMenuInfo != null) {
            competentlyVarCompetently.dovishness(contextMenuInfo);
        }
        ArrayList<competently> arrayList = this.f4954beachfront;
        arrayList.add(arytenoidectomy(arrayList, iOilcan), competentlyVarCompetently);
        saran(true);
        return competentlyVarCompetently;
    }

    public boolean beachfront(competently competentlyVar) {
        boolean zCollapseItemActionView = false;
        if (!this.f4961gintrap.isEmpty() && this.f4971rotuma == competentlyVar) {
            nosophobia();
            for (WeakReference<apical> weakReference : this.f4961gintrap) {
                apical apicalVar = weakReference.get();
                if (apicalVar != null) {
                    zCollapseItemActionView = apicalVar.collapseItemActionView(this, competentlyVar);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    this.f4961gintrap.remove(weakReference);
                }
            }
            lerp();
            if (zCollapseItemActionView) {
                this.f4971rotuma = null;
            }
        }
        return zCollapseItemActionView;
    }

    @Override // android.view.Menu
    public void clear() {
        competently competentlyVar = this.f4971rotuma;
        if (competentlyVar != null) {
            beachfront(competentlyVar);
        }
        this.f4954beachfront.clear();
        saran(true);
    }

    public void clearHeader() {
        this.f4965kowloon = null;
        this.f4974triweekly = null;
        this.f4952arytenoidectomy = null;
        saran(false);
    }

    @Override // android.view.Menu
    public void close() {
        marial(true);
    }

    public marial clubfoot(int i) {
        this.f4960formularize = i;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final void coffeecake(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.f4972saneness.getConfiguration().keyboard != 1 && treadless.formularize(ViewConfiguration.get(this.f4953attabal), this.f4953attabal);
        }
        this.f4975wireman = z2;
    }

    public final competently competently(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new competently(this, i, i2, i3, i4, charSequence, i5);
    }

    public CharSequence cord() {
        return this.f4974triweekly;
    }

    public boolean creditor(MenuItem menuItem, apical apicalVar, int i) {
        competently competentlyVar = (competently) menuItem;
        if (competentlyVar == null || !competentlyVar.isEnabled()) {
            return false;
        }
        boolean zApical = competentlyVar.apical();
        androidx.core.view.saneness sanenessVarAttabal = competentlyVar.attabal();
        boolean z = sanenessVarAttabal != null && sanenessVarAttabal.attabal();
        if (competentlyVar.cutely()) {
            boolean zExpandActionView = competentlyVar.expandActionView() | zApical;
            if (zExpandActionView) {
                marial(true);
            }
            return zExpandActionView;
        }
        if (!competentlyVar.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                marial(true);
            }
            return zApical;
        }
        if ((i & 4) == 0) {
            marial(false);
        }
        if (!competentlyVar.hasSubMenu()) {
            competentlyVar.rotuma(new arytenoidectomy(gintrap(), this, competentlyVar));
        }
        arytenoidectomy arytenoidectomyVar = (arytenoidectomy) competentlyVar.getSubMenu();
        if (z) {
            sanenessVarAttabal.beachfront(arytenoidectomyVar);
        }
        boolean zFormularize = formularize(arytenoidectomyVar, apicalVar) | zApical;
        if (!zFormularize) {
            marial(true);
        }
        return zFormularize;
    }

    public View cuirassed() {
        return this.f4952arytenoidectomy;
    }

    public marial cultivated(Drawable drawable) {
        premeiotic(0, null, 0, drawable, null);
        return this;
    }

    public final void cutely(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f4961gintrap.isEmpty()) {
            return;
        }
        for (WeakReference<apical> weakReference : this.f4961gintrap) {
            apical apicalVar = weakReference.get();
            if (apicalVar == null) {
                this.f4961gintrap.remove(weakReference);
            } else {
                int id = apicalVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    apicalVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    public void dent(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f4954beachfront.size();
        nosophobia();
        for (int i = 0; i < size; i++) {
            competently competentlyVar = this.f4954beachfront.get(i);
            if (competentlyVar.getGroupId() == groupId && competentlyVar.impassible() && competentlyVar.isCheckable()) {
                competentlyVar.molybdenite(competentlyVar == menuItem);
            }
        }
        lerp();
    }

    public void dern(apical apicalVar, Context context) {
        this.f4961gintrap.add(new WeakReference<>(apicalVar));
        apicalVar.initForMenu(context, this);
        this.f4951apical = true;
    }

    public String dovishness() {
        return "android:menu:actionviewstates";
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            competently competentlyVar = this.f4954beachfront.get(i2);
            if (competentlyVar.getItemId() == i) {
                return competentlyVar;
            }
            if (competentlyVar.hasSubMenu() && (menuItemFindItem = competentlyVar.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final boolean formularize(arytenoidectomy arytenoidectomyVar, apical apicalVar) {
        if (this.f4961gintrap.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = apicalVar != null ? apicalVar.onSubMenuSelected(arytenoidectomyVar) : false;
        for (WeakReference<apical> weakReference : this.f4961gintrap) {
            apical apicalVar2 = weakReference.get();
            if (apicalVar2 == null) {
                this.f4961gintrap.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = apicalVar2.onSubMenuSelected(arytenoidectomyVar);
            }
        }
        return zOnSubMenuSelected;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f4954beachfront.get(i);
    }

    public Context gintrap() {
        return this.f4953attabal;
    }

    public void graveside() {
        ArrayList<competently> arrayListKattegat = kattegat();
        if (this.f4951apical) {
            boolean zFlagActionItems = false;
            for (WeakReference<apical> weakReference : this.f4961gintrap) {
                apical apicalVar = weakReference.get();
                if (apicalVar == null) {
                    this.f4961gintrap.remove(weakReference);
                } else {
                    zFlagActionItems |= apicalVar.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.f4973taiyuan.clear();
                this.f4957cutely.clear();
                int size = arrayListKattegat.size();
                for (int i = 0; i < size; i++) {
                    competently competentlyVar = arrayListKattegat.get(i);
                    if (competentlyVar.formularize()) {
                        this.f4973taiyuan.add(competentlyVar);
                    } else {
                        this.f4957cutely.add(competentlyVar);
                    }
                }
            } else {
                this.f4973taiyuan.clear();
                this.f4957cutely.clear();
                this.f4957cutely.addAll(kattegat());
            }
            this.f4951apical = false;
        }
    }

    public void grimness(competently competentlyVar) {
        this.f4964impromptu = true;
        saran(true);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f4956cord) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4954beachfront.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void hydrovane(apical apicalVar) {
        for (WeakReference<apical> weakReference : this.f4961gintrap) {
            apical apicalVar2 = weakReference.get();
            if (apicalVar2 == null || apicalVar2 == apicalVar) {
                this.f4961gintrap.remove(weakReference);
            }
        }
    }

    public boolean impassible(competently competentlyVar) {
        boolean zExpandItemActionView = false;
        if (this.f4961gintrap.isEmpty()) {
            return false;
        }
        nosophobia();
        for (WeakReference<apical> weakReference : this.f4961gintrap) {
            apical apicalVar = weakReference.get();
            if (apicalVar != null) {
                zExpandItemActionView = apicalVar.expandItemActionView(this, competentlyVar);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                this.f4961gintrap.remove(weakReference);
            }
        }
        lerp();
        if (zExpandItemActionView) {
            this.f4971rotuma = competentlyVar;
        }
        return zExpandItemActionView;
    }

    public boolean impromptu(marial marialVar, MenuItem menuItem) {
        attabal attabalVar = this.f4966marial;
        return attabalVar != null && attabalVar.attabal(marialVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return polloi(i, keyEvent) != null;
    }

    public void itchy(boolean z) {
        this.f4956cord = z;
    }

    public ArrayList<competently> kattegat() {
        if (!this.f4964impromptu) {
            return this.f4955competently;
        }
        this.f4955competently.clear();
        int size = this.f4954beachfront.size();
        for (int i = 0; i < size; i++) {
            competently competentlyVar = this.f4954beachfront.get(i);
            if (competentlyVar.isVisible()) {
                this.f4955competently.add(competentlyVar);
            }
        }
        this.f4964impromptu = false;
        this.f4951apical = true;
        return this.f4955competently;
    }

    public int kowloon(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f4954beachfront.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public void lerp() {
        this.f4968monoploid = false;
        if (this.f4969polloi) {
            this.f4969polloi = false;
            saran(this.f4967molybdenite);
        }
    }

    public final void marial(boolean z) {
        if (this.f4950adultoid) {
            return;
        }
        this.f4950adultoid = true;
        for (WeakReference<apical> weakReference : this.f4961gintrap) {
            apical apicalVar = weakReference.get();
            if (apicalVar == null) {
                this.f4961gintrap.remove(weakReference);
            } else {
                apicalVar.onCloseMenu(this, z);
            }
        }
        this.f4950adultoid = false;
    }

    public void mathsort(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
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
                ((arytenoidectomy) item.getSubMenu()).mathsort(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(dovishness(), sparseArray);
        }
    }

    public boolean merc() {
        return this.f4958dern;
    }

    public marial milliradian(CharSequence charSequence) {
        premeiotic(0, charSequence, 0, null, null);
        return this;
    }

    public void molybdenite(List<competently> list, int i, KeyEvent keyEvent) {
        boolean zMerc = merc();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f4954beachfront.size();
            for (int i2 = 0; i2 < size; i2++) {
                competently competentlyVar = this.f4954beachfront.get(i2);
                if (competentlyVar.hasSubMenu()) {
                    ((marial) competentlyVar.getSubMenu()).molybdenite(list, i, keyEvent);
                }
                char alphabeticShortcut = zMerc ? competentlyVar.getAlphabeticShortcut() : competentlyVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zMerc ? competentlyVar.getAlphabeticModifiers() : competentlyVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zMerc && alphabeticShortcut == '\b' && i == 67)) && competentlyVar.isEnabled()) {
                        list.add(competentlyVar);
                    }
                }
            }
        }
    }

    public int monoploid(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f4954beachfront.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public void nosophobia() {
        if (this.f4968monoploid) {
            return;
        }
        this.f4968monoploid = true;
        this.f4969polloi = false;
        this.f4967molybdenite = false;
    }

    public void overspeculate(attabal attabalVar) {
        this.f4966marial = attabalVar;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return privatdozent(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        competently competentlyVarPolloi = polloi(i, keyEvent);
        boolean zPrivatdozent = competentlyVarPolloi != null ? privatdozent(competentlyVarPolloi, i2) : false;
        if ((i2 & 2) != 0) {
            marial(true);
        }
        return zPrivatdozent;
    }

    public void peridotite(Bundle bundle) {
        cutely(bundle);
    }

    public marial permissivist(int i) {
        premeiotic(0, null, i, null, null);
        return this;
    }

    public boolean polder() {
        return this.f4975wireman;
    }

    public competently polloi(int i, KeyEvent keyEvent) {
        ArrayList<competently> arrayList = this.f4959dovishness;
        arrayList.clear();
        molybdenite(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zMerc = merc();
        for (int i2 = 0; i2 < size; i2++) {
            competently competentlyVar = arrayList.get(i2);
            char alphabeticShortcut = zMerc ? competentlyVar.getAlphabeticShortcut() : competentlyVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zMerc && alphabeticShortcut == '\b' && i == 67))) {
                return competentlyVar;
            }
        }
        return null;
    }

    public final void premeiotic(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resourcesYemenite = yemenite();
        if (view != null) {
            this.f4952arytenoidectomy = view;
            this.f4974triweekly = null;
            this.f4965kowloon = null;
        } else {
            if (i > 0) {
                this.f4974triweekly = resourcesYemenite.getText(i);
            } else if (charSequence != null) {
                this.f4974triweekly = charSequence;
            }
            if (i2 > 0) {
                this.f4965kowloon = picketboat.saneness.getDrawable(gintrap(), i2);
            } else if (drawable != null) {
                this.f4965kowloon = drawable;
            }
            this.f4952arytenoidectomy = null;
        }
        saran(false);
    }

    public Drawable preprohormone() {
        return this.f4965kowloon;
    }

    public boolean privatdozent(MenuItem menuItem, int i) {
        return creditor(menuItem, null, i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iTriweekly = triweekly(i);
        if (iTriweekly >= 0) {
            int size = this.f4954beachfront.size() - iTriweekly;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f4954beachfront.get(iTriweekly).getGroupId() != i) {
                    break;
                }
                starveling(iTriweekly, false);
                i2 = i3;
            }
            saran(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        starveling(monoploid(i), true);
    }

    public boolean restrictive() {
        return this.f4970preprohormone;
    }

    public competently rotuma() {
        return this.f4971rotuma;
    }

    public void saneness(apical apicalVar) {
        dern(apicalVar, this.f4953attabal);
    }

    public void saran(boolean z) {
        if (this.f4968monoploid) {
            this.f4969polloi = true;
            if (z) {
                this.f4967molybdenite = true;
                return;
            }
            return;
        }
        if (z) {
            this.f4964impromptu = true;
            this.f4951apical = true;
        }
        taiyuan(z);
    }

    public void seminary(competently competentlyVar) {
        this.f4951apical = true;
        saran(true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f4954beachfront.size();
        for (int i2 = 0; i2 < size; i2++) {
            competently competentlyVar = this.f4954beachfront.get(i2);
            if (competentlyVar.getGroupId() == i) {
                competentlyVar.graveside(z2);
                competentlyVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f4970preprohormone = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f4954beachfront.size();
        for (int i2 = 0; i2 < size; i2++) {
            competently competentlyVar = this.f4954beachfront.get(i2);
            if (competentlyVar.getGroupId() == i) {
                competentlyVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f4954beachfront.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            competently competentlyVar = this.f4954beachfront.get(i2);
            if (competentlyVar.getGroupId() == i && competentlyVar.preprohormone(z)) {
                z2 = true;
            }
        }
        if (z2) {
            saran(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f4958dern = z;
        saran(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f4954beachfront.size();
    }

    public void splinterproof(Bundle bundle) {
        apical(bundle);
    }

    public final void starveling(int i, boolean z) {
        if (i < 0 || i >= this.f4954beachfront.size()) {
            return;
        }
        this.f4954beachfront.remove(i);
        if (z) {
            saran(true);
        }
    }

    public ArrayList<competently> stratoscope() {
        graveside();
        return this.f4957cutely;
    }

    public boolean supplicat() {
        return !this.f4968monoploid;
    }

    public final void taiyuan(boolean z) {
        if (this.f4961gintrap.isEmpty()) {
            return;
        }
        nosophobia();
        for (WeakReference<apical> weakReference : this.f4961gintrap) {
            apical apicalVar = weakReference.get();
            if (apicalVar == null) {
                this.f4961gintrap.remove(weakReference);
            } else {
                apicalVar.updateMenuView(z);
            }
        }
        lerp();
    }

    public marial timberyard(int i) {
        premeiotic(i, null, 0, null, null);
        return this;
    }

    public marial treadless(View view) {
        premeiotic(0, null, 0, null, view);
        return this;
    }

    public int triweekly(int i) {
        return kowloon(i, 0);
    }

    public boolean trm() {
        return this.f4962graveside;
    }

    public void walach(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(dovishness());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((arytenoidectomy) item.getSubMenu()).walach(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void wireman() {
        attabal attabalVar = this.f4966marial;
        if (attabalVar != null) {
            attabalVar.saneness(this);
        }
    }

    public Resources yemenite() {
        return this.f4972saneness;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return attabal(0, 0, 0, this.f4972saneness.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f4972saneness.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return attabal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        competently competentlyVar = (competently) attabal(i, i2, i3, charSequence);
        arytenoidectomy arytenoidectomyVar = new arytenoidectomy(this.f4953attabal, this, competentlyVar);
        competentlyVar.rotuma(arytenoidectomyVar);
        return arytenoidectomyVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return attabal(i, i2, i3, this.f4972saneness.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f4972saneness.getString(i4));
    }

    public marial sealless() {
        return this;
    }
}
