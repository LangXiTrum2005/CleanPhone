package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.backstairs;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class pw0 implements coi {
    public final coffeecake a;

    public pw0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake cronetInstaller = this.a;
        Intrinsics.checkNotNullParameter(cronetInstaller, "cronetInstaller");
        return new backstairs(cronetInstaller);
    }
}
