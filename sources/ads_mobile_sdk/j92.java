package ads_mobile_sdk;

import kotlinx.coroutines.impromptu;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import saneness.canephora;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class j92 implements kotlinx.coroutines.flow.wireman {
    public final /* synthetic */ CoroutineContext a;
    public final /* synthetic */ orthocephalic b;

    public j92(CoroutineContext coroutineContext, orthocephalic orthocephalicVar) {
        this.a = coroutineContext;
        this.b = orthocephalicVar;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, wretchedly.dern dernVar) {
        canephora canephoraVar = (canephora) obj;
        if (canephoraVar instanceof m92) {
            Object objCompetently = impromptu.competently(this.a, new g92(this.b, canephoraVar, null), dernVar);
            return objCompetently == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCompetently : Unit.f29295attabal;
        }
        if (!(canephoraVar instanceof l92)) {
            return Unit.f29295attabal;
        }
        Object objCompetently2 = impromptu.competently(this.a, new i92(this.b, canephoraVar, null), dernVar);
        return objCompetently2 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCompetently2 : Unit.f29295attabal;
    }
}
