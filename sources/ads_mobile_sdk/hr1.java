package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class hr1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public hr1(rl1 rl1Var, coffeecake coffeecakeVar) {
        this.a = rl1Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        ql1 nativeAdSignalSource = (ql1) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(nativeAdSignalSource, "nativeAdSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.REQUIRED;
        gp2 gp2Var = gp2.ASYNC;
        fr2 fr2Var = fr2.BACKGROUND;
        nativeAdSignalSource.getClass();
        return new nt1(nativeAdSignalSource, bq2Var, gp2Var, volunteer.attabal(flags, to0.NATIVE_AD));
    }
}
