package ads_mobile_sdk;

import java.util.Optional;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class wr implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public wr(coffeecake coffeecakeVar, b80 b80Var) {
        this.a = coffeecakeVar;
        this.b = b80Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Optional publisherRequestTraceMeta = (Optional) this.a.get();
        Optional internalRequestTraceMeta = (Optional) this.b.get();
        Intrinsics.checkNotNullParameter(publisherRequestTraceMeta, "publisherRequestTraceMeta");
        Intrinsics.checkNotNullParameter(internalRequestTraceMeta, "internalRequestTraceMeta");
        return new l13((xb2) monocoque.attabal.attabal(publisherRequestTraceMeta, new xb2()), (j71) monocoque.attabal.attabal(internalRequestTraceMeta, new j71()), new le2(), new o6());
    }
}
