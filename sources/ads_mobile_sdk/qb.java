package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class qb implements portwide {
    public final iv a;

    public qb(iv consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.a = consentManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.AMAZON_FIRE_AD_ID;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        pb pbVar;
        qb qbVar;
        String str;
        if (dernVar instanceof pb) {
            pbVar = (pb) dernVar;
            int i = pbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbVar.d = i - Integer.MIN_VALUE;
            } else {
                pbVar = new pb(this, dernVar);
            }
        } else {
            pbVar = new pb(this, dernVar);
        }
        Object objL = pbVar.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = pbVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                qbVar = (qb) pbVar.a;
                p002kotlin.dern.saneness(objL);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) pbVar.a;
                p002kotlin.dern.saneness(objL);
            }
            return new tn0(new ob(str, (Boolean) objL));
        }
        p002kotlin.dern.saneness(objL);
        iv ivVar = this.a;
        pbVar.a = this;
        pbVar.d = 1;
        objL = ivVar.l(pbVar);
        if (objL != objBeachfront) {
            qbVar = this;
        }
        return objBeachfront;
        String str2 = (String) objL;
        iv ivVar2 = qbVar.a;
        pbVar.a = str2;
        pbVar.d = 2;
        Object objT = ivVar2.t(pbVar);
        if (objT != objBeachfront) {
            str = str2;
            objL = objT;
            return new tn0(new ob(str, (Boolean) objL));
        }
        return objBeachfront;
    }
}
