package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.backstairs;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class fw0 implements coi {
    public final coffeecake a;

    public fw0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake preconnectTask = this.a;
        Intrinsics.checkNotNullParameter(preconnectTask, "preconnectTask");
        return new backstairs(preconnectTask);
    }
}
