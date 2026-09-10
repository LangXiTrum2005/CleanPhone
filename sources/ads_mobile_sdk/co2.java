package ads_mobile_sdk;

import java.util.Map;
import kotlinx.coroutines.impromptu;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class co2 implements hemolysin {
    public final CoroutineContext a;
    public final yj1 b;

    public co2(CoroutineContext uiContext, yj1 nativeAdCore) {
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        this.a = uiContext;
        this.b = nativeAdCore;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        Object objCompetently;
        gq0 gq0Var2 = (gq0) this.b.e.get();
        return (gq0Var2 == null || (objCompetently = impromptu.competently(this.a, new bo2(gq0Var2, null), dernVar)) != p002kotlin.coroutines.intrinsics.attabal.beachfront()) ? Unit.f29295attabal : objCompetently;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_SHOW_VALIDATOR_OVERLAY;
    }
}
