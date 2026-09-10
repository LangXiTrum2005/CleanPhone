package provostship;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: WriteSingleThreadExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static attabal f36000saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ExecutorService f36001attabal = Executors.newSingleThreadExecutor();

    public static attabal attabal() {
        if (f36000saneness == null) {
            synchronized (attabal.class) {
                try {
                    if (f36000saneness == null) {
                        f36000saneness = new attabal();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36000saneness;
    }

    public ExecutorService saneness() {
        return this.f36001attabal;
    }
}
