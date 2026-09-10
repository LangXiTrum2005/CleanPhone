package com.gyf.immersionbar;

import android.R;
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
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.badlogic.gdx.graphics.GL20;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2553Kq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2579Lq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC4646tC;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ViewTreeObserverOnGlobalLayoutListenerC2686Pu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XY;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f850a;
    public final Fragment b;
    public final android.app.Fragment c;
    public Window d;
    public ViewGroup e;
    public ViewGroup f;
    public a g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public T8 k;
    public S8 l;
    public int m;
    public int n;
    public ViewTreeObserverOnGlobalLayoutListenerC2686Pu o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;

    public a(Activity activity) {
        this.h = false;
        this.i = false;
        this.j = false;
        this.m = 0;
        this.n = 0;
        this.o = null;
        new HashMap();
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.f850a = activity;
        f(activity.getWindow());
    }

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (((childAt instanceof DrawerLayout) && a(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static a k(Activity activity) {
        XY xy = WY.f3925a;
        xy.getClass();
        if (activity == null) {
            throw new NullPointerException("activity is null");
        }
        StringBuilder sbO = DM.o(xy.f3974a + activity.getClass().getName());
        sbO.append(System.identityHashCode(activity));
        sbO.append(".tag.notOnly.");
        String string = sbO.toString();
        if (activity instanceof FragmentActivity) {
            SupportRequestBarManagerFragment supportRequestBarManagerFragmentB = xy.b(((FragmentActivity) activity).getSupportFragmentManager(), string, false);
            if (supportRequestBarManagerFragmentB.f849a == null) {
                supportRequestBarManagerFragmentB.f849a = new RunnableC4646tC(activity);
            }
            return (a) supportRequestBarManagerFragmentB.f849a.c;
        }
        JY jyA = xy.a(activity.getFragmentManager(), string, false);
        if (jyA.f3270a == null) {
            jyA.f3270a = new RunnableC4646tC(activity);
        }
        return (a) jyA.f3270a.c;
    }

    public final void b() {
        if (this.g == null) {
            this.g = k(this.f850a);
        }
        a aVar = this.g;
        if (aVar == null || aVar.p) {
            return;
        }
        aVar.e();
    }

    public final void c() {
        if (OSUtils.isEMUI3_x()) {
            this.k.getClass();
            g();
        } else if (a(this.e.findViewById(R.id.content))) {
            i(0, 0, 0);
        } else {
            this.k.getClass();
            this.k.getClass();
            i(0, 0, 0);
        }
        if (this.k.j) {
            int i = this.l.f3703a;
        }
    }

    public final void d() {
        this.k.q = 3;
        if (OSUtils.isEMUI3_x()) {
            T8 t8 = this.k;
            int i = t8.q;
            t8.f = i == 2 || i == 3;
        }
    }

    public final void e() {
        T8 t8 = this.k;
        if (t8.p) {
            t8.getClass();
            ColorUtils.blendARGB(0, ViewCompat.MEASURED_STATE_MASK, this.k.c);
            this.k.getClass();
            T8 t9 = this.k;
            ColorUtils.blendARGB(t9.f3757a, ViewCompat.MEASURED_STATE_MASK, t9.d);
            this.k.getClass();
            boolean z = this.p;
            boolean z2 = this.h;
            if (!z || z2) {
                j();
            }
            a aVar = this.g;
            if (aVar != null && z2) {
                aVar.k = this.k;
            }
            h();
            c();
            if (z2) {
                a aVar2 = this.g;
                if (aVar2 != null) {
                    if (aVar2.k.k) {
                        if (aVar2.o == null) {
                            aVar2.o = new ViewTreeObserverOnGlobalLayoutListenerC2686Pu(aVar2);
                        }
                        a aVar3 = this.g;
                        ViewTreeObserverOnGlobalLayoutListenerC2686Pu viewTreeObserverOnGlobalLayoutListenerC2686Pu = aVar3.o;
                        viewTreeObserverOnGlobalLayoutListenerC2686Pu.b.setSoftInputMode(aVar3.k.l);
                        if (!viewTreeObserverOnGlobalLayoutListenerC2686Pu.k) {
                            viewTreeObserverOnGlobalLayoutListenerC2686Pu.c.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2686Pu);
                            viewTreeObserverOnGlobalLayoutListenerC2686Pu.k = true;
                        }
                    } else {
                        ViewTreeObserverOnGlobalLayoutListenerC2686Pu viewTreeObserverOnGlobalLayoutListenerC2686Pu2 = aVar2.o;
                        if (viewTreeObserverOnGlobalLayoutListenerC2686Pu2 != null) {
                            viewTreeObserverOnGlobalLayoutListenerC2686Pu2.a();
                        }
                    }
                }
            } else if (this.k.k) {
                if (this.o == null) {
                    this.o = new ViewTreeObserverOnGlobalLayoutListenerC2686Pu(this);
                }
                ViewTreeObserverOnGlobalLayoutListenerC2686Pu viewTreeObserverOnGlobalLayoutListenerC2686Pu3 = this.o;
                viewTreeObserverOnGlobalLayoutListenerC2686Pu3.b.setSoftInputMode(this.k.l);
                if (!viewTreeObserverOnGlobalLayoutListenerC2686Pu3.k) {
                    viewTreeObserverOnGlobalLayoutListenerC2686Pu3.c.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2686Pu3);
                    viewTreeObserverOnGlobalLayoutListenerC2686Pu3.k = true;
                }
            } else {
                ViewTreeObserverOnGlobalLayoutListenerC2686Pu viewTreeObserverOnGlobalLayoutListenerC2686Pu4 = this.o;
                if (viewTreeObserverOnGlobalLayoutListenerC2686Pu4 != null) {
                    viewTreeObserverOnGlobalLayoutListenerC2686Pu4.a();
                }
            }
            if (this.k.i.size() != 0) {
                for (Map.Entry entry : this.k.i.entrySet()) {
                    View view = (View) entry.getKey();
                    Map map = (Map) entry.getValue();
                    this.k.getClass();
                    Integer num = 0;
                    this.k.getClass();
                    Integer numValueOf = Integer.valueOf(ViewCompat.MEASURED_STATE_MASK);
                    for (Map.Entry entry2 : map.entrySet()) {
                        Integer num2 = (Integer) entry2.getKey();
                        numValueOf = (Integer) entry2.getValue();
                        num = num2;
                    }
                    if (view != null) {
                        this.k.getClass();
                        if (Math.abs(0.0f) == 0.0f) {
                            view.setBackgroundColor(ColorUtils.blendARGB(num.intValue(), numValueOf.intValue(), this.k.c));
                        } else {
                            int iIntValue = num.intValue();
                            int iIntValue2 = numValueOf.intValue();
                            this.k.getClass();
                            view.setBackgroundColor(ColorUtils.blendARGB(iIntValue, iIntValue2, 0.0f));
                        }
                    }
                }
            }
            this.p = true;
        }
    }

    public final void f(Window window) {
        this.d = window;
        T8 t8 = new T8();
        t8.f3757a = ViewCompat.MEASURED_STATE_MASK;
        t8.b = ViewCompat.MEASURED_STATE_MASK;
        t8.c = 0.0f;
        t8.d = 0.0f;
        t8.e = false;
        t8.f = false;
        t8.q = 4;
        t8.g = false;
        t8.h = false;
        t8.i = new HashMap();
        t8.j = true;
        t8.k = false;
        t8.l = 18;
        t8.m = true;
        t8.n = true;
        t8.o = true;
        t8.p = true;
        this.k = t8;
        ViewGroup viewGroup = (ViewGroup) this.d.getDecorView();
        this.e = viewGroup;
        this.f = (ViewGroup) viewGroup.findViewById(R.id.content);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    public final void g() {
        int i;
        int i2;
        Uri uriFor;
        if (a(this.e.findViewById(R.id.content))) {
            i(0, 0, 0);
        } else {
            this.k.getClass();
            this.k.getClass();
            S8 s8 = this.l;
            if (s8.b) {
                T8 t8 = this.k;
                if (t8.m && t8.n) {
                    if (t8.e) {
                        i = 0;
                    } else {
                        if (s8.c()) {
                            i2 = this.l.c;
                            i = 0;
                        } else {
                            i = this.l.d;
                        }
                        if (this.k.f) {
                            if (this.l.c()) {
                                i = 0;
                            }
                        } else if (!this.l.c()) {
                            i = this.l.d;
                        }
                    }
                    i2 = 0;
                    if (this.k.f) {
                        if (this.l.c()) {
                            i = 0;
                        }
                    } else if (!this.l.c()) {
                        i = this.l.d;
                    }
                } else {
                    i = 0;
                }
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
            i(0, i, i2);
        }
        if (this.h || !OSUtils.isEMUI3_x()) {
            return;
        }
        View viewFindViewById = this.e.findViewById(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.id.immersion_navigation_bar_view);
        T8 t9 = this.k;
        if (!t9.m || !t9.n) {
            int i3 = C2579Lq.d;
            ArrayList arrayList = AbstractC2553Kq.f3327a.f3376a;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            viewFindViewById.setVisibility(8);
            return;
        }
        if (viewFindViewById != null) {
            int i4 = C2579Lq.d;
            C2579Lq c2579Lq = AbstractC2553Kq.f3327a;
            if (c2579Lq.f3376a == null) {
                c2579Lq.f3376a = new ArrayList();
            }
            if (!c2579Lq.f3376a.contains(this)) {
                c2579Lq.f3376a.add(this);
            }
            Application application = this.f850a.getApplication();
            c2579Lq.b = application;
            if (application == null || application.getContentResolver() == null || c2579Lq.c.booleanValue() || (uriFor = Settings.System.getUriFor("navigationbar_is_min")) == null) {
                return;
            }
            c2579Lq.b.getContentResolver().registerContentObserver(uriFor, true, c2579Lq);
            c2579Lq.c = Boolean.TRUE;
        }
    }

    public final void h() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        WindowInsetsController windowInsetsController;
        int i2 = Build.VERSION.SDK_INT;
        boolean zIsEMUI3_x = OSUtils.isEMUI3_x();
        Activity activity = this.f850a;
        if (zIsEMUI3_x) {
            this.d.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            View viewFindViewById = this.e.findViewById(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.id.immersion_status_bar_view);
            if (viewFindViewById == null) {
                viewFindViewById = new View(activity);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, this.l.f3703a);
                layoutParams2.gravity = 48;
                viewFindViewById.setLayoutParams(layoutParams2);
                viewFindViewById.setVisibility(0);
                viewFindViewById.setId(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.id.immersion_status_bar_view);
                this.e.addView(viewFindViewById);
            }
            this.k.getClass();
            this.k.getClass();
            this.k.getClass();
            viewFindViewById.setBackgroundColor(ColorUtils.blendARGB(0, ViewCompat.MEASURED_STATE_MASK, this.k.c));
            if (this.l.b || OSUtils.isEMUI3_x()) {
                T8 t8 = this.k;
                if (t8.m && t8.n) {
                    this.d.addFlags(134217728);
                } else {
                    this.d.clearFlags(134217728);
                }
                if (this.m == 0) {
                    this.m = this.l.c;
                }
                if (this.n == 0) {
                    this.n = this.l.d;
                }
                View viewFindViewById2 = this.e.findViewById(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.id.immersion_navigation_bar_view);
                if (viewFindViewById2 == null) {
                    viewFindViewById2 = new View(activity);
                    viewFindViewById2.setId(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.id.immersion_navigation_bar_view);
                    this.e.addView(viewFindViewById2);
                }
                if (this.l.c()) {
                    layoutParams = new FrameLayout.LayoutParams(-1, this.l.c);
                    layoutParams.gravity = 80;
                } else {
                    layoutParams = new FrameLayout.LayoutParams(this.l.d, -1);
                    layoutParams.gravity = GravityCompat.END;
                }
                viewFindViewById2.setLayoutParams(layoutParams);
                T8 t9 = this.k;
                viewFindViewById2.setBackgroundColor(ColorUtils.blendARGB(t9.f3757a, ViewCompat.MEASURED_STATE_MASK, t9.d));
                T8 t10 = this.k;
                if (t10.m && t10.n && !t10.f) {
                    viewFindViewById2.setVisibility(0);
                } else {
                    viewFindViewById2.setVisibility(8);
                }
            }
            i = 256;
        } else {
            if (i2 >= 28 && !this.p) {
                try {
                    WindowManager.LayoutParams attributes = this.d.getAttributes();
                    attributes.layoutInDisplayCutoutMode = 1;
                    this.d.setAttributes(attributes);
                } catch (Exception unused) {
                }
            }
            if (!this.p) {
                this.k.b = this.d.getNavigationBarColor();
            }
            T8 t11 = this.k;
            i = (t11.e && t11.m) ? 1792 : GL20.GL_INVALID_ENUM;
            this.d.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            if (this.l.b) {
                this.d.clearFlags(134217728);
            }
            this.d.addFlags(Integer.MIN_VALUE);
            this.k.getClass();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                this.d.setStatusBarContrastEnforced(false);
            }
            Window window = this.d;
            this.k.getClass();
            this.k.getClass();
            window.setStatusBarColor(ColorUtils.blendARGB(0, ViewCompat.MEASURED_STATE_MASK, this.k.c));
            T8 t12 = this.k;
            if (t12.m) {
                if (i3 >= 29) {
                    this.d.setNavigationBarContrastEnforced(false);
                }
                Window window2 = this.d;
                T8 t13 = this.k;
                window2.setNavigationBarColor(ColorUtils.blendARGB(t13.f3757a, ViewCompat.MEASURED_STATE_MASK, t13.d));
            } else {
                this.d.setNavigationBarColor(t12.b);
            }
            if (i3 >= 23 && this.k.g) {
                i |= 8192;
            }
            if (i3 >= 26 && this.k.h) {
                i |= 16;
            }
            if (i3 >= 30) {
                WindowInsetsController windowInsetsController2 = this.f.getWindowInsetsController();
                if (this.k.g) {
                    Window window3 = this.d;
                    if (window3 != null) {
                        View decorView = window3.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                    }
                    windowInsetsController2.setSystemBarsAppearance(8, 8);
                } else {
                    windowInsetsController2.setSystemBarsAppearance(0, 8);
                }
                WindowInsetsController windowInsetsController3 = this.f.getWindowInsetsController();
                if (this.k.h) {
                    windowInsetsController3.setSystemBarsAppearance(16, 16);
                } else {
                    windowInsetsController3.setSystemBarsAppearance(0, 16);
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            int iD = DM.D(this.k.q);
            if (iD == 0) {
                i |= GL20.GL_FRONT;
            } else if (iD == 1) {
                i |= GL20.GL_EQUAL;
            } else if (iD == 2) {
                i |= GL20.GL_GEQUAL;
            }
            i |= 4096;
        }
        this.e.setSystemUiVisibility(i);
        if (OSUtils.isMIUI6Later()) {
            SpecialBarFontUtils.setMIUIBarDark(this.d, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", this.k.g);
            T8 t14 = this.k;
            if (t14.m) {
                SpecialBarFontUtils.setMIUIBarDark(this.d, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", t14.h);
            }
        }
        if (OSUtils.isFlymeOS4Later()) {
            this.k.getClass();
            SpecialBarFontUtils.setStatusBarDarkIcon(activity, this.k.g);
        }
        if (i4 >= 30 && (windowInsetsController = this.f.getWindowInsetsController()) != null) {
            int iD2 = DM.D(this.k.q);
            if (iD2 == 0) {
                windowInsetsController.hide(WindowInsets.Type.statusBars());
            } else if (iD2 == 1) {
                windowInsetsController.hide(WindowInsets.Type.navigationBars());
            } else if (iD2 == 2) {
                windowInsetsController.hide(WindowInsets.Type.statusBars());
                windowInsetsController.hide(WindowInsets.Type.navigationBars());
            } else if (iD2 == 3) {
                windowInsetsController.show(WindowInsets.Type.statusBars());
                windowInsetsController.show(WindowInsets.Type.navigationBars());
            }
            windowInsetsController.setSystemBarsBehavior(2);
        }
        this.k.getClass();
    }

    public final void i(int i, int i2, int i3) {
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setPadding(0, i, i2, i3);
        }
        this.q = 0;
        this.r = i;
        this.s = i2;
        this.t = i3;
    }

    public final void j() {
        this.l = new S8(this.f850a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        g();
    }

    public a(Fragment fragment) {
        this.h = false;
        this.i = false;
        this.j = false;
        this.m = 0;
        this.n = 0;
        this.o = null;
        new HashMap();
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.h = true;
        FragmentActivity activity = fragment.getActivity();
        this.f850a = activity;
        this.b = fragment;
        b();
        f(activity.getWindow());
    }

    public a(android.app.Fragment fragment) {
        this.h = false;
        this.i = false;
        this.j = false;
        this.m = 0;
        this.n = 0;
        this.o = null;
        new HashMap();
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.h = true;
        Activity activity = fragment.getActivity();
        this.f850a = activity;
        this.c = fragment;
        b();
        f(activity.getWindow());
    }

    public a(DialogFragment dialogFragment) {
        this.h = false;
        this.i = false;
        this.j = false;
        this.m = 0;
        this.n = 0;
        this.o = null;
        new HashMap();
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.j = true;
        this.i = true;
        this.f850a = dialogFragment.getActivity();
        this.b = dialogFragment;
        Dialog dialog = dialogFragment.getDialog();
        b();
        f(dialog.getWindow());
    }

    public a(android.app.DialogFragment dialogFragment) {
        this.h = false;
        this.i = false;
        this.j = false;
        this.m = 0;
        this.n = 0;
        this.o = null;
        new HashMap();
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.j = true;
        this.i = true;
        this.f850a = dialogFragment.getActivity();
        this.c = dialogFragment;
        Dialog dialog = dialogFragment.getDialog();
        b();
        f(dialog.getWindow());
    }

    public a(WeaponUseActivity weaponUseActivity, Dialog dialog) {
        this.h = false;
        this.i = false;
        this.j = false;
        this.m = 0;
        this.n = 0;
        this.o = null;
        new HashMap();
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.j = true;
        this.f850a = weaponUseActivity;
        b();
        f(dialog.getWindow());
    }
}
