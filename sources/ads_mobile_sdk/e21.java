package ads_mobile_sdk;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class e21 extends SuspendLambda implements Function2 {
    public final /* synthetic */ f21 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e21(f21 f21Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = f21Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new e21(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new e21(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        f21 f21Var = this.a;
        ri2 ri2Var = f21Var.g;
        no0 no0Var = no0.CUI_NAME_INSTALL_REFERRER_TASK;
        List listFormularize = adultoid.formularize();
        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                f21Var.h.a(new d21(f21Var));
                Unit unit = Unit.f29295attabal;
                interaction.saneness.attabal(v62VarA, null);
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
                f21Var.h.a(new d21(f21Var));
                Unit unit2 = Unit.f29295attabal;
                interaction.saneness.attabal(w03VarA, null);
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
        return Unit.f29295attabal;
    }
}
