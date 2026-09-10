package ads_mobile_sdk;

import java.net.URL;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class cu0 implements hemolysin {
    public final hobby a;

    public cu0(hobby httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.a = httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        bu0 bu0Var;
        if (dernVar instanceof bu0) {
            bu0Var = (bu0) dernVar;
            int i = bu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bu0Var.c = i - Integer.MIN_VALUE;
            } else {
                bu0Var = new bu0(this, dernVar);
            }
        } else {
            bu0Var = new bu0(this, dernVar);
        }
        Object obj = bu0Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = bu0Var.c;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                String str = (String) map.get("u");
                if (str == null) {
                    y13.a("URL is missing from an httpTrack GMSG: " + map, null, 6);
                    return Unit.f29295attabal;
                }
                hobby hobbyVar = this.a;
                URL url = new URL(str);
                bu0Var.c = 1;
                if (hobby.attabal(hobbyVar, url, null, bu0Var, 14) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
        } catch (Exception e) {
            y13.b(e);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_NAME_HTTP_TRACK;
    }
}
