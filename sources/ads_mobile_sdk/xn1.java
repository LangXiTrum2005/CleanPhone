package ads_mobile_sdk;

import android.net.Uri;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class xn1 implements hemolysin {
    public final e2 a;
    public final rg2 b;

    public xn1(e2 adEventEmitter, rg2 retryingUrlPinger) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(retryingUrlPinger, "retryingUrlPinger");
        this.a = adEventEmitter;
        this.b = retryingUrlPinger;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("u");
        if (str == null || str.length() == 0) {
            y13.a("Impression URL in native GMSG is null or empty", null, 6);
            return Unit.f29295attabal;
        }
        rg2 rg2Var = this.b;
        Uri uri = Uri.parse(str);
        e2 e2Var = this.a;
        Boolean boolAttabal = igo.attabal.attabal(true);
        xb2 publisherRequestTraceMeta = new xb2();
        j71 internalRequestTraceMeta = new j71();
        le2 renderTraceMeta = new le2();
        o6 adTraceMeta = new o6();
        Intrinsics.checkNotNullParameter(publisherRequestTraceMeta, "publisherRequestTraceMeta");
        Intrinsics.checkNotNullParameter(internalRequestTraceMeta, "internalRequestTraceMeta");
        Intrinsics.checkNotNullParameter(renderTraceMeta, "renderTraceMeta");
        Intrinsics.checkNotNullParameter(adTraceMeta, "adTraceMeta");
        rg2Var.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        rg2Var.c.a(uri, rg2Var.a, rg2Var.b, e2Var, boolAttabal, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_NATIVE_IMPRESSION_FLOW_CONTROL;
    }
}
