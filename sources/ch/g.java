package ch;

import android.os.PowerManager;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements sg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f6432a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static PowerManager.WakeLock f6433b;

    public final synchronized void a() {
        PowerManager.WakeLock wakeLock = f6433b;
        if (wakeLock == null || !wakeLock.isHeld()) {
            Object systemService = super.h().getSystemService("power");
            n.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, super.h().getPackageName() + ":AssetProcess");
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(600000L);
            f6433b = wakeLockNewWakeLock;
        }
    }
}
