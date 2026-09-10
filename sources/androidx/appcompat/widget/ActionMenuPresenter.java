package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopup;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ActionProvider;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ActionMenuPresenter extends BaseMenuPresenter implements ActionProvider.SubUiVisibilityListener {
    public OverflowMenuButton j0;
    public Drawable k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public int p0;
    public int q0;
    public boolean r0;
    public final SparseBooleanArray s0;
    public OverflowPopup t0;
    public ActionButtonSubmenu u0;
    public OpenOverflowRunnable v0;
    public ActionMenuPopupCallback w0;
    public final PopupPresenterCallback x0;

    public class ActionButtonSubmenu extends MenuPopupHelper {
        public ActionButtonSubmenu(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, subMenuBuilder, false);
            if ((subMenuBuilder.f3516A.x & 32) != 32) {
                View view2 = ActionMenuPresenter.this.j0;
                this.f3512e = view2 == null ? (View) ActionMenuPresenter.this.i0 : view2;
            }
            PopupPresenterCallback popupPresenterCallback = ActionMenuPresenter.this.x0;
            this.f3513h = popupPresenterCallback;
            MenuPopup menuPopup = this.f3514i;
            if (menuPopup != null) {
                menuPopup.c(popupPresenterCallback);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void c() {
            ActionMenuPresenter.this.u0 = null;
            super.c();
        }
    }

    public class ActionMenuPopupCallback extends ActionMenuItemView.PopupCallback {
        public ActionMenuPopupCallback() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public final ShowableListMenu a() {
            ActionButtonSubmenu actionButtonSubmenu = ActionMenuPresenter.this.u0;
            if (actionButtonSubmenu != null) {
                return actionButtonSubmenu.a();
            }
            return null;
        }
    }

    public class OpenOverflowRunnable implements Runnable {
        public final OverflowPopup X;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.X = overflowPopup;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MenuBuilder.Callback callback;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            MenuBuilder menuBuilder = actionMenuPresenter.Z;
            if (menuBuilder != null && (callback = menuBuilder.f3481e) != null) {
                callback.b(menuBuilder);
            }
            View view = (View) actionMenuPresenter.i0;
            if (view != null && view.getWindowToken() != null) {
                OverflowPopup overflowPopup = this.X;
                if (overflowPopup.b()) {
                    actionMenuPresenter.t0 = overflowPopup;
                } else if (overflowPopup.f3512e != null) {
                    overflowPopup.e(0, 0, false, false);
                    actionMenuPresenter.t0 = overflowPopup;
                }
            }
            actionMenuPresenter.v0 = null;
        }
    }

    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.a(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public final ShowableListMenu b() {
                    OverflowPopup overflowPopup = ActionMenuPresenter.this.t0;
                    if (overflowPopup == null) {
                        return null;
                    }
                    return overflowPopup.a();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public final boolean c() {
                    ActionMenuPresenter.this.p();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public final boolean d() {
                    ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                    if (actionMenuPresenter.v0 != null) {
                        return false;
                    }
                    actionMenuPresenter.m();
                    return true;
                }
            });
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.p();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.g(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class OverflowPopup extends MenuPopupHelper {
        public OverflowPopup(Context context, MenuBuilder menuBuilder, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, menuBuilder, true);
            this.f = 8388613;
            PopupPresenterCallback popupPresenterCallback = ActionMenuPresenter.this.x0;
            this.f3513h = popupPresenterCallback;
            MenuPopup menuPopup = this.f3514i;
            if (menuPopup != null) {
                menuPopup.c(popupPresenterCallback);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            MenuBuilder menuBuilder = actionMenuPresenter.Z;
            if (menuBuilder != null) {
                menuBuilder.c(true);
            }
            actionMenuPresenter.t0 = null;
            super.c();
        }
    }

    public class PopupPresenterCallback implements MenuPresenter.Callback {
        public PopupPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void b(MenuBuilder menuBuilder, boolean z2) {
            if (menuBuilder instanceof SubMenuBuilder) {
                ((SubMenuBuilder) menuBuilder).f3517z.k().c(false);
            }
            MenuPresenter.Callback callback = ActionMenuPresenter.this.f0;
            if (callback != null) {
                callback.b(menuBuilder, z2);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean c(MenuBuilder menuBuilder) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (menuBuilder == actionMenuPresenter.Z) {
                return false;
            }
            int i2 = ((SubMenuBuilder) menuBuilder).f3516A.f3492a;
            MenuPresenter.Callback callback = actionMenuPresenter.f0;
            if (callback != null) {
                return callback.c(menuBuilder);
            }
            return false;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int X;

        /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.X = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.X);
        }
    }

    public ActionMenuPresenter(Context context) {
        this.X = context;
        this.e0 = LayoutInflater.from(context);
        this.g0 = R.layout.abc_action_menu_layout;
        this.h0 = R.layout.abc_action_menu_item_layout;
        this.s0 = new SparseBooleanArray();
        this.x0 = new PopupPresenterCallback();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final void a(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
        itemView.c(menuItemImpl);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i0);
        if (this.w0 == null) {
            this.w0 = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.w0);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void b(MenuBuilder menuBuilder, boolean z2) {
        m();
        ActionButtonSubmenu actionButtonSubmenu = this.u0;
        if (actionButtonSubmenu != null && actionButtonSubmenu.b()) {
            actionButtonSubmenu.f3514i.dismiss();
        }
        super.b(menuBuilder, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final boolean e(SubMenuBuilder subMenuBuilder) {
        boolean z2;
        if (subMenuBuilder.hasVisibleItems()) {
            SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
            while (true) {
                MenuBuilder menuBuilder = subMenuBuilder2.f3517z;
                if (menuBuilder == this.Z) {
                    break;
                }
                subMenuBuilder2 = (SubMenuBuilder) menuBuilder;
            }
            ViewGroup viewGroup = (ViewGroup) this.i0;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == subMenuBuilder2.f3516A) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                int i3 = subMenuBuilder.f3516A.f3492a;
                int size = subMenuBuilder.f.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = subMenuBuilder.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i4++;
                }
                ActionButtonSubmenu actionButtonSubmenu = new ActionButtonSubmenu(this.f3466Y, subMenuBuilder, view);
                this.u0 = actionButtonSubmenu;
                actionButtonSubmenu.d(z2);
                ActionButtonSubmenu actionButtonSubmenu2 = this.u0;
                if (!actionButtonSubmenu2.b()) {
                    if (actionButtonSubmenu2.f3512e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    actionButtonSubmenu2.e(0, 0, false, false);
                }
                super.e(subMenuBuilder);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void g(boolean z2) {
        ArrayList arrayList;
        super.g(z2);
        ((View) this.i0).requestLayout();
        MenuBuilder menuBuilder = this.Z;
        boolean z3 = false;
        if (menuBuilder != null) {
            menuBuilder.i();
            ArrayList arrayList2 = menuBuilder.f3483i;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ActionProvider actionProvider = ((MenuItemImpl) arrayList2.get(i2)).f3490A;
                if (actionProvider != null) {
                    actionProvider.f4421b = this;
                }
            }
        }
        MenuBuilder menuBuilder2 = this.Z;
        if (menuBuilder2 != null) {
            menuBuilder2.i();
            arrayList = menuBuilder2.j;
        } else {
            arrayList = null;
        }
        if (this.m0 && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z3 = !((MenuItemImpl) arrayList.get(0)).C;
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.j0 == null) {
                this.j0 = new OverflowMenuButton(this.X);
            }
            ViewGroup viewGroup = (ViewGroup) this.j0.getParent();
            if (viewGroup != this.i0) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.j0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i0;
                OverflowMenuButton overflowMenuButton = this.j0;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParamsL = ActionMenuView.l();
                layoutParamsL.f3527a = true;
                actionMenuView.addView(overflowMenuButton, layoutParamsL);
            }
        } else {
            OverflowMenuButton overflowMenuButton2 = this.j0;
            if (overflowMenuButton2 != null) {
                Object parent = overflowMenuButton2.getParent();
                Object obj = this.i0;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.j0);
                }
            }
        }
        ((ActionMenuView) this.i0).setOverflowReserved(this.m0);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final boolean h() {
        int size;
        ArrayList arrayListL;
        int i2;
        boolean z2;
        ActionMenuPresenter actionMenuPresenter = this;
        MenuBuilder menuBuilder = actionMenuPresenter.Z;
        if (menuBuilder != null) {
            arrayListL = menuBuilder.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i3 = actionMenuPresenter.q0;
        int i4 = actionMenuPresenter.p0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.i0;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= size) {
                break;
            }
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListL.get(i5);
            int i8 = menuItemImpl.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (actionMenuPresenter.r0 && menuItemImpl.C) {
                i3 = 0;
            }
            i5++;
        }
        if (actionMenuPresenter.m0 && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.s0;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            MenuItemImpl menuItemImpl2 = (MenuItemImpl) arrayListL.get(i10);
            int i12 = menuItemImpl2.y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = menuItemImpl2.f3493b;
            if (z4) {
                View viewK = actionMenuPresenter.k(menuItemImpl2, null, viewGroup);
                viewK.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewK.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                menuItemImpl2.g(z2);
            } else {
                if ((i12 & 1) == z2) {
                    boolean z5 = sparseBooleanArray.get(i13);
                    boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                    if (z6) {
                        View viewK2 = actionMenuPresenter.k(menuItemImpl2, null, viewGroup);
                        viewK2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewK2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        z6 &= i4 + i11 > 0;
                    }
                    if (z6 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z5) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i10; i14++) {
                            MenuItemImpl menuItemImpl3 = (MenuItemImpl) arrayListL.get(i14);
                            if (menuItemImpl3.f3493b == i13) {
                                if ((menuItemImpl3.x & 32) == 32) {
                                    i9++;
                                }
                                menuItemImpl3.g(false);
                            }
                        }
                    }
                    if (z6) {
                        i9--;
                    }
                    menuItemImpl2.g(z6);
                } else {
                    menuItemImpl2.g(false);
                }
                i10++;
                i2 = 2;
                actionMenuPresenter = this;
                z2 = true;
            }
            i10++;
            i2 = 2;
            actionMenuPresenter = this;
            z2 = true;
        }
        return z2;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void i(Context context, MenuBuilder menuBuilder) {
        super.i(context, menuBuilder);
        Resources resources = context.getResources();
        ActionBarPolicy actionBarPolicy = new ActionBarPolicy();
        actionBarPolicy.f3419a = context;
        if (!this.n0) {
            this.m0 = true;
        }
        this.o0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.q0 = actionBarPolicy.a();
        int measuredWidth = this.o0;
        if (this.m0) {
            if (this.j0 == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.X);
                this.j0 = overflowMenuButton;
                if (this.l0) {
                    overflowMenuButton.setImageDrawable(this.k0);
                    this.k0 = null;
                    this.l0 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.j0.getMeasuredWidth();
        } else {
            this.j0 = null;
        }
        this.p0 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean j(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.j0) {
            return false;
        }
        viewGroup.removeViewAt(i2);
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final View k(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.e()) {
            actionView = super.k(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.LayoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean l(MenuItemImpl menuItemImpl) {
        return (menuItemImpl.x & 32) == 32;
    }

    public final boolean m() {
        Object obj;
        OpenOverflowRunnable openOverflowRunnable = this.v0;
        if (openOverflowRunnable != null && (obj = this.i0) != null) {
            ((View) obj).removeCallbacks(openOverflowRunnable);
            this.v0 = null;
            return true;
        }
        OverflowPopup overflowPopup = this.t0;
        if (overflowPopup == null) {
            return false;
        }
        if (overflowPopup.b()) {
            overflowPopup.f3514i.dismiss();
        }
        return true;
    }

    public final boolean n() {
        OverflowPopup overflowPopup = this.t0;
        return overflowPopup != null && overflowPopup.b();
    }

    public final void o(boolean z2) {
        if (z2) {
            super.e(null);
            return;
        }
        MenuBuilder menuBuilder = this.Z;
        if (menuBuilder != null) {
            menuBuilder.c(false);
        }
    }

    public final boolean p() {
        MenuBuilder menuBuilder;
        if (!this.m0 || n() || (menuBuilder = this.Z) == null || this.i0 == null || this.v0 != null) {
            return false;
        }
        menuBuilder.i();
        if (menuBuilder.j.isEmpty()) {
            return false;
        }
        OpenOverflowRunnable openOverflowRunnable = new OpenOverflowRunnable(new OverflowPopup(this.f3466Y, this.Z, this.j0));
        this.v0 = openOverflowRunnable;
        ((View) this.i0).post(openOverflowRunnable);
        return true;
    }
}
