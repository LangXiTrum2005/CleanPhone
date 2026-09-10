package ads_mobile_sdk;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.phytopathogen;

/* JADX INFO: loaded from: classes.dex */
public final class ld2 implements hemolysin {
    public final phytopathogen a;

    public ld2(phytopathogen refreshListener) {
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        this.a = refreshListener;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("action");
        if (Intrinsics.wireman(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, str)) {
            Object objA = this.a.a(true, dernVar);
            return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
        }
        if (!Intrinsics.wireman(CampaignEx.JSON_NATIVE_VIDEO_RESUME, str)) {
            return Unit.f29295attabal;
        }
        Object objB = this.a.b(true, dernVar);
        return objB == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objB : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_NAME_REFRESH;
    }
}
