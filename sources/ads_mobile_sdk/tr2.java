package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class tr2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public tr2(b6 b6Var, coffeecake coffeecakeVar) {
        this.a = b6Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        a6 adSizeSignalSource = (a6) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(adSizeSignalSource, "adSizeSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.REQUIRED;
        gp2 gp2Var = gp2.SEQUENTIAL;
        fr2 fr2Var = fr2.BACKGROUND;
        adSizeSignalSource.getClass();
        return new nt1(adSizeSignalSource, bq2Var, gp2Var, volunteer.attabal(flags, to0.AD_SIZE));
    }
}
