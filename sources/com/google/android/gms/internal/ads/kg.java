package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kg implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Handler f16427m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f16429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager f16430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final KeyguardManager f16431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q7.c f16432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ag f16433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f16434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f16435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yf f16436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f16437j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16438k = -1;
    public long l = -3;

    public kg(Context context, ag agVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16428a = applicationContext;
        this.f16433f = agVar;
        this.f16430c = (PowerManager) applicationContext.getSystemService("power");
        this.f16431d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f16429b = (Application) applicationContext;
            this.f16436i = new yf((Application) applicationContext, this);
        }
        a(null);
    }

    public final void a(View view) {
        long j10;
        WeakReference weakReference = this.f16435h;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            e(view2);
        }
        this.f16435h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j10 = -2;
        } else {
            j10 = -3;
        }
        this.l = j10;
    }

    public final void b(Activity activity, int i10) {
        Window window;
        if (this.f16435h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        WeakReference weakReference = this.f16435h;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f16438k = i10;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0086  */
    public final void c() {
        Activity activity;
        WeakReference weakReference = this.f16435h;
        if (weakReference == null) {
            return;
        }
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            this.l = -3L;
            this.f16437j = (byte) -1;
            return;
        }
        int i10 = 0;
        int i11 = view.getVisibility() != 0 ? 1 : 0;
        if (!view.isShown()) {
            i11 |= 2;
        }
        PowerManager powerManager = this.f16430c;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i11 |= 4;
        }
        if (!this.f16433f.f12027a) {
            KeyguardManager keyguardManager = this.f16431d;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                i11 |= 8;
            } else {
                char[] cArr = ig.f15734a;
                View rootView = view.getRootView();
                if (rootView == null) {
                    rootView = view;
                }
                Context context = rootView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper) || i10 >= 10) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        i10++;
                    }
                }
                if (activity != null) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes == null || (attributes.flags & 524288) == 0) {
                        i11 |= 8;
                    }
                } else {
                    i11 |= 8;
                }
            }
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            i11 |= 16;
        }
        if (!view.getLocalVisibleRect(new Rect())) {
            i11 |= 32;
        }
        int windowVisibility = view.getWindowVisibility();
        int i12 = this.f16438k;
        if (i12 != -1) {
            windowVisibility = i12;
        }
        if (windowVisibility != 0) {
            i11 |= 64;
        }
        if (this.f16437j != i11) {
            this.f16437j = (byte) i11;
            this.l = i11 == 0 ? SystemClock.elapsedRealtime() : (-3) - ((long) i11);
        }
    }

    public final void d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f16434g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f16432e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            q7.c cVar = new q7.c(this, 1);
            this.f16432e = cVar;
            this.f16428a.registerReceiver(cVar, intentFilter);
        }
        Application application = this.f16429b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f16436i);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(View view) {
        try {
            WeakReference weakReference = this.f16434g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f16434g = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        q7.c cVar = this.f16432e;
        if (cVar != null) {
            try {
                this.f16428a.unregisterReceiver(cVar);
            } catch (Exception unused3) {
            }
            this.f16432e = null;
        }
        Application application = this.f16429b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f16436i);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c();
        f16427m.post(new d(this, 6));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f16438k = -1;
        d(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f16438k = -1;
        c();
        f16427m.post(new d(this, 6));
        e(view);
    }
}
