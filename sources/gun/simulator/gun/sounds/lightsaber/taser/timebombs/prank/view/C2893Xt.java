package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2893Xt {
    private C2893Xt() {
    }

    public /* synthetic */ C2893Xt(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public static /* synthetic */ C2919Yt get$default(C2893Xt c2893Xt, Executor executor, ZT zt, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = C2919Yt.FILENAME;
        }
        return c2893Xt.get(executor, zt, str);
    }

    public final synchronized C2919Yt get(Executor executor, ZT zt, String str) {
        Object c2919Yt;
        Object objPutIfAbsent;
        try {
            AbstractC2995aW.q(executor, "ioExecutor");
            AbstractC2995aW.q(zt, "pathProvider");
            AbstractC2995aW.q(str, "filename");
            ConcurrentHashMap concurrentHashMap = C2919Yt.filePreferenceMap;
            c2919Yt = concurrentHashMap.get(str);
            if (c2919Yt == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c2919Yt = new C2919Yt(executor, zt, str, null)))) != null) {
                c2919Yt = objPutIfAbsent;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C2919Yt) c2919Yt;
    }

    @VisibleForTesting
    public static /* synthetic */ void getFILENAME$annotations() {
    }
}
