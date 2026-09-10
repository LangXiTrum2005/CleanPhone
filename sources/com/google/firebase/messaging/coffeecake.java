package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WakeLockHolder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class coffeecake {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static WakeLock f22619dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final long f22618attabal = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Object f22620saneness = new Object();

    public static void beachfront(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static ComponentName competently(Context context, Intent intent) {
        synchronized (f22620saneness) {
            try {
                saneness(context);
                boolean zWireman = wireman(intent);
                beachfront(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zWireman) {
                    f22619dern.acquire(f22618attabal);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void dern(Intent intent) {
        synchronized (f22620saneness) {
            try {
                if (f22619dern != null && wireman(intent)) {
                    beachfront(intent, false);
                    f22619dern.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void marial(Context context, empress empressVar, final Intent intent) {
        synchronized (f22620saneness) {
            try {
                saneness(context);
                boolean zWireman = wireman(intent);
                beachfront(intent, true);
                if (!zWireman) {
                    f22619dern.acquire(f22618attabal);
                }
                empressVar.wireman(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.itchy
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        coffeecake.dern(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void saneness(Context context) {
        if (f22619dern == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f22619dern = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    public static boolean wireman(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
}
