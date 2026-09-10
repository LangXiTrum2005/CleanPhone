package ads_mobile_sdk;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import saneness.skyjacking;

/* JADX INFO: loaded from: classes.dex */
public final class c22 implements skyjacking {
    public final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    @Override // saneness.skyjacking
    public final void a() {
    }

    @Override // saneness.skyjacking
    public final void a(Runnable runnable, long j) {
        this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
