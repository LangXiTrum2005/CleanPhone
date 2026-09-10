package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class o53 implements hemolysin {
    public final sr1 a;

    public o53(sr1 nativeVideoViewabilityMonitor) {
        Intrinsics.checkNotNullParameter(nativeVideoViewabilityMonitor, "nativeVideoViewabilityMonitor");
        this.a = nativeVideoViewabilityMonitor;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        this.a.g.getAndSet(false);
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_UNTRACK_ACTIVE_VIEW_UNIT;
    }
}
