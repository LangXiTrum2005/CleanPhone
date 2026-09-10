package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MenuPopupHelper implements MenuHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MenuBuilder f3510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3511c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f3512e;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MenuPresenter.Callback f3513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MenuPopup f3514i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final PopupWindow.OnDismissListener k = new AnonymousClass1();

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.MenuPopupHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements PopupWindow.OnDismissListener {
        public AnonymousClass1() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            MenuPopupHelper.this.c();
        }
    }

    public static class Api17Impl {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public MenuPopupHelper(int i2, Context context, View view, MenuBuilder menuBuilder, boolean z2) {
        this.f3509a = context;
        this.f3510b = menuBuilder;
        this.f3512e = view;
        this.f3511c = z2;
        this.d = i2;
    }

    public final MenuPopup a() {
        MenuPopup standardMenuPopup;
        if (this.f3514i == null) {
            Context context = this.f3509a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            Api17Impl.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                standardMenuPopup = new CascadingMenuPopup(context, this.f3512e, this.d, this.f3511c);
            } else {
                View view = this.f3512e;
                Context context2 = this.f3509a;
                boolean z2 = this.f3511c;
                standardMenuPopup = new StandardMenuPopup(this.d, context2, view, this.f3510b, z2);
            }
            standardMenuPopup.j(this.f3510b);
            standardMenuPopup.q(this.k);
            standardMenuPopup.l(this.f3512e);
            standardMenuPopup.c(this.f3513h);
            standardMenuPopup.n(this.g);
            standardMenuPopup.o(this.f);
            this.f3514i = standardMenuPopup;
        }
        return this.f3514i;
    }

    public final boolean b() {
        MenuPopup menuPopup = this.f3514i;
        return menuPopup != null && menuPopup.a();
    }

    public void c() {
        this.f3514i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z2) {
        this.g = z2;
        MenuPopup menuPopup = this.f3514i;
        if (menuPopup != null) {
            menuPopup.n(z2);
        }
    }

    public final void e(int i2, int i3, boolean z2, boolean z3) {
        MenuPopup menuPopupA = a();
        menuPopupA.r(z3);
        if (z2) {
            int i4 = this.f;
            View view = this.f3512e;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f3512e.getWidth();
            }
            menuPopupA.p(i2);
            menuPopupA.s(i3);
            int i5 = (int) ((this.f3509a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            menuPopupA.X = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        menuPopupA.show();
    }
}
