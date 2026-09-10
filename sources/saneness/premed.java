package saneness;

import ads_mobile_sdk.gq0;
import ads_mobile_sdk.kq0;
import ads_mobile_sdk.po0;
import ads_mobile_sdk.pq0;
import java.util.Map;
import p002kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class premed implements hemolysin {
    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        if (map.keySet().contains("start")) {
            pq0 pq0VarB = gq0Var.b();
            pq0VarB.j.incrementAndGet();
            pq0VarB.f();
            return Unit.f29295attabal;
        }
        if (map.keySet().contains("stop")) {
            pq0 pq0VarB2 = gq0Var.b();
            pq0VarB2.j.decrementAndGet();
            pq0VarB2.f();
            return Unit.f29295attabal;
        }
        if (!map.keySet().contains("cancel")) {
            return Unit.f29295attabal;
        }
        pq0 pq0VarB3 = gq0Var.b();
        pq0VarB3.i.set(true);
        kotlinx.coroutines.cutely.wireman(pq0VarB3.c, null, null, new kq0(pq0VarB3, null), 3, null);
        pq0VarB3.f();
        Unit unit = Unit.f29295attabal;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        return unit;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_DELAY_PAGE_LOADED;
    }

    @Override // saneness.hemolysin
    public final boolean c() {
        return true;
    }
}
