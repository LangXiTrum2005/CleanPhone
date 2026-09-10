package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;
import saneness.hemolysin;
import saneness.invest;

/* JADX INFO: loaded from: classes.dex */
public final class ym2 implements hemolysin {
    public final a02 a;

    public ym2(a02 paidLifecycleWrapper) {
        Intrinsics.checkNotNullParameter(paidLifecycleWrapper, "paidLifecycleWrapper");
        this.a = paidLifecycleWrapper;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("enabled");
        if (!dovishness.stratoscope(str, com.ironsource.mediationsdk.metadata.a.g, true) && !dovishness.stratoscope(str, "false", true)) {
            return Unit.f29295attabal;
        }
        a02 a02Var = this.a;
        boolean z = Boolean.parseBoolean(str);
        a02Var.getClass();
        try {
            Object value = a02Var.e.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            kr0 kr0Var = (kr0) ((invest) value);
            kr0Var.getClass();
            synchronized (kr0.class) {
                kr0Var.a.a(Boolean.valueOf(z), "paidv2_user_option");
            }
        } catch (Exception e) {
            y13.a("Exception while setting GpidV2 UserOption", e, 4);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_SET_PAIDV2_PERSONALIZATION_ENABLED;
    }
}
