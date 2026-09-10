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
public final class r83 extends SuspendLambda implements Function2 {
    public w03 a;
    public w03 b;
    public int c;
    public final /* synthetic */ v83 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r83(v83 v83Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = v83Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new r83(this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new r83(this.d, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:33:0x0078, B:35:0x007f, B:37:0x0086, B:39:0x008a, B:41:0x008e, B:44:0x0091, B:45:0x0096, B:46:0x0097, B:47:0x009e, B:48:0x009f, B:49:0x00a6, B:50:0x00a7), top: B:104:0x0078, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0086 A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:33:0x0078, B:35:0x007f, B:37:0x0086, B:39:0x008a, B:41:0x008e, B:44:0x0091, B:45:0x0096, B:46:0x0097, B:47:0x009e, B:48:0x009f, B:49:0x00a6, B:50:0x00a7), top: B:104:0x0078, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:33:0x0078, B:35:0x007f, B:37:0x0086, B:39:0x008a, B:41:0x008e, B:44:0x0091, B:45:0x0096, B:46:0x0097, B:47:0x009e, B:48:0x009f, B:49:0x00a6, B:50:0x00a7), top: B:104:0x0078, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008e A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:33:0x0078, B:35:0x007f, B:37:0x0086, B:39:0x008a, B:41:0x008e, B:44:0x0091, B:45:0x0096, B:46:0x0097, B:47:0x009e, B:48:0x009f, B:49:0x00a6, B:50:0x00a7), top: B:104:0x0078, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0091 A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:33:0x0078, B:35:0x007f, B:37:0x0086, B:39:0x008a, B:41:0x008e, B:44:0x0091, B:45:0x0096, B:46:0x0097, B:47:0x009e, B:48:0x009f, B:49:0x00a6, B:50:0x00a7), top: B:104:0x0078, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0097 A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:33:0x0078, B:35:0x007f, B:37:0x0086, B:39:0x008a, B:41:0x008e, B:44:0x0091, B:45:0x0096, B:46:0x0097, B:47:0x009e, B:48:0x009f, B:49:0x00a6, B:50:0x00a7), top: B:104:0x0078, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:33:0x0078, B:35:0x007f, B:37:0x0086, B:39:0x008a, B:41:0x008e, B:44:0x0091, B:45:0x0096, B:46:0x0097, B:47:0x009e, B:48:0x009f, B:49:0x00a6, B:50:0x00a7), top: B:104:0x0078, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #8 {all -> 0x008f, blocks: (B:33:0x0078, B:35:0x007f, B:37:0x0086, B:39:0x008a, B:41:0x008e, B:44:0x0091, B:45:0x0096, B:46:0x0097, B:47:0x009e, B:48:0x009f, B:49:0x00a6, B:50:0x00a7), top: B:104:0x0078, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc A[Catch: all -> 0x00ec, TryCatch #7 {all -> 0x00ec, blocks: (B:66:0x00d5, B:68:0x00dc, B:70:0x00e3, B:72:0x00e7, B:74:0x00eb, B:77:0x00ee, B:78:0x00f3, B:79:0x00f4, B:80:0x00fb, B:81:0x00fc, B:82:0x0103, B:83:0x0104), top: B:103:0x00d5, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3 A[Catch: all -> 0x00ec, TryCatch #7 {all -> 0x00ec, blocks: (B:66:0x00d5, B:68:0x00dc, B:70:0x00e3, B:72:0x00e7, B:74:0x00eb, B:77:0x00ee, B:78:0x00f3, B:79:0x00f4, B:80:0x00fb, B:81:0x00fc, B:82:0x0103, B:83:0x0104), top: B:103:0x00d5, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7 A[Catch: all -> 0x00ec, TryCatch #7 {all -> 0x00ec, blocks: (B:66:0x00d5, B:68:0x00dc, B:70:0x00e3, B:72:0x00e7, B:74:0x00eb, B:77:0x00ee, B:78:0x00f3, B:79:0x00f4, B:80:0x00fb, B:81:0x00fc, B:82:0x0103, B:83:0x0104), top: B:103:0x00d5, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb A[Catch: all -> 0x00ec, TryCatch #7 {all -> 0x00ec, blocks: (B:66:0x00d5, B:68:0x00dc, B:70:0x00e3, B:72:0x00e7, B:74:0x00eb, B:77:0x00ee, B:78:0x00f3, B:79:0x00f4, B:80:0x00fb, B:81:0x00fc, B:82:0x0103, B:83:0x0104), top: B:103:0x00d5, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee A[Catch: all -> 0x00ec, TryCatch #7 {all -> 0x00ec, blocks: (B:66:0x00d5, B:68:0x00dc, B:70:0x00e3, B:72:0x00e7, B:74:0x00eb, B:77:0x00ee, B:78:0x00f3, B:79:0x00f4, B:80:0x00fb, B:81:0x00fc, B:82:0x0103, B:83:0x0104), top: B:103:0x00d5, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4 A[Catch: all -> 0x00ec, TryCatch #7 {all -> 0x00ec, blocks: (B:66:0x00d5, B:68:0x00dc, B:70:0x00e3, B:72:0x00e7, B:74:0x00eb, B:77:0x00ee, B:78:0x00f3, B:79:0x00f4, B:80:0x00fb, B:81:0x00fc, B:82:0x0103, B:83:0x0104), top: B:103:0x00d5, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00fc A[Catch: all -> 0x00ec, TryCatch #7 {all -> 0x00ec, blocks: (B:66:0x00d5, B:68:0x00dc, B:70:0x00e3, B:72:0x00e7, B:74:0x00eb, B:77:0x00ee, B:78:0x00f3, B:79:0x00f4, B:80:0x00fb, B:81:0x00fc, B:82:0x0103, B:83:0x0104), top: B:103:0x00d5, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0104 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #7 {all -> 0x00ec, blocks: (B:66:0x00d5, B:68:0x00dc, B:70:0x00e3, B:72:0x00e7, B:74:0x00eb, B:77:0x00ee, B:78:0x00f3, B:79:0x00f4, B:80:0x00fb, B:81:0x00fc, B:82:0x0103, B:83:0x0104), top: B:103:0x00d5, outer: #1 }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w03 w03VarA;
        w03 w03Var;
        w03 w03VarA2;
        w03 w03Var2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                v83 v83Var = this.d;
                ri2 ri2Var = v83Var.h;
                no0 no0Var = no0.CUI_NAME_STARTUP_WEBVIEW;
                List listFormularize = adultoid.formularize();
                l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
                if (j13.b().a == null) {
                    w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                    try {
                        this.a = w03VarA2;
                        this.b = w03VarA2;
                        this.c = 1;
                        if (v83.a(v83Var, this) != objBeachfront) {
                            w03Var2 = w03VarA2;
                            Unit unit = Unit.f29295attabal;
                            interaction.saneness.attabal(w03Var2, null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        w03Var2 = w03VarA2;
                        w03VarA2.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        w03VarA2.a(th);
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
                } else {
                    w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                    try {
                        this.a = w03VarA;
                        this.b = w03VarA;
                        this.c = 2;
                        if (v83.a(v83Var, this) != objBeachfront) {
                            w03Var = w03VarA;
                            Unit unit2 = Unit.f29295attabal;
                            interaction.saneness.attabal(w03Var, null);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        w03Var = w03VarA;
                        w03VarA.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        w03VarA.a(th);
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
            if (i == 1) {
                w03Var2 = this.b;
                w03VarA2 = this.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    Unit unit3 = Unit.f29295attabal;
                    interaction.saneness.attabal(w03Var2, null);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        w03VarA2.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        w03VarA2.a(th);
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
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            interaction.saneness.attabal(w03Var2, th4);
                            throw th5;
                        }
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w03Var = this.b;
                w03VarA = this.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    Unit unit4 = Unit.f29295attabal;
                    interaction.saneness.attabal(w03Var, null);
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        w03VarA.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        w03VarA.a(th);
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
                            interaction.saneness.attabal(w03Var, th7);
                            throw th8;
                        }
                    }
                }
            }
            this.d.k.dern();
            return Unit.f29295attabal;
        } catch (Throwable th9) {
            this.d.k.dern();
            throw th9;
        }
    }
}
