package ads_mobile_sdk;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import saneness.evenfall;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class sa1 extends SuspendLambda implements Function1 {
    public w03 a;
    public w03 b;
    public int c;
    public final /* synthetic */ ya1 d;
    public final /* synthetic */ hemolysin e;
    public final /* synthetic */ gq0 f;
    public final /* synthetic */ Uri g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa1(ya1 ya1Var, hemolysin hemolysinVar, gq0 gq0Var, Uri uri, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.d = ya1Var;
        this.e = hemolysinVar;
        this.f = gq0Var;
        this.g = uri;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new sa1(this.d, this.e, this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((sa1) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:29:0x007e, B:31:0x0085, B:33:0x008c, B:35:0x0090, B:37:0x0094, B:40:0x0097, B:41:0x009c, B:42:0x009d, B:43:0x00a4, B:44:0x00a5, B:45:0x00ac, B:46:0x00ad), top: B:85:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:29:0x007e, B:31:0x0085, B:33:0x008c, B:35:0x0090, B:37:0x0094, B:40:0x0097, B:41:0x009c, B:42:0x009d, B:43:0x00a4, B:44:0x00a5, B:45:0x00ac, B:46:0x00ad), top: B:85:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:29:0x007e, B:31:0x0085, B:33:0x008c, B:35:0x0090, B:37:0x0094, B:40:0x0097, B:41:0x009c, B:42:0x009d, B:43:0x00a4, B:44:0x00a5, B:45:0x00ac, B:46:0x00ad), top: B:85:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:29:0x007e, B:31:0x0085, B:33:0x008c, B:35:0x0090, B:37:0x0094, B:40:0x0097, B:41:0x009c, B:42:0x009d, B:43:0x00a4, B:44:0x00a5, B:45:0x00ac, B:46:0x00ad), top: B:85:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:29:0x007e, B:31:0x0085, B:33:0x008c, B:35:0x0090, B:37:0x0094, B:40:0x0097, B:41:0x009c, B:42:0x009d, B:43:0x00a4, B:44:0x00a5, B:45:0x00ac, B:46:0x00ad), top: B:85:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009d A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:29:0x007e, B:31:0x0085, B:33:0x008c, B:35:0x0090, B:37:0x0094, B:40:0x0097, B:41:0x009c, B:42:0x009d, B:43:0x00a4, B:44:0x00a5, B:45:0x00ac, B:46:0x00ad), top: B:85:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:29:0x007e, B:31:0x0085, B:33:0x008c, B:35:0x0090, B:37:0x0094, B:40:0x0097, B:41:0x009c, B:42:0x009d, B:43:0x00a4, B:44:0x00a5, B:45:0x00ac, B:46:0x00ad), top: B:85:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #1 {all -> 0x0095, blocks: (B:29:0x007e, B:31:0x0085, B:33:0x008c, B:35:0x0090, B:37:0x0094, B:40:0x0097, B:41:0x009c, B:42:0x009d, B:43:0x00a4, B:44:0x00a5, B:45:0x00ac, B:46:0x00ad), top: B:85:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2 A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:62:0x00eb, B:64:0x00f2, B:66:0x00f9, B:68:0x00fd, B:70:0x0101, B:73:0x0104, B:74:0x0109, B:75:0x010a, B:76:0x0111, B:77:0x0112, B:78:0x0119, B:79:0x011a), top: B:84:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f9 A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:62:0x00eb, B:64:0x00f2, B:66:0x00f9, B:68:0x00fd, B:70:0x0101, B:73:0x0104, B:74:0x0109, B:75:0x010a, B:76:0x0111, B:77:0x0112, B:78:0x0119, B:79:0x011a), top: B:84:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:62:0x00eb, B:64:0x00f2, B:66:0x00f9, B:68:0x00fd, B:70:0x0101, B:73:0x0104, B:74:0x0109, B:75:0x010a, B:76:0x0111, B:77:0x0112, B:78:0x0119, B:79:0x011a), top: B:84:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0101 A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:62:0x00eb, B:64:0x00f2, B:66:0x00f9, B:68:0x00fd, B:70:0x0101, B:73:0x0104, B:74:0x0109, B:75:0x010a, B:76:0x0111, B:77:0x0112, B:78:0x0119, B:79:0x011a), top: B:84:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0104 A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:62:0x00eb, B:64:0x00f2, B:66:0x00f9, B:68:0x00fd, B:70:0x0101, B:73:0x0104, B:74:0x0109, B:75:0x010a, B:76:0x0111, B:77:0x0112, B:78:0x0119, B:79:0x011a), top: B:84:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:75:0x010a A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:62:0x00eb, B:64:0x00f2, B:66:0x00f9, B:68:0x00fd, B:70:0x0101, B:73:0x0104, B:74:0x0109, B:75:0x010a, B:76:0x0111, B:77:0x0112, B:78:0x0119, B:79:0x011a), top: B:84:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0112 A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:62:0x00eb, B:64:0x00f2, B:66:0x00f9, B:68:0x00fd, B:70:0x0101, B:73:0x0104, B:74:0x0109, B:75:0x010a, B:76:0x0111, B:77:0x0112, B:78:0x0119, B:79:0x011a), top: B:84:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:79:0x011a A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #0 {all -> 0x0102, blocks: (B:62:0x00eb, B:64:0x00f2, B:66:0x00f9, B:68:0x00fd, B:70:0x0101, B:73:0x0104, B:74:0x0109, B:75:0x010a, B:76:0x0111, B:77:0x0112, B:78:0x0119, B:79:0x011a), top: B:84:0x00eb }] */
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
            ya1 ya1Var = this.d;
            l13 l13Var = ya1Var.b;
            hemolysin hemolysinVar = this.e;
            gq0 gq0Var = this.f;
            Uri uri = this.g;
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    j13.a().e().l = hemolysinVar.b();
                    Map mapD = ya1Var.c.d(uri);
                    this.a = v62VarA;
                    this.b = v62VarA;
                    this.c = 1;
                    if (hemolysinVar.a(gq0Var, mapD, this) != objBeachfront) {
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
                    j13.a().e().l = hemolysinVar.b();
                    Map mapD2 = ya1Var.c.d(uri);
                    this.a = w03VarA;
                    this.b = w03VarA;
                    this.c = 2;
                    if (hemolysinVar.a(gq0Var, mapD2, this) != objBeachfront) {
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
