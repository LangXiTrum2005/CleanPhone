package ads_mobile_sdk;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kurbash.formularize;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class aa2 extends SuspendLambda implements Function2 {
    public w03 a;
    public w03 b;
    public int c;
    public final /* synthetic */ na2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa2(na2 na2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = na2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new aa2(this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new aa2(this.d, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007b A[Catch: all -> 0x008b, TryCatch #5 {all -> 0x008b, blocks: (B:30:0x0074, B:32:0x007b, B:34:0x0082, B:36:0x0086, B:38:0x008a, B:41:0x008d, B:42:0x0092, B:43:0x0093, B:44:0x009a, B:45:0x009b, B:46:0x00a2, B:47:0x00a3), top: B:93:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: all -> 0x008b, TryCatch #5 {all -> 0x008b, blocks: (B:30:0x0074, B:32:0x007b, B:34:0x0082, B:36:0x0086, B:38:0x008a, B:41:0x008d, B:42:0x0092, B:43:0x0093, B:44:0x009a, B:45:0x009b, B:46:0x00a2, B:47:0x00a3), top: B:93:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0086 A[Catch: all -> 0x008b, TryCatch #5 {all -> 0x008b, blocks: (B:30:0x0074, B:32:0x007b, B:34:0x0082, B:36:0x0086, B:38:0x008a, B:41:0x008d, B:42:0x0092, B:43:0x0093, B:44:0x009a, B:45:0x009b, B:46:0x00a2, B:47:0x00a3), top: B:93:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008a A[Catch: all -> 0x008b, TryCatch #5 {all -> 0x008b, blocks: (B:30:0x0074, B:32:0x007b, B:34:0x0082, B:36:0x0086, B:38:0x008a, B:41:0x008d, B:42:0x0092, B:43:0x0093, B:44:0x009a, B:45:0x009b, B:46:0x00a2, B:47:0x00a3), top: B:93:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d A[Catch: all -> 0x008b, TryCatch #5 {all -> 0x008b, blocks: (B:30:0x0074, B:32:0x007b, B:34:0x0082, B:36:0x0086, B:38:0x008a, B:41:0x008d, B:42:0x0092, B:43:0x0093, B:44:0x009a, B:45:0x009b, B:46:0x00a2, B:47:0x00a3), top: B:93:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[Catch: all -> 0x008b, TryCatch #5 {all -> 0x008b, blocks: (B:30:0x0074, B:32:0x007b, B:34:0x0082, B:36:0x0086, B:38:0x008a, B:41:0x008d, B:42:0x0092, B:43:0x0093, B:44:0x009a, B:45:0x009b, B:46:0x00a2, B:47:0x00a3), top: B:93:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x009b A[Catch: all -> 0x008b, TryCatch #5 {all -> 0x008b, blocks: (B:30:0x0074, B:32:0x007b, B:34:0x0082, B:36:0x0086, B:38:0x008a, B:41:0x008d, B:42:0x0092, B:43:0x0093, B:44:0x009a, B:45:0x009b, B:46:0x00a2, B:47:0x00a3), top: B:93:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3 A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #5 {all -> 0x008b, blocks: (B:30:0x0074, B:32:0x007b, B:34:0x0082, B:36:0x0086, B:38:0x008a, B:41:0x008d, B:42:0x0092, B:43:0x0093, B:44:0x009a, B:45:0x009b, B:46:0x00a2, B:47:0x00a3), top: B:93:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3 A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:62:0x00cc, B:64:0x00d3, B:66:0x00da, B:68:0x00de, B:70:0x00e2, B:73:0x00e5, B:74:0x00ea, B:75:0x00eb, B:76:0x00f2, B:77:0x00f3, B:78:0x00fa, B:79:0x00fb), top: B:86:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00da A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:62:0x00cc, B:64:0x00d3, B:66:0x00da, B:68:0x00de, B:70:0x00e2, B:73:0x00e5, B:74:0x00ea, B:75:0x00eb, B:76:0x00f2, B:77:0x00f3, B:78:0x00fa, B:79:0x00fb), top: B:86:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00de A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:62:0x00cc, B:64:0x00d3, B:66:0x00da, B:68:0x00de, B:70:0x00e2, B:73:0x00e5, B:74:0x00ea, B:75:0x00eb, B:76:0x00f2, B:77:0x00f3, B:78:0x00fa, B:79:0x00fb), top: B:86:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2 A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:62:0x00cc, B:64:0x00d3, B:66:0x00da, B:68:0x00de, B:70:0x00e2, B:73:0x00e5, B:74:0x00ea, B:75:0x00eb, B:76:0x00f2, B:77:0x00f3, B:78:0x00fa, B:79:0x00fb), top: B:86:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5 A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:62:0x00cc, B:64:0x00d3, B:66:0x00da, B:68:0x00de, B:70:0x00e2, B:73:0x00e5, B:74:0x00ea, B:75:0x00eb, B:76:0x00f2, B:77:0x00f3, B:78:0x00fa, B:79:0x00fb), top: B:86:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00eb A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:62:0x00cc, B:64:0x00d3, B:66:0x00da, B:68:0x00de, B:70:0x00e2, B:73:0x00e5, B:74:0x00ea, B:75:0x00eb, B:76:0x00f2, B:77:0x00f3, B:78:0x00fa, B:79:0x00fb), top: B:86:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3 A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:62:0x00cc, B:64:0x00d3, B:66:0x00da, B:68:0x00de, B:70:0x00e2, B:73:0x00e5, B:74:0x00ea, B:75:0x00eb, B:76:0x00f2, B:77:0x00f3, B:78:0x00fa, B:79:0x00fb), top: B:86:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb A[Catch: all -> 0x00e3, TRY_LEAVE, TryCatch #1 {all -> 0x00e3, blocks: (B:62:0x00cc, B:64:0x00d3, B:66:0x00da, B:68:0x00de, B:70:0x00e2, B:73:0x00e5, B:74:0x00ea, B:75:0x00eb, B:76:0x00f2, B:77:0x00f3, B:78:0x00fa, B:79:0x00fb), top: B:86:0x00cc }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w03 w03Var;
        TimeoutCancellationException th;
        w03 w03Var2;
        w03 w03Var3;
        TimeoutCancellationException th2;
        w03 w03Var4;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                w03Var4 = this.b;
                w03Var3 = this.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    Pair pair = (Pair) obj;
                    interaction.saneness.attabal(w03Var4, null);
                    return pair;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        w03Var3.b(th2);
                        if (!(th2 instanceof evenfall)) {
                            throw th2;
                        }
                        w03Var3.a(th2);
                        if (!(th2 instanceof TimeoutCancellationException)) {
                            throw new cp0(th2);
                        }
                        if (!(th2 instanceof CancellationException)) {
                            throw new bn0(th2);
                        }
                        if (th2 instanceof yn0) {
                            throw th2;
                        }
                        throw new gn0(th2);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            interaction.saneness.attabal(w03Var4, th4);
                            throw th5;
                        }
                    }
                }
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var2 = this.b;
            w03Var = this.a;
            try {
                p002kotlin.dern.saneness(obj);
                Pair pair2 = (Pair) obj;
                interaction.saneness.attabal(w03Var2, null);
                return pair2;
            } catch (Throwable th6) {
                th = th6;
                try {
                    w03Var.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        interaction.saneness.attabal(w03Var2, th7);
                        throw th8;
                    }
                }
            }
        }
        p002kotlin.dern.saneness(obj);
        na2 na2Var = this.d;
        formularize[] formularizeVarArr = na2.y;
        ri2 ri2Var = na2Var.e;
        no0 no0Var = no0.CUI_NAME_ADREQUEST;
        String string = na2Var.g.toString();
        q13[] q13VarArr = q13.a;
        List listKowloon = adultoid.kowloon(string, "BANNER_AD_REFRESH");
        na2 na2Var2 = this.d;
        l13 l13Var = na2Var2.c;
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listKowloon, l13Var);
            try {
                this.a = v62VarA;
                this.b = v62VarA;
                this.c = 1;
                Object objA = na2.a(na2Var2, (wretchedly.dern) this);
                if (objA != objBeachfront) {
                    w03Var4 = v62VarA;
                    obj = objA;
                    w03Var3 = w03Var4;
                    Pair pair3 = (Pair) obj;
                    interaction.saneness.attabal(w03Var4, null);
                    return pair3;
                }
            } catch (Throwable th9) {
                w03Var3 = v62VarA;
                th2 = th9;
                w03Var4 = w03Var3;
                w03Var3.b(th2);
                if (!(th2 instanceof evenfall)) {
                    throw th2;
                }
                w03Var3.a(th2);
                if (!(th2 instanceof TimeoutCancellationException)) {
                    throw new cp0(th2);
                }
                if (!(th2 instanceof CancellationException)) {
                    throw new bn0(th2);
                }
                if (th2 instanceof yn0) {
                    throw th2;
                }
                throw new gn0(th2);
            }
        } else {
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                this.a = w03VarA;
                this.b = w03VarA;
                this.c = 2;
                Object objA2 = na2.a(na2Var2, (wretchedly.dern) this);
                if (objA2 != objBeachfront) {
                    w03Var2 = w03VarA;
                    obj = objA2;
                    w03Var = w03Var2;
                    Pair pair4 = (Pair) obj;
                    interaction.saneness.attabal(w03Var2, null);
                    return pair4;
                }
            } catch (Throwable th10) {
                w03Var = w03VarA;
                th = th10;
                w03Var2 = w03Var;
                w03Var.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                w03Var.a(th);
                if (!(th instanceof TimeoutCancellationException)) {
                    throw new cp0(th);
                }
                if (!(th instanceof CancellationException)) {
                    throw new bn0(th);
                }
                if (th instanceof yn0) {
                    throw th;
                }
                throw new gn0(th);
            }
        }
        return objBeachfront;
    }
}
