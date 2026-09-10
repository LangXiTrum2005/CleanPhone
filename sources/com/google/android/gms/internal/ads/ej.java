package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ScheduledFuture f13988a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f13989b = new d(this, 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13990c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hj f13991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f13992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jj f13993f;

    public final void a(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f13990c) {
            try {
                if (this.f13992e != null) {
                    return;
                }
                this.f13992e = context.getApplicationContext();
                if (((Boolean) zzba.zzc().a(am.f12283o5)).booleanValue()) {
                    d();
                } else {
                    if (((Boolean) zzba.zzc().a(am.f12267n5)).booleanValue()) {
                        zzt.zzg().b(new dj(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final fj b(ij ijVar) {
        synchronized (this.f13990c) {
            if (this.f13993f == null) {
                return new fj();
            }
            try {
                if (this.f13991d.j()) {
                    jj jjVar = this.f13993f;
                    Parcel parcelQ = jjVar.q();
                    rh.c(parcelQ, ijVar);
                    Parcel parcelR = jjVar.r(parcelQ, 2);
                    fj fjVar = (fj) rh.b(parcelR, fj.CREATOR);
                    parcelR.recycle();
                    return fjVar;
                }
                jj jjVar2 = this.f13993f;
                Parcel parcelQ2 = jjVar2.q();
                rh.c(parcelQ2, ijVar);
                Parcel parcelR2 = jjVar2.r(parcelQ2, 1);
                fj fjVar2 = (fj) rh.b(parcelR2, fj.CREATOR);
                parcelR2.recycle();
                return fjVar2;
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzg("Unable to call into cache service.", e10);
                return new fj();
            }
        }
    }

    public final /* synthetic */ void c() {
        synchronized (this.f13990c) {
            try {
                hj hjVar = this.f13991d;
                if (hjVar == null) {
                    return;
                }
                if (hjVar.isConnected() || this.f13991d.isConnecting()) {
                    this.f13991d.disconnect();
                }
                this.f13991d = null;
                this.f13993f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        hj hjVar;
        synchronized (this.f13990c) {
            if (this.f13992e != null && this.f13991d == null) {
                vf vfVar = new vf(this, 7);
                so0 so0Var = new so0(this, 8);
                synchronized (this) {
                    hjVar = new hj(this.f13992e, zzt.zzs().zza(), vfVar, so0Var, 0);
                }
                this.f13991d = hjVar;
                hjVar.checkAvailabilityAndConnect();
            }
        }
    }
}
