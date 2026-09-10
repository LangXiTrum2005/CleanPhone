package ads_mobile_sdk;

import android.os.SystemClock;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class xp0 extends SuspendLambda implements Function2 {
    public gq0 a;
    public int b;
    public final /* synthetic */ gq0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp0(gq0 gq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = gq0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new xp0(this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xp0(this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xp0 xp0Var;
        gq0 gq0Var;
        b03 b03Var;
        Object objA;
        gq0 gq0Var2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                p002kotlin.dern.saneness(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gq0Var2 = this.a;
                p002kotlin.dern.saneness(obj);
            }
            b03Var = (b03) obj;
            gq0Var = gq0Var2;
            gq0Var.u = b03Var;
            return Unit.f29295attabal;
        }
        p002kotlin.dern.saneness(obj);
        gq0 gq0Var3 = this.c;
        b03 b03Var2 = gq0Var3.t;
        if (b03Var2 != null) {
            u20 u20Var = gq0Var3.d;
            this.b = 1;
            u20Var.getClass();
            String str = b03Var2.a;
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            u20Var.c.getClass();
            xp0Var = this;
            Object objA2 = u20Var.a("awfllc", str, p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), xp0Var);
            if (objA2 != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objA2 = Unit.f29295attabal;
            }
            if (objA2 != objBeachfront) {
            }
            return objBeachfront;
        }
        gq0Var = xp0Var.c;
        b03Var = gq0Var.u;
        if (b03Var == null) {
            u20 u20Var2 = gq0Var.d;
            xp0Var.a = gq0Var;
            xp0Var.b = 2;
            objA = u20Var2.a("native:view_load", this);
            if (objA != objBeachfront) {
                gq0Var2 = gq0Var;
                obj = objA;
                b03Var = (b03) obj;
                gq0Var = gq0Var2;
            }
            return objBeachfront;
        }
        gq0Var.u = b03Var;
        return Unit.f29295attabal;
        xp0Var = this;
        gq0Var = xp0Var.c;
        b03Var = gq0Var.u;
        if (b03Var == null) {
            u20 u20Var3 = gq0Var.d;
            xp0Var.a = gq0Var;
            xp0Var.b = 2;
            objA = u20Var3.a("native:view_load", this);
            if (objA != objBeachfront) {
                gq0Var2 = gq0Var;
                obj = objA;
                b03Var = (b03) obj;
                gq0Var = gq0Var2;
            }
            return objBeachfront;
        }
        gq0Var.u = b03Var;
        return Unit.f29295attabal;
    }
}
