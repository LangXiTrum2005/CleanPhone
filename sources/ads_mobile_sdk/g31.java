package ads_mobile_sdk;

import p002kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class g31 implements kotlinx.coroutines.flow.dern {
    public final /* synthetic */ kotlinx.coroutines.flow.dern a;
    public final /* synthetic */ j31 b;

    public g31(kotlinx.coroutines.flow.dern dernVar, j31 j31Var) {
        this.a = dernVar;
        this.b = j31Var;
    }

    @Override // kotlinx.coroutines.flow.dern
    public final Object collect(kotlinx.coroutines.flow.wireman wiremanVar, wretchedly.dern dernVar) {
        Object objCollect = this.a.collect(new f31(wiremanVar, this.b), dernVar);
        return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }
}
