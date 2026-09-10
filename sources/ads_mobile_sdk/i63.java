package ads_mobile_sdk;

import android.webkit.WebSettings;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class i63 extends SuspendLambda implements Function1 {
    public final /* synthetic */ k63 a;
    public final /* synthetic */ saran b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i63(k63 k63Var, saran saranVar, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.a = k63Var;
        this.b = saranVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new i63(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new i63(this.a, this.b, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String defaultUserAgent;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        try {
            ri2 ri2Var = this.a.f;
            if (ri2Var == null) {
                Intrinsics.preprohormone("rootTraceCreator");
                ri2Var = null;
            }
            no0 no0Var = no0.CUI_NAME_WEBVIEW_USER_AGENT;
            k63 k63Var = this.a;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    defaultUserAgent = WebSettings.getDefaultUserAgent(k63Var.a);
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
                    defaultUserAgent = WebSettings.getDefaultUserAgent(k63Var.a);
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
            this.a.i.dern();
            saran saranVar = this.b;
            h63 block = new h63(this.a, defaultUserAgent, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            return defaultUserAgent;
        } catch (Throwable th7) {
            this.a.i.dern();
            throw th7;
        }
    }
}
