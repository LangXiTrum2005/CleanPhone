package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.laky;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends hv2 {
    public final iv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(iv consentManager) {
        super(no0.CUI_NAME_SDKINIT_INIT_AD_ID_PERMISSION);
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.d = consentManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.AD_ID_PERMISSION;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        p2 p2Var;
        if (dernVar instanceof p2) {
            p2Var = (p2) dernVar;
            int i = p2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p2Var.c = i - Integer.MIN_VALUE;
            } else {
                p2Var = new p2(this, dernVar);
            }
        } else {
            p2Var = new p2(this, dernVar);
        }
        Object objAttabal = p2Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = p2Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objAttabal);
            iv ivVar = this.d;
            p2Var.c = 1;
            ivVar.getClass();
            laky lakyVar = ip0.f;
            objAttabal = igo.attabal.attabal(laky.competently(ivVar.c, "com.google.android.gms.permission.AD_ID"));
            if (objAttabal == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objAttabal);
        }
        return new tn0(new o2(((Boolean) objAttabal).booleanValue()));
    }
}
