package androidx.appcompat.view.menu;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface MenuPresenter {

    public interface Callback {
        void b(MenuBuilder menuBuilder, boolean z2);

        boolean c(MenuBuilder menuBuilder);
    }

    void b(MenuBuilder menuBuilder, boolean z2);

    void c(Callback callback);

    boolean d(MenuItemImpl menuItemImpl);

    boolean e(SubMenuBuilder subMenuBuilder);

    boolean f(MenuItemImpl menuItemImpl);

    void g(boolean z2);

    boolean h();

    void i(Context context, MenuBuilder menuBuilder);
}
