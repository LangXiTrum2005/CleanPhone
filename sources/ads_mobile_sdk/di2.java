package ads_mobile_sdk;

import complexometry.competently;
import kotlinx.coroutines.flow.marial;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.alloy;
import saneness.coffeecake;
import saneness.regie;
import saneness.sensatory;

/* JADX INFO: loaded from: classes.dex */
public final class di2 implements sensatory {
    public final adultoid a;

    public di2(coffeecake componentProvider) {
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        this.a = componentProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(competently competentlyVar, yf2 yf2Var, l13 l13Var, boolean z, rc2 rc2Var, gy0 gy0Var, d6 d6Var, wretchedly.dern dernVar) {
        ci2 ci2Var;
        if (dernVar instanceof ci2) {
            ci2Var = (ci2) dernVar;
            int i = ci2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ci2Var.c = i - Integer.MIN_VALUE;
            } else {
                ci2Var = new ci2(this, dernVar);
            }
        } else {
            ci2Var = new ci2(this, dernVar);
        }
        Object objA = ci2Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ci2Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            alloy alloyVar = (alloy) ((l70) ((regie) ((l70) ((regie) ((l70) ((regie) ((l70) ((regie) ((l70) ((regie) ((l70) ((regie) ((l70) ((regie) ((l70) ((regie) ((l70) ((regie) ((l70) ((regie) this.a.get())).a(competentlyVar))).a(yf2Var))).a(l13Var.a))).a(l13Var.b))).a(z))).a(rc2Var))).b(true))).a(gy0Var))).a(d6Var))).a().t0.get();
            ci2Var.c = 1;
            objA = ((j31) alloyVar).a(ci2Var);
            if (objA != objBeachfront) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
            return objA;
        }
        p002kotlin.dern.saneness(objA);
        ci2Var.c = 2;
        Object objMolybdenite = marial.molybdenite((kotlinx.coroutines.flow.dern) objA, ci2Var);
        return objMolybdenite == objBeachfront ? objBeachfront : objMolybdenite;
    }
}
