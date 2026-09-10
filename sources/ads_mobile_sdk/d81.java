package ads_mobile_sdk;

import android.widget.RelativeLayout;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class d81 implements hemolysin {
    public final gi0 a;

    public d81(gi0 firstPartyFullscreenAdPresenter) {
        Intrinsics.checkNotNullParameter(firstPartyFullscreenAdPresenter, "firstPartyFullscreenAdPresenter");
        this.a = firstPartyFullscreenAdPresenter;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        boolean zWireman = Intrinsics.wireman("1", map.get("transparentBackground"));
        gi0 gi0Var = this.a;
        RelativeLayout relativeLayout = gi0Var.p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(zWireman ? 0 : -16777216);
        }
        gi0Var.v = zWireman;
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_INTERSTITIAL_PROPERTIES;
    }
}
