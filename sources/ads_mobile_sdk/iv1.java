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
public final class iv1 extends SuspendLambda implements Function2 {
    public w03 a;
    public w03 b;
    public int c;
    public final /* synthetic */ lv1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv1(lv1 lv1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = lv1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new iv1(this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new iv1(this.d, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c A[Catch: all -> 0x008c, TryCatch #6 {all -> 0x008c, blocks: (B:29:0x0075, B:31:0x007c, B:33:0x0083, B:35:0x0087, B:37:0x008b, B:40:0x008e, B:41:0x0093, B:42:0x0094, B:43:0x009b, B:44:0x009c, B:45:0x00a3, B:46:0x00a4), top: B:95:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[Catch: all -> 0x008c, TryCatch #6 {all -> 0x008c, blocks: (B:29:0x0075, B:31:0x007c, B:33:0x0083, B:35:0x0087, B:37:0x008b, B:40:0x008e, B:41:0x0093, B:42:0x0094, B:43:0x009b, B:44:0x009c, B:45:0x00a3, B:46:0x00a4), top: B:95:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[Catch: all -> 0x008c, TryCatch #6 {all -> 0x008c, blocks: (B:29:0x0075, B:31:0x007c, B:33:0x0083, B:35:0x0087, B:37:0x008b, B:40:0x008e, B:41:0x0093, B:42:0x0094, B:43:0x009b, B:44:0x009c, B:45:0x00a3, B:46:0x00a4), top: B:95:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008b A[Catch: all -> 0x008c, TryCatch #6 {all -> 0x008c, blocks: (B:29:0x0075, B:31:0x007c, B:33:0x0083, B:35:0x0087, B:37:0x008b, B:40:0x008e, B:41:0x0093, B:42:0x0094, B:43:0x009b, B:44:0x009c, B:45:0x00a3, B:46:0x00a4), top: B:95:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008e A[Catch: all -> 0x008c, TryCatch #6 {all -> 0x008c, blocks: (B:29:0x0075, B:31:0x007c, B:33:0x0083, B:35:0x0087, B:37:0x008b, B:40:0x008e, B:41:0x0093, B:42:0x0094, B:43:0x009b, B:44:0x009c, B:45:0x00a3, B:46:0x00a4), top: B:95:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0094 A[Catch: all -> 0x008c, TryCatch #6 {all -> 0x008c, blocks: (B:29:0x0075, B:31:0x007c, B:33:0x0083, B:35:0x0087, B:37:0x008b, B:40:0x008e, B:41:0x0093, B:42:0x0094, B:43:0x009b, B:44:0x009c, B:45:0x00a3, B:46:0x00a4), top: B:95:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x009c A[Catch: all -> 0x008c, TryCatch #6 {all -> 0x008c, blocks: (B:29:0x0075, B:31:0x007c, B:33:0x0083, B:35:0x0087, B:37:0x008b, B:40:0x008e, B:41:0x0093, B:42:0x0094, B:43:0x009b, B:44:0x009c, B:45:0x00a3, B:46:0x00a4), top: B:95:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #6 {all -> 0x008c, blocks: (B:29:0x0075, B:31:0x007c, B:33:0x0083, B:35:0x0087, B:37:0x008b, B:40:0x008e, B:41:0x0093, B:42:0x0094, B:43:0x009b, B:44:0x009c, B:45:0x00a3, B:46:0x00a4), top: B:95:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:62:0x00cb, B:64:0x00d2, B:66:0x00d9, B:68:0x00dd, B:70:0x00e1, B:73:0x00e4, B:74:0x00e9, B:75:0x00ea, B:76:0x00f1, B:77:0x00f2, B:78:0x00f9, B:79:0x00fa), top: B:84:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:62:0x00cb, B:64:0x00d2, B:66:0x00d9, B:68:0x00dd, B:70:0x00e1, B:73:0x00e4, B:74:0x00e9, B:75:0x00ea, B:76:0x00f1, B:77:0x00f2, B:78:0x00f9, B:79:0x00fa), top: B:84:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:62:0x00cb, B:64:0x00d2, B:66:0x00d9, B:68:0x00dd, B:70:0x00e1, B:73:0x00e4, B:74:0x00e9, B:75:0x00ea, B:76:0x00f1, B:77:0x00f2, B:78:0x00f9, B:79:0x00fa), top: B:84:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:62:0x00cb, B:64:0x00d2, B:66:0x00d9, B:68:0x00dd, B:70:0x00e1, B:73:0x00e4, B:74:0x00e9, B:75:0x00ea, B:76:0x00f1, B:77:0x00f2, B:78:0x00f9, B:79:0x00fa), top: B:84:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:62:0x00cb, B:64:0x00d2, B:66:0x00d9, B:68:0x00dd, B:70:0x00e1, B:73:0x00e4, B:74:0x00e9, B:75:0x00ea, B:76:0x00f1, B:77:0x00f2, B:78:0x00f9, B:79:0x00fa), top: B:84:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:62:0x00cb, B:64:0x00d2, B:66:0x00d9, B:68:0x00dd, B:70:0x00e1, B:73:0x00e4, B:74:0x00e9, B:75:0x00ea, B:76:0x00f1, B:77:0x00f2, B:78:0x00f9, B:79:0x00fa), top: B:84:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:62:0x00cb, B:64:0x00d2, B:66:0x00d9, B:68:0x00dd, B:70:0x00e1, B:73:0x00e4, B:74:0x00e9, B:75:0x00ea, B:76:0x00f1, B:77:0x00f2, B:78:0x00f9, B:79:0x00fa), top: B:84:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #0 {all -> 0x00e2, blocks: (B:62:0x00cb, B:64:0x00d2, B:66:0x00d9, B:68:0x00dd, B:70:0x00e1, B:73:0x00e4, B:74:0x00e9, B:75:0x00ea, B:76:0x00f1, B:77:0x00f2, B:78:0x00f9, B:79:0x00fa), top: B:84:0x00cb }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w03 w03VarA;
        w03 w03Var;
        w03 w03VarA2;
        w03 w03Var2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            lv1 lv1Var = this.d;
            ri2 ri2Var = lv1Var.g;
            no0 no0Var = no0.CUI_NAME_SDKINIT_INIT_OMID;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    this.a = w03VarA2;
                    this.b = w03VarA2;
                    this.c = 1;
                    if (lv1.a(lv1Var, this) != objBeachfront) {
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
                    if (lv1.a(lv1Var, this) != objBeachfront) {
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
        return Unit.f29295attabal;
    }
}
