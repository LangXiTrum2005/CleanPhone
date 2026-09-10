package ads_mobile_sdk;

import androidx.datastore.core.competently;
import kotlinx.coroutines.flow.marial;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class il2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ll2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il2(ll2 ll2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = ll2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new il2(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new il2(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            kotlinx.coroutines.flow.dern data = ((competently) this.b.b.get()).getData();
            this.a = 1;
            obj = marial.graveside(data, this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        fl2 fl2Var = (fl2) obj;
        return fl2Var == null ? fl2.p() : fl2Var;
    }
}
