package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.os.StrictMode;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3981lh implements AW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4657a;

    public /* synthetic */ C3981lh(int i) {
        this.f4657a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AW
    public final Object get() {
        switch (this.f4657a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                C3157cH c3157cH = ExecutorsRegistrar.f843a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    builderDetectNetwork.detectResourceMismatches();
                    if (i >= 26) {
                        builderDetectNetwork.detectUnbufferedIo();
                    }
                }
                return new ScheduledExecutorServiceC4435qo(Executors.newFixedThreadPool(4, new ThreadFactoryC2521Jk("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                C3157cH c3157cH2 = ExecutorsRegistrar.f843a;
                return new ScheduledExecutorServiceC4435qo(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC2521Jk("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                C3157cH c3157cH3 = ExecutorsRegistrar.f843a;
                return new ScheduledExecutorServiceC4435qo(Executors.newCachedThreadPool(new ThreadFactoryC2521Jk("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 5:
                C3157cH c3157cH4 = ExecutorsRegistrar.f843a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC2521Jk("Firebase Scheduler", 0, null));
            default:
                Clock clock = C4844vY.j;
                return null;
        }
    }
}
