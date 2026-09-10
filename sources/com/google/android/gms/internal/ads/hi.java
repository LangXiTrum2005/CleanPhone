package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hi implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f15294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f15295b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f15301h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f15303j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15296c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15297d = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15298e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f15299f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f15300g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15302i = false;

    public final void a(Activity activity) {
        synchronized (this.f15296c) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.f15294a = activity;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f15296c) {
            try {
                Activity activity2 = this.f15294a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f15294a = null;
                }
                Iterator it = this.f15300g.iterator();
                while (it.hasNext()) {
                    try {
                        ((jh0) it.next()).d();
                    } catch (Exception e10) {
                        zzt.zzh().d("AppActivityTracker.ActivityListener.onActivityDestroyed", e10);
                        int i10 = zze.zza;
                        zzo.zzg("", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f15296c) {
            Iterator it = this.f15300g.iterator();
            while (it.hasNext()) {
                try {
                    ((jh0) it.next()).c();
                } catch (Exception e10) {
                    zzt.zzh().d("AppActivityTracker.ActivityListener.onActivityPaused", e10);
                    int i10 = zze.zza;
                    zzo.zzg("", e10);
                }
            }
        }
        this.f15298e = true;
        d dVar = this.f15301h;
        if (dVar != null) {
            zzs.zza.removeCallbacks(dVar);
        }
        y01 y01Var = zzs.zza;
        d dVar2 = new d(this, 9);
        this.f15301h = dVar2;
        y01Var.postDelayed(dVar2, this.f15303j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.f15298e = false;
        boolean andSet = this.f15297d.getAndSet(true);
        d dVar = this.f15301h;
        if (dVar != null) {
            zzs.zza.removeCallbacks(dVar);
        }
        synchronized (this.f15296c) {
            Iterator it = this.f15300g.iterator();
            while (it.hasNext()) {
                try {
                    ((jh0) it.next()).b();
                } catch (Exception e10) {
                    zzt.zzh().d("AppActivityTracker.ActivityListener.onActivityResumed", e10);
                    int i10 = zze.zza;
                    zzo.zzg("", e10);
                }
            }
            if (andSet) {
                int i11 = zze.zza;
                zzo.zzd("App is still foreground.");
            } else {
                Iterator it2 = this.f15299f.iterator();
                while (it2.hasNext()) {
                    try {
                        ((ii) it2.next()).zza(true);
                    } catch (Exception e11) {
                        int i12 = zze.zza;
                        zzo.zzg("", e11);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
