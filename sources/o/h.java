package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.storage.androidcleaner.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46944a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f46945b;

    public h(i iVar) {
        this.f46945b = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f46945b.f46948c;
        o oVar = mVar.f46979v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f46968j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((o) arrayList.get(i10)) == oVar) {
                    this.f46944a = i10;
                    return;
                }
            }
        }
        this.f46944a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i10) {
        i iVar = this.f46945b;
        m mVar = iVar.f46948c;
        mVar.i();
        ArrayList arrayList = mVar.f46968j;
        iVar.getClass();
        int i11 = this.f46944a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (o) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f46945b;
        m mVar = iVar.f46948c;
        mVar.i();
        int size = mVar.f46968j.size();
        iVar.getClass();
        return this.f46944a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f46945b.f46947b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
