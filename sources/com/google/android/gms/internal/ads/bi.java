package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bi implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f12779o = ((Long) zzba.zzc().a(am.f12111d2)).longValue();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f12781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager f12782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final KeyguardManager f12783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q7.c f12784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f12785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WeakReference f12786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yf f12787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzbu f12788i = new zzbu(f12779o);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12789j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12790k = -1;
    public final HashSet l = new HashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DisplayMetrics f12791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f12792n;

    public bi(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f12780a = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f12782c = (PowerManager) applicationContext.getSystemService("power");
        this.f12783d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f12781b = (Application) applicationContext;
            this.f12787h = new yf((Application) applicationContext, this);
        }
        this.f12791m = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f12792n = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f12786g;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.f12786g = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f10 = rect.left;
        float f11 = this.f12791m.density;
        return new Rect((int) (f10 / f11), (int) (rect.top / f11), (int) (rect.right / f11), (int) (rect.bottom / f11));
    }

    public final void b() {
        zzs.zza.post(new d(this, 8));
    }

    public final void c(Activity activity, int i10) {
        Window window;
        WeakReference weakReference = this.f12786g;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f12790k = i10;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0138  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r23v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    public final void d(int i10) {
        WeakReference weakReference;
        int i11;
        boolean z10;
        boolean z11;
        View view;
        ?? arrayList;
        int i12;
        int i13;
        int i14;
        boolean z12;
        HashSet hashSet = this.l;
        if (hashSet.isEmpty() || (weakReference = this.f12786g) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            boolean globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            boolean localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
                i11 = 0;
            } catch (Exception e10) {
                int i15 = zze.zza;
                i11 = 0;
                zzo.zzg("Failure getting view location.", e10);
            }
            if (((Boolean) zzba.zzc().a(am.f12194i6)).booleanValue()) {
                rect.left = iArr2[i11];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[i11];
                rect.top = iArr[1];
            }
            rect.right = view2.getWidth() + rect.left;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
            z10 = globalVisibleRect;
            z11 = localVisibleRect;
        } else {
            i11 = 0;
            z10 = false;
            z11 = false;
            view = null;
        }
        if (!((Boolean) zzba.zzc().a(am.f12160g2)).booleanValue() || view == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                arrayList = new ArrayList();
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        arrayList.add(a(rect5));
                    }
                }
            } catch (Exception e11) {
                zzt.zzh().d("PositionWatcher.getParentScrollViewRects", e11);
                arrayList = Collections.EMPTY_LIST;
            }
        }
        ?? r28 = arrayList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i16 = this.f12790k;
        if (i16 != -1) {
            windowVisibility = i16;
        }
        zzt.zzc();
        long jZzy = zzs.zzy(view);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12200ic)).booleanValue();
        KeyguardManager keyguardManager = this.f12783d;
        PowerManager powerManager = this.f12782c;
        boolean z13 = z10;
        z13 = z10;
        boolean z14 = z11;
        z14 = z11;
        if (zBooleanValue) {
            if (view2 != null) {
                zzt.zzc();
                if (zzs.zzX(view, powerManager, keyguardManager)) {
                    if (!z10) {
                        i12 = i11;
                        i13 = i12;
                        i14 = z11;
                    } else if (!z11) {
                        i13 = 1;
                        i12 = i11;
                        i14 = i12;
                    } else if (jZzy < ((Integer) zzba.zzc().a(am.lc)).intValue() || windowVisibility != 0) {
                        z13 = true;
                        z14 = true;
                    } else {
                        i12 = 1;
                        i13 = 1;
                        i14 = 1;
                        windowVisibility = i11;
                    }
                }
            }
            z13 = z10;
            z14 = z11;
            z13 = z10;
            z14 = z11;
            i12 = i11;
            i13 = z13;
            i14 = z14;
        } else {
            if (view2 != null) {
                zzt.zzc();
                if (zzs.zzX(view, powerManager, keyguardManager)) {
                    if (!z10) {
                        i12 = i11;
                        i13 = i12;
                        i14 = z11;
                    } else if (!z11) {
                        i13 = 1;
                        i12 = i11;
                        i14 = i12;
                    } else if (windowVisibility == 0) {
                        i12 = 1;
                        i13 = 1;
                        i14 = 1;
                        windowVisibility = i11;
                    } else {
                        z13 = true;
                        z14 = true;
                    }
                }
            }
            z13 = z10;
            z14 = z11;
            z13 = z10;
            z14 = z11;
            i12 = i11;
            i13 = z13;
            i14 = z14;
        }
        if (((Boolean) zzba.zzc().a(am.f12273nc)).booleanValue()) {
            zzt.zzc();
            int i17 = true != zzs.zzX(view, powerManager, keyguardManager) ? i11 : 64;
            int i18 = 1 != i13 ? i11 : 8;
            int i19 = 1 != i14 ? i11 : 16;
            int i20 = windowVisibility == 0 ? 128 : i11;
            int i21 = i17;
            int i22 = jZzy >= ((long) ((Integer) zzba.zzc().a(am.lc)).intValue()) ? 32 : i11;
            zzt.zzc();
            zzs.zzM(view, i22 | i21 | i18 | i19 | i20 | i12, null);
        }
        if (i10 == 1 && !this.f12788i.zza() && i12 == this.f12789j) {
            return;
        }
        if (i12 != 0 || this.f12789j) {
            z12 = true;
        } else {
            z12 = true;
            if (i10 == 1) {
                return;
            }
        }
        ((p9.b) zzt.zzk()).getClass();
        SystemClock.elapsedRealtime();
        powerManager.isScreenOn();
        ?? r18 = (view == null || !view.isAttachedToWindow()) ? i11 : z12;
        int windowVisibility2 = view != null ? view.getWindowVisibility() : 8;
        Rect rectA = a(this.f12792n);
        Rect rectA2 = a(rect);
        Rect rectA3 = a(rect2);
        Rect rectA4 = a(rect3);
        Rect rectA5 = a(rect4);
        float f10 = this.f12791m.density;
        ?? r27 = i12;
        zh zhVar = new zh(r18, windowVisibility2, rectA, rectA2, rectA3, i13, rectA4, i14, rectA5, r27, r28);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ai) it.next()).v(zhVar);
        }
        this.f12789j = r27;
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f12785f = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f12784e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f12784e = new q7.c(this, 2);
            zzt.zzA().zzb(this.f12780a, this.f12784e, intentFilter);
        }
        Application application = this.f12781b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f12787h);
            } catch (Exception e10) {
                int i10 = zze.zza;
                zzo.zzg("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f12785f;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f12785f = null;
            }
        } catch (Exception e10) {
            int i10 = zze.zza;
            zzo.zzg("Error while unregistering listeners from the last ViewTreeObserver.", e10);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e11) {
            int i11 = zze.zza;
            zzo.zzg("Error while unregistering listeners from the ViewTreeObserver.", e11);
        }
        if (this.f12784e != null) {
            try {
                zzt.zzA().zzc(this.f12780a, this.f12784e);
            } catch (IllegalStateException e12) {
                int i12 = zze.zza;
                zzo.zzg("Failed trying to unregister the receiver", e12);
            } catch (Exception e13) {
                zzt.zzh().d("ActiveViewUnit.stopScreenStatusMonitoring", e13);
            }
            this.f12784e = null;
        }
        Application application = this.f12781b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f12787h);
            } catch (Exception e14) {
                int i13 = zze.zza;
                zzo.zzg("Error registering activity lifecycle callbacks.", e14);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d(3);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d(2);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f12790k = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f12790k = -1;
        d(3);
        b();
        f(view);
    }
}
