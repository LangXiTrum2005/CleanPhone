package saneness;

import ads_mobile_sdk.e63;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.text.MatchResult;
import p002kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public interface blighty {
    static {
        Regex regex = palewise.f37241attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object attabal(blighty blightyVar, wretchedly.dern dernVar) {
        e63 e63Var;
        MatchResult matchResultFind$default;
        MatchResult.saneness sanenessVarAttabal;
        if (dernVar instanceof e63) {
            e63Var = (e63) dernVar;
            int i = e63Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e63Var.c = i - Integer.MIN_VALUE;
            } else {
                e63Var = new e63(blightyVar, dernVar);
            }
        } else {
            e63Var = new e63(blightyVar, dernVar);
        }
        Object objA = e63Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = e63Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            e63Var.c = 1;
            objA = blightyVar.a(e63Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
        }
        String str = (String) objA;
        if (str == null || (matchResultFind$default = Regex.find$default(palewise.f37241attabal, str, 0, 2, null)) == null || (sanenessVarAttabal = matchResultFind$default.attabal()) == null) {
            return null;
        }
        return sanenessVarAttabal.getMatch().saneness().get(1);
    }

    default Object a(e63 e63Var) {
        return null;
    }

    Object a(ContinuationImpl continuationImpl);

    Object b(ContinuationImpl continuationImpl);
}
