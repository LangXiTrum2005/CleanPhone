package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.undertread;

/* JADX INFO: loaded from: classes.dex */
public final class f7 implements undertread {
    public final c7 a;
    public final formularize b;

    public f7(c7 adUnitStatsTracker, formularize baseRequest) {
        Intrinsics.checkNotNullParameter(adUnitStatsTracker, "adUnitStatsTracker");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        this.a = adUnitStatsTracker;
        this.b = baseRequest;
    }

    @Override // saneness.undertread
    public final Object n(wretchedly.dern dernVar) {
        c7 c7Var = this.a;
        String adUnitId = this.b.getAdUnitId();
        if (adUnitId != null) {
            synchronized (c7Var.a) {
                try {
                    Integer num = (Integer) c7Var.b.get(adUnitId);
                    if (num == null) {
                        num = 0;
                    }
                    Intrinsics.beachfront(num);
                    c7Var.b.put(adUnitId, Integer.valueOf(num.intValue() + 1));
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            c7Var.getClass();
        }
        return Unit.f29295attabal;
    }
}
