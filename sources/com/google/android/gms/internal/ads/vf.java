package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vf implements xb1, sb, b01, k9.b, InitializationStatus, p00, SignalCallbacks, MediationRewardedAdCallback, yd1, zb0, ao, al0, j80, zzg, mp0, kt0, lt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21157b;

    public /* synthetic */ vf(int i10) {
        this.f21156a = i10;
    }

    public static vf c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        vf vfVar = new vf(0);
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new uf(vfVar, 0));
                return vfVar;
            } catch (RuntimeException unused) {
                synchronized (vf.class) {
                    vfVar.f21157b = null;
                }
            }
        }
        return vfVar;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public ListenableFuture a(mx mxVar) {
        uk0 uk0Var = (uk0) ((vu0) this.f21157b).f21275c;
        String str = mxVar.f17573h;
        synchronized (uk0Var.f19987b) {
            try {
                int i10 = uk0Var.f20811h;
                if (i10 != 1 && i10 != 3) {
                    return zw1.l(new yk0(2));
                }
                if (uk0Var.f19988c) {
                    return uk0Var.f19986a;
                }
                uk0Var.f20811h = 3;
                uk0Var.f19988c = true;
                uk0Var.f20810g = str;
                uk0Var.f19991f.checkAvailabilityAndConnect();
                m00 m00Var = uk0Var.f19986a;
                m00Var.addListener(new tk0(uk0Var, 0), l00.f16615h);
                return m00Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kt0
    public /* synthetic */ c50 b(jt0 jt0Var) {
        return ((us0) this.f21157b).b(jt0Var);
    }

    @Override // k9.b
    public void d(Bundle bundle) {
        ej ejVar = (ej) this.f21157b;
        synchronized (ejVar.f13990c) {
            try {
                hj hjVar = ejVar.f13991d;
                if (hjVar != null) {
                    ejVar.f13993f = (jj) hjVar.getService();
                }
            } catch (DeadObjectException e10) {
                int i10 = zze.zza;
                zzo.zzg("Unable to obtain a cache service instance.", e10);
                ((ej) this.f21157b).c();
            }
            ((ej) this.f21157b).f13990c.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.lt0
    public /* bridge */ /* synthetic */ ListenableFuture e(lj1 lj1Var, kt0 kt0Var) {
        return k(lj1Var, kt0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.mp0
    public void f(m80 m80Var) {
        n90 n90Var;
        fp0 fp0Var = (fp0) this.f21157b;
        p70 p70Var = (p70) m80Var;
        synchronized (fp0Var) {
            try {
                p70 p70Var2 = fp0Var.f14500i;
                if (p70Var2 != null) {
                    n90 n90Var2 = p70Var.f17343j;
                    if (n90Var2 != null && (n90Var = p70Var2.f17343j) != null) {
                        n90Var2.a(n90Var.f17723a.get());
                    }
                    pa0 pa0Var = fp0Var.f14500i.f17336c;
                    pa0Var.getClass();
                    pa0Var.S0(new zl(null, 1));
                }
                fp0Var.f14500i = p70Var;
                p70Var.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xb1
    public /* synthetic */ void g(long j10, np0 np0Var) {
        rb0.q(j10, np0Var, ((da) this.f21157b).f13474c);
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public Map getAdapterStatusMap() {
        return (HashMap) this.f21157b;
    }

    public synchronized ListenableFuture k(lj1 lj1Var, kt0 kt0Var, u90 u90Var) {
        v80 v80VarZza;
        try {
            if (u90Var != null) {
                this.f21157b = u90Var;
            } else {
                this.f21157b = (u90) kt0Var.b((jt0) lj1Var.f17037c).c();
            }
            v80VarZza = ((u90) this.f21157b).zza();
        } catch (Throwable th2) {
            throw th2;
        }
        return v80VarZza.c(v80VarZza.b());
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdClosed() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdClosed.");
        try {
            ((xt) this.f21157b).zzf();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public void onAdFailedToShow(AdError adError) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdFailedToShow.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        int length = String.valueOf(code).length();
        StringBuilder sb2 = new StringBuilder(length + 60 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
        sb2.append("Mediation ad failed to show: Error Code = ");
        sb2.append(code);
        sb2.append(". Error Message = ");
        sb2.append(message);
        sb2.append(" Error Domain = ");
        sb2.append(domain);
        zzo.zzi(sb2.toString());
        try {
            ((xt) this.f21157b).B(adError.zza());
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdOpened() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdOpened.");
        try {
            ((xt) this.f21157b).zzi();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onFailure(AdError adError) {
        try {
            ((cv) this.f21157b).a(adError.zza());
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onSuccess(String str) {
        try {
            ((cv) this.f21157b).zze(str);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onUserEarnedReward() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onUserEarnedReward.");
        try {
            ((xt) this.f21157b).zzz();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoComplete() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onVideoComplete.");
        try {
            ((xt) this.f21157b).zzt();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onVideoStart() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onVideoStart.");
        try {
            ((xt) this.f21157b).zzo();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // k9.b
    public void q(int i10) {
        ej ejVar = (ej) this.f21157b;
        synchronized (ejVar.f13990c) {
            ejVar.f13993f = null;
            ejVar.f13990c.notifyAll();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdClicked() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called reportAdClicked.");
        try {
            ((xt) this.f21157b).zze();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdImpression() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called reportAdImpression.");
        try {
            ((xt) this.f21157b).zzk();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.sb, com.google.android.gms.internal.ads.hm0
    /* JADX INFO: renamed from: zza */
    public File mo166zza() {
        return (File) this.f21157b;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public synchronized void zzb() {
        zzg zzgVar = (zzg) this.f21157b;
        if (zzgVar != null) {
            zzgVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.ao
    public JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.lt0
    public Object zzd() {
        u90 u90Var;
        synchronized (this) {
            u90Var = (u90) this.f21157b;
        }
        return u90Var;
    }

    public /* synthetic */ vf(int i10, Object obj, Object obj2) {
        this.f21156a = i10;
        this.f21157b = obj2;
    }

    @Override // com.google.android.gms.internal.ads.j80
    public zzea zza() throws qu0 {
        try {
            return ((av) ((qm0) this.f21157b).f19127b).zzh();
        } catch (RemoteException e10) {
            throw new qu0(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.b01
    public void zzb(int i10, long j10, String str) {
        ((qz0) this.f21157b).e(i10, System.currentTimeMillis() - j10, null, null, str);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: zzc, reason: collision with other method in class */
    public synchronized void mo169zzc() {
        zzg zzgVar = (zzg) this.f21157b;
        if (zzgVar != null) {
            zzgVar.mo169zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.ao
    /* JADX INFO: renamed from: zzd, reason: collision with other method in class */
    public JSONObject mo170zzd() {
        return null;
    }

    public /* synthetic */ vf(Object obj, int i10) {
        this.f21156a = i10;
        this.f21157b = obj;
    }

    public vf() {
        this.f21156a = 1;
        this.f21157b = new CopyOnWriteArrayList();
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        m00 m00Var;
        switch (this.f21156a) {
            case 12:
                ((AtomicInteger) ((q00) this.f21157b).f18848b).set(1);
                return;
            case 16:
                ((m90) this.f21157b).f17351a.zza();
                return;
            case 20:
                ee0 ee0Var = (ee0) this.f21157b;
                je0 je0Var = ee0Var.f13937m;
                b30 b30Var = (b30) obj;
                synchronized (je0Var) {
                    je0Var.f16060k = b30Var;
                }
                je0 je0Var2 = ee0Var.f13937m;
                synchronized (je0Var2) {
                    m00Var = je0Var2.f16062n;
                }
                km0 km0VarE = ee0Var.e("Google", true);
                if (km0VarE != null && m00Var != null) {
                    m00Var.zzc(km0VarE);
                    return;
                } else {
                    if (m00Var != null) {
                        m00Var.cancel(false);
                        return;
                    }
                    return;
                }
            case 22:
                ((dj0) obj).f13568n = true;
                ((vj0) this.f21157b).f21186d.b();
                return;
            default:
                try {
                    ((qv0) this.f21157b).zza((SQLiteDatabase) obj);
                    return;
                } catch (Exception e10) {
                    String strValueOf = String.valueOf(e10.getMessage());
                    int i10 = zze.zza;
                    zzo.zzf("Error executing function on offline signal database: ".concat(strValueOf));
                    return;
                }
        }
    }

    public vf(us usVar) {
        this.f21156a = 9;
        Objects.requireNonNull(usVar);
        this.f21157b = usVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onUserEarnedReward(RewardItem rewardItem) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onUserEarnedReward.");
        try {
            ((xt) this.f21157b).L0(new wy(rewardItem));
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ao, com.google.android.gms.internal.ads.tv0
    /* JADX INFO: renamed from: zza */
    public void mo165zza() {
        switch (this.f21156a) {
            case 21:
                ee0 ee0Var = ((hg0) this.f21157b).f15281d;
                if (ee0Var != null) {
                    synchronized (ee0Var) {
                        ee0Var.f13938n.f(NativeCustomFormatAd.ASSET_NAME_VIDEO);
                    }
                    return;
                }
                return;
            default:
                fp0 fp0Var = (fp0) this.f21157b;
                synchronized (fp0Var) {
                    fp0Var.f14500i = null;
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.b01
    public void zza(int i10, long j10) {
        ((qz0) this.f21157b).b(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public synchronized void zza(View view) {
        zzg zzgVar = (zzg) this.f21157b;
        if (zzgVar != null) {
            zzgVar.zza(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.p00, com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        switch (this.f21156a) {
            case 9:
                zze.zza("Releasing engine reference.");
                ((us) this.f21157b).f20879d.u();
                break;
            case 17:
                ((ia0) obj).Z((fd0) this.f21157b);
                break;
            case 18:
                ((wb0) obj).u0((tk) this.f21157b);
                break;
            default:
                ((ai) obj).v((zh) this.f21157b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        switch (this.f21156a) {
            case 12:
                ((AtomicInteger) ((q00) this.f21157b).f18848b).set(-1);
                break;
            case 16:
                break;
            case 20:
                if (((Boolean) zzba.zzc().a(am.f12436y6)).booleanValue()) {
                    zzt.zzh().e("omid native display exp", th2);
                }
                break;
            case 22:
                break;
            default:
                String strValueOf = String.valueOf(th2.getMessage());
                int i10 = zze.zza;
                zzo.zzf("Failed to get offline signal database: ".concat(strValueOf));
                break;
        }
    }

    private final void i(Throwable th2) {
    }

    private final void j(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.ao
    public void h(MotionEvent motionEvent) {
    }
}
