package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class fs2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public fs2(ld0 ld0Var, coffeecake coffeecakeVar) {
        this.a = ld0Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        kd0 displayCountSignalSource = (kd0) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(displayCountSignalSource, "displayCountSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.OPTIONAL;
        gp2 gp2Var = gp2.ASYNC;
        fr2 fr2Var = fr2.BACKGROUND;
        displayCountSignalSource.getClass();
        return new nt1(displayCountSignalSource, bq2Var, gp2Var, volunteer.attabal(flags, to0.DISPLAY_COUNT));
    }
}
