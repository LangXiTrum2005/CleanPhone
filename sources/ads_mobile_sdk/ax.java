package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import saneness.pediatric;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class ax implements pediatric {
    public final /* synthetic */ cb3 a;

    public ax(cb3 cb3Var) {
        this.a = cb3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rotuma rotumaVar, wretchedly.dern dernVar) {
        zw zwVar;
        if (dernVar instanceof zw) {
            zwVar = (zw) dernVar;
            int i = zwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zwVar.c = i - Integer.MIN_VALUE;
            } else {
                zwVar = new zw(this, dernVar);
            }
        } else {
            zwVar = new zw(this, dernVar);
        }
        Object obj = zwVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = zwVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Function2 ywVar = new yw(this.a, null);
            zwVar.c = 1;
            if (rotumaVar.attabal(ywVar, zwVar) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.pediatric
    public final /* bridge */ /* synthetic */ Object a(Object obj, oa1 oa1Var) {
        return a((rotuma) obj, (wretchedly.dern) oa1Var);
    }
}
