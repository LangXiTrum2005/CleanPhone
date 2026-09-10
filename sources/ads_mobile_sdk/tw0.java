package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.backstairs;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class tw0 implements coi {
    public final coffeecake a;

    public tw0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake installReferrerTask = this.a;
        Intrinsics.checkNotNullParameter(installReferrerTask, "installReferrerTask");
        return new backstairs(installReferrerTask);
    }
}
