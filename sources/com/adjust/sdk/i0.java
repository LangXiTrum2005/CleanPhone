package com.adjust.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.ca;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.bs0;
import com.google.android.gms.internal.ads.e20;
import com.google.android.gms.internal.ads.hn;
import com.google.android.gms.internal.ads.hz;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6859e;

    public /* synthetic */ i0(hz hzVar, long j10, bs0 bs0Var, Bundle bundle) {
        this.f6855a = 4;
        this.f6856b = hzVar;
        this.f6857c = j10;
        this.f6859e = bs0Var;
        this.f6858d = bundle;
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f6859e).f24676b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.f6859e).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6855a) {
            case 0:
                Context context = (Context) this.f6856b;
                AdjustThirdPartySharingResult thirdPartySharingResult = SharedPreferencesManager.getDefaultInstance(context).getThirdPartySharingResult();
                if (thirdPartySharingResult != null) {
                    new Handler(context.getMainLooper()).post(new d0(11, this, thirdPartySharingResult));
                    return;
                } else {
                    ActivityHandler.queueGetThirdPartySharingSettingsWithTimeout(this.f6857c, (OnThirdPartySharingSettingsReadListener) this.f6859e, ((AdjustInstance) this.f6858d).cachedThirdPartySharingTimeoutCallbacks, context);
                    return;
                }
            case 1:
                Context context2 = (Context) this.f6856b;
                String adidFromActivityStateFile = Util.getAdidFromActivityStateFile(context2);
                if (adidFromActivityStateFile != null) {
                    new Handler(context2.getMainLooper()).post(new d0(12, this, adidFromActivityStateFile));
                    return;
                } else {
                    ActivityHandler.queueGetAdidWithTimeout(this.f6857c, (OnAdidReadListener) this.f6859e, ((AdjustInstance) this.f6858d).cachedAdidReadTimeoutCallbacks, context2);
                    return;
                }
            case 2:
                Context context3 = (Context) this.f6856b;
                AdjustAttribution attributionFromAttributionFile = Util.getAttributionFromAttributionFile(context3);
                if (attributionFromAttributionFile != null) {
                    new Handler(context3.getMainLooper()).post(new d0(13, this, attributionFromAttributionFile));
                    return;
                } else {
                    ActivityHandler.queueGetAttributionWithTimeout(this.f6857c, (OnAttributionReadListener) this.f6859e, ((AdjustInstance) this.f6858d).cachedAttributionReadTimeoutCallbacks, context3);
                    return;
                }
            case 3:
                HashMap mapN = ca.n(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
                mapN.put("src", (String) this.f6856b);
                mapN.put("cachedSrc", (String) this.f6859e);
                mapN.put("totalDuration", Long.toString(this.f6857c));
                ((e20) this.f6858d).r(mapN);
                return;
            case 4:
                ((p9.b) zzt.zzk()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6857c;
                boolean zBooleanValue = ((Boolean) hn.f15331a.o()).booleanValue();
                Bundle bundle = (Bundle) this.f6858d;
                bs0 bs0Var = (bs0) this.f6859e;
                if (zBooleanValue) {
                    String canonicalName = bs0Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    StringBuilder sb2 = new StringBuilder(canonicalName.length() + 25 + String.valueOf(jElapsedRealtime).length());
                    wi.d.m(sb2, "Signal runtime (ms) : ", canonicalName, " = ");
                    sb2.append(jElapsedRealtime);
                    zze.zza(sb2.toString());
                }
                if (((Boolean) zzba.zzc().a(am.S2)).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(am.Y2)).booleanValue()) {
                        synchronized (((hz) this.f6856b)) {
                            int iZzb = bs0Var.zzb();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                            sb3.append("sig");
                            sb3.append(iZzb);
                            bundle.putLong(sb3.toString(), jElapsedRealtime);
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f6856b;
                zc.u uVarT = zc.u.t();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f6859e;
                if (uVarT.v(firebaseMessaging.f24676b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.l = true;
                        }
                        if (!firebaseMessaging.f24684j.f()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.l = false;
                            }
                            if (!zc.u.t().v(firebaseMessaging.f24676b)) {
                                return;
                            }
                        } else if (!zc.u.t().u(firebaseMessaging.f24676b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.l = false;
                                }
                            } else {
                                firebaseMessaging.m(this.f6857c);
                            }
                            if (!zc.u.t().v(firebaseMessaging.f24676b)) {
                                return;
                            }
                        } else {
                            com.google.android.gms.common.api.internal.w wVar = new com.google.android.gms.common.api.internal.w();
                            wVar.f11776c = this;
                            wVar.a();
                            if (!zc.u.t().v(firebaseMessaging.f24676b)) {
                                return;
                            }
                        }
                    } catch (IOException e10) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.l = false;
                            if (!zc.u.t().v(firebaseMessaging.f24676b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th2) {
                    if (zc.u.t().v(firebaseMessaging.f24676b)) {
                        wakeLock.release();
                    }
                    throw th2;
                }
        }
    }

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f6855a = i10;
        this.f6858d = obj;
        this.f6856b = obj2;
        this.f6859e = obj3;
        this.f6857c = j10;
    }

    public i0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f6855a = 5;
        this.f6858d = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new q9.a("firebase-iid-executor"));
        this.f6859e = firebaseMessaging;
        this.f6857c = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f24676b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f6856b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}
