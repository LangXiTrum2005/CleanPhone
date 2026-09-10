package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class aq2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public aq2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        c33 trustlessTokenSignalSource = (c33) this.a.get();
        jk0 flags = (jk0) this.b.get();
        adjudge.saneness signalRequest = (adjudge.saneness) this.c.get();
        Intrinsics.checkNotNullParameter(trustlessTokenSignalSource, "trustlessTokenSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(signalRequest, "signalRequest");
        bq2 bq2Var = bq2.REQUIRED;
        gp2 gp2Var = gp2.ASYNC;
        fr2 fr2Var = fr2.BACKGROUND;
        trustlessTokenSignalSource.getClass();
        return new vn(trustlessTokenSignalSource, gp2Var, fr2Var, volunteer.attabal(flags, to0.TRUSTLESS_TOKEN), new xp2(flags, signalRequest));
    }
}
