package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {
    public Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LayoutInflater f3475Y;
    public MenuBuilder Z;
    public ExpandedMenuView e0;
    public MenuPresenter.Callback f0;
    public MenuAdapter g0;

    public class MenuAdapter extends BaseAdapter {
        public int X = -1;

        public MenuAdapter() {
            a();
        }

        public final void a() {
            MenuBuilder menuBuilder = ListMenuPresenter.this.Z;
            MenuItemImpl menuItemImpl = menuBuilder.v;
            if (menuItemImpl != null) {
                menuBuilder.i();
                ArrayList arrayList = menuBuilder.j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((MenuItemImpl) arrayList.get(i2)) == menuItemImpl) {
                        this.X = i2;
                        return;
                    }
                }
            }
            this.X = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MenuItemImpl getItem(int i2) {
            ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
            MenuBuilder menuBuilder = listMenuPresenter.Z;
            menuBuilder.i();
            ArrayList arrayList = menuBuilder.j;
            listMenuPresenter.getClass();
            int i3 = this.X;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (MenuItemImpl) arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
            MenuBuilder menuBuilder = listMenuPresenter.Z;
            menuBuilder.i();
            int size = menuBuilder.j.size();
            listMenuPresenter.getClass();
            return this.X < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public final View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ListMenuPresenter.this.f3475Y.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((MenuView.ItemView) view).c(getItem(i2));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context) {
        this.X = context;
        this.f3475Y = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.g0 == null) {
            this.g0 = new MenuAdapter();
        }
        return this.g0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void b(MenuBuilder menuBuilder, boolean z2) {
        MenuPresenter.Callback callback = this.f0;
        if (callback != null) {
            callback.b(menuBuilder, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void c(MenuPresenter.Callback callback) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean d(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        MenuDialogHelper menuDialogHelper = new MenuDialogHelper();
        menuDialogHelper.X = subMenuBuilder;
        Context context = subMenuBuilder.f3478a;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(builder.getContext());
        menuDialogHelper.Z = listMenuPresenter;
        listMenuPresenter.f0 = menuDialogHelper;
        subMenuBuilder.b(listMenuPresenter, context);
        ListAdapter listAdapterA = menuDialogHelper.Z.a();
        AlertController.AlertParams alertParams = builder.f3317a;
        alertParams.m = listAdapterA;
        alertParams.f3313n = menuDialogHelper;
        View view = subMenuBuilder.o;
        if (view != null) {
            alertParams.f3309e = view;
        } else {
            alertParams.f3308c = subMenuBuilder.f3485n;
            builder.setTitle(subMenuBuilder.m);
        }
        alertParams.f3312l = menuDialogHelper;
        AlertDialog alertDialogCreate = builder.create();
        menuDialogHelper.f3489Y = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(menuDialogHelper);
        WindowManager.LayoutParams attributes = menuDialogHelper.f3489Y.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        menuDialogHelper.f3489Y.show();
        MenuPresenter.Callback callback = this.f0;
        if (callback == null) {
            return true;
        }
        callback.c(subMenuBuilder);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean f(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void g(boolean z2) {
        MenuAdapter menuAdapter = this.g0;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void i(Context context, MenuBuilder menuBuilder) {
        if (this.X != null) {
            this.X = context;
            if (this.f3475Y == null) {
                this.f3475Y = LayoutInflater.from(context);
            }
        }
        this.Z = menuBuilder;
        MenuAdapter menuAdapter = this.g0;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    public final MenuView j(ViewGroup viewGroup) {
        if (this.e0 == null) {
            this.e0 = (ExpandedMenuView) this.f3475Y.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.g0 == null) {
                this.g0 = new MenuAdapter();
            }
            this.e0.setAdapter((ListAdapter) this.g0);
            this.e0.setOnItemClickListener(this);
        }
        return this.e0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
        this.Z.q(this.g0.getItem(i2), this, 0);
    }
}
