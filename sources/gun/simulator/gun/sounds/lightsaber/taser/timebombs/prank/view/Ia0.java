package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class Ia0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3224a;
    public final PowerManager.WakeLock b;
    public final FirebaseMessaging c;

    public Ia0(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.c = firebaseMessaging;
        this.f3224a = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.c.b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            return this.c.a() != null;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3844k50 c3844k50I = C3844k50.i();
        FirebaseMessaging firebaseMessaging = this.c;
        boolean zL = c3844k50I.l(firebaseMessaging.b);
        PowerManager.WakeLock wakeLock = this.b;
        if (zL) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = true;
                }
                if (!firebaseMessaging.h.d()) {
                    firebaseMessaging.e(false);
                    if (C3844k50.i().l(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (C3844k50.i().k(firebaseMessaging.b) && !a()) {
                    new C4024m70(this).a();
                    if (C3844k50.i().l(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    firebaseMessaging.e(false);
                } else {
                    firebaseMessaging.f(this.f3224a);
                }
                if (!C3844k50.i().l(firebaseMessaging.b)) {
                    return;
                }
                wakeLock.release();
            } catch (IOException e) {
                e.getMessage();
                firebaseMessaging.e(false);
                if (!C3844k50.i().l(firebaseMessaging.b)) {
                }
            }
        } catch (Throwable th) {
            if (C3844k50.i().l(firebaseMessaging.b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
