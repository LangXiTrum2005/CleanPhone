package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;

/* JADX INFO: compiled from: StandardMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon extends taiyuan implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, apical, View.OnKeyListener {

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public static final int f4926merc = beachfront.competently.abc_popup_menu_item_layout;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final int f4927adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Context f4928arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4929cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public View f4930cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final int f4931dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final MenuPopupWindow f4932gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final int f4933graveside;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public int f4934kattegat;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final boolean f4935molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final marial f4936monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public ViewTreeObserver f4937oilcan;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final MenuAdapter f4938polloi;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public boolean f4940restrictive;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public boolean f4942sealless;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public View f4943stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public apical.attabal f4945trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public boolean f4946yemenite;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f4941rotuma = new attabal();

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f4939preprohormone = new saneness();

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public int f4944supplicat = 0;

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    public class attabal implements ViewTreeObserver.OnGlobalLayoutListener {
        public attabal() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!kowloon.this.attabal() || kowloon.this.f4932gintrap.cuirassed()) {
                return;
            }
            View view = kowloon.this.f4943stratoscope;
            if (view == null || !view.isShown()) {
                kowloon.this.dismiss();
            } else {
                kowloon.this.f4932gintrap.show();
            }
        }
    }

    public kowloon(Context context, marial marialVar, View view, int i, int i2, boolean z) {
        this.f4928arytenoidectomy = context;
        this.f4936monoploid = marialVar;
        this.f4935molybdenite = z;
        this.f4938polloi = new MenuAdapter(marialVar, LayoutInflater.from(context), z, f4926merc);
        this.f4927adultoid = i;
        this.f4931dovishness = i2;
        Resources resources = context.getResources();
        this.f4933graveside = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(beachfront.wireman.abc_config_prefDialogWidth));
        this.f4930cuirassed = view;
        this.f4932gintrap = new MenuPopupWindow(context, null, i, i2);
        marialVar.dern(this, context);
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void apical(PopupWindow.OnDismissListener onDismissListener) {
        this.f4929cord = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.triweekly
    public boolean attabal() {
        return !this.f4946yemenite && this.f4932gintrap.attabal();
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void beachfront(View view) {
        this.f4930cuirassed = view;
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void cutely(int i) {
        this.f4932gintrap.marial(i);
    }

    @Override // androidx.appcompat.view.menu.triweekly
    public void dismiss() {
        if (attabal()) {
            this.f4932gintrap.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.apical
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void formularize(boolean z) {
        this.f4940restrictive = z;
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void impassible(int i) {
        this.f4932gintrap.taiyuan(i);
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void impromptu(boolean z) {
        this.f4938polloi.setForceShowIcon(z);
    }

    @Override // androidx.appcompat.view.menu.triweekly
    public ListView kowloon() {
        return this.f4932gintrap.kowloon();
    }

    public final boolean monoploid() {
        View view;
        if (attabal()) {
            return true;
        }
        if (this.f4946yemenite || (view = this.f4930cuirassed) == null) {
            return false;
        }
        this.f4943stratoscope = view;
        this.f4932gintrap.merc(this);
        this.f4932gintrap.polder(this);
        this.f4932gintrap.restrictive(true);
        View view2 = this.f4943stratoscope;
        boolean z = this.f4937oilcan == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4937oilcan = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4941rotuma);
        }
        view2.addOnAttachStateChangeListener(this.f4939preprohormone);
        this.f4932gintrap.trm(view2);
        this.f4932gintrap.sealless(this.f4944supplicat);
        if (!this.f4942sealless) {
            this.f4934kattegat = taiyuan.marial(this.f4938polloi, null, this.f4928arytenoidectomy, this.f4933graveside);
            this.f4942sealless = true;
        }
        this.f4932gintrap.yemenite(this.f4934kattegat);
        this.f4932gintrap.supplicat(2);
        this.f4932gintrap.kattegat(wireman());
        this.f4932gintrap.show();
        ListView listViewKowloon = this.f4932gintrap.kowloon();
        listViewKowloon.setOnKeyListener(this);
        if (this.f4940restrictive && this.f4936monoploid.cord() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f4928arytenoidectomy).inflate(beachfront.competently.abc_popup_menu_header_item_layout, (ViewGroup) listViewKowloon, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f4936monoploid.cord());
            }
            frameLayout.setEnabled(false);
            listViewKowloon.addHeaderView(frameLayout, null, false);
        }
        this.f4932gintrap.impassible(this.f4938polloi);
        this.f4932gintrap.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.apical
    public void onCloseMenu(marial marialVar, boolean z) {
        if (marialVar != this.f4936monoploid) {
            return;
        }
        dismiss();
        apical.attabal attabalVar = this.f4945trm;
        if (attabalVar != null) {
            attabalVar.onCloseMenu(marialVar, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f4946yemenite = true;
        this.f4936monoploid.close();
        ViewTreeObserver viewTreeObserver = this.f4937oilcan;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4937oilcan = this.f4943stratoscope.getViewTreeObserver();
            }
            this.f4937oilcan.removeGlobalOnLayoutListener(this.f4941rotuma);
            this.f4937oilcan = null;
        }
        this.f4943stratoscope.removeOnAttachStateChangeListener(this.f4939preprohormone);
        PopupWindow.OnDismissListener onDismissListener = this.f4929cord;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        if (arytenoidectomyVar.hasVisibleItems()) {
            cutely cutelyVar = new cutely(this.f4928arytenoidectomy, arytenoidectomyVar, this.f4943stratoscope, this.f4935molybdenite, this.f4927adultoid, this.f4931dovishness);
            cutelyVar.cutely(this.f4945trm);
            cutelyVar.competently(taiyuan.triweekly(arytenoidectomyVar));
            cutelyVar.taiyuan(this.f4929cord);
            this.f4929cord = null;
            this.f4936monoploid.marial(false);
            int iDern = this.f4932gintrap.dern();
            int iFormularize = this.f4932gintrap.formularize();
            if ((Gravity.getAbsoluteGravity(this.f4944supplicat, this.f4930cuirassed.getLayoutDirection()) & 7) == 5) {
                iDern += this.f4930cuirassed.getWidth();
            }
            if (cutelyVar.triweekly(iDern, iFormularize)) {
                apical.attabal attabalVar = this.f4945trm;
                if (attabalVar == null) {
                    return true;
                }
                attabalVar.attabal(arytenoidectomyVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.apical
    public void setCallback(apical.attabal attabalVar) {
        this.f4945trm = attabalVar;
    }

    @Override // androidx.appcompat.view.menu.triweekly
    public void show() {
        if (!monoploid()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.taiyuan
    public void taiyuan(int i) {
        this.f4944supplicat = i;
    }

    @Override // androidx.appcompat.view.menu.apical
    public void updateMenuView(boolean z) {
        this.f4942sealless = false;
        MenuAdapter menuAdapter = this.f4938polloi;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    public class saneness implements View.OnAttachStateChangeListener {
        public saneness() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = kowloon.this.f4937oilcan;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    kowloon.this.f4937oilcan = view.getViewTreeObserver();
                }
                kowloon kowloonVar = kowloon.this;
                kowloonVar.f4937oilcan.removeGlobalOnLayoutListener(kowloonVar.f4941rotuma);
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

    @Override // androidx.appcompat.view.menu.taiyuan
    public void saneness(marial marialVar) {
    }
}
