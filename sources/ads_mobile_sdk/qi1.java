package ads_mobile_sdk;

import p002kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class qi1 implements kotlinx.coroutines.flow.dern {
    public final /* synthetic */ kotlinx.coroutines.flow.dern a;
    public final /* synthetic */ ti1 b;

    public qi1(kotlinx.coroutines.flow.dern dernVar, ti1 ti1Var) {
        this.a = dernVar;
        this.b = ti1Var;
    }

    @Override // kotlinx.coroutines.flow.dern
    public final Object collect(kotlinx.coroutines.flow.wireman wiremanVar, wretchedly.dern dernVar) {
        Object objCollect = this.a.collect(new pi1(wiremanVar, this.b), dernVar);
        return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }
}
