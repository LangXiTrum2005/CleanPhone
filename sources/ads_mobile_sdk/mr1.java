package ads_mobile_sdk;

import android.view.View;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.taffarel;
import saneness.technofreak;

/* JADX INFO: loaded from: classes.dex */
public final class mr1 implements hemolysin {
    public final yj1 a;
    public final hj1 b;

    public mr1(yj1 nativeAdCore, hj1 nativeAdAssets) {
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        this.a = nativeAdCore;
        this.b = nativeAdAssets;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        cm1 cm1Var;
        View viewB;
        fj1 fj1Var = this.b.b;
        int i = fj1Var == null ? -1 : taffarel.f37324attabal[fj1Var.ordinal()];
        if (i == -1) {
            return Unit.f29295attabal;
        }
        if (i == 1) {
            technofreak technofreakVar = (technofreak) this.a.c.get();
            if (technofreakVar != null && (viewB = (cm1Var = (cm1) technofreakVar).b("3010")) != null) {
                cm1Var.onClick(viewB);
            }
        } else if (i == 2) {
            this.a.a("_videoMediaView");
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_NATIVE_VIDEO_CLICKED;
    }
}
