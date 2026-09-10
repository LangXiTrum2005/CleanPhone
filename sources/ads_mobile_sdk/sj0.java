package ads_mobile_sdk;

import androidx.datastore.core.competently;
import com.google.gson.JsonObject;
import formularization.beachfront;
import java.util.Map;
import kotlinx.coroutines.flow.marial;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.delouse;

/* JADX INFO: loaded from: classes.dex */
public final class sj0 {
    public final delouse a;
    public final formularization.attabal b;
    public gj0 c;

    public sj0(delouse dataStore, amphitheatre clock) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = dataStore;
        this.b = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(sj0 sj0Var, wretchedly.dern dernVar) {
        ij0 ij0Var;
        formularization.attabal attabalVar;
        gj0 gj0VarQ;
        formularization.attabal attabalVar2;
        sj0 sj0Var2;
        gj0 gj0Var;
        formularization.attabal attabalVar3;
        if (dernVar instanceof ij0) {
            ij0Var = (ij0) dernVar;
            int i = ij0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ij0Var.f = i - Integer.MIN_VALUE;
            } else {
                ij0Var = new ij0(sj0Var, dernVar);
            }
        } else {
            ij0Var = new ij0(sj0Var, dernVar);
        }
        Object objGraveside = ij0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ij0Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objGraveside);
                attabalVar = sj0Var.b;
                ij0Var.a = sj0Var;
                ij0Var.b = attabalVar;
                ij0Var.f = 1;
                if (attabalVar.attabal(null, ij0Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                formularization.attabal attabalVar4 = (formularization.attabal) ij0Var.b;
                sj0 sj0Var3 = ij0Var.a;
                p002kotlin.dern.saneness(objGraveside);
                attabalVar = attabalVar4;
                sj0Var = sj0Var3;
            } else {
                if (i2 == 2) {
                    sj0Var = ij0Var.a;
                    p002kotlin.dern.saneness(objGraveside);
                    gj0VarQ = (gj0) objGraveside;
                    if (gj0VarQ == null) {
                        gj0VarQ = gj0.q();
                    }
                    attabalVar2 = sj0Var.b;
                    ij0Var.a = sj0Var;
                    ij0Var.b = gj0VarQ;
                    ij0Var.c = attabalVar2;
                    ij0Var.f = 3;
                    if (attabalVar2.attabal(null, ij0Var) != objBeachfront) {
                        sj0Var2 = sj0Var;
                        gj0Var = gj0VarQ;
                        attabalVar3 = attabalVar2;
                    }
                    return objBeachfront;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar3 = ij0Var.c;
                gj0Var = (gj0) ij0Var.b;
                sj0Var2 = ij0Var.a;
                p002kotlin.dern.saneness(objGraveside);
            }
            try {
                sj0Var2.c = gj0Var;
                Unit unit = Unit.f29295attabal;
                attabalVar3.wireman(null);
                Intrinsics.beachfront(gj0Var);
                return gj0Var;
            } catch (Throwable th) {
                attabalVar3.wireman(null);
                throw th;
            }
            gj0 gj0Var2 = sj0Var.c;
            attabalVar.wireman(null);
            if (gj0Var2 != null) {
                return gj0Var2;
            }
            kotlinx.coroutines.flow.dern data = ((competently) sj0Var.a.get()).getData();
            ij0Var.a = sj0Var;
            ij0Var.b = null;
            ij0Var.f = 2;
            objGraveside = marial.graveside(data, ij0Var);
            if (objGraveside != objBeachfront) {
                gj0VarQ = (gj0) objGraveside;
                if (gj0VarQ == null) {
                    gj0VarQ = gj0.q();
                }
                attabalVar2 = sj0Var.b;
                ij0Var.a = sj0Var;
                ij0Var.b = gj0VarQ;
                ij0Var.c = attabalVar2;
                ij0Var.f = 3;
                if (attabalVar2.attabal(null, ij0Var) != objBeachfront) {
                    sj0Var2 = sj0Var;
                    gj0Var = gj0VarQ;
                    attabalVar3 = attabalVar2;
                    sj0Var2.c = gj0Var;
                    Unit unit2 = Unit.f29295attabal;
                    attabalVar3.wireman(null);
                    Intrinsics.beachfront(gj0Var);
                    return gj0Var;
                }
            }
            return objBeachfront;
        } catch (Throwable th2) {
            attabalVar.wireman(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object b(sj0 sj0Var, wretchedly.dern dernVar) {
        jj0 jj0Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof jj0) {
            jj0Var = (jj0) dernVar;
            int i = jj0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jj0Var.e = i - Integer.MIN_VALUE;
            } else {
                jj0Var = new jj0(sj0Var, dernVar);
            }
        } else {
            jj0Var = new jj0(sj0Var, dernVar);
        }
        Object obj = jj0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = jj0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = sj0Var.b;
            jj0Var.a = sj0Var;
            jj0Var.b = attabalVar;
            jj0Var.e = 1;
            if (attabalVar.attabal(null, jj0Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = jj0Var.b;
            sj0 sj0Var2 = jj0Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            sj0Var = sj0Var2;
        }
        try {
            gj0 gj0Var = sj0Var.c;
            attabalVar.wireman(null);
            Map mapV = gj0Var != null ? gj0Var.v() : null;
            return mapV == null ? seminary.taiyuan() : mapV;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wretchedly.dern dernVar) {
        lj0 lj0Var;
        sj0 sj0Var;
        sj0 sj0Var2;
        formularization.attabal attabalVar;
        gj0 gj0Var;
        if (dernVar instanceof lj0) {
            lj0Var = (lj0) dernVar;
            int i = lj0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lj0Var.f = i - Integer.MIN_VALUE;
            } else {
                lj0Var = new lj0(this, dernVar);
            }
        } else {
            lj0Var = new lj0(this, dernVar);
        }
        Object objAttabal = lj0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = lj0Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objAttabal);
                competently competentlyVar = (competently) this.a.get();
                mj0 mj0Var = new mj0(null);
                lj0Var.a = this;
                lj0Var.f = 1;
                objAttabal = competentlyVar.attabal(mj0Var, lj0Var);
                if (objAttabal != objBeachfront) {
                    sj0Var = this;
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                sj0Var = lj0Var.a;
                p002kotlin.dern.saneness(objAttabal);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar = lj0Var.c;
                gj0Var = lj0Var.b;
                sj0Var2 = lj0Var.a;
                p002kotlin.dern.saneness(objAttabal);
            }
            try {
                sj0Var2.c = gj0Var;
                Unit unit = Unit.f29295attabal;
                return Unit.f29295attabal;
            } finally {
                attabalVar.wireman(null);
            }
            gj0 gj0Var2 = (gj0) objAttabal;
            formularization.attabal attabalVar2 = sj0Var.b;
            lj0Var.a = sj0Var;
            lj0Var.b = gj0Var2;
            lj0Var.c = attabalVar2;
            lj0Var.f = 2;
            if (attabalVar2.attabal(null, lj0Var) != objBeachfront) {
                sj0Var2 = sj0Var;
                attabalVar = attabalVar2;
                gj0Var = gj0Var2;
                sj0Var2.c = gj0Var;
                Unit unit2 = Unit.f29295attabal;
                return Unit.f29295attabal;
            }
            return objBeachfront;
        } catch (Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            w03 w03VarA = j13.a();
            w03VarA.e().m = false;
            w03VarA.a(exception);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(sj0 sj0Var, String str, String str2, wretchedly.dern dernVar) {
        oj0 oj0Var;
        gj0 gj0Var;
        sj0 sj0Var2;
        formularization.attabal attabalVar;
        if (dernVar instanceof oj0) {
            oj0Var = (oj0) dernVar;
            int i = oj0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                oj0Var.f = i - Integer.MIN_VALUE;
            } else {
                oj0Var = new oj0(sj0Var, dernVar);
            }
        } else {
            oj0Var = new oj0(sj0Var, dernVar);
        }
        Object objAttabal = oj0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = oj0Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objAttabal);
                competently competentlyVar = (competently) sj0Var.a.get();
                pj0 pj0Var = new pj0(str2, str, null);
                oj0Var.a = sj0Var;
                oj0Var.f = 1;
                objAttabal = competentlyVar.attabal(pj0Var, oj0Var);
                if (objAttabal == objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                sj0Var = oj0Var.a;
                p002kotlin.dern.saneness(objAttabal);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar = oj0Var.c;
                gj0Var = oj0Var.b;
                sj0Var2 = oj0Var.a;
                p002kotlin.dern.saneness(objAttabal);
            }
            try {
                sj0Var2.c = gj0Var;
                Unit unit = Unit.f29295attabal;
                return Unit.f29295attabal;
            } finally {
                attabalVar.wireman(null);
            }
            gj0Var = (gj0) objAttabal;
            formularization.attabal attabalVar2 = sj0Var.b;
            oj0Var.a = sj0Var;
            oj0Var.b = gj0Var;
            oj0Var.c = attabalVar2;
            oj0Var.f = 2;
            if (attabalVar2.attabal(null, oj0Var) != objBeachfront) {
                sj0Var2 = sj0Var;
                attabalVar = attabalVar2;
                sj0Var2.c = gj0Var;
                Unit unit2 = Unit.f29295attabal;
                return Unit.f29295attabal;
            }
            return objBeachfront;
        } catch (Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            w03 w03VarA = j13.a();
            w03VarA.e().m = false;
            w03VarA.a(exception);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(sj0 sj0Var, mv mvVar, JsonObject jsonObject, boolean z, wretchedly.dern dernVar) {
        qj0 qj0Var;
        gj0 gj0Var;
        sj0 sj0Var2;
        formularization.attabal attabalVar;
        if (dernVar instanceof qj0) {
            qj0Var = (qj0) dernVar;
            int i = qj0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qj0Var.f = i - Integer.MIN_VALUE;
            } else {
                qj0Var = new qj0(sj0Var, dernVar);
            }
        } else {
            qj0Var = new qj0(sj0Var, dernVar);
        }
        Object objAttabal = qj0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = qj0Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objAttabal);
                competently competentlyVar = (competently) sj0Var.a.get();
                rj0 rj0Var = new rj0(mvVar, jsonObject, null, z);
                qj0Var.a = sj0Var;
                qj0Var.f = 1;
                objAttabal = competentlyVar.attabal(rj0Var, qj0Var);
                if (objAttabal == objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                sj0Var = qj0Var.a;
                p002kotlin.dern.saneness(objAttabal);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar = qj0Var.c;
                gj0Var = qj0Var.b;
                sj0Var2 = qj0Var.a;
                p002kotlin.dern.saneness(objAttabal);
            }
            try {
                sj0Var2.c = gj0Var;
                Unit unit = Unit.f29295attabal;
                return Unit.f29295attabal;
            } finally {
                attabalVar.wireman(null);
            }
            gj0Var = (gj0) objAttabal;
            formularization.attabal attabalVar2 = sj0Var.b;
            qj0Var.a = sj0Var;
            qj0Var.b = gj0Var;
            qj0Var.c = attabalVar2;
            qj0Var.f = 2;
            if (attabalVar2.attabal(null, qj0Var) != objBeachfront) {
                sj0Var2 = sj0Var;
                attabalVar = attabalVar2;
                sj0Var2.c = gj0Var;
                Unit unit2 = Unit.f29295attabal;
                return Unit.f29295attabal;
            }
            return objBeachfront;
        } catch (Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            w03 w03VarA = j13.a();
            w03VarA.e().m = false;
            w03VarA.a(exception);
        }
    }
}
