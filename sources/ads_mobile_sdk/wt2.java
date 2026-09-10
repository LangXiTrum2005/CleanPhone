package ads_mobile_sdk;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class wt2 implements hemolysin {
    public final wz0 a;
    public final jk0 b;
    public final loun c;

    public wt2(wz0 inspectorManager, jk0 flags, loun traceLogger) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = inspectorManager;
        this.b = flags;
        this.c = traceLogger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        vt2 vt2Var;
        Exception exc;
        wt2 wt2Var;
        long j;
        Map map2 = map;
        if (dernVar instanceof vt2) {
            vt2Var = (vt2) dernVar;
            int i = vt2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vt2Var.e = i - Integer.MIN_VALUE;
            } else {
                vt2Var = new vt2(this, dernVar);
            }
        } else {
            vt2Var = new vt2(this, dernVar);
        }
        vt2 vt2Var2 = vt2Var;
        Object obj = vt2Var2.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vt2Var2.e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map2 = vt2Var2.b;
            wt2Var = vt2Var2.a;
            try {
                p002kotlin.dern.saneness(obj);
                return Unit.f29295attabal;
            } catch (NumberFormatException e) {
                e = e;
                exc = null;
                kn0.c("Invalid expiration in SingleAdSourceTesting GMSG.", null);
                ((d13) wt2Var.c).a("SingleAdSourceTestingGmsgHandler.onGmsg", e);
                y13.a("Invalid expiration in SingleAdSource GMSG: " + map2, exc, 6);
                return Unit.f29295attabal;
            }
        }
        p002kotlin.dern.saneness(obj);
        if (!this.b.K()) {
            return Unit.f29295attabal;
        }
        String str = (String) map2.get(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        if (str == null || str.length() == 0) {
            y13.a("Network Extras is missing from SingleAdSource GMSG: " + map2, null, 6);
            kn0.c("Missing network extras in SingleAdSourceTesting request.", null);
            return Unit.f29295attabal;
        }
        try {
            wz0 wz0Var = this.a;
            String str2 = (String) map2.get("expires");
            if (str2 != null) {
                try {
                    j = Long.parseLong(str2);
                } catch (NumberFormatException e2) {
                    e = e2;
                    wt2Var = this;
                    exc = null;
                    kn0.c("Invalid expiration in SingleAdSourceTesting GMSG.", null);
                    ((d13) wt2Var.c).a("SingleAdSourceTestingGmsgHandler.onGmsg", e);
                    y13.a("Invalid expiration in SingleAdSource GMSG: " + map2, exc, 6);
                    return Unit.f29295attabal;
                }
            } else {
                j = Long.MAX_VALUE;
            }
            Long lMarial = igo.attabal.marial(j);
            vt2Var2.a = this;
            vt2Var2.b = map2;
            vt2Var2.e = 1;
            exc = null;
            try {
                if (wz0.a(wz0Var, null, null, null, str, lMarial, null, null, null, vt2Var2, 231) == objBeachfront) {
                    return objBeachfront;
                }
                return Unit.f29295attabal;
            } catch (NumberFormatException e3) {
                e = e3;
                wt2Var = this;
                kn0.c("Invalid expiration in SingleAdSourceTesting GMSG.", null);
                ((d13) wt2Var.c).a("SingleAdSourceTestingGmsgHandler.onGmsg", e);
                y13.a("Invalid expiration in SingleAdSource GMSG: " + map2, exc, 6);
                return Unit.f29295attabal;
            }
        } catch (NumberFormatException e4) {
            e = e4;
            exc = null;
        }
        kn0.c("Invalid expiration in SingleAdSourceTesting GMSG.", null);
        ((d13) wt2Var.c).a("SingleAdSourceTestingGmsgHandler.onGmsg", e);
        y13.a("Invalid expiration in SingleAdSource GMSG: " + map2, exc, 6);
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_INSPECTOR_SINGLE_AD_SOURCE_TEST;
    }
}
