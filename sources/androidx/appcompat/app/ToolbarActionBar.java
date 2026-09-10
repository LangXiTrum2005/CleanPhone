package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class ToolbarActionBar extends ActionBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarWidgetWrapper f3356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f3357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ToolbarMenuCallback f3358c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3359e;
    public boolean f;
    public final ArrayList g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f3360h = new Runnable() { // from class: androidx.appcompat.app.ToolbarActionBar.1
        @Override // java.lang.Runnable
        public final void run() {
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            Window.Callback callback = toolbarActionBar.f3357b;
            Menu menuT = toolbarActionBar.t();
            MenuBuilder menuBuilder = menuT instanceof MenuBuilder ? (MenuBuilder) menuT : null;
            if (menuBuilder != null) {
                menuBuilder.w();
            }
            try {
                menuT.clear();
                if (!callback.onCreatePanelMenu(0, menuT) || !callback.onPreparePanel(0, null, menuT)) {
                    menuT.clear();
                }
            } finally {
                if (menuBuilder != null) {
                    menuBuilder.v();
                }
            }
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Toolbar.OnMenuItemClickListener f3361i;

    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        public boolean X;

        public ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void b(MenuBuilder menuBuilder, boolean z2) {
            if (this.X) {
                return;
            }
            this.X = true;
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            toolbarActionBar.f3356a.m();
            toolbarActionBar.f3357b.onPanelClosed(108, menuBuilder);
            this.X = false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean c(MenuBuilder menuBuilder) {
            ToolbarActionBar.this.f3357b.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public final class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void b(MenuBuilder menuBuilder) {
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            boolean zQ = toolbarActionBar.f3356a.f3651a.q();
            Window.Callback callback = toolbarActionBar.f3357b;
            if (zQ) {
                callback.onPanelClosed(108, menuBuilder);
            } else if (callback.onPreparePanel(0, null, menuBuilder)) {
                callback.onMenuOpened(108, menuBuilder);
            }
        }
    }

    public class ToolbarMenuCallback implements AppCompatDelegateImpl.ActionBarMenuCallback {
        public ToolbarMenuCallback() {
        }
    }

    public ToolbarActionBar(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        Toolbar.OnMenuItemClickListener onMenuItemClickListener = new Toolbar.OnMenuItemClickListener() { // from class: androidx.appcompat.app.ToolbarActionBar.2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return ToolbarActionBar.this.f3357b.onMenuItemSelected(0, menuItem);
            }
        };
        this.f3361i = onMenuItemClickListener;
        toolbar.getClass();
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.f3356a = toolbarWidgetWrapper;
        callback.getClass();
        this.f3357b = callback;
        toolbarWidgetWrapper.k = callback;
        toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.f3358c = new ToolbarMenuCallback();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean e() {
        return this.f3356a.c();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean f() {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f3356a;
        if (!toolbarWidgetWrapper.f3651a.m()) {
            return false;
        }
        toolbarWidgetWrapper.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void g(boolean z2) {
        if (z2 == this.f) {
            return;
        }
        this.f = z2;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ActionBar.OnMenuVisibilityListener) arrayList.get(i2)).a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int h() {
        return this.f3356a.f3652b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context i() {
        return this.f3356a.f3651a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean j() {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f3356a;
        Toolbar toolbar = toolbarWidgetWrapper.f3651a;
        Runnable runnable = this.f3360h;
        toolbar.removeCallbacks(runnable);
        Toolbar toolbar2 = toolbarWidgetWrapper.f3651a;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        toolbar2.postOnAnimation(runnable);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void l() {
        this.f3356a.f3651a.removeCallbacks(this.f3360h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean m(int i2, KeyEvent keyEvent) {
        Menu menuT = t();
        if (menuT == null) {
            return false;
        }
        menuT.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuT.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean n(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            o();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean o() {
        return this.f3356a.f3651a.w();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void p(boolean z2) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void q(boolean z2) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(CharSequence charSequence) {
        this.f3356a.setWindowTitle(charSequence);
    }

    public final Menu t() {
        boolean z2 = this.f3359e;
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f3356a;
        if (!z2) {
            ActionMenuPresenterCallback actionMenuPresenterCallback = new ActionMenuPresenterCallback();
            MenuBuilderCallback menuBuilderCallback = new MenuBuilderCallback();
            Toolbar toolbar = toolbarWidgetWrapper.f3651a;
            toolbar.R0 = actionMenuPresenterCallback;
            toolbar.S0 = menuBuilderCallback;
            ActionMenuView actionMenuView = toolbar.e0;
            if (actionMenuView != null) {
                actionMenuView.y0 = actionMenuPresenterCallback;
                actionMenuView.z0 = menuBuilderCallback;
            }
            this.f3359e = true;
        }
        return toolbarWidgetWrapper.f3651a.getMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void k() {
    }
}
