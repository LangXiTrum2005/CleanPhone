package ads_mobile_sdk;

import com.google.gson.JsonObject;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import saneness.glassmaker;

/* JADX INFO: loaded from: classes.dex */
public final class fx1 extends SuspendLambda implements Function2 {
    public glassmaker a;
    public int b;
    public final /* synthetic */ tx1 c;
    public final /* synthetic */ gq0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Ref$ObjectRef f;
    public final /* synthetic */ iv0 g;
    public final /* synthetic */ Ref$ObjectRef h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx1(tx1 tx1Var, gq0 gq0Var, String str, Ref$ObjectRef ref$ObjectRef, iv0 iv0Var, Ref$ObjectRef ref$ObjectRef2, boolean z, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = tx1Var;
        this.d = gq0Var;
        this.e = str;
        this.f = ref$ObjectRef;
        this.g = iv0Var;
        this.h = ref$ObjectRef2;
        this.i = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new fx1(this.c, this.d, this.e, this.f, this.g, this.h, this.i, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fx1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fw fwVar;
        sz1 sz1Var;
        fx1 fx1Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.b;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            tx1 tx1Var = this.c;
            lv1 lv1Var = tx1Var.f;
            gq0 gq0Var = this.d;
            String str = this.e;
            String str2 = tx1Var.e.x;
            T t = this.f.element;
            if (t == 0) {
                Intrinsics.preprohormone("creativeType");
                fwVar = null;
            } else {
                fwVar = (fw) t;
            }
            iv0 iv0Var = this.g;
            sz1 sz1Var2 = sz1.c;
            T t2 = this.h.element;
            if (t2 == 0) {
                Intrinsics.preprohormone("videoEventsOwner");
                sz1Var = null;
            } else {
                sz1Var = (sz1) t2;
            }
            this.b = 1;
            lv1Var.getClass();
            fx1Var = this;
            obj = lv1.a(lv1Var, gq0Var, str, str2, fwVar, iv0Var, sz1Var2, sz1Var, fx1Var);
            if (obj != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            glassmaker glassmakerVar = this.a;
            p002kotlin.dern.saneness(obj);
            return glassmakerVar;
        }
        p002kotlin.dern.saneness(obj);
        fx1Var = this;
        glassmaker adSession = (glassmaker) obj;
        if (adSession == null) {
            return null;
        }
        tx1 tx1Var2 = fx1Var.c;
        gq0 gq0Var2 = fx1Var.d;
        boolean z = fx1Var.i;
        if (tx1Var2.m) {
            tx1Var2.f.a(adSession, gq0Var2);
        }
        if (z) {
            lv1 lv1Var2 = tx1Var2.f;
            lv1Var2.getClass();
            Intrinsics.checkNotNullParameter(adSession, "adSession");
            JsonObject jsonObject = new JsonObject();
            fx1Var.a = adSession;
            fx1Var.b = 2;
            if (gq0Var2.a(jsonObject, "onSdkLoaded", this) == objBeachfront) {
                return objBeachfront;
            }
        }
        return adSession;
    }
}
