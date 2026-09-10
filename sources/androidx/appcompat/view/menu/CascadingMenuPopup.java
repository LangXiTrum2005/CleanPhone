package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Context f3470Y;
    public final int Z;
    public final int e0;
    public final boolean f0;
    public final Handler g0;
    public View o0;
    public View p0;
    public int q0;
    public boolean r0;
    public boolean s0;
    public int t0;
    public int u0;
    public boolean w0;
    public MenuPresenter.Callback x0;
    public ViewTreeObserver y0;
    public PopupWindow.OnDismissListener z0;
    public final ArrayList h0 = new ArrayList();
    public final ArrayList i0 = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener j0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            if (cascadingMenuPopup.a()) {
                ArrayList arrayList = cascadingMenuPopup.i0;
                if (arrayList.size() <= 0 || ((CascadingMenuInfo) arrayList.get(0)).f3472a.z0) {
                    return;
                }
                View view = cascadingMenuPopup.p0;
                if (view == null || !view.isShown()) {
                    cascadingMenuPopup.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((CascadingMenuInfo) it.next()).f3472a.show();
                }
            }
        }
    };
    public final View.OnAttachStateChangeListener k0 = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            ViewTreeObserver viewTreeObserver = cascadingMenuPopup.y0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cascadingMenuPopup.y0 = view.getViewTreeObserver();
                }
                cascadingMenuPopup.y0.removeGlobalOnLayoutListener(cascadingMenuPopup.j0);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public final MenuItemHoverListener l0 = new MenuItemHoverListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3
        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public final void c(final MenuBuilder menuBuilder, final MenuItemImpl menuItemImpl) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            cascadingMenuPopup.g0.removeCallbacksAndMessages(null);
            ArrayList arrayList = cascadingMenuPopup.i0;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (menuBuilder == ((CascadingMenuInfo) arrayList.get(i2)).f3473b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            final CascadingMenuInfo cascadingMenuInfo = i3 < arrayList.size() ? (CascadingMenuInfo) arrayList.get(i3) : null;
            cascadingMenuPopup.g0.postAtTime(new Runnable() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    CascadingMenuInfo cascadingMenuInfo2 = cascadingMenuInfo;
                    if (cascadingMenuInfo2 != null) {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        CascadingMenuPopup.this.A0 = true;
                        cascadingMenuInfo2.f3473b.c(false);
                        CascadingMenuPopup.this.A0 = false;
                    }
                    MenuItemImpl menuItemImpl2 = menuItemImpl;
                    if (menuItemImpl2.isEnabled() && menuItemImpl2.hasSubMenu()) {
                        menuBuilder.q(menuItemImpl2, null, 4);
                    }
                }
            }, menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public final void k(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            CascadingMenuPopup.this.g0.removeCallbacksAndMessages(menuBuilder);
        }
    };
    public int m0 = 0;
    public int n0 = 0;
    public boolean v0 = false;

    public static class CascadingMenuInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f3472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MenuBuilder f3473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3474c;

        public CascadingMenuInfo(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i2) {
            this.f3472a = menuPopupWindow;
            this.f3473b = menuBuilder;
            this.f3474c = i2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public CascadingMenuPopup(Context context, View view, int i2, boolean z2) {
        this.f3470Y = context;
        this.o0 = view;
        this.e0 = i2;
        this.f0 = z2;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        this.q0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.Z = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.g0 = new Handler();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean a() {
        ArrayList arrayList = this.i0;
        return arrayList.size() > 0 && ((CascadingMenuInfo) arrayList.get(0)).f3472a.A0.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void b(MenuBuilder menuBuilder, boolean z2) {
        ArrayList arrayList = this.i0;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuBuilder == ((CascadingMenuInfo) arrayList.get(i2)).f3473b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((CascadingMenuInfo) arrayList.get(i3)).f3473b.c(false);
        }
        CascadingMenuInfo cascadingMenuInfo = (CascadingMenuInfo) arrayList.remove(i2);
        cascadingMenuInfo.f3473b.r(this);
        boolean z3 = this.A0;
        MenuPopupWindow menuPopupWindow = cascadingMenuInfo.f3472a;
        if (z3) {
            menuPopupWindow.q();
            menuPopupWindow.A0.setAnimationStyle(0);
        }
        menuPopupWindow.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.q0 = ((CascadingMenuInfo) arrayList.get(size2 - 1)).f3474c;
        } else {
            View view = this.o0;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            this.q0 = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((CascadingMenuInfo) arrayList.get(0)).f3473b.c(false);
                return;
            }
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.x0;
        if (callback != null) {
            callback.b(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.y0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y0.removeGlobalOnLayoutListener(this.j0);
            }
            this.y0 = null;
        }
        this.p0.removeOnAttachStateChangeListener(this.k0);
        ((MenuPopupHelper.AnonymousClass1) this.z0).onDismiss();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void c(MenuPresenter.Callback callback) {
        this.x0 = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        ArrayList arrayList = this.i0;
        int size = arrayList.size();
        if (size > 0) {
            CascadingMenuInfo[] cascadingMenuInfoArr = (CascadingMenuInfo[]) arrayList.toArray(new CascadingMenuInfo[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[i2];
                if (cascadingMenuInfo.f3472a.A0.isShowing()) {
                    cascadingMenuInfo.f3472a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e(SubMenuBuilder subMenuBuilder) {
        for (CascadingMenuInfo cascadingMenuInfo : this.i0) {
            if (subMenuBuilder == cascadingMenuInfo.f3473b) {
                cascadingMenuInfo.f3472a.Z.requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        j(subMenuBuilder);
        MenuPresenter.Callback callback = this.x0;
        if (callback != null) {
            callback.c(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void g(boolean z2) {
        Iterator it = this.i0.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((CascadingMenuInfo) it.next()).f3472a.Z.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((MenuAdapter) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void j(MenuBuilder menuBuilder) {
        menuBuilder.b(this, this.f3470Y);
        if (a()) {
            u(menuBuilder);
        } else {
            this.h0.add(menuBuilder);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void l(View view) {
        if (this.o0 != view) {
            this.o0 = view;
            int i2 = this.m0;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            this.n0 = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView m() {
        ArrayList arrayList = this.i0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((CascadingMenuInfo) a.d(1, arrayList)).f3472a.Z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void n(boolean z2) {
        this.v0 = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void o(int i2) {
        if (this.m0 != i2) {
            this.m0 = i2;
            View view = this.o0;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            this.n0 = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        CascadingMenuInfo cascadingMenuInfo;
        ArrayList arrayList = this.i0;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = (CascadingMenuInfo) arrayList.get(i2);
            if (!cascadingMenuInfo.f3472a.A0.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.f3473b.c(false);
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
        this.r0 = true;
        this.t0 = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.z0 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void r(boolean z2) {
        this.w0 = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void s(int i2) {
        this.s0 = true;
        this.u0 = i2;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.h0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((MenuBuilder) it.next());
        }
        arrayList.clear();
        View view = this.o0;
        this.p0 = view;
        if (view != null) {
            boolean z2 = this.y0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y0 = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j0);
            }
            this.p0.addOnAttachStateChangeListener(this.k0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:48:0x011b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0127  */
    /* JADX WARN: Code duplicated, block: B:52:0x012b  */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x0142  */
    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187 A[PHI: r5
  0x0187: PHI (r5v14 int) = (r5v5 int), (r5v15 int) binds: [B:72:0x0189, B:70:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x019b  */
    /* JADX WARN: Code duplicated, block: B:77:0x019f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(MenuBuilder menuBuilder) {
        int i2;
        int i3;
        CascadingMenuInfo cascadingMenuInfo;
        View childAt;
        Rect rect;
        Rect rect2;
        DropDownListView dropDownListView;
        int[] iArr;
        Rect rect3;
        int i4;
        int i5;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int i7;
        int width;
        MenuItem item;
        MenuAdapter menuAdapter;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f3470Y;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        MenuAdapter menuAdapter2 = new MenuAdapter(menuBuilder, layoutInflaterFrom, this.f0, R.layout.abc_cascading_menu_item_layout);
        int i8 = 1;
        if (!a() && this.v0) {
            menuAdapter2.Z = true;
        } else if (a()) {
            menuAdapter2.Z = MenuPopup.t(menuBuilder);
        }
        int iK = MenuPopup.k(menuAdapter2, context, this.Z);
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(context, null, this.e0);
        menuPopupWindow.D0 = this.l0;
        menuPopupWindow.q0 = this;
        menuPopupWindow.A0.setOnDismissListener(this);
        menuPopupWindow.p0 = this.o0;
        menuPopupWindow.m0 = this.n0;
        menuPopupWindow.z0 = true;
        menuPopupWindow.A0.setFocusable(true);
        menuPopupWindow.A0.setInputMethodMode(2);
        menuPopupWindow.l(menuAdapter2);
        menuPopupWindow.o(iK);
        menuPopupWindow.m0 = this.n0;
        ArrayList arrayList = this.i0;
        if (arrayList.size() > 0) {
            cascadingMenuInfo = (CascadingMenuInfo) a.d(1, arrayList);
            MenuBuilder menuBuilder2 = cascadingMenuInfo.f3473b;
            int size = menuBuilder2.f.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    item = null;
                    break;
                }
                item = menuBuilder2.getItem(i9);
                if (item.hasSubMenu() && menuBuilder == item.getSubMenu()) {
                    break;
                } else {
                    i9++;
                }
            }
            if (item == null) {
                i2 = 1;
                childAt = null;
                i3 = 0;
            } else {
                DropDownListView dropDownListView2 = cascadingMenuInfo.f3472a.Z;
                ListAdapter adapter = dropDownListView2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (MenuAdapter) adapter;
                    headersCount = 0;
                }
                int count = menuAdapter.getCount();
                int i10 = 0;
                i3 = 0;
                while (true) {
                    i2 = i8;
                    if (i10 >= count) {
                        i10 = -1;
                        break;
                    } else {
                        if (item == menuAdapter.getItem(i10)) {
                            break;
                        }
                        i10++;
                        i8 = i2;
                    }
                }
                if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - dropDownListView2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < dropDownListView2.getChildCount()) {
                    childAt = dropDownListView2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                menuPopupWindow.r();
                menuPopupWindow.p();
                dropDownListView = ((CascadingMenuInfo) arrayList.get(arrayList.size() - 1)).f3472a.Z;
                iArr = new int[2];
                dropDownListView.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.p0.getWindowVisibleDisplayFrame(rect3);
                if (this.q0 == i2) {
                    if (dropDownListView.getWidth() + iArr[i3] + iK > rect3.right) {
                        i4 = i3;
                    } else {
                        i4 = 1;
                    }
                } else if (iArr[i3] - iK < 0) {
                    i4 = 1;
                } else {
                    i4 = i3;
                }
                if (i4 == 1) {
                    i5 = 1;
                } else {
                    i5 = i3;
                }
                this.q0 = i4;
                if (Build.VERSION.SDK_INT >= 26) {
                    menuPopupWindow.p0 = childAt;
                    i7 = i3;
                    i6 = i7;
                } else {
                    iArr2 = new int[2];
                    this.o0.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.n0 & 7) == 5) {
                        iArr2[i3] = this.o0.getWidth() + iArr2[i3];
                        iArr3[i3] = childAt.getWidth() + iArr3[i3];
                    }
                    i6 = iArr3[i3] - iArr2[i3];
                    i7 = iArr3[1] - iArr2[1];
                }
                if ((this.n0 & 5) == 5) {
                    if (i5 != 0) {
                        width = i6 + iK;
                    } else {
                        iK = childAt.getWidth();
                        width = i6 - iK;
                    }
                } else if (i5 != 0) {
                    width = i6 + childAt.getWidth();
                } else {
                    width = i6 - iK;
                }
                menuPopupWindow.g0 = width;
                menuPopupWindow.l0 = true;
                menuPopupWindow.k0 = true;
                menuPopupWindow.g(i7);
            } else {
                if (this.r0) {
                    menuPopupWindow.g0 = this.t0;
                }
                if (this.s0) {
                    menuPopupWindow.g(this.u0);
                }
                rect = this.X;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                menuPopupWindow.y0 = rect2;
            }
            arrayList.add(new CascadingMenuInfo(menuPopupWindow, menuBuilder, this.q0));
            menuPopupWindow.show();
            DropDownListView dropDownListView3 = menuPopupWindow.Z;
            dropDownListView3.setOnKeyListener(this);
            if (cascadingMenuInfo == null || !this.w0 || menuBuilder.m == null) {
                return;
            }
            boolean z2 = i3;
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, dropDownListView3, z2);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z2);
            textView.setText(menuBuilder.m);
            dropDownListView3.addHeaderView(frameLayout, null, z2);
            menuPopupWindow.show();
            return;
        }
        i2 = 1;
        i3 = 0;
        cascadingMenuInfo = null;
        childAt = null;
        if (childAt != null) {
            menuPopupWindow.r();
            menuPopupWindow.p();
            dropDownListView = ((CascadingMenuInfo) arrayList.get(arrayList.size() - 1)).f3472a.Z;
            iArr = new int[2];
            dropDownListView.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.p0.getWindowVisibleDisplayFrame(rect3);
            if (this.q0 == i2) {
                if (dropDownListView.getWidth() + iArr[i3] + iK > rect3.right) {
                    i4 = i3;
                } else {
                    i4 = 1;
                }
            } else if (iArr[i3] - iK < 0) {
                i4 = 1;
            } else {
                i4 = i3;
            }
            if (i4 == 1) {
                i5 = 1;
            } else {
                i5 = i3;
            }
            this.q0 = i4;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindow.p0 = childAt;
                i7 = i3;
                i6 = i7;
            } else {
                iArr2 = new int[2];
                this.o0.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.n0 & 7) == 5) {
                    iArr2[i3] = this.o0.getWidth() + iArr2[i3];
                    iArr3[i3] = childAt.getWidth() + iArr3[i3];
                }
                i6 = iArr3[i3] - iArr2[i3];
                i7 = iArr3[1] - iArr2[1];
            }
            if ((this.n0 & 5) == 5) {
                if (i5 != 0) {
                    width = i6 + iK;
                } else {
                    iK = childAt.getWidth();
                    width = i6 - iK;
                }
            } else if (i5 != 0) {
                width = i6 + childAt.getWidth();
            } else {
                width = i6 - iK;
            }
            menuPopupWindow.g0 = width;
            menuPopupWindow.l0 = true;
            menuPopupWindow.k0 = true;
            menuPopupWindow.g(i7);
        } else {
            if (this.r0) {
                menuPopupWindow.g0 = this.t0;
            }
            if (this.s0) {
                menuPopupWindow.g(this.u0);
            }
            rect = this.X;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            menuPopupWindow.y0 = rect2;
        }
        arrayList.add(new CascadingMenuInfo(menuPopupWindow, menuBuilder, this.q0));
        menuPopupWindow.show();
        DropDownListView dropDownListView4 = menuPopupWindow.Z;
        dropDownListView4.setOnKeyListener(this);
        if (cascadingMenuInfo == null) {
        }
    }
}
