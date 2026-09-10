package ads_mobile_sdk;

import com.applovin.impl.sdk.utils.JsonUtils;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xy0 extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public wz0 b;
    public int c;
    public final /* synthetic */ wz0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(wz0 wz0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = wz0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new xy0(this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xy0(this.d, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        wz0 wz0Var;
        formularization.attabal attabalVar;
        formularization.attabal attabalVar2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                wz0Var = this.d;
                formularization.attabal attabalVar3 = wz0Var.w;
                this.a = attabalVar3;
                this.b = wz0Var;
                this.c = 1;
                if (attabalVar3.attabal(null, this) != objBeachfront) {
                    attabalVar = attabalVar3;
                }
                return objBeachfront;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = this.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    Unit unit = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    attabalVar = attabalVar2;
                    attabalVar.wireman(null);
                    throw th;
                }
            }
            wz0Var = this.b;
            formularization.attabal attabalVar4 = this.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar4;
            Long lMarial = igo.attabal.marial(Long.MAX_VALUE);
            this.a = attabalVar;
            this.b = null;
            this.c = 2;
            if (wz0.a(wz0Var, null, null, null, JsonUtils.EMPTY_JSON, lMarial, null, null, null, this, 231) != objBeachfront) {
                attabalVar2 = attabalVar;
                Unit unit2 = Unit.f29295attabal;
                attabalVar2.wireman(null);
                return unit2;
            }
            return objBeachfront;
        } catch (Throwable th2) {
            th = th2;
            attabalVar.wireman(null);
            throw th;
        }
    }
}
