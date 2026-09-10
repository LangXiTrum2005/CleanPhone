package ads_mobile_sdk;

import androidx.datastore.core.competently;
import formularization.beachfront;
import kotlinx.coroutines.flow.marial;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.delouse;

/* JADX INFO: loaded from: classes.dex */
public final class gl1 extends ox0 {
    public final delouse c;
    public final formularization.attabal d;
    public xk1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl1(delouse dataStore) {
        super(no0.CUI_NAME_SDKINIT_INIT_NATIVE_AD_SETTINGS, false);
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.c = dataStore;
        this.d = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, wretchedly.dern dernVar) {
        al1 al1Var;
        if (dernVar instanceof al1) {
            al1Var = (al1) dernVar;
            int i = al1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                al1Var.d = i - Integer.MIN_VALUE;
            } else {
                al1Var = new al1(this, dernVar);
            }
        } else {
            al1Var = new al1(this, dernVar);
        }
        Object objG = al1Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = al1Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objG);
            al1Var.a = str;
            al1Var.d = 1;
            objG = g(al1Var);
            if (objG == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = al1Var.a;
            p002kotlin.dern.saneness(objG);
        }
        return ((xk1) objG).o().get(str);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0080 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:28:0x007c, B:30:0x0080, B:31:0x0089), top: B:38:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) throws Throwable {
        bl1 bl1Var;
        formularization.attabal attabalVar;
        gl1 gl1Var;
        formularization.attabal attabalVar2;
        gl1 gl1Var2;
        xk1 xk1VarQ;
        if (dernVar instanceof bl1) {
            bl1Var = (bl1) dernVar;
            int i = bl1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bl1Var.e = i - Integer.MIN_VALUE;
            } else {
                bl1Var = new bl1(this, dernVar);
            }
        } else {
            bl1Var = new bl1(this, dernVar);
        }
        Object obj = bl1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = bl1Var.e;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = this.d;
                bl1Var.a = this;
                bl1Var.b = attabalVar;
                bl1Var.e = 1;
                if (attabalVar.attabal(null, bl1Var) != objBeachfront) {
                    gl1Var = this;
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gl1Var2 = (gl1) bl1Var.b;
                attabalVar2 = (formularization.attabal) bl1Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    xk1VarQ = (xk1) obj;
                    if (xk1VarQ == null) {
                        xk1VarQ = xk1.q();
                        Intrinsics.checkNotNullExpressionValue(xk1VarQ, "getDefaultInstance(...)");
                    }
                    gl1Var2.e = xk1VarQ;
                    Unit unit = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    return new tn0(unit);
                } catch (Throwable th) {
                    formularization.attabal attabalVar3 = attabalVar2;
                    th = th;
                    attabalVar = attabalVar3;
                    attabalVar.wireman(null);
                    throw th;
                }
            }
            formularization.attabal attabalVar4 = (formularization.attabal) bl1Var.b;
            gl1Var = (gl1) bl1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar4;
            kotlinx.coroutines.flow.dern data = ((competently) gl1Var.c.get()).getData();
            bl1Var.a = attabalVar;
            bl1Var.b = gl1Var;
            bl1Var.e = 2;
            Object objGraveside = marial.graveside(data, bl1Var);
            if (objGraveside != objBeachfront) {
                attabalVar2 = attabalVar;
                obj = objGraveside;
                gl1Var2 = gl1Var;
                xk1VarQ = (xk1) obj;
                if (xk1VarQ == null) {
                    xk1VarQ = xk1.q();
                    Intrinsics.checkNotNullExpressionValue(xk1VarQ, "getDefaultInstance(...)");
                }
                gl1Var2.e = xk1VarQ;
                Unit unit2 = Unit.f29295attabal;
                attabalVar2.wireman(null);
                return new tn0(unit2);
            }
            return objBeachfront;
        } catch (Throwable th2) {
            th = th2;
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(wretchedly.dern dernVar) {
        yk1 yk1Var;
        if (dernVar instanceof yk1) {
            yk1Var = (yk1) dernVar;
            int i = yk1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yk1Var.c = i - Integer.MIN_VALUE;
            } else {
                yk1Var = new yk1(this, dernVar);
            }
        } else {
            yk1Var = new yk1(this, dernVar);
        }
        Object objG = yk1Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = yk1Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objG);
            yk1Var.c = 1;
            objG = g(yk1Var);
            if (objG == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objG);
        }
        return igo.attabal.marial(((xk1) objG).p());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(wretchedly.dern dernVar) {
        zk1 zk1Var;
        gl1 gl1Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof zk1) {
            zk1Var = (zk1) dernVar;
            int i = zk1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                zk1Var.e = i - Integer.MIN_VALUE;
            } else {
                zk1Var = new zk1(this, dernVar);
            }
        } else {
            zk1Var = new zk1(this, dernVar);
        }
        Object obj = zk1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = zk1Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.d;
            zk1Var.a = this;
            zk1Var.b = attabalVar2;
            zk1Var.e = 1;
            if (attabalVar2.attabal(null, zk1Var) == objBeachfront) {
                return objBeachfront;
            }
            gl1Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = zk1Var.b;
            gl1Var = zk1Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            xk1 xk1Var = gl1Var.e;
            if (xk1Var == null) {
                Intrinsics.preprohormone("nativeAdSettings");
                xk1Var = null;
            }
            return xk1Var;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, wretchedly.dern dernVar, boolean z) {
        el1 el1Var;
        gl1 gl1Var;
        xk1 xk1Var;
        gl1 gl1Var2;
        formularization.attabal attabalVar;
        if (dernVar instanceof el1) {
            el1Var = (el1) dernVar;
            int i = el1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                el1Var.f = i - Integer.MIN_VALUE;
            } else {
                el1Var = new el1(this, dernVar);
            }
        } else {
            el1Var = new el1(this, dernVar);
        }
        Object objAttabal = el1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = el1Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objAttabal);
            competently competentlyVar = (competently) this.c.get();
            fl1 fl1Var = new fl1(str, null, z);
            el1Var.a = this;
            el1Var.f = 1;
            objAttabal = competentlyVar.attabal(fl1Var, el1Var);
            if (objAttabal != objBeachfront) {
                gl1Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            gl1Var = el1Var.a;
            p002kotlin.dern.saneness(objAttabal);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = el1Var.c;
            xk1Var = el1Var.b;
            gl1Var2 = el1Var.a;
            p002kotlin.dern.saneness(objAttabal);
        }
        try {
            gl1Var2.e = xk1Var;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
        xk1Var = (xk1) objAttabal;
        formularization.attabal attabalVar2 = gl1Var.d;
        el1Var.a = gl1Var;
        el1Var.b = xk1Var;
        el1Var.c = attabalVar2;
        el1Var.f = 2;
        if (attabalVar2.attabal(null, el1Var) != objBeachfront) {
            gl1Var2 = gl1Var;
            attabalVar = attabalVar2;
            gl1Var2.e = xk1Var;
            return Unit.f29295attabal;
        }
        return objBeachfront;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, wretchedly.dern dernVar) {
        cl1 cl1Var;
        gl1 gl1Var;
        xk1 xk1Var;
        gl1 gl1Var2;
        formularization.attabal attabalVar;
        if (dernVar instanceof cl1) {
            cl1Var = (cl1) dernVar;
            int i = cl1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cl1Var.f = i - Integer.MIN_VALUE;
            } else {
                cl1Var = new cl1(this, dernVar);
            }
        } else {
            cl1Var = new cl1(this, dernVar);
        }
        Object objAttabal = cl1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = cl1Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objAttabal);
            competently competentlyVar = (competently) this.c.get();
            dl1 dl1Var = new dl1(j, null);
            cl1Var.a = this;
            cl1Var.f = 1;
            objAttabal = competentlyVar.attabal(dl1Var, cl1Var);
            if (objAttabal != objBeachfront) {
                gl1Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            gl1Var = cl1Var.a;
            p002kotlin.dern.saneness(objAttabal);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = cl1Var.c;
            xk1Var = cl1Var.b;
            gl1Var2 = cl1Var.a;
            p002kotlin.dern.saneness(objAttabal);
        }
        try {
            gl1Var2.e = xk1Var;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
        xk1Var = (xk1) objAttabal;
        formularization.attabal attabalVar2 = gl1Var.d;
        cl1Var.a = gl1Var;
        cl1Var.b = xk1Var;
        cl1Var.c = attabalVar2;
        cl1Var.f = 2;
        if (attabalVar2.attabal(null, cl1Var) != objBeachfront) {
            gl1Var2 = gl1Var;
            attabalVar = attabalVar2;
            gl1Var2.e = xk1Var;
            return Unit.f29295attabal;
        }
        return objBeachfront;
    }
}
