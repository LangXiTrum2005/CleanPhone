package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class ToolbarWidgetWrapper implements DecorToolbar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f3651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f3653c;
    public Drawable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f3654e;
    public final Drawable f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f3655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f3656i;
    public final CharSequence j;
    public Window.Callback k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3657l;
    public ActionMenuPresenter m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3658n;
    public final Drawable o;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z2) {
        Drawable drawable;
        this.f3658n = 0;
        this.f3651a = toolbar;
        this.f3655h = toolbar.getTitle();
        this.f3656i = toolbar.getSubtitle();
        this.g = this.f3655h != null;
        this.f = toolbar.getNavigationIcon();
        TintTypedArray tintTypedArrayE = TintTypedArray.e(toolbar.getContext(), null, R.styleable.f3277a, com.charging.screenshow.battery.animations.themes.R.attr.actionBarStyle);
        int i2 = 15;
        this.o = tintTypedArrayE.b(15);
        if (z2) {
            TypedArray typedArray = tintTypedArrayE.f3646b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.f3655h = text;
                if ((this.f3652b & 8) != 0) {
                    Toolbar toolbar2 = this.f3651a;
                    toolbar2.setTitle(text);
                    if (this.g) {
                        ViewCompat.B(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f3656i = text2;
                if ((this.f3652b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableB = tintTypedArrayE.b(20);
            if (drawableB != null) {
                this.f3654e = drawableB;
                s();
            }
            Drawable drawableB2 = tintTypedArrayE.b(17);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                int i3 = this.f3652b & 4;
                Toolbar toolbar3 = this.f3651a;
                if (i3 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            i(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f3653c;
                if (view != null && (this.f3652b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f3653c = viewInflate;
                if (viewInflate != null && (this.f3652b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                i(this.f3652b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.x0.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.p0 = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.f0;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.q0 = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.g0;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f3652b = i2;
        }
        tintTypedArrayE.f();
        if (com.charging.screenshow.battery.animations.themes.R.string.abc_action_bar_up_description != this.f3658n) {
            this.f3658n = com.charging.screenshow.battery.animations.themes.R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i4 = this.f3658n;
                this.j = i4 != 0 ? this.f3651a.getContext().getString(i4) : null;
                r();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.1
            public final ActionMenuItem X;

            {
                Context context3 = ToolbarWidgetWrapper.this.f3651a.getContext();
                CharSequence charSequence = ToolbarWidgetWrapper.this.f3655h;
                ActionMenuItem actionMenuItem = new ActionMenuItem();
                actionMenuItem.f3460e = 4096;
                actionMenuItem.g = 4096;
                actionMenuItem.f3463l = null;
                actionMenuItem.m = null;
                actionMenuItem.f3464n = false;
                actionMenuItem.o = false;
                actionMenuItem.f3465p = 16;
                actionMenuItem.f3462i = context3;
                actionMenuItem.f3457a = charSequence;
                this.X = actionMenuItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
                Window.Callback callback = toolbarWidgetWrapper.k;
                if (callback == null || !toolbarWidgetWrapper.f3657l) {
                    return;
                }
                callback.onMenuItemSelected(0, this.X);
            }
        });
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean a() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f3651a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.e0) != null && actionMenuView.w0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void b(MenuBuilder menuBuilder, MenuPresenter.Callback callback) {
        ActionMenuPresenter actionMenuPresenter = this.m;
        Toolbar toolbar = this.f3651a;
        if (actionMenuPresenter == null) {
            this.m = new ActionMenuPresenter(toolbar.getContext());
        }
        ActionMenuPresenter actionMenuPresenter2 = this.m;
        actionMenuPresenter2.f0 = callback;
        if (menuBuilder == null && toolbar.e0 == null) {
            return;
        }
        toolbar.f();
        MenuBuilder menuBuilder2 = toolbar.e0.t0;
        if (menuBuilder2 == menuBuilder) {
            return;
        }
        if (menuBuilder2 != null) {
            menuBuilder2.r(toolbar.P0);
            menuBuilder2.r(toolbar.Q0);
        }
        if (toolbar.Q0 == null) {
            toolbar.Q0 = toolbar.new ExpandedActionViewMenuPresenter();
        }
        actionMenuPresenter2.r0 = true;
        if (menuBuilder != null) {
            menuBuilder.b(actionMenuPresenter2, toolbar.n0);
            menuBuilder.b(toolbar.Q0, toolbar.n0);
        } else {
            actionMenuPresenter2.i(toolbar.n0, null);
            toolbar.Q0.i(toolbar.n0, null);
            actionMenuPresenter2.g(true);
            toolbar.Q0.g(true);
        }
        toolbar.e0.setPopupTheme(toolbar.o0);
        toolbar.e0.setPresenter(actionMenuPresenter2);
        toolbar.P0 = actionMenuPresenter2;
        toolbar.x();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean c() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f3651a.e0;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.x0) == null || !actionMenuPresenter.m()) ? false : true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void collapseActionView() {
        Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.f3651a.Q0;
        MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.f3649Y;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean d() {
        return this.f3651a.w();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean e() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f3651a.e0;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.x0) == null || !actionMenuPresenter.n()) ? false : true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void f() {
        this.f3657l = true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean g() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f3651a.e0;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.x0) == null) {
            return false;
        }
        return actionMenuPresenter.v0 != null || actionMenuPresenter.n();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final Context getContext() {
        return this.f3651a.getContext();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final CharSequence getTitle() {
        return this.f3651a.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean h() {
        return this.f3651a.m();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void i(int i2) {
        View view;
        int i3 = this.f3652b ^ i2;
        this.f3652b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    r();
                }
                int i4 = this.f3652b & 4;
                Toolbar toolbar = this.f3651a;
                if (i4 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                s();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f3651a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f3655h);
                    toolbar2.setSubtitle(this.f3656i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f3653c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final ViewPropertyAnimatorCompat j(final int i2, long j) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA = ViewCompat.a(this.f3651a);
        viewPropertyAnimatorCompatA.a(i2 == 0 ? 1.0f : 0.0f);
        viewPropertyAnimatorCompatA.c(j);
        viewPropertyAnimatorCompatA.d(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f3660a = false;

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void a() {
                this.f3660a = true;
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void b() {
                ToolbarWidgetWrapper.this.f3651a.setVisibility(0);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void c() {
                if (this.f3660a) {
                    return;
                }
                ToolbarWidgetWrapper.this.f3651a.setVisibility(i2);
            }
        });
        return viewPropertyAnimatorCompatA;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void k() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void l(boolean z2) {
        this.f3651a.setCollapsible(z2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void m() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f3651a.e0;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.x0) == null) {
            return;
        }
        actionMenuPresenter.m();
        ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = actionMenuPresenter.u0;
        if (actionButtonSubmenu == null || !actionButtonSubmenu.b()) {
            return;
        }
        actionButtonSubmenu.f3514i.dismiss();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void o(int i2) {
        this.f3654e = i2 != 0 ? AppCompatResources.a(this.f3651a.getContext(), i2) : null;
        s();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final int p() {
        return this.f3652b;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void r() {
        if ((this.f3652b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f3651a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f3658n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void s() {
        Drawable drawable;
        int i2 = this.f3652b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f3654e) == null) {
            drawable = this.d;
        }
        this.f3651a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setIcon(int i2) {
        setIcon(i2 != 0 ? AppCompatResources.a(this.f3651a.getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setVisibility(int i2) {
        this.f3651a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setWindowCallback(Window.Callback callback) {
        this.k = callback;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.g) {
            return;
        }
        this.f3655h = charSequence;
        if ((this.f3652b & 8) != 0) {
            Toolbar toolbar = this.f3651a;
            toolbar.setTitle(charSequence);
            if (this.g) {
                ViewCompat.B(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setIcon(Drawable drawable) {
        this.d = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void n() {
    }
}
