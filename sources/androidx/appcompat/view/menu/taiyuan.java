package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: MenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class taiyuan implements triweekly, apical, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Rect f4987kowloon;

    public static MenuAdapter arytenoidectomy(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (MenuAdapter) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (MenuAdapter) listAdapter;
    }

    public static int marial(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean triweekly(marial marialVar) {
        int size = marialVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = marialVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void apical(PopupWindow.OnDismissListener onDismissListener);

    public abstract void beachfront(View view);

    @Override // androidx.appcompat.view.menu.apical
    public boolean collapseItemActionView(marial marialVar, competently competentlyVar) {
        return false;
    }

    public void competently(Rect rect) {
        this.f4987kowloon = rect;
    }

    public abstract void cutely(int i);

    public boolean dern() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.apical
    public boolean expandItemActionView(marial marialVar, competently competentlyVar) {
        return false;
    }

    public abstract void formularize(boolean z);

    @Override // androidx.appcompat.view.menu.apical
    public int getId() {
        return 0;
    }

    public abstract void impassible(int i);

    public abstract void impromptu(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        arytenoidectomy(listAdapter).mAdapterMenu.creditor((MenuItem) listAdapter.getItem(i), this, dern() ? 0 : 4);
    }

    public abstract void saneness(marial marialVar);

    public abstract void taiyuan(int i);

    public Rect wireman() {
        return this.f4987kowloon;
    }

    @Override // androidx.appcompat.view.menu.apical
    public void initForMenu(Context context, marial marialVar) {
    }
}
