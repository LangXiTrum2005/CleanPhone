package ads_mobile_sdk;

import androidx.datastore.core.competently;
import com.google.common.base.triweekly;
import formularization.beachfront;
import kotlinx.coroutines.flow.marial;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.delouse;

/* JADX INFO: loaded from: classes.dex */
public final class sn2 {
    public final delouse a;
    public final formularization.attabal b;
    public on2 c;

    public sn2(delouse dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.a = dataStore;
        this.b = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(sn2 sn2Var, wretchedly.dern dernVar) {
        pn2 pn2Var;
        formularization.attabal attabalVar;
        on2 on2VarO;
        formularization.attabal attabalVar2;
        sn2 sn2Var2;
        on2 on2Var;
        formularization.attabal attabalVar3;
        if (dernVar instanceof pn2) {
            pn2Var = (pn2) dernVar;
            int i = pn2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pn2Var.f = i - Integer.MIN_VALUE;
            } else {
                pn2Var = new pn2(sn2Var, dernVar);
            }
        } else {
            pn2Var = new pn2(sn2Var, dernVar);
        }
        Object objGraveside = pn2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = pn2Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objGraveside);
                attabalVar = sn2Var.b;
                pn2Var.a = sn2Var;
                pn2Var.b = attabalVar;
                pn2Var.f = 1;
                if (attabalVar.attabal(null, pn2Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                formularization.attabal attabalVar4 = (formularization.attabal) pn2Var.b;
                sn2 sn2Var3 = pn2Var.a;
                p002kotlin.dern.saneness(objGraveside);
                attabalVar = attabalVar4;
                sn2Var = sn2Var3;
            } else {
                if (i2 == 2) {
                    sn2Var = pn2Var.a;
                    p002kotlin.dern.saneness(objGraveside);
                    on2VarO = (on2) objGraveside;
                    if (on2VarO == null) {
                        on2VarO = on2.o();
                    }
                    attabalVar2 = sn2Var.b;
                    pn2Var.a = sn2Var;
                    pn2Var.b = on2VarO;
                    pn2Var.c = attabalVar2;
                    pn2Var.f = 3;
                    if (attabalVar2.attabal(null, pn2Var) != objBeachfront) {
                        sn2Var2 = sn2Var;
                        on2Var = on2VarO;
                        attabalVar3 = attabalVar2;
                    }
                    return objBeachfront;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar3 = pn2Var.c;
                on2Var = (on2) pn2Var.b;
                sn2Var2 = pn2Var.a;
                p002kotlin.dern.saneness(objGraveside);
            }
            try {
                sn2Var2.c = on2Var;
                Unit unit = Unit.f29295attabal;
                attabalVar3.wireman(null);
                Intrinsics.beachfront(on2Var);
                return on2Var;
            } catch (Throwable th) {
                attabalVar3.wireman(null);
                throw th;
            }
            on2 on2Var2 = sn2Var.c;
            attabalVar.wireman(null);
            if (on2Var2 != null) {
                return on2Var2;
            }
            kotlinx.coroutines.flow.dern data = ((competently) sn2Var.a.get()).getData();
            pn2Var.a = sn2Var;
            pn2Var.b = null;
            pn2Var.f = 2;
            objGraveside = marial.graveside(data, pn2Var);
            if (objGraveside != objBeachfront) {
                on2VarO = (on2) objGraveside;
                if (on2VarO == null) {
                    on2VarO = on2.o();
                }
                attabalVar2 = sn2Var.b;
                pn2Var.a = sn2Var;
                pn2Var.b = on2VarO;
                pn2Var.c = attabalVar2;
                pn2Var.f = 3;
                if (attabalVar2.attabal(null, pn2Var) != objBeachfront) {
                    sn2Var2 = sn2Var;
                    on2Var = on2VarO;
                    attabalVar3 = attabalVar2;
                    sn2Var2.c = on2Var;
                    Unit unit2 = Unit.f29295attabal;
                    attabalVar3.wireman(null);
                    Intrinsics.beachfront(on2Var);
                    return on2Var;
                }
            }
            return objBeachfront;
        } catch (Throwable th2) {
            attabalVar.wireman(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(sn2 sn2Var, z11 z11Var, wretchedly.dern dernVar) {
        qn2 qn2Var;
        on2 on2Var;
        sn2 sn2Var2;
        formularization.attabal attabalVar;
        if (dernVar instanceof qn2) {
            qn2Var = (qn2) dernVar;
            int i = qn2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qn2Var.f = i - Integer.MIN_VALUE;
            } else {
                qn2Var = new qn2(sn2Var, dernVar);
            }
        } else {
            qn2Var = new qn2(sn2Var, dernVar);
        }
        Object objAttabal = qn2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = qn2Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objAttabal);
                competently competentlyVar = (competently) sn2Var.a.get();
                rn2 rn2Var = new rn2(z11Var, null);
                qn2Var.a = sn2Var;
                qn2Var.f = 1;
                objAttabal = competentlyVar.attabal(rn2Var, qn2Var);
                if (objAttabal == objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                sn2Var = qn2Var.a;
                p002kotlin.dern.saneness(objAttabal);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar = qn2Var.c;
                on2Var = qn2Var.b;
                sn2Var2 = qn2Var.a;
                p002kotlin.dern.saneness(objAttabal);
            }
            try {
                sn2Var2.c = on2Var;
                Unit unit = Unit.f29295attabal;
                return Unit.f29295attabal;
            } finally {
                attabalVar.wireman(null);
            }
            on2Var = (on2) objAttabal;
            formularization.attabal attabalVar2 = sn2Var.b;
            qn2Var.a = sn2Var;
            qn2Var.b = on2Var;
            qn2Var.c = attabalVar2;
            qn2Var.f = 2;
            if (attabalVar2.attabal(null, qn2Var) != objBeachfront) {
                sn2Var2 = sn2Var;
                attabalVar = attabalVar2;
                sn2Var2.c = on2Var;
                Unit unit2 = Unit.f29295attabal;
                return Unit.f29295attabal;
            }
            return objBeachfront;
        } catch (Throwable th) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Failed to update shared settings: " + th, null);
        }
    }
}
