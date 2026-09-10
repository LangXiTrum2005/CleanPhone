package ads_mobile_sdk;

import android.content.Context;
import android.os.BatteryManager;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;

/* JADX INFO: loaded from: classes.dex */
public final class ol extends un {
    public final BatteryManager l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(jk0 flags, Context context, saran backgroundScope, amphitheatre clock, ri2 rootTraceCreator, x activityTracker) {
        super(clock, backgroundScope, rootTraceCreator, flags, activityTracker);
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.l = (BatteryManager) context.getSystemService(BatteryManager.class);
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.BATTERY;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        return new tn0(new nl(((double) this.l.getIntProperty(4)) / 100.0d, this.l.isCharging()));
    }
}
