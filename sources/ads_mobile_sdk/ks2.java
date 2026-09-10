package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class ks2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public ks2(coffeecake coffeecakeVar, ef1 ef1Var) {
        this.a = coffeecakeVar;
        this.b = ef1Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        jk0 flags = (jk0) this.a.get();
        df1 memorySignalSource = (df1) this.b.get();
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(memorySignalSource, "memorySignalSource");
        bq2 bq2Var = bq2.OPTIONAL;
        gp2 gp2Var = gp2.ASYNC;
        fr2 fr2Var = fr2.BACKGROUND;
        memorySignalSource.getClass();
        return new nt1(memorySignalSource, bq2Var, gp2Var, volunteer.attabal(flags, to0.MEMORY));
    }
}
