package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.backstairs;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ex0 implements coi {
    public final coffeecake a;

    public ex0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake trustlessTokenSignalSource = this.a;
        Intrinsics.checkNotNullParameter(trustlessTokenSignalSource, "trustlessTokenSignalSource");
        return new backstairs(trustlessTokenSignalSource);
    }
}
