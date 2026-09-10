package ads_mobile_sdk;

import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.arytenoidectomy;
import kotlinx.coroutines.flow.graveside;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class ub2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public ub2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        saran backgroundScope = (saran) this.a.get();
        kotlinx.coroutines.channels.wireman cancellationChannel = (kotlinx.coroutines.channels.wireman) this.b.get();
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(cancellationChannel, "cancellationChannel");
        return (arytenoidectomy) vilification.dern(FlowKt__ShareKt.competently(marial.yemenite(cancellationChannel), backgroundScope, graveside.INSTANCE.wireman(), 0, 4, null));
    }
}
