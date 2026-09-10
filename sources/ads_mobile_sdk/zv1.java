package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.glassmaker;

/* JADX INFO: loaded from: classes.dex */
public final class zv1 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ xq0 c;
    public final /* synthetic */ kw1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(kw1 kw1Var, xq0 xq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = xq0Var;
        this.d = kw1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new zv1(this.d, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        xq0 xq0Var = this.c;
        return new zv1(this.d, xq0Var, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        iv0 iv0Var;
        zv1 zv1Var;
        gq0 gq0Var;
        glassmaker glassmakerVar;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                gq0Var = (gq0) this.a;
                p002kotlin.dern.saneness(obj);
                zv1Var = this;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                glassmakerVar = (glassmaker) this.a;
                p002kotlin.dern.saneness(obj);
                zv1Var = this;
            }
            zv1Var.d.i = glassmakerVar;
            return Unit.f29295attabal;
        }
        p002kotlin.dern.saneness(obj);
        gq0 gq0Var2 = this.c.a;
        kw1 kw1Var = this.d;
        h1 h1Var = kw1Var.d;
        ay1 ay1Var = h1Var.R;
        zx1 zx1Var = ay1Var.a;
        sz1 sz1Var = ay1Var.b;
        zx1 zx1Var2 = zx1.VIDEO;
        if (zx1Var == zx1Var2) {
            iv0Var = iv0.b;
        } else {
            iv0Var = h1Var.F == d1.ONE_PIXEL ? iv0.e : iv0.d;
        }
        fw fwVar = zx1Var == zx1Var2 ? fw.e : fw.c;
        lv1 lv1Var = kw1Var.e;
        sz1 sz1Var2 = sz1.c;
        String str = h1Var.x;
        this.a = gq0Var2;
        this.b = 1;
        lv1Var.getClass();
        zv1Var = this;
        obj = lv1.a(lv1Var, gq0Var2, sz1Var2, iv0Var, fwVar, sz1Var, str, zv1Var);
        if (obj != objBeachfront) {
            gq0Var = gq0Var2;
        }
        return objBeachfront;
        glassmaker adSession = (glassmaker) obj;
        if (adSession == null) {
            return Unit.f29295attabal;
        }
        zv1Var.d.e.a(adSession, zv1Var.c);
        lv1 lv1Var2 = zv1Var.d.e;
        lv1Var2.getClass();
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        JsonObject jsonObject = new JsonObject();
        zv1Var.a = adSession;
        zv1Var.b = 2;
        if (gq0Var.a(jsonObject, "onSdkLoaded", this) != objBeachfront) {
            glassmakerVar = adSession;
            zv1Var.d.i = glassmakerVar;
            return Unit.f29295attabal;
        }
        return objBeachfront;
    }
}
