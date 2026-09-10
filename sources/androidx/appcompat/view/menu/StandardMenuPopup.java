package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
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
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, MenuPresenter, View.OnKeyListener {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Context f3515Y;
    public final MenuBuilder Z;
    public final MenuAdapter e0;
    public final boolean f0;
    public final int g0;
    public final int h0;
    public final MenuPopupWindow i0;
    public PopupWindow.OnDismissListener l0;
    public View m0;
    public View n0;
    public MenuPresenter.Callback o0;
    public ViewTreeObserver p0;
    public boolean q0;
    public boolean r0;
    public int s0;
    public boolean u0;
    public final ViewTreeObserver.OnGlobalLayoutListener j0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
            if (standardMenuPopup.a()) {
                MenuPopupWindow menuPopupWindow = standardMenuPopup.i0;
                if (menuPopupWindow.z0) {
                    return;
                }
                View view = standardMenuPopup.n0;
                if (view == null || !view.isShown()) {
                    standardMenuPopup.dismiss();
                } else {
                    menuPopupWindow.show();
                }
            }
        }
    };
    public final View.OnAttachStateChangeListener k0 = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
            ViewTreeObserver viewTreeObserver = standardMenuPopup.p0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    standardMenuPopup.p0 = view.getViewTreeObserver();
                }
                standardMenuPopup.p0.removeGlobalOnLayoutListener(standardMenuPopup.j0);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public int t0 = 0;

    public StandardMenuPopup(int i2, Context context, View view, MenuBuilder menuBuilder, boolean z2) {
        this.f3515Y = context;
        this.Z = menuBuilder;
        this.f0 = z2;
        this.e0 = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.h0 = i2;
        Resources resources = context.getResources();
        this.g0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m0 = view;
        this.i0 = new MenuPopupWindow(context, null, i2);
        menuBuilder.b(this, context);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean a() {
        return !this.q0 && this.i0.A0.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void b(MenuBuilder menuBuilder, boolean z2) {
        if (menuBuilder != this.Z) {
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.o0;
        if (callback != null) {
            callback.b(menuBuilder, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void c(MenuPresenter.Callback callback) {
        this.o0 = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        if (a()) {
            this.i0.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e(SubMenuBuilder subMenuBuilder) {
        if (subMenuBuilder.hasVisibleItems()) {
            View view = this.n0;
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.h0, this.f3515Y, view, subMenuBuilder, this.f0);
            MenuPresenter.Callback callback = this.o0;
            menuPopupHelper.f3513h = callback;
            MenuPopup menuPopup = menuPopupHelper.f3514i;
            if (menuPopup != null) {
                menuPopup.c(callback);
            }
            menuPopupHelper.d(MenuPopup.t(subMenuBuilder));
            menuPopupHelper.j = this.l0;
            this.l0 = null;
            this.Z.c(false);
            MenuPopupWindow menuPopupWindow = this.i0;
            int width = menuPopupWindow.g0;
            int iJ = menuPopupWindow.j();
            int i2 = this.t0;
            View view2 = this.m0;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if ((Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 7) == 5) {
                width += this.m0.getWidth();
            }
            if (!menuPopupHelper.b()) {
                if (menuPopupHelper.f3512e != null) {
                    menuPopupHelper.e(width, iJ, true, true);
                }
            }
            MenuPresenter.Callback callback2 = this.o0;
            if (callback2 != null) {
                callback2.c(subMenuBuilder);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void g(boolean z2) {
        this.r0 = false;
        MenuAdapter menuAdapter = this.e0;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void j(MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void l(View view) {
        this.m0 = view;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView m() {
        return this.i0.Z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void n(boolean z2) {
        this.e0.Z = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void o(int i2) {
        this.t0 = i2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.q0 = true;
        this.Z.c(true);
        ViewTreeObserver viewTreeObserver = this.p0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p0 = this.n0.getViewTreeObserver();
            }
            this.p0.removeGlobalOnLayoutListener(this.j0);
            this.p0 = null;
        }
        this.n0.removeOnAttachStateChangeListener(this.k0);
        PopupWindow.OnDismissListener onDismissListener = this.l0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void p(int i2) {
        this.i0.g0 = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.l0 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void r(boolean z2) {
        this.u0 = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void s(int i2) {
        this.i0.g(i2);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.q0 || (view = this.m0) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.n0 = view;
        MenuPopupWindow menuPopupWindow = this.i0;
        menuPopupWindow.A0.setOnDismissListener(this);
        menuPopupWindow.q0 = this;
        menuPopupWindow.z0 = true;
        menuPopupWindow.A0.setFocusable(true);
        View view2 = this.n0;
        boolean z2 = this.p0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p0 = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j0);
        }
        view2.addOnAttachStateChangeListener(this.k0);
        menuPopupWindow.p0 = view2;
        menuPopupWindow.m0 = this.t0;
        boolean z3 = this.r0;
        Context context = this.f3515Y;
        MenuAdapter menuAdapter = this.e0;
        if (!z3) {
            this.s0 = MenuPopup.k(menuAdapter, context, this.g0);
            this.r0 = true;
        }
        menuPopupWindow.o(this.s0);
        menuPopupWindow.A0.setInputMethodMode(2);
        Rect rect = this.X;
        menuPopupWindow.y0 = rect != null ? new Rect(rect) : null;
        menuPopupWindow.show();
        DropDownListView dropDownListView = menuPopupWindow.Z;
        dropDownListView.setOnKeyListener(this);
        if (this.u0) {
            MenuBuilder menuBuilder = this.Z;
            if (menuBuilder.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuBuilder.m);
                }
                frameLayout.setEnabled(false);
                dropDownListView.addHeaderView(frameLayout, null, false);
            }
        }
        menuPopupWindow.l(menuAdapter);
        menuPopupWindow.show();
    }
}
