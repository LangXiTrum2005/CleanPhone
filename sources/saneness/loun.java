package saneness;

import ads_mobile_sdk.d13;
import ads_mobile_sdk.fv1;
import ads_mobile_sdk.y03;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface loun {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object saneness(loun lounVar, String str, fv1 fv1Var, wretchedly.dern dernVar) {
        y03 y03Var;
        if (dernVar instanceof y03) {
            y03Var = (y03) dernVar;
            int i = y03Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                y03Var.e = i - Integer.MIN_VALUE;
            } else {
                y03Var = new y03(lounVar, dernVar);
            }
        } else {
            y03Var = new y03(lounVar, dernVar);
        }
        Object obj = y03Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = y03Var.e;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = y03Var.b;
                loun lounVar2 = y03Var.a;
                p002kotlin.dern.saneness(obj);
                return obj;
            }
            p002kotlin.dern.saneness(obj);
            y03Var.a = lounVar;
            y03Var.b = str;
            y03Var.e = 1;
            Object objInvoke = fv1Var.invoke(y03Var);
            return objInvoke == objBeachfront ? objBeachfront : objInvoke;
        } catch (Exception e) {
            ((d13) lounVar).a(str, e);
            return null;
        }
    }

    default Object attabal(String label, Function0 block) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke();
        } catch (Exception e) {
            ((d13) this).a(label, e);
            return null;
        }
    }
}
