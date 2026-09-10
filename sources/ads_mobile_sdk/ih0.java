package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class ih0 implements portwide {
    public final iv a;
    public final wg0 b;

    public ih0(iv consentManager, wg0 firebaseAnalyticsAdapter) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsAdapter, "firebaseAnalyticsAdapter");
        this.a = consentManager;
        this.b = firebaseAnalyticsAdapter;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.FIREBASE_ANALYTICS;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        hh0 hh0Var;
        ih0 ih0Var;
        String str;
        String str2;
        Object objN;
        String str3;
        ih0 ih0Var2;
        String str4;
        String str5;
        if (dernVar instanceof hh0) {
            hh0Var = (hh0) dernVar;
            int i = hh0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hh0Var.f = i - Integer.MIN_VALUE;
            } else {
                hh0Var = new hh0(this, dernVar);
            }
        } else {
            hh0Var = new hh0(this, dernVar);
        }
        Object objO = hh0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = hh0Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objO);
            if (this.b.e.getValue() == null) {
                return new tn0(new gh0(null, null, null, null, false));
            }
            iv ivVar = this.a;
            hh0Var.a = this;
            hh0Var.f = 1;
            objO = ivVar.o(hh0Var);
            if (objO != objBeachfront) {
                ih0Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            ih0Var = hh0Var.a;
            p002kotlin.dern.saneness(objO);
        } else {
            if (i2 == 2) {
                String str6 = hh0Var.b;
                ih0 ih0Var3 = hh0Var.a;
                p002kotlin.dern.saneness(objO);
                str = str6;
                ih0Var = ih0Var3;
                str2 = (String) objO;
                iv ivVar2 = ih0Var.a;
                hh0Var.a = ih0Var;
                hh0Var.b = str;
                hh0Var.c = str2;
                hh0Var.f = 3;
                objN = ivVar2.n(hh0Var);
                if (objN != objBeachfront) {
                    str3 = str2;
                    objO = objN;
                    ih0Var2 = ih0Var;
                    str4 = str;
                }
                return objBeachfront;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str7 = hh0Var.c;
            str4 = hh0Var.b;
            ih0Var2 = hh0Var.a;
            p002kotlin.dern.saneness(objO);
            str3 = str7;
        }
        String str8 = (String) objO;
        if (ih0Var2.b.e.getValue() != null) {
            str5 = "fa";
        } else {
            str5 = null;
        }
        return new tn0(new gh0(str4, str3, str8, str5, true));
        String str9 = (String) objO;
        iv ivVar3 = ih0Var.a;
        hh0Var.a = ih0Var;
        hh0Var.b = str9;
        hh0Var.f = 2;
        Object objP = ivVar3.p(hh0Var);
        if (objP != objBeachfront) {
            str = str9;
            objO = objP;
            str2 = (String) objO;
            iv ivVar4 = ih0Var.a;
            hh0Var.a = ih0Var;
            hh0Var.b = str;
            hh0Var.c = str2;
            hh0Var.f = 3;
            objN = ivVar4.n(hh0Var);
            if (objN != objBeachfront) {
                str3 = str2;
                objO = objN;
                ih0Var2 = ih0Var;
                str4 = str;
                String str10 = (String) objO;
                if (ih0Var2.b.e.getValue() != null) {
                    str5 = "fa";
                } else {
                    str5 = null;
                }
                return new tn0(new gh0(str4, str3, str10, str5, true));
            }
        }
        return objBeachfront;
    }
}
