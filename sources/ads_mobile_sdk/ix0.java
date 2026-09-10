package ads_mobile_sdk;

import java.util.Set;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ix0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public ix0(coffeecake coffeecakeVar, xm2 xm2Var) {
        this.a = coffeecakeVar;
        this.b = xm2Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        x activityTracker = (x) this.a.get();
        Set foregroundStateChangeListeners = (Set) this.b.get();
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(foregroundStateChangeListeners, "foregroundStateChangeListeners");
        return new tv0(activityTracker, foregroundStateChangeListeners);
    }
}
