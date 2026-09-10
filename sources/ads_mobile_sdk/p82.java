package ads_mobile_sdk;

import kotlinx.coroutines.flow.arytenoidectomy;
import kotlinx.coroutines.monroe;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p82 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ k92 b;
    public final /* synthetic */ monroe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p82(k92 k92Var, monroe monroeVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = k92Var;
        this.c = monroeVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new p82(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p82(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            arytenoidectomy arytenoidectomyVar = this.b.l;
            o82 o82Var = new o82(this.c);
            this.a = 1;
            if (arytenoidectomyVar.collect(o82Var, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        throw new KotlinNothingValueException();
    }
}
