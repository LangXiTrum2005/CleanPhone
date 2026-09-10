package ads_mobile_sdk;

import java.util.Map;
import kotlinx.coroutines.impromptu;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class zn2 implements hemolysin {
    public final CoroutineContext a;
    public final yj1 b;
    public final sr1 c;

    public zn2(CoroutineContext uiContext, yj1 nativeAdCore, sr1 nativeVideoViewabilityMonitor) {
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(nativeVideoViewabilityMonitor, "nativeVideoViewabilityMonitor");
        this.a = uiContext;
        this.b = nativeAdCore;
        this.c = nativeVideoViewabilityMonitor;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        Object objCompetently;
        gq0 gq0Var2 = (gq0) this.b.d.get();
        return (gq0Var2 == null || (objCompetently = impromptu.competently(this.a, new yn2(this, gq0Var2, null), dernVar)) != p002kotlin.coroutines.intrinsics.attabal.beachfront()) ? Unit.f29295attabal : objCompetently;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_SHOW_OVERLAY;
    }
}
