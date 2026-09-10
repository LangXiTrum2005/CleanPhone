package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener {
    public static final Method E0;
    public MenuItemHoverListener D0;

    public static class Api23Impl {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class Api29Impl {
        public static void a(PopupWindow popupWindow, boolean z2) {
            popupWindow.setTouchModal(z2);
        }
    }

    public static class MenuDropDownListView extends DropDownListView {
        public final int q0;
        public final int r0;
        public MenuItemHoverListener s0;
        public MenuItemImpl t0;

        public static class Api17Impl {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z2) {
            super(context, z2);
            if (1 == Api17Impl.a(context.getResources().getConfiguration())) {
                this.q0 = 21;
                this.r0 = 22;
            } else {
                this.q0 = 22;
                this.r0 = 21;
            }
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            MenuAdapter menuAdapter;
            int headersCount;
            int iPointToPosition;
            int i2;
            if (this.s0 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (MenuAdapter) adapter;
                    headersCount = 0;
                }
                MenuItemImpl item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= menuAdapter.getCount()) ? null : menuAdapter.getItem(i2);
                MenuItemImpl menuItemImpl = this.t0;
                if (menuItemImpl != item) {
                    MenuBuilder menuBuilder = menuAdapter.X;
                    if (menuItemImpl != null) {
                        this.s0.k(menuBuilder, menuItemImpl);
                    }
                    this.t0 = item;
                    if (item != null) {
                        this.s0.c(menuBuilder, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.q0) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i2 != this.r0) {
                return super.onKeyDown(i2, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (MenuAdapter) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (MenuAdapter) adapter).X.c(false);
            return true;
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
            this.s0 = menuItemHoverListener;
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public final void c(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        MenuItemHoverListener menuItemHoverListener = this.D0;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.c(menuBuilder, menuItemImpl);
        }
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public final void k(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        MenuItemHoverListener menuItemHoverListener = this.D0;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.k(menuBuilder, menuItemImpl);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public final DropDownListView n(Context context, boolean z2) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z2);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    public final void p() {
        Api23Impl.a(this.A0, null);
    }

    public final void q() {
        Api23Impl.b(this.A0, null);
    }

    public final void r() {
        int i2 = Build.VERSION.SDK_INT;
        PopupWindow popupWindow = this.A0;
        if (i2 > 28) {
            Api29Impl.a(popupWindow, false);
            return;
        }
        Method method = E0;
        if (method != null) {
            try {
                method.invoke(popupWindow, Boolean.FALSE);
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
