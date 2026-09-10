package ads_mobile_sdk;

import complexometry.formularize;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.evenfall;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class r82 extends SuspendLambda implements Function2 {
    public w03 a;
    public w03 b;
    public int c;
    public final /* synthetic */ k92 d;
    public final /* synthetic */ orthocephalic e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r82(k92 k92Var, orthocephalic orthocephalicVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = k92Var;
        this.e = orthocephalicVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new r82(this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new r82(this.d, this.e, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0093 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:37:0x008c, B:39:0x0093, B:41:0x009a, B:43:0x009e, B:45:0x00a2, B:48:0x00a5, B:49:0x00aa, B:50:0x00ab, B:51:0x00b2, B:52:0x00b3, B:53:0x00ba, B:54:0x00bb), top: B:100:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009a A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:37:0x008c, B:39:0x0093, B:41:0x009a, B:43:0x009e, B:45:0x00a2, B:48:0x00a5, B:49:0x00aa, B:50:0x00ab, B:51:0x00b2, B:52:0x00b3, B:53:0x00ba, B:54:0x00bb), top: B:100:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009e A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:37:0x008c, B:39:0x0093, B:41:0x009a, B:43:0x009e, B:45:0x00a2, B:48:0x00a5, B:49:0x00aa, B:50:0x00ab, B:51:0x00b2, B:52:0x00b3, B:53:0x00ba, B:54:0x00bb), top: B:100:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:37:0x008c, B:39:0x0093, B:41:0x009a, B:43:0x009e, B:45:0x00a2, B:48:0x00a5, B:49:0x00aa, B:50:0x00ab, B:51:0x00b2, B:52:0x00b3, B:53:0x00ba, B:54:0x00bb), top: B:100:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:37:0x008c, B:39:0x0093, B:41:0x009a, B:43:0x009e, B:45:0x00a2, B:48:0x00a5, B:49:0x00aa, B:50:0x00ab, B:51:0x00b2, B:52:0x00b3, B:53:0x00ba, B:54:0x00bb), top: B:100:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:37:0x008c, B:39:0x0093, B:41:0x009a, B:43:0x009e, B:45:0x00a2, B:48:0x00a5, B:49:0x00aa, B:50:0x00ab, B:51:0x00b2, B:52:0x00b3, B:53:0x00ba, B:54:0x00bb), top: B:100:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:37:0x008c, B:39:0x0093, B:41:0x009a, B:43:0x009e, B:45:0x00a2, B:48:0x00a5, B:49:0x00aa, B:50:0x00ab, B:51:0x00b2, B:52:0x00b3, B:53:0x00ba, B:54:0x00bb), top: B:100:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:37:0x008c, B:39:0x0093, B:41:0x009a, B:43:0x009e, B:45:0x00a2, B:48:0x00a5, B:49:0x00aa, B:50:0x00ab, B:51:0x00b2, B:52:0x00b3, B:53:0x00ba, B:54:0x00bb), top: B:100:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0109 A[Catch: all -> 0x0119, TryCatch #4 {all -> 0x0119, blocks: (B:78:0x0102, B:80:0x0109, B:82:0x0110, B:84:0x0114, B:86:0x0118, B:89:0x011b, B:90:0x0120, B:91:0x0121, B:92:0x0128, B:93:0x0129, B:94:0x0130, B:95:0x0131), top: B:107:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0110 A[Catch: all -> 0x0119, TryCatch #4 {all -> 0x0119, blocks: (B:78:0x0102, B:80:0x0109, B:82:0x0110, B:84:0x0114, B:86:0x0118, B:89:0x011b, B:90:0x0120, B:91:0x0121, B:92:0x0128, B:93:0x0129, B:94:0x0130, B:95:0x0131), top: B:107:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0114 A[Catch: all -> 0x0119, TryCatch #4 {all -> 0x0119, blocks: (B:78:0x0102, B:80:0x0109, B:82:0x0110, B:84:0x0114, B:86:0x0118, B:89:0x011b, B:90:0x0120, B:91:0x0121, B:92:0x0128, B:93:0x0129, B:94:0x0130, B:95:0x0131), top: B:107:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0118 A[Catch: all -> 0x0119, TryCatch #4 {all -> 0x0119, blocks: (B:78:0x0102, B:80:0x0109, B:82:0x0110, B:84:0x0114, B:86:0x0118, B:89:0x011b, B:90:0x0120, B:91:0x0121, B:92:0x0128, B:93:0x0129, B:94:0x0130, B:95:0x0131), top: B:107:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x011b A[Catch: all -> 0x0119, TryCatch #4 {all -> 0x0119, blocks: (B:78:0x0102, B:80:0x0109, B:82:0x0110, B:84:0x0114, B:86:0x0118, B:89:0x011b, B:90:0x0120, B:91:0x0121, B:92:0x0128, B:93:0x0129, B:94:0x0130, B:95:0x0131), top: B:107:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[Catch: all -> 0x0119, TryCatch #4 {all -> 0x0119, blocks: (B:78:0x0102, B:80:0x0109, B:82:0x0110, B:84:0x0114, B:86:0x0118, B:89:0x011b, B:90:0x0120, B:91:0x0121, B:92:0x0128, B:93:0x0129, B:94:0x0130, B:95:0x0131), top: B:107:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0129 A[Catch: all -> 0x0119, TryCatch #4 {all -> 0x0119, blocks: (B:78:0x0102, B:80:0x0109, B:82:0x0110, B:84:0x0114, B:86:0x0118, B:89:0x011b, B:90:0x0120, B:91:0x0121, B:92:0x0128, B:93:0x0129, B:94:0x0130, B:95:0x0131), top: B:107:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0131 A[Catch: all -> 0x0119, TRY_LEAVE, TryCatch #4 {all -> 0x0119, blocks: (B:78:0x0102, B:80:0x0109, B:82:0x0110, B:84:0x0114, B:86:0x0118, B:89:0x011b, B:90:0x0120, B:91:0x0121, B:92:0x0128, B:93:0x0129, B:94:0x0130, B:95:0x0131), top: B:107:0x0102 }] */
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
            k92 k92Var = this.d;
            ri2 ri2Var = k92Var.e;
            no0 no0Var = no0.CUI_NAME_ADREQUEST;
            List listMarial = graveside.marial(k92Var.g.toString());
            k92 k92Var2 = this.d;
            l13 l13Var = k92Var2.c;
            orthocephalic orthocephalicVar = this.e;
            String str = "";
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listMarial, l13Var);
                try {
                    xb2 xb2Var = k92Var2.c.a;
                    xb2Var.a = k92Var2.f;
                    xb2Var.c = k92Var2.g;
                    formularize formularizeVar = k92Var2.h;
                    String adUnitId = formularizeVar != null ? formularizeVar.getAdUnitId() : null;
                    if (adUnitId != null) {
                        str = adUnitId;
                    }
                    xb2Var.b = str;
                    this.a = v62VarA;
                    this.b = v62VarA;
                    this.c = 1;
                    if (k92.a(k92Var2, orthocephalicVar, this) != objBeachfront) {
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
                    xb2 xb2Var2 = k92Var2.c.a;
                    xb2Var2.a = k92Var2.f;
                    xb2Var2.c = k92Var2.g;
                    formularize formularizeVar2 = k92Var2.h;
                    String adUnitId2 = formularizeVar2 != null ? formularizeVar2.getAdUnitId() : null;
                    if (adUnitId2 != null) {
                        str = adUnitId2;
                    }
                    xb2Var2.b = str;
                    this.a = w03VarA;
                    this.b = w03VarA;
                    this.c = 2;
                    if (k92.a(k92Var2, orthocephalicVar, this) != objBeachfront) {
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
