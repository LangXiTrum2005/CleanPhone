package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u implements c0, y, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f47019a;

    public static int k(ListAdapter listAdapter, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    @Override // o.y
    public final boolean d(o oVar) {
        return false;
    }

    @Override // o.y
    public final boolean f(o oVar) {
        return false;
    }

    public abstract void j(m mVar);

    public abstract void m(View view);

    public abstract void n(boolean z10);

    public abstract void o(int i10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (j) listAdapter).f46952a.q((MenuItem) listAdapter.getItem(i10), this, !(this instanceof g) ? 0 : 4);
    }

    public abstract void p(int i10);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z10);

    public abstract void s(int i10);

    @Override // o.y
    public final void g(Context context, m mVar) {
    }
}
