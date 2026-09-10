package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class yp2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public yp2(tk2 tk2Var, coffeecake coffeecakeVar) {
        this.a = tk2Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        sk2 scarSignalTypeSignalSource = (sk2) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(scarSignalTypeSignalSource, "scarSignalTypeSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.REQUIRED;
        gp2 gp2Var = gp2.SEQUENTIAL;
        fr2 fr2Var = fr2.BACKGROUND;
        scarSignalTypeSignalSource.getClass();
        return new nt1(scarSignalTypeSignalSource, bq2Var, gp2Var, volunteer.attabal(flags, to0.SCAR_SIGNAL_TYPE));
    }
}
