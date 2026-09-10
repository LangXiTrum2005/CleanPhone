package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class WakeLocks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8814a = Logger.e("WakeLocks");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f8815b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        WeakHashMap weakHashMap = f8815b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strConcat);
        }
        return wakeLockNewWakeLock;
    }
}
