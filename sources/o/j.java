package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f46952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46953b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f46956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46957f;

    public j(m mVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f46955d = z10;
        this.f46956e = layoutInflater;
        this.f46952a = mVar;
        this.f46957f = i10;
        a();
    }

    public final void a() {
        m mVar = this.f46952a;
        o oVar = mVar.f46979v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f46968j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((o) arrayList.get(i10)) == oVar) {
                    this.f46953b = i10;
                    return;
                }
            }
        }
        this.f46953b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i10) {
        ArrayList arrayListL;
        boolean z10 = this.f46955d;
        m mVar = this.f46952a;
        if (z10) {
            mVar.i();
            arrayListL = mVar.f46968j;
        } else {
            arrayListL = mVar.l();
        }
        int i11 = this.f46953b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (o) arrayListL.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z10 = this.f46955d;
        m mVar = this.f46952a;
        if (z10) {
            mVar.i();
            arrayListL = mVar.f46968j;
        } else {
            arrayListL = mVar.l();
        }
        return this.f46953b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f46956e.inflate(this.f46957f, viewGroup, false);
        }
        int i11 = getItem(i10).f46986b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f46986b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f46952a.m() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        z zVar = (z) view;
        if (this.f46954c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
