package zc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.ads.aj0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f54805f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f54806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f54807h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aj0 f54809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f54810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f54811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f54812e;

    public b0(z zVar, Context context, aj0 aj0Var, long j10) {
        this.f54811d = zVar;
        this.f54808a = context;
        this.f54812e = j10;
        this.f54809b = aj0Var;
        this.f54810c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f54805f) {
            try {
                Boolean bool = f54807h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f54807h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f54805f) {
            try {
                Boolean bool = f54806g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f54806g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f54808a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f54811d;
        Context context = this.f54808a;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.f54810c;
        if (zC) {
            wakeLock.acquire(e.f54819a);
        }
        try {
            try {
                try {
                    zVar.b(true);
                    if (!this.f54809b.f()) {
                        zVar.b(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || d()) {
                        if (zVar.d()) {
                            zVar.b(false);
                        } else {
                            zVar.e(this.f54812e);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new a0(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                zVar.b(false);
                if (c(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
