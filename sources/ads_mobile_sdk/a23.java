package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class a23 implements hemolysin {
    public final sr1 a;

    public a23(sr1 nativeVideoViewabilityMonitor) {
        Intrinsics.checkNotNullParameter(nativeVideoViewabilityMonitor, "nativeVideoViewabilityMonitor");
        this.a = nativeVideoViewabilityMonitor;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        sr1 sr1Var = this.a;
        sr1Var.g.getAndSet(true);
        Object objA = sr1Var.a(dernVar);
        if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            objA = Unit.f29295attabal;
        }
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_TRACK_ACTIVE_VIEW_UNIT;
    }
}
