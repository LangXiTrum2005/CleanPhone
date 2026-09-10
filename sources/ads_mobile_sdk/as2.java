package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.volunteer;

/* JADX INFO: loaded from: classes.dex */
public final class as2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public as2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        rh audioSignalSource = (rh) this.a.get();
        jk0 flags = (jk0) this.b.get();
        Intrinsics.checkNotNullParameter(audioSignalSource, "audioSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        bq2 bq2Var = bq2.REQUIRED;
        gp2 gp2Var = gp2.SEQUENTIAL;
        fr2 fr2Var = fr2.BACKGROUND;
        audioSignalSource.getClass();
        return new vn(audioSignalSource, volunteer.attabal(flags, to0.AUDIO));
    }
}
