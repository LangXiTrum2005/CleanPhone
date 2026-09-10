package ads_mobile_sdk;

import java.util.Optional;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class wb2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public wb2(h21 h21Var, h21 h21Var2, h21 h21Var3) {
        this.a = h21Var;
        this.b = h21Var2;
        this.c = h21Var3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Optional publisherRequestTraceMeta = (Optional) this.a.get();
        Optional internalRequestTraceMeta = (Optional) this.b.get();
        Optional renderTraceMeta = (Optional) this.c.get();
        Intrinsics.checkNotNullParameter(publisherRequestTraceMeta, "publisherRequestTraceMeta");
        Intrinsics.checkNotNullParameter(internalRequestTraceMeta, "internalRequestTraceMeta");
        Intrinsics.checkNotNullParameter(renderTraceMeta, "renderTraceMeta");
        return new l13((xb2) monocoque.attabal.attabal(publisherRequestTraceMeta, new xb2()), (j71) monocoque.attabal.attabal(internalRequestTraceMeta, new j71()), (le2) monocoque.attabal.attabal(renderTraceMeta, new le2()), new o6());
    }
}
