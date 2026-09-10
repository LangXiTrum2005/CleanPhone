package ads_mobile_sdk;

import java.util.Optional;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class sr implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public sr(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, b80 b80Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = b80Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Optional publisherRequestTraceMeta = (Optional) this.a.get();
        Optional internalRequestTraceMeta = (Optional) this.b.get();
        Optional renderTraceMeta = (Optional) this.c.get();
        Optional adTraceMeta = (Optional) this.d.get();
        Intrinsics.checkNotNullParameter(publisherRequestTraceMeta, "publisherRequestTraceMeta");
        Intrinsics.checkNotNullParameter(internalRequestTraceMeta, "internalRequestTraceMeta");
        Intrinsics.checkNotNullParameter(renderTraceMeta, "renderTraceMeta");
        Intrinsics.checkNotNullParameter(adTraceMeta, "adTraceMeta");
        return new l13((xb2) monocoque.attabal.attabal(publisherRequestTraceMeta, new xb2()), (j71) monocoque.attabal.attabal(internalRequestTraceMeta, new j71()), (le2) monocoque.attabal.attabal(renderTraceMeta, new le2()), (o6) monocoque.attabal.attabal(adTraceMeta, new o6()));
    }
}
