package ads_mobile_sdk;

import com.google.common.io.BaseEncoding;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class r53 implements hemolysin {
    public final iv a;
    public final loun b;

    public r53(iv consentManager, loun traceLogger) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = consentManager;
        this.b = traceLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        q53 q53Var;
        r53 r53Var;
        if (dernVar instanceof q53) {
            q53Var = (q53) dernVar;
            int i = q53Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q53Var.d = i - Integer.MIN_VALUE;
            } else {
                q53Var = new q53(this, dernVar);
            }
        } else {
            q53Var = new q53(this, dernVar);
        }
        Object obj = q53Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = q53Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r53Var = q53Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                return Unit.f29295attabal;
            } catch (x81 e) {
                e = e;
                y13.b(e);
                ((d13) r53Var.b).a("Allowlist proto deserialization failed.", e);
                return Unit.f29295attabal;
            }
        }
        p002kotlin.dern.saneness(obj);
        String str = (String) map.get("allowlist");
        if (str == null) {
            y13.a("Allowlist is missing from an updateAllowlist GMSG: " + map, null, 6);
            return Unit.f29295attabal;
        }
        try {
            byte[] bArrWireman = BaseEncoding.dern().wireman(str);
            Intrinsics.checkNotNullExpressionValue(bArrWireman, "decode(...)");
            try {
                iv ivVar = this.a;
                gt gtVarA = gt.a(bArrWireman);
                Intrinsics.checkNotNullExpressionValue(gtVarA, "parseFrom(...)");
                q53Var.a = this;
                q53Var.d = 1;
                if (ivVar.a(gtVarA, q53Var) == objBeachfront) {
                    return objBeachfront;
                }
                return Unit.f29295attabal;
            } catch (x81 e2) {
                e = e2;
                r53Var = this;
                y13.b(e);
                ((d13) r53Var.b).a("Allowlist proto deserialization failed.", e);
                return Unit.f29295attabal;
            }
        } catch (IllegalArgumentException e3) {
            y13.b(e3);
            ((d13) this.b).a("Allowlist gmsg param is not a valid encoded string.", e3);
            return Unit.f29295attabal;
        }
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_UPDATE_CONSENT_ALLOWLIST;
    }
}
