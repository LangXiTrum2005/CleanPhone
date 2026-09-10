package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ti extends AppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi f20395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f20396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ui f20397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FullScreenContentCallback f20398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnPaidEventListener f20399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f20400f;

    public ti(wi wiVar) {
        this.f20397c = new ui();
        this.f20400f = new AtomicLong();
        this.f20395a = wiVar;
        this.f20396b = new AtomicReference();
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        String strZzj;
        String str;
        AtomicReference atomicReference = this.f20396b;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzj = this.f20395a.zzj();
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
                strZzj = null;
            }
            if (strZzj == null) {
                this.f20396b.set("");
            } else {
                this.f20396b.set(strZzj);
            }
            str = (String) this.f20396b.get();
        }
        return str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f20398d;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f20399e;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final long getPlacementId() {
        long j10;
        AtomicLong atomicLong = this.f20400f;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long jZzk = this.f20395a.zzk();
                    AtomicLong atomicLong2 = this.f20400f;
                    atomicLong2.set(jZzk);
                    j10 = atomicLong2.get();
                } catch (RemoteException e10) {
                    zzo.zzl("#007 Could not call remote method.", e10);
                    return 0L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        zzdx zzdxVarZzg;
        try {
            zzdxVarZzg = this.f20395a.zzg();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            zzdxVarZzg = null;
        }
        return ResponseInfo.zzc(zzdxVarZzg);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f20398d = fullScreenContentCallback;
        this.f20397c.f20796a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z10) {
        try {
            this.f20395a.zzh(z10);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f20399e = onPaidEventListener;
        try {
            this.f20395a.n0(new zzfo(onPaidEventListener));
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setPlacementId(long j10) {
        try {
            this.f20395a.zzl(j10);
            this.f20400f.set(j10);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.f20395a.u0(new s9.b(activity), this.f20397c);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public ti(wi wiVar, String str) {
        this.f20397c = new ui();
        this.f20400f = new AtomicLong();
        this.f20395a = wiVar;
        this.f20396b = new AtomicReference(str);
    }
}
