package ads_mobile_sdk;

import java.util.Random;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.kaif;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class vr implements coi {
    public final coffeecake a;

    public vr(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        kaif randomGenerator = (kaif) this.a.get();
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        randomGenerator.getClass();
        return (String) vilification.dern(String.valueOf(new Random().nextInt(Integer.MAX_VALUE)));
    }
}
