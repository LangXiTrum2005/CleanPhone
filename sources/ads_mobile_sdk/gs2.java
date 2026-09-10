package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class gs2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public gs2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        sf0 experimentIdsSignalSource = (sf0) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(experimentIdsSignalSource, "experimentIdsSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.REQUIRED;
        gp2 gp2Var = gp2.SEQUENTIAL;
        fr2 fr2Var = fr2.BACKGROUND;
        experimentIdsSignalSource.getClass();
        return new nt1(experimentIdsSignalSource, bq2Var, gp2Var, volunteer.attabal(flags, to0.EXPERIMENT_IDS));
    }
}
