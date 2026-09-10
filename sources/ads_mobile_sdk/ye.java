package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class ye implements portwide {
    public final x a;

    public ye(x activityTracker) {
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.a = activityTracker;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.APP_OPEN;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        boolean z;
        x xVar = this.a;
        synchronized (xVar) {
            z = xVar.m;
        }
        return new tn0(new xe(z));
    }
}
