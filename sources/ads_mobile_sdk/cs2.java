package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class cs2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public cs2(ap apVar, coffeecake coffeecakeVar) {
        this.a = apVar;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        zo cldSignalSource = (zo) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(cldSignalSource, "cldSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.OPTIONAL;
        gp2 gp2Var = gp2.ASYNC;
        fr2 fr2Var = fr2.BACKGROUND;
        cldSignalSource.getClass();
        return new nt1(cldSignalSource, bq2Var, gp2Var, volunteer.attabal(flags, to0.CLD));
    }
}
