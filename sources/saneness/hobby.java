package saneness;

import ads_mobile_sdk.d4;
import ads_mobile_sdk.eh0;
import ads_mobile_sdk.n51;
import ads_mobile_sdk.qs1;
import ads_mobile_sdk.vo;
import ads_mobile_sdk.xt0;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface hobby {
    static /* synthetic */ Object attabal(hobby hobbyVar, URL url, Map map, wretchedly.dern dernVar, int i) {
        if ((i & 4) != 0) {
            map = null;
        }
        return hobbyVar.a(url, (p002kotlin.time.saneness) null, map, false, dernVar);
    }

    static /* synthetic */ Object saneness(hobby hobbyVar, xt0 xt0Var, p002kotlin.time.saneness sanenessVar, wretchedly.dern dernVar, int i) {
        if ((i & 2) != 0) {
            sanenessVar = null;
        }
        return hobbyVar.a(xt0Var, sanenessVar, (Map) null, false, dernVar);
    }

    Object a(int i, long j, d4 d4Var);

    Object a(n51 n51Var);

    Object a(xt0 xt0Var, p002kotlin.time.saneness sanenessVar, qs1 qs1Var);

    Object a(xt0 xt0Var, p002kotlin.time.saneness sanenessVar, Map map, boolean z, wretchedly.dern dernVar);

    Object a(String str, Map map, wretchedly.dern dernVar);

    Object a(URL url, eh0 eh0Var, wretchedly.dern dernVar);

    Object a(URL url, p002kotlin.time.saneness sanenessVar, Map map, boolean z, wretchedly.dern dernVar);

    Object a(URL url, wretchedly.dern dernVar);

    void a(vo voVar);

    void a(imposure.saneness sanenessVar);

    void a(tithonia tithoniaVar);
}
