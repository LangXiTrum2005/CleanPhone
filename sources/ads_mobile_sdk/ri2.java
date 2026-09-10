package ads_mobile_sdk;

import java.util.List;
import java.util.UUID;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class ri2 {
    public final x a;
    public final loun b;
    public final amphitheatre c;

    public ri2(x activityTracker, loun traceLogger, amphitheatre clock) {
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = activityTracker;
        this.b = traceLogger;
        this.c = clock;
    }

    public static v62 a(ri2 ri2Var, no0 cuiName, List tags, l13 traceMetaSet) {
        ri2Var.getClass();
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        amphitheatre clock = ri2Var.c;
        loun traceLogger = ri2Var.b;
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        u62 u62Var = new u62();
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        v62 trace = new v62(cuiName, tags, uuidRandomUUID, traceMetaSet, u62Var, clock, traceLogger, 0, null, true, 1280);
        Intrinsics.checkNotNullParameter(trace, "trace");
        u62Var.a.set(trace);
        j13.a(j13.b(), null);
        j13.a(j13.b(), trace);
        trace.k.x = ri2Var.a.c() ? ro0.PROCESS_STATE_BACKGROUND : ro0.PROCESS_STATE_FOREGROUND;
        return trace;
    }
}
