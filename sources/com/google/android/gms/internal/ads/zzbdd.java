package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class zzbdd implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private final AtomicBoolean zzd = new AtomicBoolean(true);
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.zza = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            try {
                Activity activity2 = this.zza;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzdum) it.next()).zzg(activity);
                    } catch (Exception e2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdum) it.next()).zzf(activity);
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        zzfxl zzfxlVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzbdc zzbdcVar = new zzbdc(this);
        this.zzh = zzbdcVar;
        zzfxlVar.postDelayed(zzbdcVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean andSet = this.zzd.getAndSet(true);
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdum) it.next()).zze(activity);
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                }
            }
            if (andSet) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground.");
            } else {
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzbde) it2.next()).zza(true);
                    } catch (Exception e3) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzby)).longValue();
        this.zzi = true;
    }

    public final void zzb(zzbde zzbdeVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzbdeVar);
        }
    }

    public final void zzc(zzbde zzbdeVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzbdeVar);
        }
    }

    public final Activity zzd() {
        return this.zza;
    }

    public final Context zze() {
        return this.zzb;
    }

    public final /* synthetic */ Object zzf() {
        return this.zzc;
    }

    public final /* synthetic */ AtomicBoolean zzg() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    public final /* synthetic */ List zzi() {
        return this.zzf;
    }

    public final void zzj(zzdum zzdumVar) {
        synchronized (this.zzc) {
            this.zzg.add(zzdumVar);
        }
    }
}
