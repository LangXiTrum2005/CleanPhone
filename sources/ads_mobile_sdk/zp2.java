package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class zp2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public zp2(wp2 wp2Var, coffeecake coffeecakeVar) {
        this.a = wp2Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        vp2 signalGenerationResponseKeySignalSource = (vp2) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(signalGenerationResponseKeySignalSource, "signalGenerationResponseKeySignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.REQUIRED;
        gp2 gp2Var = gp2.ASYNC;
        fr2 fr2Var = fr2.BACKGROUND;
        signalGenerationResponseKeySignalSource.getClass();
        return new nt1(signalGenerationResponseKeySignalSource, bq2Var, gp2Var, volunteer.attabal(flags, to0.AD_RESPONSE_ENCRYPTION_KEY));
    }
}
