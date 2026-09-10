package ads_mobile_sdk;

import p002kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class v82 implements kotlinx.coroutines.flow.dern {
    public final /* synthetic */ kotlinx.coroutines.flow.dern a;
    public final /* synthetic */ k92 b;

    public v82(kotlinx.coroutines.flow.dern dernVar, k92 k92Var) {
        this.a = dernVar;
        this.b = k92Var;
    }

    @Override // kotlinx.coroutines.flow.dern
    public final Object collect(kotlinx.coroutines.flow.wireman wiremanVar, wretchedly.dern dernVar) {
        Object objCollect = this.a.collect(new u82(wiremanVar, this.b), dernVar);
        return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }
}
