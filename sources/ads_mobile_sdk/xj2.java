package ads_mobile_sdk;

import complexometry.formularize;
import java.util.List;
import java.util.Optional;
import liquory.beachfront;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class xj2 implements portwide {
    public final Optional a;
    public final Optional b;
    public final pj2 c;
    public final yf2 d;
    public final formularize e;
    public final List f;

    public xj2(jk0 flags, Optional optionalBannerRequest, Optional optionalSignalRequest, pj2 rtbAdapterSignalCollector, yf2 requestType, formularize adRequest) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(optionalBannerRequest, "optionalBannerRequest");
        Intrinsics.checkNotNullParameter(optionalSignalRequest, "optionalSignalRequest");
        Intrinsics.checkNotNullParameter(rtbAdapterSignalCollector, "rtbAdapterSignalCollector");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        this.a = optionalBannerRequest;
        this.b = optionalSignalRequest;
        this.c = rtbAdapterSignalCollector;
        this.d = requestType;
        this.e = adRequest;
        this.f = flags.h0();
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.RTB_SIGNAL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        wj2 wj2Var;
        if (dernVar instanceof wj2) {
            wj2Var = (wj2) dernVar;
            int i = wj2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wj2Var.c = i - Integer.MIN_VALUE;
            } else {
                wj2Var = new wj2(this, dernVar);
            }
        } else {
            wj2Var = new wj2(this, dernVar);
        }
        Object objA = wj2Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = wj2Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            adjudge.saneness sanenessVar = (adjudge.saneness) monocoque.attabal.saneness(this.b);
            if (sanenessVar != null && !this.f.contains(String.valueOf(sanenessVar.getF3279impassible().getNumber()))) {
                return new tn0(new tj2(adultoid.formularize()));
            }
            beachfront beachfrontVar = (beachfront) monocoque.attabal.saneness(this.a);
            liquory.attabal attabalVar = beachfrontVar != null ? beachfrontVar.getCom.ironsource.X3.i.O java.lang.String() : null;
            String str = this.d.a;
            pj2 pj2Var = this.c;
            formularize formularizeVar = this.e;
            wj2Var.c = 1;
            objA = pj2Var.a(attabalVar, str, formularizeVar, wj2Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
        }
        return new tn0(new tj2((List) objA));
    }
}
