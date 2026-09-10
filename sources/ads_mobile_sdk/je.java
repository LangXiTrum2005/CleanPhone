package ads_mobile_sdk;

import complexometry.competently;
import kotlinx.coroutines.flow.marial;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.alloy;
import saneness.coffeecake;
import saneness.jugal;

/* JADX INFO: loaded from: classes.dex */
public final class je implements jugal {
    public final adultoid a;

    public je(coffeecake componentProvider) {
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        this.a = componentProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(competently competentlyVar, yf2 yf2Var, l13 l13Var, boolean z, rc2 rc2Var, gy0 gy0Var, d6 d6Var, wretchedly.dern dernVar) {
        ie ieVar;
        if (dernVar instanceof ie) {
            ieVar = (ie) dernVar;
            int i = ieVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ieVar.c = i - Integer.MIN_VALUE;
            } else {
                ieVar = new ie(this, dernVar);
            }
        } else {
            ieVar = new ie(this, dernVar);
        }
        Object objA = ieVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ieVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            alloy alloyVar = (alloy) ((r60) ((saneness.competently) ((r60) ((saneness.competently) ((r60) ((saneness.competently) ((r60) ((saneness.competently) ((r60) ((saneness.competently) ((r60) ((saneness.competently) ((r60) ((saneness.competently) ((r60) ((saneness.competently) ((r60) ((saneness.competently) ((r60) ((saneness.competently) this.a.get())).a(competentlyVar))).a(yf2Var))).a(l13Var.a))).a(l13Var.b))).a(z))).a(rc2Var))).b(true))).a(gy0Var))).a(d6Var))).a().t0.get();
            ieVar.c = 1;
            objA = ((j31) alloyVar).a(ieVar);
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
        ieVar.c = 2;
        Object objMolybdenite = marial.molybdenite((kotlinx.coroutines.flow.dern) objA, ieVar);
        return objMolybdenite == objBeachfront ? objBeachfront : objMolybdenite;
    }
}
