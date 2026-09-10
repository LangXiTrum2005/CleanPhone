package ads_mobile_sdk;

import androidx.datastore.core.competently;
import formularization.beachfront;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.preprohormone;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.delouse;

/* JADX INFO: loaded from: classes.dex */
public final class ll2 {
    public final saran a;
    public final delouse b;
    public final amphitheatre c;
    public final formularization.attabal d;
    public walach e;

    public ll2(saran backgroundScope, delouse dataStore, amphitheatre clock) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = backgroundScope;
        this.b = dataStore;
        this.c = clock;
        this.d = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(ll2 ll2Var, wretchedly.dern dernVar) {
        hl2 hl2Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof hl2) {
            hl2Var = (hl2) dernVar;
            int i = hl2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hl2Var.e = i - Integer.MIN_VALUE;
            } else {
                hl2Var = new hl2(ll2Var, dernVar);
            }
        } else {
            hl2Var = new hl2(ll2Var, dernVar);
        }
        Object obj = hl2Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = hl2Var.e;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = ll2Var.d;
                hl2Var.a = ll2Var;
                hl2Var.b = attabalVar;
                hl2Var.e = 1;
                if (attabalVar.attabal(null, hl2Var) != objBeachfront) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
                return obj;
            }
            formularization.attabal attabalVar2 = hl2Var.b;
            ll2 ll2Var2 = hl2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            ll2Var = ll2Var2;
            walach walachVarSaneness = ll2Var.e;
            if (walachVarSaneness == null) {
                walachVarSaneness = cutely.saneness(ll2Var.a, null, null, new il2(ll2Var, null), 3, null);
                ll2Var.e = walachVarSaneness;
            }
            attabalVar.wireman(null);
            hl2Var.a = null;
            hl2Var.b = null;
            hl2Var.e = 2;
            Object objDent = walachVarSaneness.dent(hl2Var);
            return objDent == objBeachfront ? objBeachfront : objDent;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(ll2 ll2Var, String str, wretchedly.dern dernVar) {
        jl2 jl2Var;
        fl2 fl2Var;
        ll2 ll2Var2;
        formularization.attabal attabalVar;
        if (dernVar instanceof jl2) {
            jl2Var = (jl2) dernVar;
            int i = jl2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jl2Var.f = i - Integer.MIN_VALUE;
            } else {
                jl2Var = new jl2(ll2Var, dernVar);
            }
        } else {
            jl2Var = new jl2(ll2Var, dernVar);
        }
        Object objAttabal = jl2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = jl2Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objAttabal);
                competently competentlyVar = (competently) ll2Var.b.get();
                kl2 kl2Var = new kl2(ll2Var, str, null);
                jl2Var.a = ll2Var;
                jl2Var.f = 1;
                objAttabal = competentlyVar.attabal(kl2Var, jl2Var);
                if (objAttabal == objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                ll2Var = jl2Var.a;
                p002kotlin.dern.saneness(objAttabal);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar = jl2Var.c;
                fl2Var = jl2Var.b;
                ll2Var2 = jl2Var.a;
                p002kotlin.dern.saneness(objAttabal);
            }
            try {
                ll2Var2.e = preprohormone.attabal(fl2Var);
                Unit unit = Unit.f29295attabal;
                return Unit.f29295attabal;
            } finally {
                attabalVar.wireman(null);
            }
            fl2Var = (fl2) objAttabal;
            formularization.attabal attabalVar2 = ll2Var.d;
            jl2Var.a = ll2Var;
            jl2Var.b = fl2Var;
            jl2Var.c = attabalVar2;
            jl2Var.f = 2;
            if (attabalVar2.attabal(null, jl2Var) != objBeachfront) {
                ll2Var2 = ll2Var;
                attabalVar = attabalVar2;
                ll2Var2.e = preprohormone.attabal(fl2Var);
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
