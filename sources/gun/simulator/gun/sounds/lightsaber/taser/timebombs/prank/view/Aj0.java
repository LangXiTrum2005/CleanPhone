package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Aj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f2831a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static WakeLock c;

    public static void a(Intent intent) {
        synchronized (b) {
            try {
                if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    c.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(Context context, ServiceConnectionC3201cm0 serviceConnectionC3201cm0, Intent intent) {
        synchronized (b) {
            try {
                if (c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    c.acquire(f2831a);
                }
                serviceConnectionC3201cm0.b(intent).addOnCompleteListener(new C2503Is(intent, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (b) {
            try {
                if (c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    c.acquire(f2831a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
