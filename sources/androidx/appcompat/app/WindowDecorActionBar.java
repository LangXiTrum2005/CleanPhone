package androidx.appcompat.app;

import A.V;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f3376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f3377c;
    public ActionBarOverlayLayout d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f3378e;
    public DecorToolbar f;
    public ActionBarContextView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f3379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3380i;
    public ActionModeImpl j;
    public ActionModeImpl k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ActionMode.Callback f3381l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f3382n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3383p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ViewPropertyAnimatorCompatSet t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3384u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ViewPropertyAnimatorListener f3385w;
    public final ViewPropertyAnimatorListener x;
    public final ViewPropertyAnimatorUpdateListener y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f3374z = new AccelerateInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final DecelerateInterpolator f3373A = new DecelerateInterpolator();

    /* JADX INFO: renamed from: androidx.appcompat.app.WindowDecorActionBar$1, reason: invalid class name */
    public class AnonymousClass1 extends ViewPropertyAnimatorListenerAdapter {
        public AnonymousClass1() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void c() {
            View view;
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f3383p && (view = windowDecorActionBar.f3379h) != null) {
                view.setTranslationY(0.0f);
                windowDecorActionBar.f3378e.setTranslationY(0.0f);
            }
            windowDecorActionBar.f3378e.setVisibility(8);
            windowDecorActionBar.f3378e.setTransitioning(false);
            windowDecorActionBar.t = null;
            ActionMode.Callback callback = windowDecorActionBar.f3381l;
            if (callback != null) {
                ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9) callback).a(windowDecorActionBar.k);
                windowDecorActionBar.k = null;
                windowDecorActionBar.f3381l = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = windowDecorActionBar.d;
            if (actionBarOverlayLayout != null) {
                ViewCompat.x(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.WindowDecorActionBar$2, reason: invalid class name */
    public class AnonymousClass2 extends ViewPropertyAnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void c() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            windowDecorActionBar.t = null;
            windowDecorActionBar.f3378e.requestLayout();
        }
    }

    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {
        public final Context Z;
        public final MenuBuilder e0;
        public ActionMode.Callback f0;
        public WeakReference g0;

        public ActionModeImpl(Context context, ActionMode.Callback callback) {
            this.Z = context;
            this.f0 = callback;
            MenuBuilder menuBuilder = new MenuBuilder(context);
            menuBuilder.f3484l = 1;
            this.e0 = menuBuilder;
            menuBuilder.f3481e = this;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            ActionMode.Callback callback = this.f0;
            if (callback != null) {
                return ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9) callback).f3325a.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void b(MenuBuilder menuBuilder) {
            if (this.f0 == null) {
                return;
            }
            i();
            WindowDecorActionBar.this.g.i();
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void c() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.j != this) {
                return;
            }
            if (windowDecorActionBar.q) {
                windowDecorActionBar.k = this;
                windowDecorActionBar.f3381l = this.f0;
            } else {
                ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9) this.f0).a(this);
            }
            this.f0 = null;
            windowDecorActionBar.t(false);
            ActionBarContextView actionBarContextView = windowDecorActionBar.g;
            if (actionBarContextView.o0 == null) {
                actionBarContextView.g();
            }
            windowDecorActionBar.d.setHideOnContentScrollEnabled(windowDecorActionBar.v);
            windowDecorActionBar.j = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final View d() {
            WeakReference weakReference = this.g0;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final MenuBuilder e() {
            return this.e0;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final MenuInflater f() {
            return new SupportMenuInflater(this.Z);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final CharSequence g() {
            return WindowDecorActionBar.this.g.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public final CharSequence h() {
            return WindowDecorActionBar.this.g.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void i() {
            if (WindowDecorActionBar.this.j != this) {
                return;
            }
            MenuBuilder menuBuilder = this.e0;
            menuBuilder.w();
            try {
                ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9) this.f0).d(this, menuBuilder);
            } finally {
                menuBuilder.v();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public final boolean j() {
            return WindowDecorActionBar.this.g.w0;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void k(View view) {
            WindowDecorActionBar.this.g.setCustomView(view);
            this.g0 = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void l(int i2) {
            m(WindowDecorActionBar.this.f3375a.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void m(CharSequence charSequence) {
            WindowDecorActionBar.this.g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void n(int i2) {
            o(WindowDecorActionBar.this.f3375a.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void o(CharSequence charSequence) {
            WindowDecorActionBar.this.g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void p(boolean z2) {
            this.f3420Y = z2;
            WindowDecorActionBar.this.g.setTitleOptional(z2);
        }
    }

    public class TabImpl extends ActionBar.Tab {
    }

    public WindowDecorActionBar(Activity activity, boolean z2) {
        new ArrayList();
        this.f3382n = new ArrayList();
        this.o = 0;
        this.f3383p = true;
        this.s = true;
        this.f3385w = new AnonymousClass1();
        this.x = new AnonymousClass2();
        this.y = new ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
            @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
            public final void a() {
                ((View) WindowDecorActionBar.this.f3378e.getParent()).invalidate();
            }
        };
        this.f3377c = activity;
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z2) {
            return;
        }
        this.f3379h = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void a() {
        if (this.q) {
            this.q = false;
            w(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void b(boolean z2) {
        this.f3383p = z2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void c() {
        if (this.q) {
            return;
        }
        this.q = true;
        w(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void d() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.t;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.a();
            this.t = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean f() {
        DecorToolbar decorToolbar = this.f;
        if (decorToolbar == null || !decorToolbar.h()) {
            return false;
        }
        this.f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void g(boolean z2) {
        if (z2 == this.m) {
            return;
        }
        this.m = z2;
        ArrayList arrayList = this.f3382n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ActionBar.OnMenuVisibilityListener) arrayList.get(i2)).a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int h() {
        return this.f.p();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context i() {
        if (this.f3376b == null) {
            TypedValue typedValue = new TypedValue();
            this.f3375a.getTheme().resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f3376b = new ContextThemeWrapper(this.f3375a, i2);
            } else {
                this.f3376b = this.f3375a;
            }
        }
        return this.f3376b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void k() {
        v(this.f3375a.getResources().getBoolean(com.charging.screenshow.battery.animations.themes.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean m(int i2, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        ActionModeImpl actionModeImpl = this.j;
        if (actionModeImpl == null || (menuBuilder = actionModeImpl.e0) == null) {
            return false;
        }
        menuBuilder.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuBuilder.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void onWindowVisibilityChanged(int i2) {
        this.o = i2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void p(boolean z2) {
        if (this.f3380i) {
            return;
        }
        int i2 = z2 ? 4 : 0;
        int iP = this.f.p();
        this.f3380i = true;
        this.f.i((i2 & 4) | (iP & (-5)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void q(boolean z2) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.f3384u = z2;
        if (z2 || (viewPropertyAnimatorCompatSet = this.t) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(CharSequence charSequence) {
        this.f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final ActionMode s(ActionMode.Callback callback) {
        ActionModeImpl actionModeImpl = this.j;
        if (actionModeImpl != null) {
            actionModeImpl.c();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.g();
        ActionModeImpl actionModeImpl2 = new ActionModeImpl(this.g.getContext(), callback);
        MenuBuilder menuBuilder = actionModeImpl2.e0;
        menuBuilder.w();
        try {
            boolean zB = ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9) actionModeImpl2.f0).f3325a.b(actionModeImpl2, menuBuilder);
            menuBuilder.v();
            if (!zB) {
                return null;
            }
            this.j = actionModeImpl2;
            actionModeImpl2.i();
            this.g.e(actionModeImpl2);
            t(true);
            return actionModeImpl2;
        } catch (Throwable th) {
            menuBuilder.v();
            throw th;
        }
    }

    public final void t(boolean z2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatJ;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatH;
        if (z2) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w(false);
        }
        ActionBarContainer actionBarContainer = this.f3378e;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                this.f.setVisibility(4);
                this.g.setVisibility(0);
                return;
            } else {
                this.f.setVisibility(0);
                this.g.setVisibility(8);
                return;
            }
        }
        if (z2) {
            viewPropertyAnimatorCompatH = this.f.j(4, 100L);
            viewPropertyAnimatorCompatJ = this.g.h(0, 200L);
        } else {
            viewPropertyAnimatorCompatJ = this.f.j(0, 200L);
            viewPropertyAnimatorCompatH = this.g.h(8, 100L);
        }
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
        ArrayList arrayList = viewPropertyAnimatorCompatSet.f3450a;
        arrayList.add(viewPropertyAnimatorCompatH);
        View view = (View) viewPropertyAnimatorCompatH.f4485a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) viewPropertyAnimatorCompatJ.f4485a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(viewPropertyAnimatorCompatJ);
        viewPropertyAnimatorCompatSet.b();
    }

    public final void u(View view) {
        DecorToolbar wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.charging.screenshow.battery.animations.themes.R.id.decor_content_parent);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.charging.screenshow.battery.animations.themes.R.id.action_bar);
        if (callbackFindViewById instanceof DecorToolbar) {
            wrapper = (DecorToolbar) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : AbstractJsonLexerKt.NULL));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f = wrapper;
        this.g = (ActionBarContextView) view.findViewById(com.charging.screenshow.battery.animations.themes.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.charging.screenshow.battery.animations.themes.R.id.action_bar_container);
        this.f3378e = actionBarContainer;
        DecorToolbar decorToolbar = this.f;
        if (decorToolbar == null || this.g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f3375a = decorToolbar.getContext();
        if ((this.f.p() & 4) != 0) {
            this.f3380i = true;
        }
        Context context = this.f3375a;
        ActionBarPolicy actionBarPolicy = new ActionBarPolicy();
        actionBarPolicy.f3419a = context;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f.getClass();
        v(actionBarPolicy.f3419a.getResources().getBoolean(com.charging.screenshow.battery.animations.themes.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f3375a.obtainStyledAttributes(null, androidx.appcompat.R.styleable.f3277a, com.charging.screenshow.battery.animations.themes.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.d;
            if (!actionBarOverlayLayout2.l0) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ViewCompat.E(this.f3378e, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void v(boolean z2) {
        if (z2) {
            this.f3378e.setTabContainer(null);
            this.f.n();
        } else {
            this.f.n();
            this.f3378e.setTabContainer(null);
        }
        this.f.getClass();
        this.f.l(false);
        this.d.setHasNonEmbeddedTabs(false);
    }

    public final void w(boolean z2) {
        boolean z3 = this.r || !this.q;
        ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener = this.y;
        View view = this.f3379h;
        if (!z3) {
            if (this.s) {
                this.s = false;
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.t;
                if (viewPropertyAnimatorCompatSet != null) {
                    viewPropertyAnimatorCompatSet.a();
                }
                int i2 = this.o;
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = this.f3385w;
                if (i2 != 0 || (!this.f3384u && !z2)) {
                    ((AnonymousClass1) viewPropertyAnimatorListener).c();
                    return;
                }
                this.f3378e.setAlpha(1.0f);
                this.f3378e.setTransitioning(true);
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
                float f = -this.f3378e.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.f3378e.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA = ViewCompat.a(this.f3378e);
                viewPropertyAnimatorCompatA.e(f);
                View view2 = (View) viewPropertyAnimatorCompatA.f4485a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new V(view2, 2, viewPropertyAnimatorUpdateListener) : null);
                }
                boolean z4 = viewPropertyAnimatorCompatSet2.f3453e;
                ArrayList arrayList = viewPropertyAnimatorCompatSet2.f3450a;
                if (!z4) {
                    arrayList.add(viewPropertyAnimatorCompatA);
                }
                if (this.f3383p && view != null) {
                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA2 = ViewCompat.a(view);
                    viewPropertyAnimatorCompatA2.e(f);
                    if (!viewPropertyAnimatorCompatSet2.f3453e) {
                        arrayList.add(viewPropertyAnimatorCompatA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f3374z;
                boolean z5 = viewPropertyAnimatorCompatSet2.f3453e;
                if (!z5) {
                    viewPropertyAnimatorCompatSet2.f3452c = accelerateInterpolator;
                }
                if (!z5) {
                    viewPropertyAnimatorCompatSet2.f3451b = 250L;
                }
                ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = (ViewPropertyAnimatorListenerAdapter) viewPropertyAnimatorListener;
                if (!z5) {
                    viewPropertyAnimatorCompatSet2.d = viewPropertyAnimatorListenerAdapter;
                }
                this.t = viewPropertyAnimatorCompatSet2;
                viewPropertyAnimatorCompatSet2.b();
                return;
            }
            return;
        }
        if (this.s) {
            return;
        }
        this.s = true;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet3 = this.t;
        if (viewPropertyAnimatorCompatSet3 != null) {
            viewPropertyAnimatorCompatSet3.a();
        }
        this.f3378e.setVisibility(0);
        int i3 = this.o;
        ViewPropertyAnimatorListener viewPropertyAnimatorListener2 = this.x;
        if (i3 == 0 && (this.f3384u || z2)) {
            this.f3378e.setTranslationY(0.0f);
            float f2 = -this.f3378e.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.f3378e.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f3378e.setTranslationY(f2);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet4 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA3 = ViewCompat.a(this.f3378e);
            viewPropertyAnimatorCompatA3.e(0.0f);
            View view3 = (View) viewPropertyAnimatorCompatA3.f4485a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new V(view3, 2, viewPropertyAnimatorUpdateListener) : null);
            }
            boolean z6 = viewPropertyAnimatorCompatSet4.f3453e;
            ArrayList arrayList2 = viewPropertyAnimatorCompatSet4.f3450a;
            if (!z6) {
                arrayList2.add(viewPropertyAnimatorCompatA3);
            }
            if (this.f3383p && view != null) {
                view.setTranslationY(f2);
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA4 = ViewCompat.a(view);
                viewPropertyAnimatorCompatA4.e(0.0f);
                if (!viewPropertyAnimatorCompatSet4.f3453e) {
                    arrayList2.add(viewPropertyAnimatorCompatA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f3373A;
            boolean z7 = viewPropertyAnimatorCompatSet4.f3453e;
            if (!z7) {
                viewPropertyAnimatorCompatSet4.f3452c = decelerateInterpolator;
            }
            if (!z7) {
                viewPropertyAnimatorCompatSet4.f3451b = 250L;
            }
            ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter2 = (ViewPropertyAnimatorListenerAdapter) viewPropertyAnimatorListener2;
            if (!z7) {
                viewPropertyAnimatorCompatSet4.d = viewPropertyAnimatorListenerAdapter2;
            }
            this.t = viewPropertyAnimatorCompatSet4;
            viewPropertyAnimatorCompatSet4.b();
        } else {
            this.f3378e.setAlpha(1.0f);
            this.f3378e.setTranslationY(0.0f);
            if (this.f3383p && view != null) {
                view.setTranslationY(0.0f);
            }
            ((AnonymousClass2) viewPropertyAnimatorListener2).c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            ViewCompat.x(actionBarOverlayLayout);
        }
    }

    public WindowDecorActionBar(Dialog dialog) {
        new ArrayList();
        this.f3382n = new ArrayList();
        this.o = 0;
        this.f3383p = true;
        this.s = true;
        this.f3385w = new AnonymousClass1();
        this.x = new AnonymousClass2();
        this.y = new ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
            @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
            public final void a() {
                ((View) WindowDecorActionBar.this.f3378e.getParent()).invalidate();
            }
        };
        u(dialog.getWindow().getDecorView());
    }
}
