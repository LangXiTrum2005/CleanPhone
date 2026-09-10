package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3933l6 {
    public static final C3933l6 INSTANCE = new C3933l6();
    private static C4838vS client;

    private C3933l6() {
    }

    public final C4838vS createOkHttpClient(ZT zt) {
        AbstractC2995aW.q(zt, "pathProvider");
        C4838vS c4838vS = client;
        if (c4838vS != null) {
            return c4838vS;
        }
        C4750uS c4750uS = new C4750uS();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c4750uS.b(60L, timeUnit);
        c4750uS.a(60L, timeUnit);
        c4750uS.k = null;
        c4750uS.h = true;
        c4750uS.i = true;
        C3457fi c3457fi = C3457fi.INSTANCE;
        if (c3457fi.isCleverCacheEnabled()) {
            long cleverCacheDiskSize = c3457fi.getCleverCacheDiskSize();
            int cleverCacheDiskPercentage = c3457fi.getCleverCacheDiskPercentage();
            String absolutePath = zt.getCleverCacheDir().getAbsolutePath();
            AbstractC2995aW.p(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long jMin = Math.min(cleverCacheDiskSize, (zt.getAvailableBytes(absolutePath) * ((long) cleverCacheDiskPercentage)) / ((long) 100));
            if (jMin > 0) {
                c4750uS.k = new C4850vc(zt.getCleverCacheDir(), jMin);
            } else {
                C4917wJ.Companion.w("OkHttpClientWrapper", "cache disk capacity size <=0, no clever cache active.");
            }
        }
        C4838vS c4838vS2 = new C4838vS(c4750uS);
        client = c4838vS2;
        return c4838vS2;
    }
}
