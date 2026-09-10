package ads_mobile_sdk;

import complexometry.formularize;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.rockless;

/* JADX INFO: loaded from: classes.dex */
public final class iv2 implements rockless {
    public final c7 a;
    public final ah b;
    public final String c;
    public final long d;

    public iv2(c7 adUnitStatsTracker, ah appStatsTracker, String requestId, long j) {
        Intrinsics.checkNotNullParameter(adUnitStatsTracker, "adUnitStatsTracker");
        Intrinsics.checkNotNullParameter(appStatsTracker, "appStatsTracker");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.a = adUnitStatsTracker;
        this.b = appStatsTracker;
        this.c = requestId;
        this.d = j;
    }

    @Override // saneness.rockless
    public final Object a(formularize formularizeVar, wretchedly.dern dernVar) {
        Unit unit;
        ah ahVar = this.b;
        long j = this.d;
        synchronized (ahVar.b) {
            try {
                if (ahVar.e.get() == -1) {
                    ahVar.g = Long.valueOf(j);
                }
                ahVar.e.incrementAndGet();
                ahVar.f.incrementAndGet();
                unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        return unit;
    }

    @Override // saneness.rockless
    public final Object b(wretchedly.dern dernVar) {
        c7 c7Var = this.a;
        String requestId = this.c;
        long j = this.d;
        c7Var.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        ConcurrentHashMap concurrentHashMap = c7Var.c;
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        concurrentHashMap.put(requestId, p002kotlin.time.saneness.cutely(p002kotlin.time.dern.graveside(j, DurationUnit.MILLISECONDS)));
        return Unit.f29295attabal;
    }
}
