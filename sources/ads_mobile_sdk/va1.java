package ads_mobile_sdk;

import com.google.gson.JsonObject;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class va1 extends SuspendLambda implements Function1 {
    public w03 a;
    public w03 b;
    public int c;
    public final /* synthetic */ ya1 d;
    public final /* synthetic */ hg2 e;
    public final /* synthetic */ JsonObject f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va1(ya1 ya1Var, hg2 hg2Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.d = ya1Var;
        this.e = hg2Var;
        this.f = jsonObject;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new va1(this.d, this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((va1) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:29:0x0076, B:31:0x007d, B:33:0x0084, B:35:0x0088, B:37:0x008c, B:40:0x008f, B:41:0x0094, B:42:0x0095, B:43:0x009c, B:44:0x009d, B:45:0x00a4, B:46:0x00a5), top: B:95:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:29:0x0076, B:31:0x007d, B:33:0x0084, B:35:0x0088, B:37:0x008c, B:40:0x008f, B:41:0x0094, B:42:0x0095, B:43:0x009c, B:44:0x009d, B:45:0x00a4, B:46:0x00a5), top: B:95:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:29:0x0076, B:31:0x007d, B:33:0x0084, B:35:0x0088, B:37:0x008c, B:40:0x008f, B:41:0x0094, B:42:0x0095, B:43:0x009c, B:44:0x009d, B:45:0x00a4, B:46:0x00a5), top: B:95:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:29:0x0076, B:31:0x007d, B:33:0x0084, B:35:0x0088, B:37:0x008c, B:40:0x008f, B:41:0x0094, B:42:0x0095, B:43:0x009c, B:44:0x009d, B:45:0x00a4, B:46:0x00a5), top: B:95:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008f A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:29:0x0076, B:31:0x007d, B:33:0x0084, B:35:0x0088, B:37:0x008c, B:40:0x008f, B:41:0x0094, B:42:0x0095, B:43:0x009c, B:44:0x009d, B:45:0x00a4, B:46:0x00a5), top: B:95:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:29:0x0076, B:31:0x007d, B:33:0x0084, B:35:0x0088, B:37:0x008c, B:40:0x008f, B:41:0x0094, B:42:0x0095, B:43:0x009c, B:44:0x009d, B:45:0x00a4, B:46:0x00a5), top: B:95:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x009d A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:29:0x0076, B:31:0x007d, B:33:0x0084, B:35:0x0088, B:37:0x008c, B:40:0x008f, B:41:0x0094, B:42:0x0095, B:43:0x009c, B:44:0x009d, B:45:0x00a4, B:46:0x00a5), top: B:95:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #6 {all -> 0x008d, blocks: (B:29:0x0076, B:31:0x007d, B:33:0x0084, B:35:0x0088, B:37:0x008c, B:40:0x008f, B:41:0x0094, B:42:0x0095, B:43:0x009c, B:44:0x009d, B:45:0x00a4, B:46:0x00a5), top: B:95:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5 A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:62:0x00de, B:64:0x00e5, B:66:0x00ec, B:68:0x00f0, B:70:0x00f4, B:73:0x00f7, B:74:0x00fc, B:75:0x00fd, B:76:0x0104, B:77:0x0105, B:78:0x010c, B:79:0x010d), top: B:86:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:62:0x00de, B:64:0x00e5, B:66:0x00ec, B:68:0x00f0, B:70:0x00f4, B:73:0x00f7, B:74:0x00fc, B:75:0x00fd, B:76:0x0104, B:77:0x0105, B:78:0x010c, B:79:0x010d), top: B:86:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0 A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:62:0x00de, B:64:0x00e5, B:66:0x00ec, B:68:0x00f0, B:70:0x00f4, B:73:0x00f7, B:74:0x00fc, B:75:0x00fd, B:76:0x0104, B:77:0x0105, B:78:0x010c, B:79:0x010d), top: B:86:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f4 A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:62:0x00de, B:64:0x00e5, B:66:0x00ec, B:68:0x00f0, B:70:0x00f4, B:73:0x00f7, B:74:0x00fc, B:75:0x00fd, B:76:0x0104, B:77:0x0105, B:78:0x010c, B:79:0x010d), top: B:86:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f7 A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:62:0x00de, B:64:0x00e5, B:66:0x00ec, B:68:0x00f0, B:70:0x00f4, B:73:0x00f7, B:74:0x00fc, B:75:0x00fd, B:76:0x0104, B:77:0x0105, B:78:0x010c, B:79:0x010d), top: B:86:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:62:0x00de, B:64:0x00e5, B:66:0x00ec, B:68:0x00f0, B:70:0x00f4, B:73:0x00f7, B:74:0x00fc, B:75:0x00fd, B:76:0x0104, B:77:0x0105, B:78:0x010c, B:79:0x010d), top: B:86:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0105 A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:62:0x00de, B:64:0x00e5, B:66:0x00ec, B:68:0x00f0, B:70:0x00f4, B:73:0x00f7, B:74:0x00fc, B:75:0x00fd, B:76:0x0104, B:77:0x0105, B:78:0x010c, B:79:0x010d), top: B:86:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:79:0x010d A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #1 {all -> 0x00f5, blocks: (B:62:0x00de, B:64:0x00e5, B:66:0x00ec, B:68:0x00f0, B:70:0x00f4, B:73:0x00f7, B:74:0x00fc, B:75:0x00fd, B:76:0x0104, B:77:0x0105, B:78:0x010c, B:79:0x010d), top: B:86:0x00de }] */
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
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ri2 ri2Var = this.d.a;
            no0 no0Var = no0.CUI_NAME_GMSG;
            List listFormularize = adultoid.formularize();
            l13 l13Var = this.d.b;
            hg2 hg2Var = this.e;
            JsonObject jsonObject = this.f;
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    o12 o12VarE = j13.a().e();
                    hg2Var.getClass();
                    o12VarE.l = po0.GMSG_NAME_RESULT;
                    this.a = v62VarA;
                    this.b = v62VarA;
                    this.c = 1;
                    if (hg2Var.a(jsonObject, this) != objBeachfront) {
                        w03Var4 = v62VarA;
                        w03Var3 = w03Var4;
                        Unit unit = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var4, null);
                    }
                } catch (Throwable th3) {
                    w03Var3 = v62VarA;
                    th2 = th3;
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
                    o12 o12VarE2 = j13.a().e();
                    hg2Var.getClass();
                    o12VarE2.l = po0.GMSG_NAME_RESULT;
                    this.a = w03VarA;
                    this.b = w03VarA;
                    this.c = 2;
                    if (hg2Var.a(jsonObject, this) != objBeachfront) {
                        w03Var2 = w03VarA;
                        w03Var = w03Var2;
                        Unit unit2 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var2, null);
                    }
                } catch (Throwable th4) {
                    w03Var = w03VarA;
                    th = th4;
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
        if (i == 1) {
            w03Var4 = this.b;
            w03Var3 = this.a;
            try {
                p002kotlin.dern.saneness(obj);
                Unit unit3 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var4, null);
            } catch (Throwable th5) {
                th2 = th5;
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
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        interaction.saneness.attabal(w03Var4, th6);
                        throw th7;
                    }
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var2 = this.b;
            w03Var = this.a;
            try {
                p002kotlin.dern.saneness(obj);
                Unit unit4 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var2, null);
            } catch (Throwable th8) {
                th = th8;
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
                } catch (Throwable th9) {
                    try {
                        throw th9;
                    } catch (Throwable th10) {
                        interaction.saneness.attabal(w03Var2, th9);
                        throw th10;
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }
}
