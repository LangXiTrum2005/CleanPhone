package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.backstairs;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class bx0 implements coi {
    public final coffeecake a;

    public bx0(vl2 vl2Var) {
        this.a = vl2Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake sdkCorePostInitializationTask = this.a;
        Intrinsics.checkNotNullParameter(sdkCorePostInitializationTask, "sdkCorePostInitializationTask");
        return new backstairs(sdkCorePostInitializationTask);
    }
}
