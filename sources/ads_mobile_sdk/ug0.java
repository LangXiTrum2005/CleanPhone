package ads_mobile_sdk;

import android.content.Context;
import com.ironsource.X3;
import com.unity3d.services.core.fid.Constants;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class ug0 extends Lambda implements Function0 {
    public final /* synthetic */ wg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug0(wg0 wg0Var) {
        super(0);
        this.a = wg0Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objInvoke;
        wg0 wg0Var = this.a;
        ri2 ri2Var = wg0Var.c;
        no0 no0Var = no0.CUI_NAME_INIT_FIREBASE_ANALYTICS;
        List listFormularize = adultoid.formularize();
        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                try {
                    jk0 jk0Var = wg0Var.d;
                    jk0Var.getClass();
                    Intrinsics.checkNotNullParameter("gads:firebase_analytics_integration:enabled", X3.i.W);
                    if (!((Boolean) jk0Var.a("gads:firebase_analytics_integration:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                        interaction.saneness.attabal(v62VarA, null);
                        return null;
                    }
                    objInvoke = Class.forName(wg0Var.d.C()).getMethod(Constants.GET_INSTANCE, Context.class).invoke(null, wg0Var.a);
                    if (objInvoke instanceof nn0) {
                        y13.a((nn0) objInvoke, false);
                    }
                    interaction.saneness.attabal(v62VarA, null);
                } catch (Exception e) {
                    y13.a("Exception while getting Firebase Analytics SDK instance", e, 4);
                    objInvoke = null;
                }
            } catch (Throwable th) {
                try {
                    v62VarA.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    v62VarA.a(th);
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
                        interaction.saneness.attabal(v62VarA, th2);
                        throw th3;
                    }
                }
            }
        } else {
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                try {
                    jk0 jk0Var2 = wg0Var.d;
                    jk0Var2.getClass();
                    Intrinsics.checkNotNullParameter("gads:firebase_analytics_integration:enabled", X3.i.W);
                    if (!((Boolean) jk0Var2.a("gads:firebase_analytics_integration:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                        interaction.saneness.attabal(w03VarA, null);
                        return null;
                    }
                    objInvoke = Class.forName(wg0Var.d.C()).getMethod(Constants.GET_INSTANCE, Context.class).invoke(null, wg0Var.a);
                    if (objInvoke instanceof nn0) {
                        y13.a((nn0) objInvoke, false);
                    }
                    interaction.saneness.attabal(w03VarA, null);
                } catch (Exception e2) {
                    y13.a("Exception while getting Firebase Analytics SDK instance", e2, 4);
                    objInvoke = null;
                }
            } catch (Throwable th4) {
                try {
                    w03VarA.b(th4);
                    if (th4 instanceof evenfall) {
                        throw th4;
                    }
                    w03VarA.a(th4);
                    if (th4 instanceof TimeoutCancellationException) {
                        throw new cp0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new bn0(th4);
                    }
                    if (th4 instanceof yn0) {
                        throw th4;
                    }
                    throw new gn0(th4);
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        interaction.saneness.attabal(w03VarA, th5);
                        throw th6;
                    }
                }
            }
        }
        return objInvoke;
    }
}
