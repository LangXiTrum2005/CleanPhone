package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
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

/* JADX INFO: loaded from: classes4.dex */
public final class zzbaa implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final Handler zza = new Handler(Looper.getMainLooper());
    private final Context zzb;
    private Application zzc;
    private final PowerManager zzd;
    private final KeyguardManager zze;
    private BroadcastReceiver zzf;
    private final zzazm zzg;
    private WeakReference zzh;
    private WeakReference zzi;
    private zzazi zzj;
    private byte zzk = -1;
    private int zzl = -1;
    private long zzm = -3;

    public zzbaa(Context context, zzazm zzazmVar) {
        Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zzg = zzazmVar;
        this.zzd = (PowerManager) applicationContext.getSystemService("power");
        this.zze = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.zzc = (Application) applicationContext;
            this.zzj = new zzazi((Application) applicationContext, this);
        }
        zza(null);
    }

    private final void zze() {
        zza.post(new zzazy(this));
    }

    private final void zzf(Activity activity, int i2) {
        Window window;
        if (this.zzi == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewZzb = zzb();
        if (viewZzb == null || viewPeekDecorView == null || viewZzb.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.zzl = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final void zzd() {
        Activity activity;
        if (this.zzi == null) {
            return;
        }
        View viewZzb = zzb();
        if (viewZzb == null) {
            this.zzm = -3L;
            this.zzk = (byte) -1;
            return;
        }
        int i2 = 0;
        int i3 = viewZzb.getVisibility() != 0 ? 1 : 0;
        if (!viewZzb.isShown()) {
            i3 |= 2;
        }
        PowerManager powerManager = this.zzd;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i3 |= 4;
        }
        if (!this.zzg.zza()) {
            KeyguardManager keyguardManager = this.zze;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                i3 |= 8;
            } else {
                int i4 = zzazw.zza;
                View rootView = viewZzb.getRootView();
                if (rootView == null) {
                    rootView = viewZzb;
                }
                Context context = rootView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper) || i2 >= 10) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        i2++;
                    }
                }
                if (activity != null) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes == null || (attributes.flags & 524288) == 0) {
                        i3 |= 8;
                    }
                } else {
                    i3 |= 8;
                }
            }
        }
        if (!viewZzb.getGlobalVisibleRect(new Rect())) {
            i3 |= 16;
        }
        if (!viewZzb.getLocalVisibleRect(new Rect())) {
            i3 |= 32;
        }
        int windowVisibility = viewZzb.getWindowVisibility();
        int i5 = this.zzl;
        if (i5 != -1) {
            windowVisibility = i5;
        }
        if (windowVisibility != 0) {
            i3 |= 64;
        }
        if (this.zzk != i3) {
            this.zzk = (byte) i3;
            this.zzm = i3 == 0 ? SystemClock.elapsedRealtime() : (-3) - ((long) i3);
        }
    }

    private final void zzh(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzh = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzf == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzazz zzazzVar = new zzazz(this);
            this.zzf = zzazzVar;
            this.zzb.registerReceiver(zzazzVar, intentFilter);
        }
        Application application = this.zzc;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception unused) {
            }
        }
    }

    private final void zzi(View view) {
        try {
            WeakReference weakReference = this.zzh;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzh = null;
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
        BroadcastReceiver broadcastReceiver = this.zzf;
        if (broadcastReceiver != null) {
            try {
                this.zzb.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.zzf = null;
        }
        Application application = this.zzc;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzf(activity, 0);
        zzd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzf(activity, 4);
        zzd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzf(activity, 0);
        zzd();
        zze();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzf(activity, 0);
        zzd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzd();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzd();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzd();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzl = -1;
        zzh(view);
        zzd();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzl = -1;
        zzd();
        zze();
        zzi(view);
    }

    public final void zza(View view) {
        long j;
        View viewZzb = zzb();
        if (viewZzb != null) {
            viewZzb.removeOnAttachStateChangeListener(this);
            zzi(viewZzb);
        }
        this.zzi = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                zzh(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.zzm = j;
    }

    public final View zzb() {
        WeakReference weakReference = this.zzi;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final long zzc() {
        if (this.zzm <= -2 && zzb() == null) {
            this.zzm = -3L;
        }
        return this.zzm;
    }
}
