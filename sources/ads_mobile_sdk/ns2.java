package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class ns2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public ns2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        t02 parentAdConfigSignalSource = (t02) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(parentAdConfigSignalSource, "parentAdConfigSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.REQUIRED;
        gp2 gp2Var = gp2.ASYNC;
        fr2 fr2Var = fr2.BACKGROUND;
        parentAdConfigSignalSource.getClass();
        return new nt1(parentAdConfigSignalSource, bq2Var, gp2Var, volunteer.attabal(flags, to0.PARENT_AD_CONFIG));
    }
}
