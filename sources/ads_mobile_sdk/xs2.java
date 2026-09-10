package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class xs2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public xs2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        q03 topicsSignalSource = (q03) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(topicsSignalSource, "topicsSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.OPTIONAL;
        gp2 gp2Var = gp2.ASYNC;
        fr2 fr2Var = fr2.BACKGROUND;
        topicsSignalSource.getClass();
        return new nt1(topicsSignalSource, bq2Var, gp2Var, fr2Var, volunteer.attabal(flags, to0.TOPICS), new kr2(flags));
    }
}
