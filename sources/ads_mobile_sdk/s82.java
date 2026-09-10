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

/* JADX INFO: loaded from: classes.dex */
public final class s82 extends SuspendLambda implements Function2 {
    public w03 a;
    public w03 b;
    public int c;
    public final /* synthetic */ k92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s82(k92 k92Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = k92Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new s82(this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new s82(this.d, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #5 {all -> 0x002c, blocks: (B:14:0x0028, B:34:0x0083, B:36:0x0089), top: B:114:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009d A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:40:0x0096, B:42:0x009d, B:44:0x00a4, B:46:0x00a8, B:48:0x00ac, B:51:0x00af, B:52:0x00b4, B:53:0x00b5, B:54:0x00bc, B:55:0x00bd, B:56:0x00c4, B:57:0x00c5), top: B:117:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4 A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:40:0x0096, B:42:0x009d, B:44:0x00a4, B:46:0x00a8, B:48:0x00ac, B:51:0x00af, B:52:0x00b4, B:53:0x00b5, B:54:0x00bc, B:55:0x00bd, B:56:0x00c4, B:57:0x00c5), top: B:117:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:40:0x0096, B:42:0x009d, B:44:0x00a4, B:46:0x00a8, B:48:0x00ac, B:51:0x00af, B:52:0x00b4, B:53:0x00b5, B:54:0x00bc, B:55:0x00bd, B:56:0x00c4, B:57:0x00c5), top: B:117:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:40:0x0096, B:42:0x009d, B:44:0x00a4, B:46:0x00a8, B:48:0x00ac, B:51:0x00af, B:52:0x00b4, B:53:0x00b5, B:54:0x00bc, B:55:0x00bd, B:56:0x00c4, B:57:0x00c5), top: B:117:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00af A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:40:0x0096, B:42:0x009d, B:44:0x00a4, B:46:0x00a8, B:48:0x00ac, B:51:0x00af, B:52:0x00b4, B:53:0x00b5, B:54:0x00bc, B:55:0x00bd, B:56:0x00c4, B:57:0x00c5), top: B:117:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5 A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:40:0x0096, B:42:0x009d, B:44:0x00a4, B:46:0x00a8, B:48:0x00ac, B:51:0x00af, B:52:0x00b4, B:53:0x00b5, B:54:0x00bc, B:55:0x00bd, B:56:0x00c4, B:57:0x00c5), top: B:117:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:40:0x0096, B:42:0x009d, B:44:0x00a4, B:46:0x00a8, B:48:0x00ac, B:51:0x00af, B:52:0x00b4, B:53:0x00b5, B:54:0x00bc, B:55:0x00bd, B:56:0x00c4, B:57:0x00c5), top: B:117:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #7 {all -> 0x00ad, blocks: (B:40:0x0096, B:42:0x009d, B:44:0x00a4, B:46:0x00a8, B:48:0x00ac, B:51:0x00af, B:52:0x00b4, B:53:0x00b5, B:54:0x00bc, B:55:0x00bd, B:56:0x00c4, B:57:0x00c5), top: B:117:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0108 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #4 {all -> 0x0019, blocks: (B:7:0x0014, B:76:0x0102, B:78:0x0108), top: B:112:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x011c A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:82:0x0115, B:84:0x011c, B:86:0x0123, B:88:0x0127, B:90:0x012b, B:93:0x012e, B:94:0x0133, B:95:0x0134, B:96:0x013b, B:97:0x013c, B:98:0x0143, B:99:0x0144), top: B:116:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0123 A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:82:0x0115, B:84:0x011c, B:86:0x0123, B:88:0x0127, B:90:0x012b, B:93:0x012e, B:94:0x0133, B:95:0x0134, B:96:0x013b, B:97:0x013c, B:98:0x0143, B:99:0x0144), top: B:116:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0127 A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:82:0x0115, B:84:0x011c, B:86:0x0123, B:88:0x0127, B:90:0x012b, B:93:0x012e, B:94:0x0133, B:95:0x0134, B:96:0x013b, B:97:0x013c, B:98:0x0143, B:99:0x0144), top: B:116:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x012b A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:82:0x0115, B:84:0x011c, B:86:0x0123, B:88:0x0127, B:90:0x012b, B:93:0x012e, B:94:0x0133, B:95:0x0134, B:96:0x013b, B:97:0x013c, B:98:0x0143, B:99:0x0144), top: B:116:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x012e A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:82:0x0115, B:84:0x011c, B:86:0x0123, B:88:0x0127, B:90:0x012b, B:93:0x012e, B:94:0x0133, B:95:0x0134, B:96:0x013b, B:97:0x013c, B:98:0x0143, B:99:0x0144), top: B:116:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0134 A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:82:0x0115, B:84:0x011c, B:86:0x0123, B:88:0x0127, B:90:0x012b, B:93:0x012e, B:94:0x0133, B:95:0x0134, B:96:0x013b, B:97:0x013c, B:98:0x0143, B:99:0x0144), top: B:116:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x013c A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:82:0x0115, B:84:0x011c, B:86:0x0123, B:88:0x0127, B:90:0x012b, B:93:0x012e, B:94:0x0133, B:95:0x0134, B:96:0x013b, B:97:0x013c, B:98:0x0143, B:99:0x0144), top: B:116:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0144 A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #6 {all -> 0x012c, blocks: (B:82:0x0115, B:84:0x011c, B:86:0x0123, B:88:0x0127, B:90:0x012b, B:93:0x012e, B:94:0x0133, B:95:0x0134, B:96:0x013b, B:97:0x013c, B:98:0x0143, B:99:0x0144), top: B:116:0x0115 }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w03 w03Var;
        TimeoutCancellationException th;
        w03 w03Var2;
        w03 w03Var3;
        TimeoutCancellationException th2;
        w03 w03Var4;
        Object obj2;
        Object obj3;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                w03Var4 = this.b;
                w03Var3 = this.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    obj2 = (kotlinx.coroutines.flow.dern) obj;
                    if (obj2 instanceof nn0) {
                        y13.a((nn0) obj2, false);
                    }
                    interaction.saneness.attabal(w03Var4, null);
                    return obj2;
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
                obj3 = (kotlinx.coroutines.flow.dern) obj;
                if (obj3 instanceof nn0) {
                    y13.a((nn0) obj3, false);
                }
                interaction.saneness.attabal(w03Var2, null);
                return obj3;
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
        k92 k92Var = this.d;
        ri2 ri2Var = k92Var.e;
        no0 no0Var = no0.CUI_NAME_ADREQUEST;
        List listMarial = graveside.marial(k92Var.g.toString());
        k92 k92Var2 = this.d;
        l13 l13Var = k92Var2.c;
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
                Object objA = k92Var2.a(this);
                if (objA != objBeachfront) {
                    w03Var4 = v62VarA;
                    obj = objA;
                    w03Var3 = w03Var4;
                    obj2 = (kotlinx.coroutines.flow.dern) obj;
                    if (obj2 instanceof nn0) {
                        y13.a((nn0) obj2, false);
                    }
                    interaction.saneness.attabal(w03Var4, null);
                    return obj2;
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
                Object objA2 = k92Var2.a(this);
                if (objA2 != objBeachfront) {
                    w03Var2 = w03VarA;
                    obj = objA2;
                    w03Var = w03Var2;
                    obj3 = (kotlinx.coroutines.flow.dern) obj;
                    if (obj3 instanceof nn0) {
                        y13.a((nn0) obj3, false);
                    }
                    interaction.saneness.attabal(w03Var2, null);
                    return obj3;
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
