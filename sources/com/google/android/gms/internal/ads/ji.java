package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16100a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hi f16101b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16102c = false;

    public final void a(Context context) {
        synchronized (this.f16100a) {
            try {
                if (!this.f16102c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i10 = zze.zza;
                        zzo.zzi("Can not cast Context to Application");
                        return;
                    }
                    if (this.f16101b == null) {
                        this.f16101b = new hi();
                    }
                    hi hiVar = this.f16101b;
                    if (!hiVar.f15302i) {
                        application.registerActivityLifecycleCallbacks(hiVar);
                        if (context instanceof Activity) {
                            hiVar.a((Activity) context);
                        }
                        hiVar.f15295b = application;
                        hiVar.f15303j = ((Long) zzba.zzc().a(am.K1)).longValue();
                        hiVar.f15302i = true;
                    }
                    this.f16102c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(ii iiVar) {
        synchronized (this.f16100a) {
            try {
                if (this.f16101b == null) {
                    this.f16101b = new hi();
                }
                hi hiVar = this.f16101b;
                synchronized (hiVar.f15296c) {
                    hiVar.f15299f.add(iiVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(ii iiVar) {
        synchronized (this.f16100a) {
            try {
                hi hiVar = this.f16101b;
                if (hiVar == null) {
                    return;
                }
                synchronized (hiVar.f15296c) {
                    hiVar.f15299f.remove(iiVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Activity d() {
        synchronized (this.f16100a) {
            try {
                hi hiVar = this.f16101b;
                if (hiVar == null) {
                    return null;
                }
                return hiVar.f15294a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        synchronized (this.f16100a) {
            try {
                hi hiVar = this.f16101b;
                if (hiVar == null) {
                    return false;
                }
                return hiVar.f15297d.get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
