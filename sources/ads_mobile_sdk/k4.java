package ads_mobile_sdk;

import android.os.Build;
import com.ironsource.X3;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;

/* JADX INFO: loaded from: classes.dex */
public final class k4 extends un {
    public final qc0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(jk0 flags, qc0 deviceProperties, saran backgroundScope, amphitheatre clock, ri2 rootTraceCreator, x activityTracker) {
        super(clock, backgroundScope, rootTraceCreator, flags, activityTracker);
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.l = deviceProperties;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.AD_SERVICES_EXTENSION_VERSION;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        int iIntValue;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            iIntValue = ((Number) this.l.l.getValue()).intValue();
        } else {
            jk0 jk0Var = this.f;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:attribution_reporting_for_android_s:enabled", X3.i.W);
            iIntValue = (!((Boolean) jk0Var.a("gads:attribution_reporting_for_android_s:enabled", Boolean.FALSE, zk.b)).booleanValue() || i < 31) ? 0 : ((Number) this.l.l.getValue()).intValue();
        }
        return new tn0(new j4(iIntValue));
    }
}
