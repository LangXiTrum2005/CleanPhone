package ads_mobile_sdk;

import android.os.SystemClock;
import complexometry.ResponseInfo;
import complexometry.formularize;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.basify;

/* JADX INFO: loaded from: classes.dex */
public final class d7 implements basify {
    public final String a;
    public final formularize b;
    public final c7 c;
    public final amphitheatre d;

    public d7(String requestId, formularize baseRequest, c7 adUnitStatsTracker, amphitheatre clock) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(adUnitStatsTracker, "adUnitStatsTracker");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = requestId;
        this.b = baseRequest;
        this.c = adUnitStatsTracker;
        this.d = clock;
    }

    @Override // saneness.basify
    public final Object a(jm2 jm2Var, h1 h1Var, ResponseInfo responseInfo, wretchedly.dern dernVar) {
        c7 c7Var = this.c;
        String requestId = this.a;
        String adUnitId = this.b.getAdUnitId();
        this.d.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c7Var.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        p002kotlin.time.saneness sanenessVar = (p002kotlin.time.saneness) c7Var.c.get(requestId);
        if (sanenessVar != null) {
            sanenessVar.getRawValue();
            if (adUnitId != null) {
                ConcurrentHashMap concurrentHashMap = c7Var.d;
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                concurrentHashMap.put(adUnitId, p002kotlin.time.saneness.cutely(p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(jElapsedRealtime, DurationUnit.MILLISECONDS), sanenessVar.getRawValue())));
            }
        }
        return Unit.f29295attabal;
    }
}
