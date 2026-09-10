package ads_mobile_sdk;

import androidx.datastore.core.competently;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rg extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ug b;
    public final /* synthetic */ vf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(ug ugVar, vf vfVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = ugVar;
        this.c = vfVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new rg(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rg(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            yf yfVar = this.b.b;
            vf vfVar = this.c;
            this.a = 1;
            Object objAttabal = ((competently) yfVar.a.get()).attabal(new xf(vfVar, null), this);
            if (objAttabal != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objAttabal = Unit.f29295attabal;
            }
            if (objAttabal == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
