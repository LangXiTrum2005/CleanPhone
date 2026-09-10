package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends n1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f47640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f47641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b2 f47642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o.o f47643p;

    public e2(Context context, boolean z10) {
        super(context, z10);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f47640m = 21;
            this.f47641n = 22;
        } else {
            this.f47640m = 22;
            this.f47641n = 21;
        }
    }

    @Override // p.n1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        o.j jVar;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.f47642o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                jVar = (o.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (o.j) adapter;
                headersCount = 0;
            }
            o.o item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= jVar.getCount()) ? null : jVar.getItem(i10);
            o.o oVar = this.f47643p;
            if (oVar != item) {
                o.m mVar = jVar.f46952a;
                if (oVar != null) {
                    this.f47642o.q(mVar, oVar);
                }
                this.f47643p = item;
                if (item != null) {
                    this.f47642o.t(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f47640m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.f47641n) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (o.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (o.j) adapter).f46952a.c(false);
        return true;
    }

    public void setHoverListener(b2 b2Var) {
        this.f47642o = b2Var;
    }

    @Override // p.n1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
