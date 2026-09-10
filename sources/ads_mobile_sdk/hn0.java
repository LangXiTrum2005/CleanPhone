package ads_mobile_sdk;

import com.google.common.base.triweekly;
import kotlinx.coroutines.polder;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class hn0 extends p002kotlin.coroutines.attabal implements polder {
    public final loun a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn0(loun traceLogger) {
        super(polder.INSTANCE);
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = traceLogger;
    }

    @Override // kotlinx.coroutines.polder
    public final void handleException(CoroutineContext context, Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        triweekly triweeklyVar = kn0.a;
        kn0.c("Uncaught exception on context " + context + ": " + exception, null);
        exception.printStackTrace();
        try {
            ((d13) this.a).a(exception);
        } catch (Throwable th) {
            triweekly triweeklyVar2 = kn0.a;
            kn0.c("Failed to report untrapped exception: " + th, null);
        }
    }
}
