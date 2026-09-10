package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MenuAdapter extends BaseAdapter {
    public final MenuBuilder X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f3477Y = -1;
    public boolean Z;
    public final boolean e0;
    public final LayoutInflater f0;
    public final int g0;

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.e0 = z2;
        this.f0 = layoutInflater;
        this.X = menuBuilder;
        this.g0 = i2;
        a();
    }

    public final void a() {
        MenuBuilder menuBuilder = this.X;
        MenuItemImpl menuItemImpl = menuBuilder.v;
        if (menuItemImpl != null) {
            menuBuilder.i();
            ArrayList arrayList = menuBuilder.j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((MenuItemImpl) arrayList.get(i2)) == menuItemImpl) {
                    this.f3477Y = i2;
                    return;
                }
            }
        }
        this.f3477Y = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemImpl getItem(int i2) {
        ArrayList arrayListL;
        MenuBuilder menuBuilder = this.X;
        if (this.e0) {
            menuBuilder.i();
            arrayListL = menuBuilder.j;
        } else {
            arrayListL = menuBuilder.l();
        }
        int i3 = this.f3477Y;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (MenuItemImpl) arrayListL.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        MenuBuilder menuBuilder = this.X;
        if (this.e0) {
            menuBuilder.i();
            arrayListL = menuBuilder.j;
        } else {
            arrayListL = menuBuilder.l();
        }
        return this.f3477Y < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f0.inflate(this.g0, viewGroup, false);
        }
        int i3 = getItem(i2).f3493b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f3493b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.X.m() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.Z) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.c(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
