package com.gyf.immersionbar;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.charging.screenshow.battery.animations.themes.activity.BaseAct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ImmersionBar implements ImmersionCallback {
    public final Activity X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Window f21434Y;
    public ViewGroup Z;
    public ViewGroup e0;
    public ImmersionBar f0;
    public final boolean g0;
    public final boolean h0;
    public BarParams i0;
    public BarConfig j0;
    public int k0;
    public int l0;
    public FitsKeyboard m0;
    public int n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;

    /* JADX INFO: renamed from: com.gyf.immersionbar.ImmersionBar$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21436a;

        static {
            int[] iArr = new int[BarHide.values().length];
            f21436a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21436a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21436a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21436a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ImmersionBar(Activity activity) {
        this.g0 = false;
        this.h0 = false;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = null;
        new HashMap();
        this.n0 = 0;
        this.o0 = false;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.X = activity;
        f(activity.getWindow());
    }

    public static boolean b(View view) {
        if (view == null) {
            return false;
        }
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (((childAt instanceof DrawerLayout) && b(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ImmersionBar j(BaseAct baseAct) {
        return RequestManagerRetriever.Holder.f21442a.a(baseAct);
    }

    @Override // com.gyf.immersionbar.OnNavigationBarListener
    public final void a(boolean z2) {
        int i2;
        int i3;
        View viewFindViewById = this.Z.findViewById(com.charging.screenshow.battery.animations.themes.R.id.immersion_navigation_bar_view);
        if (viewFindViewById != null) {
            this.j0 = new BarConfig(this.X);
            this.e0.getPaddingBottom();
            this.e0.getPaddingRight();
            int i4 = 0;
            if (z2) {
                viewFindViewById.setVisibility(0);
                if (!b(this.Z.findViewById(android.R.id.content))) {
                    if (this.k0 == 0) {
                        this.k0 = this.j0.f21424c;
                    }
                    if (this.l0 == 0) {
                        this.l0 = this.j0.d;
                    }
                    this.i0.getClass();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
                    if (this.j0.c()) {
                        layoutParams.gravity = 80;
                        layoutParams.height = this.k0;
                        this.i0.getClass();
                        i2 = 0;
                        i4 = this.k0;
                    } else {
                        layoutParams.gravity = 8388613;
                        layoutParams.width = this.l0;
                        this.i0.getClass();
                        i2 = this.l0;
                    }
                    viewFindViewById.setLayoutParams(layoutParams);
                    i3 = i4;
                    i4 = i2;
                }
                h(this.e0.getPaddingTop(), i4, i3);
            }
            viewFindViewById.setVisibility(8);
            i3 = 0;
            h(this.e0.getPaddingTop(), i4, i3);
        }
    }

    public final void c() {
        if (this.f0 == null) {
            this.f0 = RequestManagerRetriever.Holder.f21442a.a(this.X);
        }
        ImmersionBar immersionBar = this.f0;
        if (immersionBar == null || immersionBar.o0) {
            return;
        }
        immersionBar.e();
    }

    public final void d() {
        final Integer num;
        if (OSUtils.isEMUI3_x()) {
            this.i0.getClass();
            g();
        } else if (b(this.Z.findViewById(android.R.id.content))) {
            h(0, 0, 0);
        } else {
            this.i0.getClass();
            this.i0.getClass();
            h(0, 0, 0);
        }
        BarParams barParams = this.i0;
        final int i2 = barParams.e0 ? this.j0.f21422a : 0;
        int i3 = this.n0;
        Activity activity = this.X;
        if (i3 == 1) {
            View[] viewArr = {null};
            if (activity == null) {
                return;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            final View view = viewArr[0];
            if (view == null) {
                return;
            }
            Integer num2 = (Integer) view.getTag(com.charging.screenshow.battery.animations.themes.R.id.immersion_fits_layout_overlap);
            num = num2 != null ? num2 : 0;
            if (num.intValue() != i2) {
                view.setTag(com.charging.screenshow.battery.animations.themes.R.id.immersion_fits_layout_overlap, Integer.valueOf(i2));
                final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -2);
                }
                int i4 = layoutParams.height;
                if (i4 == -2 || i4 == -1) {
                    view.post(new Runnable() { // from class: com.gyf.immersionbar.ImmersionBar.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            View view2 = view;
                            int height = view2.getHeight();
                            int i5 = i2;
                            Integer num3 = num;
                            int iIntValue = (height + i5) - num3.intValue();
                            ViewGroup.LayoutParams layoutParams2 = layoutParams;
                            layoutParams2.height = iIntValue;
                            view2.setPadding(view2.getPaddingLeft(), (view2.getPaddingTop() + i5) - num3.intValue(), view2.getPaddingRight(), view2.getPaddingBottom());
                            view2.setLayoutParams(layoutParams2);
                        }
                    });
                    return;
                }
                layoutParams.height = (i2 - num.intValue()) + i4;
                view.setPadding(view.getPaddingLeft(), (view.getPaddingTop() + i2) - num.intValue(), view.getPaddingRight(), view.getPaddingBottom());
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            View[] viewArr2 = {barParams.Z};
            if (activity == null) {
                return;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            View view2 = viewArr2[0];
            if (view2 == null) {
                return;
            }
            Integer num3 = (Integer) view2.getTag(com.charging.screenshow.battery.animations.themes.R.id.immersion_fits_layout_overlap);
            if ((num3 != null ? num3 : 0).intValue() != i2) {
                view2.setTag(com.charging.screenshow.battery.animations.themes.R.id.immersion_fits_layout_overlap, Integer.valueOf(i2));
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-1, 0);
                }
                layoutParams2.height = i2;
                view2.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        View[] viewArr3 = {null};
        if (activity == null) {
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        View view3 = viewArr3[0];
        if (view3 == null) {
            return;
        }
        Integer num4 = (Integer) view3.getTag(com.charging.screenshow.battery.animations.themes.R.id.immersion_fits_layout_overlap);
        num = num4 != null ? num4 : 0;
        if (num.intValue() != i2) {
            view3.setTag(com.charging.screenshow.battery.animations.themes.R.id.immersion_fits_layout_overlap, Integer.valueOf(i2));
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (marginLayoutParams.topMargin + i2) - num.intValue(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view3.setLayoutParams(marginLayoutParams);
        }
    }

    public final void e() {
        FrameLayout.LayoutParams layoutParams;
        int i2;
        WindowInsetsController windowInsetsController;
        BarParams barParams = this.i0;
        if (barParams.i0) {
            barParams.getClass();
            this.i0.getClass();
            ColorUtils.b(0.0f, 0, -16777216);
            this.i0.getClass();
            this.i0.getClass();
            this.i0.getClass();
            this.i0.getClass();
            ColorUtils.b(0.0f, -16777216, -16777216);
            this.i0.getClass();
            boolean z2 = this.o0;
            boolean z3 = this.g0;
            if (!z2 || z3) {
                i();
            }
            ImmersionBar immersionBar = this.f0;
            if (immersionBar != null) {
                if (z3) {
                    immersionBar.i0 = this.i0;
                }
                boolean z4 = this.h0;
            }
            int i3 = Build.VERSION.SDK_INT;
            boolean zIsEMUI3_x = OSUtils.isEMUI3_x();
            Activity activity = this.X;
            if (zIsEMUI3_x) {
                this.f21434Y.addFlags(67108864);
                View viewFindViewById = this.Z.findViewById(com.charging.screenshow.battery.animations.themes.R.id.immersion_status_bar_view);
                if (viewFindViewById == null) {
                    viewFindViewById = new View(activity);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, this.j0.f21422a);
                    layoutParams2.gravity = 48;
                    viewFindViewById.setLayoutParams(layoutParams2);
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.setId(com.charging.screenshow.battery.animations.themes.R.id.immersion_status_bar_view);
                    this.Z.addView(viewFindViewById);
                }
                this.i0.getClass();
                this.i0.getClass();
                this.i0.getClass();
                this.i0.getClass();
                viewFindViewById.setBackgroundColor(ColorUtils.b(0.0f, 0, -16777216));
                if (this.j0.f21423b || OSUtils.isEMUI3_x()) {
                    BarParams barParams2 = this.i0;
                    if (barParams2.f0 && barParams2.g0) {
                        this.f21434Y.addFlags(134217728);
                    } else {
                        this.f21434Y.clearFlags(134217728);
                    }
                    if (this.k0 == 0) {
                        this.k0 = this.j0.f21424c;
                    }
                    if (this.l0 == 0) {
                        this.l0 = this.j0.d;
                    }
                    View viewFindViewById2 = this.Z.findViewById(com.charging.screenshow.battery.animations.themes.R.id.immersion_navigation_bar_view);
                    if (viewFindViewById2 == null) {
                        viewFindViewById2 = new View(activity);
                        viewFindViewById2.setId(com.charging.screenshow.battery.animations.themes.R.id.immersion_navigation_bar_view);
                        this.Z.addView(viewFindViewById2);
                    }
                    if (this.j0.c()) {
                        layoutParams = new FrameLayout.LayoutParams(-1, this.j0.f21424c);
                        layoutParams.gravity = 80;
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(this.j0.d, -1);
                        layoutParams.gravity = 8388613;
                    }
                    viewFindViewById2.setLayoutParams(layoutParams);
                    this.i0.getClass();
                    this.i0.getClass();
                    this.i0.getClass();
                    viewFindViewById2.setBackgroundColor(ColorUtils.b(0.0f, -16777216, -16777216));
                    BarParams barParams3 = this.i0;
                    if (barParams3.f0 && barParams3.g0) {
                        viewFindViewById2.setVisibility(0);
                    } else {
                        viewFindViewById2.setVisibility(8);
                    }
                }
                i2 = 256;
            } else {
                if (i3 >= 28 && !this.o0) {
                    try {
                        WindowManager.LayoutParams attributes = this.f21434Y.getAttributes();
                        attributes.layoutInDisplayCutoutMode = 1;
                        this.f21434Y.setAttributes(attributes);
                    } catch (Exception unused) {
                    }
                }
                if (!this.o0) {
                    this.i0.X = this.f21434Y.getNavigationBarColor();
                }
                this.i0.getClass();
                this.f21434Y.clearFlags(67108864);
                if (this.j0.f21423b) {
                    this.f21434Y.clearFlags(134217728);
                }
                this.f21434Y.addFlags(Integer.MIN_VALUE);
                this.i0.getClass();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                    this.f21434Y.setStatusBarContrastEnforced(false);
                }
                Window window = this.f21434Y;
                this.i0.getClass();
                this.i0.getClass();
                this.i0.getClass();
                window.setStatusBarColor(ColorUtils.b(0.0f, 0, -16777216));
                BarParams barParams4 = this.i0;
                if (barParams4.f0) {
                    if (i4 >= 29) {
                        this.f21434Y.setNavigationBarContrastEnforced(false);
                    }
                    Window window2 = this.f21434Y;
                    this.i0.getClass();
                    this.i0.getClass();
                    this.i0.getClass();
                    window2.setNavigationBarColor(ColorUtils.b(0.0f, -16777216, -16777216));
                } else {
                    this.f21434Y.setNavigationBarColor(barParams4.X);
                }
                this.i0.getClass();
                if (i4 >= 30) {
                    WindowInsetsController windowInsetsController2 = this.e0.getWindowInsetsController();
                    this.i0.getClass();
                    windowInsetsController2.setSystemBarsAppearance(0, 8);
                    WindowInsetsController windowInsetsController3 = this.e0.getWindowInsetsController();
                    this.i0.getClass();
                    windowInsetsController3.setSystemBarsAppearance(0, 16);
                }
                i2 = 1280;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 30) {
                this.i0.getClass();
                i2 |= 4096;
            }
            this.Z.setSystemUiVisibility(i2);
            if (OSUtils.isMIUI6Later()) {
                Window window3 = this.f21434Y;
                this.i0.getClass();
                SpecialBarFontUtils.setMIUIBarDark(window3, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", false);
                if (this.i0.f0) {
                    SpecialBarFontUtils.setMIUIBarDark(this.f21434Y, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", false);
                }
            }
            if (OSUtils.isFlymeOS4Later()) {
                this.i0.getClass();
                this.i0.getClass();
                SpecialBarFontUtils.setStatusBarDarkIcon(activity, false);
            }
            if (i5 >= 30 && (windowInsetsController = this.e0.getWindowInsetsController()) != null) {
                this.i0.getClass();
                windowInsetsController.show(WindowInsets.Type.statusBars());
                windowInsetsController.show(WindowInsets.Type.navigationBars());
                windowInsetsController.setSystemBarsBehavior(2);
            }
            this.i0.getClass();
            d();
            if (z3) {
                ImmersionBar immersionBar2 = this.f0;
                if (immersionBar2 != null) {
                    immersionBar2.i0.getClass();
                    FitsKeyboard fitsKeyboard = immersionBar2.m0;
                    if (fitsKeyboard != null) {
                        fitsKeyboard.a();
                    }
                }
            } else {
                this.i0.getClass();
                FitsKeyboard fitsKeyboard2 = this.m0;
                if (fitsKeyboard2 != null) {
                    fitsKeyboard2.a();
                }
            }
            if (this.i0.f21426Y.size() != 0) {
                for (Map.Entry entry : this.i0.f21426Y.entrySet()) {
                    View view = (View) entry.getKey();
                    Map map = (Map) entry.getValue();
                    this.i0.getClass();
                    Integer num = 0;
                    this.i0.getClass();
                    Integer num2 = -16777216;
                    for (Map.Entry entry2 : map.entrySet()) {
                        Integer num3 = (Integer) entry2.getKey();
                        num2 = (Integer) entry2.getValue();
                        num = num3;
                    }
                    if (view != null) {
                        this.i0.getClass();
                        if (Math.abs(0.0f) == 0.0f) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            this.i0.getClass();
                            view.setBackgroundColor(ColorUtils.b(0.0f, iIntValue, iIntValue2));
                        } else {
                            int iIntValue3 = num.intValue();
                            int iIntValue4 = num2.intValue();
                            this.i0.getClass();
                            view.setBackgroundColor(ColorUtils.b(0.0f, iIntValue3, iIntValue4));
                        }
                    }
                }
            }
            this.o0 = true;
        }
    }

    public final void f(Window window) {
        this.f21434Y = window;
        BarParams barParams = new BarParams();
        barParams.X = -16777216;
        barParams.f21426Y = new HashMap();
        barParams.e0 = true;
        barParams.f0 = true;
        barParams.g0 = true;
        barParams.h0 = true;
        barParams.i0 = true;
        this.i0 = barParams;
        ViewGroup viewGroup = (ViewGroup) this.f21434Y.getDecorView();
        this.Z = viewGroup;
        this.e0 = (ViewGroup) viewGroup.findViewById(android.R.id.content);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public final void g() {
        int i2;
        int i3;
        Uri uriFor;
        if (b(this.Z.findViewById(android.R.id.content))) {
            h(0, 0, 0);
        } else {
            this.i0.getClass();
            this.i0.getClass();
            BarConfig barConfig = this.j0;
            if (barConfig.f21423b) {
                BarParams barParams = this.i0;
                if (barParams.f0 && barParams.g0) {
                    if (barConfig.c()) {
                        i3 = this.j0.f21424c;
                        i2 = 0;
                    } else {
                        i2 = this.j0.d;
                        i3 = 0;
                    }
                    this.i0.getClass();
                    if (!this.j0.c()) {
                        i2 = this.j0.d;
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            h(0, i2, i3);
        }
        if (this.g0 || !OSUtils.isEMUI3_x()) {
            return;
        }
        View viewFindViewById = this.Z.findViewById(com.charging.screenshow.battery.animations.themes.R.id.immersion_navigation_bar_view);
        BarParams barParams2 = this.i0;
        if (!barParams2.f0 || !barParams2.g0) {
            int i4 = EMUI3NavigationBarObserver.d;
            ArrayList arrayList = EMUI3NavigationBarObserver.NavigationBarObserverInstance.f21430a.f21427a;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            viewFindViewById.setVisibility(8);
            return;
        }
        if (viewFindViewById != null) {
            int i5 = EMUI3NavigationBarObserver.d;
            EMUI3NavigationBarObserver eMUI3NavigationBarObserver = EMUI3NavigationBarObserver.NavigationBarObserverInstance.f21430a;
            if (eMUI3NavigationBarObserver.f21427a == null) {
                eMUI3NavigationBarObserver.f21427a = new ArrayList();
            }
            if (!eMUI3NavigationBarObserver.f21427a.contains(this)) {
                eMUI3NavigationBarObserver.f21427a.add(this);
            }
            Application application = this.X.getApplication();
            eMUI3NavigationBarObserver.f21428b = application;
            if (application == null || application.getContentResolver() == null || eMUI3NavigationBarObserver.f21429c.booleanValue() || (uriFor = Settings.System.getUriFor("navigationbar_is_min")) == null) {
                return;
            }
            eMUI3NavigationBarObserver.f21428b.getContentResolver().registerContentObserver(uriFor, true, eMUI3NavigationBarObserver);
            eMUI3NavigationBarObserver.f21429c = Boolean.TRUE;
        }
    }

    public final void h(int i2, int i3, int i4) {
        ViewGroup viewGroup = this.e0;
        if (viewGroup != null) {
            viewGroup.setPadding(0, i2, i3, i4);
        }
        this.p0 = i2;
        this.q0 = i3;
        this.r0 = i4;
    }

    public final void i() {
        this.j0 = new BarConfig(this.X);
    }

    @Override // java.lang.Runnable
    public final void run() {
        g();
    }

    public ImmersionBar(Fragment fragment) {
        this.g0 = false;
        this.h0 = false;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = null;
        new HashMap();
        this.n0 = 0;
        this.o0 = false;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.g0 = true;
        FragmentActivity activity = fragment.getActivity();
        this.X = activity;
        c();
        f(activity.getWindow());
    }

    public ImmersionBar(android.app.Fragment fragment) {
        this.g0 = false;
        this.h0 = false;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = null;
        new HashMap();
        this.n0 = 0;
        this.o0 = false;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.g0 = true;
        Activity activity = fragment.getActivity();
        this.X = activity;
        c();
        f(activity.getWindow());
    }

    public ImmersionBar(DialogFragment dialogFragment) {
        this.g0 = false;
        this.h0 = false;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = null;
        new HashMap();
        this.n0 = 0;
        this.o0 = false;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.h0 = true;
        this.X = dialogFragment.getActivity();
        Dialog dialog = dialogFragment.getDialog();
        c();
        f(dialog.getWindow());
    }

    public ImmersionBar(android.app.DialogFragment dialogFragment) {
        this.g0 = false;
        this.h0 = false;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = null;
        new HashMap();
        this.n0 = 0;
        this.o0 = false;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.h0 = true;
        this.X = dialogFragment.getActivity();
        Dialog dialog = dialogFragment.getDialog();
        c();
        f(dialog.getWindow());
    }
}
