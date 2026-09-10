package ads_mobile_sdk;

import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.portwide;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public abstract class hv2 extends ox0 implements portwide {
    public spartacist c;

    public /* synthetic */ hv2() {
        this(null);
    }

    @Override // saneness.portwide
    public final Object a(wretchedly.dern dernVar) {
        no0 no0Var = no0.CUI_NAME_SIGNAL;
        WeakHashMap weakHashMap = j13.a;
        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
        try {
            j13.a().e().t = new wq2(a(), mo0.CACHED, 4);
            spartacist spartacistVar = this.c;
            if (spartacistVar == null) {
                Intrinsics.preprohormone("result");
                spartacistVar = null;
            }
            if (spartacistVar instanceof nn0) {
                y13.a((nn0) spartacistVar, false);
            }
            interaction.saneness.attabal(w03VarA, null);
            return spartacistVar;
        } catch (Throwable th) {
            try {
                w03VarA.b(th);
                if (th instanceof evenfall) {
                    throw th;
                }
                w03VarA.a(th);
                if (th instanceof TimeoutCancellationException) {
                    throw new cp0(th);
                }
                if (th instanceof CancellationException) {
                    throw new bn0(th);
                }
                if (th instanceof yn0) {
                    throw th;
                }
                throw new gn0(th);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    interaction.saneness.attabal(w03VarA, th2);
                    throw th3;
                }
            }
        }
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    public hv2(no0 no0Var) {
        super(no0Var, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(hv2 hv2Var, wretchedly.dern dernVar) {
        gv2 gv2Var;
        if (dernVar instanceof gv2) {
            gv2Var = (gv2) dernVar;
            int i = gv2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gv2Var.d = i - Integer.MIN_VALUE;
            } else {
                gv2Var = new gv2(hv2Var, dernVar);
            }
        } else {
            gv2Var = new gv2(hv2Var, dernVar);
        }
        Object objC = gv2Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = gv2Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objC);
            gv2Var.a = hv2Var;
            gv2Var.d = 1;
            objC = hv2Var.c(gv2Var);
            if (objC == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hv2Var = gv2Var.a;
            p002kotlin.dern.saneness(objC);
        }
        hv2Var.c = (spartacist) objC;
        return new tn0(Unit.f29295attabal);
    }
}
