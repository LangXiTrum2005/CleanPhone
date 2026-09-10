package talweg;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: WakeLocks.java */
/* JADX INFO: loaded from: classes.dex */
public class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String f38596attabal = androidx.work.apical.beachfront("WakeLocks");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f38597saneness = new WeakHashMap<>();

    public static void attabal() {
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f38597saneness;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.apical.dern().impromptu(f38596attabal, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock saneness(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f38597saneness;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, str2);
        }
        return wakeLockNewWakeLock;
    }
}
