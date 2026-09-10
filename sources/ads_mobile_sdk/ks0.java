package ads_mobile_sdk;

import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class ks0 implements hemolysin {
    public final saran a;
    public final yj1 b;
    public final sr1 c;

    public ks0(saran uiScope, yj1 nativeAdCore, sr1 nativeVideoViewabilityMonitor) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(nativeVideoViewabilityMonitor, "nativeVideoViewabilityMonitor");
        this.a = uiScope;
        this.b = nativeAdCore;
        this.c = nativeVideoViewabilityMonitor;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        cutely.wireman(this.a, null, null, new js0(this, null), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_HIDE_OVERLAY;
    }
}
