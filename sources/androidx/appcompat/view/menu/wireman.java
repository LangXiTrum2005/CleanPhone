package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.cord;
import androidx.core.view.molybdenite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CascadingMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman extends taiyuan implements apical, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public static final int f4988creditor = beachfront.competently.abc_cascading_menu_item_layout;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final Handler f4989adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Context f4990arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final boolean f4995graveside;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public ViewTreeObserver f4996grimness;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public boolean f4997kattegat;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final int f4999molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final int f5000monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public View f5001oilcan;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public boolean f5002polder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final int f5003polloi;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public boolean f5005privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public int f5006restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public PopupWindow.OnDismissListener f5008saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public boolean f5009sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public apical.attabal f5010seminary;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public int f5012supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public View f5013trm;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final List<marial> f4993dovishness = new ArrayList();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final List<C0031wireman> f4994gintrap = new ArrayList();

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f5007rotuma = new attabal();

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f5004preprohormone = new saneness();

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final cord f4991cord = new dern();

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public int f4992cuirassed = 0;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public int f5011stratoscope = 0;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public boolean f4998merc = false;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public int f5014yemenite = adultoid();

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class attabal implements ViewTreeObserver.OnGlobalLayoutListener {
        public attabal() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!wireman.this.attabal() || wireman.this.f4994gintrap.size() <= 0 || wireman.this.f4994gintrap.get(0).f5022attabal.cuirassed()) {
                return;
            }
            View view = wireman.this.f5001oilcan;
            if (view == null || !view.isShown()) {
                wireman.this.dismiss();
                return;
            }
            Iterator<C0031wireman> it = wireman.this.f4994gintrap.iterator();
            while (it.hasNext()) {
                it.next().f5022attabal.show();
            }
        }
    }

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class dern implements cord {

        /* JADX INFO: compiled from: CascadingMenuPopup.java */
        public class attabal implements Runnable {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ MenuItem f5017arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ C0031wireman f5018kowloon;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public final /* synthetic */ marial f5019monoploid;

            public attabal(C0031wireman c0031wireman, MenuItem menuItem, marial marialVar) {
                this.f5018kowloon = c0031wireman;
                this.f5017arytenoidectomy = menuItem;
                this.f5019monoploid = marialVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0031wireman c0031wireman = this.f5018kowloon;
                if (c0031wireman != null) {
                    wireman.this.f5005privatdozent = true;
                    c0031wireman.f5024saneness.marial(false);
                    wireman.this.f5005privatdozent = false;
                }
                if (this.f5017arytenoidectomy.isEnabled() && this.f5017arytenoidectomy.hasSubMenu()) {
                    this.f5019monoploid.privatdozent(this.f5017arytenoidectomy, 4);
                }
            }
        }

        public dern() {
        }

        @Override // androidx.appcompat.widget.cord
        public void triweekly(marial marialVar, MenuItem menuItem) {
            wireman.this.f4989adultoid.removeCallbacksAndMessages(marialVar);
        }

        @Override // androidx.appcompat.widget.cord
        public void wireman(marial marialVar, MenuItem menuItem) {
            wireman.this.f4989adultoid.removeCallbacksAndMessages(null);
            int size = wireman.this.f4994gintrap.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (marialVar == wireman.this.f4994gintrap.get(i).f5024saneness) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            wireman.this.f4989adultoid.postAtTime(new attabal(i2 < wireman.this.f4994gintrap.size() ? wireman.this.f4994gintrap.get(i2) : null, menuItem, marialVar), marialVar, SystemClock.uptimeMillis() + 200);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public static class C0031wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final MenuPopupWindow f5022attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f5023dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final marial f5024saneness;

        public C0031wireman(MenuPopupWindow menuPopupWindow, marial marialVar, int i) {
            this.f5022attabal = menuPopupWindow;
            this.f5024saneness = marialVar;
            this.f5023dern = i;
        }

        public ListView attabal() {
            return this.f5022attabal.kowloon();
        }
    }

    public wireman(Context context, View view, int i, int i2, boolean z) {
        this.f4990arytenoidectomy = context;
        this.f5013trm = view;
        this.f5003polloi = i;
        this.f4999molybdenite = i2;
        this.f4995graveside = z;
        Resources resources = context.getResources();
        this.f5000monoploid = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(beachfront.wireman.abc_config_prefDialogWidth));
        this.f4989adultoid = new Handler();
    }

    public final int adultoid() {
        return this.f5013trm.getLayoutDirection() == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void apical(PopupWindow.OnDismissListener onDismissListener) {
        this.f5008saran = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.triweekly
    public boolean attabal() {
        return this.f4994gintrap.size() > 0 && this.f4994gintrap.get(0).f5022attabal.attabal();
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void beachfront(View view) {
        if (this.f5013trm != view) {
            this.f5013trm = view;
            this.f5011stratoscope = molybdenite.saneness(this.f4992cuirassed, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void cutely(int i) {
        this.f5009sealless = true;
        this.f5012supplicat = i;
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public boolean dern() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.triweekly
    public void dismiss() {
        int size = this.f4994gintrap.size();
        if (size > 0) {
            C0031wireman[] c0031wiremanArr = (C0031wireman[]) this.f4994gintrap.toArray(new C0031wireman[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0031wireman c0031wireman = c0031wiremanArr[i];
                if (c0031wireman.f5022attabal.attabal()) {
                    c0031wireman.f5022attabal.dismiss();
                }
            }
        }
    }

    public final int dovishness(int i) {
        List<C0031wireman> list = this.f4994gintrap;
        ListView listViewAttabal = list.get(list.size() - 1).attabal();
        int[] iArr = new int[2];
        listViewAttabal.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f5001oilcan.getWindowVisibleDisplayFrame(rect);
        if (this.f5014yemenite == 1) {
            return (iArr[0] + listViewAttabal.getWidth()) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // androidx.appcompat.view.menu.apical
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void formularize(boolean z) {
        this.f5002polder = z;
    }

    public final void gintrap(marial marialVar) {
        C0031wireman c0031wireman;
        View viewGraveside;
        int i;
        int i2;
        int i3;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4990arytenoidectomy);
        MenuAdapter menuAdapter = new MenuAdapter(marialVar, layoutInflaterFrom, this.f4995graveside, f4988creditor);
        if (!attabal() && this.f4998merc) {
            menuAdapter.setForceShowIcon(true);
        } else if (attabal()) {
            menuAdapter.setForceShowIcon(taiyuan.triweekly(marialVar));
        }
        int iMarial = taiyuan.marial(menuAdapter, null, this.f4990arytenoidectomy, this.f5000monoploid);
        MenuPopupWindow menuPopupWindowMonoploid = monoploid();
        menuPopupWindowMonoploid.impassible(menuAdapter);
        menuPopupWindowMonoploid.yemenite(iMarial);
        menuPopupWindowMonoploid.sealless(this.f5011stratoscope);
        if (this.f4994gintrap.size() > 0) {
            List<C0031wireman> list = this.f4994gintrap;
            c0031wireman = list.get(list.size() - 1);
            viewGraveside = graveside(c0031wireman, marialVar);
        } else {
            c0031wireman = null;
            viewGraveside = null;
        }
        if (viewGraveside != null) {
            menuPopupWindowMonoploid.mathsort(false);
            menuPopupWindowMonoploid.hydrovane(null);
            int iDovishness = dovishness(iMarial);
            boolean z = iDovishness == 1;
            this.f5014yemenite = iDovishness;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowMonoploid.trm(viewGraveside);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f5013trm.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewGraveside.getLocationOnScreen(iArr2);
                if ((this.f5011stratoscope & 7) == 5) {
                    iArr[0] = iArr[0] + this.f5013trm.getWidth();
                    iArr2[0] = iArr2[0] + viewGraveside.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f5011stratoscope & 5) == 5) {
                if (z) {
                    i3 = i + iMarial;
                } else {
                    iMarial = viewGraveside.getWidth();
                    i3 = i - iMarial;
                }
            } else if (z) {
                iMarial = viewGraveside.getWidth();
                i3 = i + iMarial;
            } else {
                i3 = i - iMarial;
            }
            menuPopupWindowMonoploid.marial(i3);
            menuPopupWindowMonoploid.grimness(true);
            menuPopupWindowMonoploid.taiyuan(i2);
        } else {
            if (this.f5009sealless) {
                menuPopupWindowMonoploid.marial(this.f5012supplicat);
            }
            if (this.f4997kattegat) {
                menuPopupWindowMonoploid.taiyuan(this.f5006restrictive);
            }
            menuPopupWindowMonoploid.kattegat(wireman());
        }
        this.f4994gintrap.add(new C0031wireman(menuPopupWindowMonoploid, marialVar, this.f5014yemenite));
        menuPopupWindowMonoploid.show();
        ListView listViewKowloon = menuPopupWindowMonoploid.kowloon();
        listViewKowloon.setOnKeyListener(this);
        if (c0031wireman == null && this.f5002polder && marialVar.cord() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(beachfront.competently.abc_popup_menu_header_item_layout, (ViewGroup) listViewKowloon, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(marialVar.cord());
            listViewKowloon.addHeaderView(frameLayout, null, false);
            menuPopupWindowMonoploid.show();
        }
    }

    public final View graveside(C0031wireman c0031wireman, marial marialVar) {
        MenuAdapter menuAdapter;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemMolybdenite = molybdenite(c0031wireman.f5024saneness, marialVar);
        if (menuItemMolybdenite == null) {
            return null;
        }
        ListView listViewAttabal = c0031wireman.attabal();
        ListAdapter adapter = listViewAttabal.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
        } else {
            menuAdapter = (MenuAdapter) adapter;
            headersCount = 0;
        }
        int count = menuAdapter.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemMolybdenite == menuAdapter.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewAttabal.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewAttabal.getChildCount()) {
            return listViewAttabal.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void impassible(int i) {
        this.f4997kattegat = true;
        this.f5006restrictive = i;
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void impromptu(boolean z) {
        this.f4998merc = z;
    }

    @Override // androidx.appcompat.view.menu.triweekly
    public ListView kowloon() {
        if (this.f4994gintrap.isEmpty()) {
            return null;
        }
        List<C0031wireman> list = this.f4994gintrap;
        return list.get(list.size() - 1).attabal();
    }

    public final MenuItem molybdenite(marial marialVar, marial marialVar2) {
        int size = marialVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = marialVar.getItem(i);
            if (item.hasSubMenu() && marialVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final MenuPopupWindow monoploid() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f4990arytenoidectomy, null, this.f5003polloi, this.f4999molybdenite);
        menuPopupWindow.peridotite(this.f4991cord);
        menuPopupWindow.polder(this);
        menuPopupWindow.merc(this);
        menuPopupWindow.trm(this.f5013trm);
        menuPopupWindow.sealless(this.f5011stratoscope);
        menuPopupWindow.restrictive(true);
        menuPopupWindow.supplicat(2);
        return menuPopupWindow;
    }

    @Override // androidx.appcompat.view.menu.apical
    public void onCloseMenu(marial marialVar, boolean z) {
        int iPolloi = polloi(marialVar);
        if (iPolloi < 0) {
            return;
        }
        int i = iPolloi + 1;
        if (i < this.f4994gintrap.size()) {
            this.f4994gintrap.get(i).f5024saneness.marial(false);
        }
        C0031wireman c0031wiremanRemove = this.f4994gintrap.remove(iPolloi);
        c0031wiremanRemove.f5024saneness.hydrovane(this);
        if (this.f5005privatdozent) {
            c0031wiremanRemove.f5022attabal.walach(null);
            c0031wiremanRemove.f5022attabal.oilcan(0);
        }
        c0031wiremanRemove.f5022attabal.dismiss();
        int size = this.f4994gintrap.size();
        if (size > 0) {
            this.f5014yemenite = this.f4994gintrap.get(size - 1).f5023dern;
        } else {
            this.f5014yemenite = adultoid();
        }
        if (size != 0) {
            if (z) {
                this.f4994gintrap.get(0).f5024saneness.marial(false);
                return;
            }
            return;
        }
        dismiss();
        apical.attabal attabalVar = this.f5010seminary;
        if (attabalVar != null) {
            attabalVar.onCloseMenu(marialVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4996grimness;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4996grimness.removeGlobalOnLayoutListener(this.f5007rotuma);
            }
            this.f4996grimness = null;
        }
        this.f5001oilcan.removeOnAttachStateChangeListener(this.f5004preprohormone);
        this.f5008saran.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0031wireman c0031wireman;
        int size = this.f4994gintrap.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0031wireman = null;
                break;
            }
            c0031wireman = this.f4994gintrap.get(i);
            if (!c0031wireman.f5022attabal.attabal()) {
                break;
            } else {
                i++;
            }
        }
        if (c0031wireman != null) {
            c0031wireman.f5024saneness.marial(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.apical
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.apical
    public boolean onSubMenuSelected(arytenoidectomy arytenoidectomyVar) {
        for (C0031wireman c0031wireman : this.f4994gintrap) {
            if (arytenoidectomyVar == c0031wireman.f5024saneness) {
                c0031wireman.attabal().requestFocus();
                return true;
            }
        }
        if (!arytenoidectomyVar.hasVisibleItems()) {
            return false;
        }
        saneness(arytenoidectomyVar);
        apical.attabal attabalVar = this.f5010seminary;
        if (attabalVar != null) {
            attabalVar.attabal(arytenoidectomyVar);
        }
        return true;
    }

    public final int polloi(marial marialVar) {
        int size = this.f4994gintrap.size();
        for (int i = 0; i < size; i++) {
            if (marialVar == this.f4994gintrap.get(i).f5024saneness) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void saneness(marial marialVar) {
        marialVar.dern(this, this.f4990arytenoidectomy);
        if (attabal()) {
            gintrap(marialVar);
        } else {
            this.f4993dovishness.add(marialVar);
        }
    }

    @Override // androidx.appcompat.view.menu.apical
    public void setCallback(apical.attabal attabalVar) {
        this.f5010seminary = attabalVar;
    }

    @Override // androidx.appcompat.view.menu.triweekly
    public void show() {
        if (attabal()) {
            return;
        }
        Iterator<marial> it = this.f4993dovishness.iterator();
        while (it.hasNext()) {
            gintrap(it.next());
        }
        this.f4993dovishness.clear();
        View view = this.f5013trm;
        this.f5001oilcan = view;
        if (view != null) {
            boolean z = this.f4996grimness == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4996grimness = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f5007rotuma);
            }
            this.f5001oilcan.addOnAttachStateChangeListener(this.f5004preprohormone);
        }
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void taiyuan(int i) {
        if (this.f4992cuirassed != i) {
            this.f4992cuirassed = i;
            this.f5011stratoscope = molybdenite.saneness(i, this.f5013trm.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.apical
    public void updateMenuView(boolean z) {
        Iterator<C0031wireman> it = this.f4994gintrap.iterator();
        while (it.hasNext()) {
            taiyuan.arytenoidectomy(it.next().attabal().getAdapter()).notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class saneness implements View.OnAttachStateChangeListener {
        public saneness() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = wireman.this.f4996grimness;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    wireman.this.f4996grimness = view.getViewTreeObserver();
                }
                wireman wiremanVar = wireman.this;
                wiremanVar.f4996grimness.removeGlobalOnLayoutListener(wiremanVar.f5007rotuma);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.apical
    public void onRestoreInstanceState(Parcelable parcelable) {
    }
}
