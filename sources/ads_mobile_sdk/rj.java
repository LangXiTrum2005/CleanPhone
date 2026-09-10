package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import saneness.terni;

/* JADX INFO: loaded from: classes.dex */
public final class rj {
    public static final rj a = new rj();

    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(k92 k92Var, Function2 function2, wretchedly.dern dernVar) {
        pj pjVar;
        Function2 function3;
        Object objInvoke;
        if (dernVar instanceof pj) {
            pjVar = (pj) dernVar;
            int i = pjVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjVar.e = i - Integer.MIN_VALUE;
            } else {
                pjVar = new pj(this, dernVar);
            }
        } else {
            pjVar = new pj(this, dernVar);
        }
        Object objA = pjVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = pjVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            terni.f37333attabal.getClass();
            z51 z51Var = (z51) ((i60) ((terni) en0.c.getValue())).p2.get();
            pjVar.a = k92Var;
            pjVar.b = function2;
            pjVar.e = 1;
            Object objStarveling = z51Var.v.starveling(pjVar);
            if (objStarveling != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objStarveling = Unit.f29295attabal;
            }
            if (objStarveling != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            function2 = pjVar.b;
            k92Var = (k92) pjVar.a;
            p002kotlin.dern.saneness(objA);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(objA);
                return objA;
            }
            function3 = (Function2) pjVar.a;
            p002kotlin.dern.saneness(objA);
        }
        pjVar.a = null;
        pjVar.e = 3;
        objInvoke = function3.invoke(objA, pjVar);
        if (objInvoke != objBeachfront) {
            return objBeachfront;
        }
        return objInvoke;
        pjVar.a = function2;
        pjVar.b = null;
        pjVar.e = 2;
        k92Var.getClass();
        objA = k92.a(k92Var, pjVar);
        if (objA != objBeachfront) {
            function3 = function2;
            pjVar.a = null;
            pjVar.e = 3;
            objInvoke = function3.invoke(objA, pjVar);
            if (objInvoke != objBeachfront) {
                return objInvoke;
            }
        }
        return objBeachfront;
    }
}
