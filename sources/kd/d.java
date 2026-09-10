package kd;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import l7.i0;
import pd.j;
import tb.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements tc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44599a;

    public /* synthetic */ d(int i10) {
        this.f44599a = i10;
    }

    @Override // tc.b
    public final Object get() {
        switch (this.f44599a) {
            case 0:
                return Executors.newSingleThreadScheduledExecutor();
            case 1:
                return GaugeManager.lambda$new$0();
            case 2:
                return GaugeManager.lambda$new$1();
            case 3:
                Random random = j.f48338j;
                return null;
            case 4:
                return Collections.EMPTY_SET;
            case 5:
                return null;
            case 6:
                l lVar = ExecutorsRegistrar.f24661a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new ub.g(Executors.newFixedThreadPool(4, new ub.a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f24664d.get());
            case 7:
                l lVar2 = ExecutorsRegistrar.f24661a;
                return new ub.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ub.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f24664d.get());
            case 8:
                l lVar3 = ExecutorsRegistrar.f24661a;
                return new ub.g(Executors.newCachedThreadPool(new ub.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f24664d.get());
            case 9:
                l lVar4 = ExecutorsRegistrar.f24661a;
                return Executors.newSingleThreadScheduledExecutor(new ub.a("Firebase Scheduler", 0, null));
            default:
                i0 i0Var = FirebaseMessaging.f24672n;
                return null;
        }
    }
}
