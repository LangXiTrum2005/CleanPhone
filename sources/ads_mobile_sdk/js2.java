package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class js2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public js2(l11 l11Var, coffeecake coffeecakeVar) {
        this.a = l11Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        k11 inspectorSignalSource = (k11) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(inspectorSignalSource, "inspectorSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.OPTIONAL;
        gp2 gp2Var = gp2.ASYNC;
        fr2 fr2Var = fr2.BACKGROUND;
        inspectorSignalSource.getClass();
        return new nt1(inspectorSignalSource, bq2Var, gp2Var, volunteer.attabal(flags, to0.INSPECTOR_SIGNAL));
    }
}
