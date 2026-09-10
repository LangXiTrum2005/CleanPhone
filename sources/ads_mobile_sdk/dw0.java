package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.backstairs;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class dw0 implements coi {
    public final coffeecake a;

    public dw0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake adIdInitTask = this.a;
        Intrinsics.checkNotNullParameter(adIdInitTask, "adIdInitTask");
        return new backstairs(adIdInitTask);
    }
}
