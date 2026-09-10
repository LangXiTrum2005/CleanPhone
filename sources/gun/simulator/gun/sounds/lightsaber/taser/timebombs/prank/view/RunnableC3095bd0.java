package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3095bd0 implements Runnable {
    public static final Object f = new Object();
    public static Boolean g;
    public static Boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4177a;
    public final C4483rP b;
    public final PowerManager.WakeLock c;
    public final Zc0 d;
    public final long e;

    public RunnableC3095bd0(Zc0 zc0, Context context, C4483rP c4483rP, long j) {
        this.d = zc0;
        this.f4177a = context;
        this.e = j;
        this.b = c4483rP;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f) {
            try {
                Boolean bool = h;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                h = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (f) {
            try {
                Boolean bool = g;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                g = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f4177a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Zc0 zc0 = this.d;
        Context context = this.f4177a;
        boolean zB = b(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (zB) {
            wakeLock.acquire(AbstractC2416Fj.f3082a);
        }
        try {
            try {
                synchronized (zc0) {
                    zc0.g = true;
                }
                if (!this.b.d()) {
                    zc0.e(false);
                    if (b(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused) {
                            return;
                        }
                    }
                    return;
                }
                if (a(context) && !c()) {
                    context.registerReceiver(new C3006ad0(this, this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (b(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused2) {
                            return;
                        }
                    }
                    return;
                }
                if (zc0.f()) {
                    zc0.e(false);
                } else {
                    zc0.g(this.e);
                }
                if (!b(context)) {
                    return;
                }
                try {
                    wakeLock.release();
                } catch (RuntimeException unused3) {
                }
            } catch (IOException e) {
                e.getMessage();
                zc0.e(false);
                if (!b(context)) {
                }
            }
        } catch (Throwable th) {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }
}
