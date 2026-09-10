package ads_mobile_sdk;

import android.os.Bundle;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.gotcha;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class w2 implements hemolysin {
    public final y2 a;
    public final gotcha b;

    public w2(y2 adMetadataHolder, gotcha adMetadataChangedEventEmitter) {
        Intrinsics.checkNotNullParameter(adMetadataHolder, "adMetadataHolder");
        Intrinsics.checkNotNullParameter(adMetadataChangedEventEmitter, "adMetadataChangedEventEmitter");
        this.a = adMetadataHolder;
        this.b = adMetadataChangedEventEmitter;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("info");
        if (str == null) {
            str = "";
        }
        Bundle bundleA = cb1.a(str);
        if (bundleA != null) {
            this.a.a(bundleA);
            Object objA = this.b.a(bundleA, dernVar);
            return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
        }
        y13.a("Unable to parse ad metadata info: " + str, null, 6);
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_AD_METADATA_CHANGED;
    }
}
