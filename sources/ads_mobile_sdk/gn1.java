package ads_mobile_sdk;

import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import saneness.evenfall;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class gn1 extends SuspendLambda implements Function1 {
    public Object a;
    public Closeable b;
    public Object c;
    public int d;
    public final /* synthetic */ hn1 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn1(hn1 hn1Var, String str, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.e = hn1Var;
        this.f = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new gn1(this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new gn1(this.e, this.f, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01ae A[Catch: all -> 0x01be, TryCatch #12 {all -> 0x01be, blocks: (B:105:0x01a7, B:107:0x01ae, B:109:0x01b5, B:111:0x01b9, B:113:0x01bd, B:116:0x01c1, B:117:0x01c6, B:118:0x01c7, B:119:0x01ce, B:120:0x01cf, B:121:0x01d6, B:122:0x01d7), top: B:147:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01b5 A[Catch: all -> 0x01be, TryCatch #12 {all -> 0x01be, blocks: (B:105:0x01a7, B:107:0x01ae, B:109:0x01b5, B:111:0x01b9, B:113:0x01bd, B:116:0x01c1, B:117:0x01c6, B:118:0x01c7, B:119:0x01ce, B:120:0x01cf, B:121:0x01d6, B:122:0x01d7), top: B:147:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01b9 A[Catch: all -> 0x01be, TryCatch #12 {all -> 0x01be, blocks: (B:105:0x01a7, B:107:0x01ae, B:109:0x01b5, B:111:0x01b9, B:113:0x01bd, B:116:0x01c1, B:117:0x01c6, B:118:0x01c7, B:119:0x01ce, B:120:0x01cf, B:121:0x01d6, B:122:0x01d7), top: B:147:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01bd A[Catch: all -> 0x01be, TryCatch #12 {all -> 0x01be, blocks: (B:105:0x01a7, B:107:0x01ae, B:109:0x01b5, B:111:0x01b9, B:113:0x01bd, B:116:0x01c1, B:117:0x01c6, B:118:0x01c7, B:119:0x01ce, B:120:0x01cf, B:121:0x01d6, B:122:0x01d7), top: B:147:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01c1 A[Catch: all -> 0x01be, TryCatch #12 {all -> 0x01be, blocks: (B:105:0x01a7, B:107:0x01ae, B:109:0x01b5, B:111:0x01b9, B:113:0x01bd, B:116:0x01c1, B:117:0x01c6, B:118:0x01c7, B:119:0x01ce, B:120:0x01cf, B:121:0x01d6, B:122:0x01d7), top: B:147:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c7 A[Catch: all -> 0x01be, TryCatch #12 {all -> 0x01be, blocks: (B:105:0x01a7, B:107:0x01ae, B:109:0x01b5, B:111:0x01b9, B:113:0x01bd, B:116:0x01c1, B:117:0x01c6, B:118:0x01c7, B:119:0x01ce, B:120:0x01cf, B:121:0x01d6, B:122:0x01d7), top: B:147:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01cf A[Catch: all -> 0x01be, TryCatch #12 {all -> 0x01be, blocks: (B:105:0x01a7, B:107:0x01ae, B:109:0x01b5, B:111:0x01b9, B:113:0x01bd, B:116:0x01c1, B:117:0x01c6, B:118:0x01c7, B:119:0x01ce, B:120:0x01cf, B:121:0x01d6, B:122:0x01d7), top: B:147:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01d7 A[Catch: all -> 0x01be, TRY_LEAVE, TryCatch #12 {all -> 0x01be, blocks: (B:105:0x01a7, B:107:0x01ae, B:109:0x01b5, B:111:0x01b9, B:113:0x01bd, B:116:0x01c1, B:117:0x01c6, B:118:0x01c7, B:119:0x01ce, B:120:0x01cf, B:121:0x01d6, B:122:0x01d7), top: B:147:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #9 {all -> 0x00fc, blocks: (B:39:0x00e5, B:43:0x00ef, B:45:0x00f3, B:50:0x00ff, B:51:0x0104), top: B:142:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #9 {all -> 0x00fc, blocks: (B:39:0x00e5, B:43:0x00ef, B:45:0x00f3, B:50:0x00ff, B:51:0x0104), top: B:142:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #9 {all -> 0x00fc, blocks: (B:39:0x00e5, B:43:0x00ef, B:45:0x00f3, B:50:0x00ff, B:51:0x0104), top: B:142:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0112 A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:56:0x010b, B:58:0x0112, B:60:0x0119, B:62:0x011d, B:64:0x0121, B:67:0x0125, B:68:0x012a, B:69:0x012b, B:70:0x0132, B:71:0x0133, B:72:0x013a, B:73:0x013b), top: B:129:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0119 A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:56:0x010b, B:58:0x0112, B:60:0x0119, B:62:0x011d, B:64:0x0121, B:67:0x0125, B:68:0x012a, B:69:0x012b, B:70:0x0132, B:71:0x0133, B:72:0x013a, B:73:0x013b), top: B:129:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x011d A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:56:0x010b, B:58:0x0112, B:60:0x0119, B:62:0x011d, B:64:0x0121, B:67:0x0125, B:68:0x012a, B:69:0x012b, B:70:0x0132, B:71:0x0133, B:72:0x013a, B:73:0x013b), top: B:129:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0121 A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:56:0x010b, B:58:0x0112, B:60:0x0119, B:62:0x011d, B:64:0x0121, B:67:0x0125, B:68:0x012a, B:69:0x012b, B:70:0x0132, B:71:0x0133, B:72:0x013a, B:73:0x013b), top: B:129:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0125 A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:56:0x010b, B:58:0x0112, B:60:0x0119, B:62:0x011d, B:64:0x0121, B:67:0x0125, B:68:0x012a, B:69:0x012b, B:70:0x0132, B:71:0x0133, B:72:0x013a, B:73:0x013b), top: B:129:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x012b A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:56:0x010b, B:58:0x0112, B:60:0x0119, B:62:0x011d, B:64:0x0121, B:67:0x0125, B:68:0x012a, B:69:0x012b, B:70:0x0132, B:71:0x0133, B:72:0x013a, B:73:0x013b), top: B:129:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0133 A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:56:0x010b, B:58:0x0112, B:60:0x0119, B:62:0x011d, B:64:0x0121, B:67:0x0125, B:68:0x012a, B:69:0x012b, B:70:0x0132, B:71:0x0133, B:72:0x013a, B:73:0x013b), top: B:129:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:73:0x013b A[Catch: all -> 0x0122, TRY_LEAVE, TryCatch #1 {all -> 0x0122, blocks: (B:56:0x010b, B:58:0x0112, B:60:0x0119, B:62:0x011d, B:64:0x0121, B:67:0x0125, B:68:0x012a, B:69:0x012b, B:70:0x0132, B:71:0x0133, B:72:0x013a, B:73:0x013b), top: B:129:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:86:0x017c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0183  */
    /* JADX WARN: Code duplicated, block: B:91:0x0187 A[Catch: all -> 0x0194, TRY_ENTER, TryCatch #3 {all -> 0x0194, blocks: (B:87:0x017d, B:91:0x0187, B:93:0x018b, B:98:0x0197, B:99:0x019c), top: B:132:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:93:0x018b A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #3 {all -> 0x0194, blocks: (B:87:0x017d, B:91:0x0187, B:93:0x018b, B:98:0x0197, B:99:0x019c), top: B:132:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0197 A[Catch: all -> 0x0194, TRY_ENTER, TryCatch #3 {all -> 0x0194, blocks: (B:87:0x017d, B:91:0x0187, B:93:0x018b, B:98:0x0197, B:99:0x019c), top: B:132:0x017d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v39, types: [ads_mobile_sdk.v62, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v8, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.Closeable] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r9;
        ?? r10;
        String str;
        Object objA;
        gq0 gq0Var;
        ?? r11;
        Object objA2;
        Closeable closeable;
        ?? r3;
        String str2;
        Closeable closeable2;
        ?? r12;
        Object objA3;
        gq0 gq0Var2;
        ?? r2;
        Object objA4;
        spartacist spartacistVar;
        spartacist spartacistVar2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.d;
        ?? A = 4;
        ?? r4 = 3;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            hn1 hn1Var = this.e;
            ri2 ri2Var = hn1Var.g;
            no0 no0Var = no0.CUI_NAME_LOAD_OMID_NATIVE_WEBVIEW;
            String str3 = this.f;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                A = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    g83 g83Var = hn1Var.e;
                    ia3 ia3Var = new ia3(ha3.DEFAULT, 0, 0, 14);
                    this.a = str3;
                    this.b = A;
                    this.c = A;
                    this.d = 1;
                    objA = g83Var.a(ia3Var, null, this);
                    if (objA != objBeachfront) {
                        ?? r13 = A;
                        r10 = r13;
                        str = str3;
                        r9 = r13;
                        gq0Var = (gq0) objA;
                        this.a = r10;
                        this.b = r9;
                        this.c = gq0Var;
                        this.d = 2;
                        objA2 = gq0.a(gq0Var, str, (String) null, false, (wretchedly.dern) this, 14);
                        if (objA2 != objBeachfront) {
                            r4 = r10;
                            r11 = r9;
                            spartacistVar2 = (spartacist) objA2;
                            if (spartacistVar2 instanceof tn0) {
                                interaction.saneness.attabal(r11, null);
                                return gq0Var;
                            }
                            if (spartacistVar2 instanceof nn0) {
                                throw new NoWhenBranchMatchedException();
                            }
                            y13.a((nn0) spartacistVar2, false);
                            interaction.saneness.attabal(r11, null);
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r4 = A;
                    r4.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    r4.a(th);
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
                w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    g83 g83Var2 = hn1Var.e;
                    ia3 ia3Var2 = new ia3(ha3.DEFAULT, 0, 0, 14);
                    this.a = str3;
                    this.b = w03VarA;
                    this.c = w03VarA;
                    this.d = 3;
                    objA3 = g83Var2.a(ia3Var2, null, this);
                    if (objA3 != objBeachfront) {
                        closeable2 = w03VarA;
                        r12 = closeable2;
                        str2 = str3;
                        gq0Var2 = (gq0) objA3;
                        this.a = r12;
                        this.b = closeable2;
                        this.c = gq0Var2;
                        this.d = 4;
                        objA4 = gq0.a(gq0Var2, str2, (String) null, false, (wretchedly.dern) this, 14);
                        if (objA4 != objBeachfront) {
                            r2 = r12;
                            spartacistVar = (spartacist) objA4;
                            if (spartacistVar instanceof tn0) {
                                interaction.saneness.attabal(closeable2, null);
                                return gq0Var2;
                            }
                            if (!(spartacistVar instanceof nn0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            y13.a((nn0) spartacistVar, false);
                            interaction.saneness.attabal(closeable2, null);
                            return null;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = w03VarA;
                    r3 = closeable;
                }
            }
            return objBeachfront;
        }
        try {
            if (i == 1) {
                Closeable closeable3 = (Closeable) this.c;
                w03 w03Var = (w03) this.b;
                String str4 = (String) this.a;
                p002kotlin.dern.saneness(obj);
                r9 = closeable3;
                r10 = w03Var;
                str = str4;
                objA = obj;
                try {
                    gq0Var = (gq0) objA;
                    this.a = r10;
                    this.b = r9;
                    this.c = gq0Var;
                    this.d = 2;
                    objA2 = gq0.a(gq0Var, str, (String) null, false, (wretchedly.dern) this, 14);
                    if (objA2 != objBeachfront) {
                        r4 = r10;
                        r11 = r9;
                    }
                    return objBeachfront;
                } catch (Throwable th3) {
                    th = th3;
                    A = r9;
                    r4 = r10;
                    try {
                        r4.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        r4.a(th);
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
                            interaction.saneness.attabal(A, th4);
                            throw th5;
                        }
                    }
                }
            }
            if (i == 2) {
                gq0Var = (gq0) this.c;
                Closeable closeable4 = this.b;
                w03 w03Var2 = (w03) this.a;
                p002kotlin.dern.saneness(obj);
                r11 = closeable4;
                objA2 = obj;
                r4 = w03Var2;
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gq0Var2 = (gq0) this.c;
                    Closeable closeable5 = this.b;
                    r2 = (w03) this.a;
                    try {
                        p002kotlin.dern.saneness(obj);
                        closeable2 = closeable5;
                        objA4 = obj;
                        r2 = r2;
                        try {
                            spartacistVar = (spartacist) objA4;
                            if (spartacistVar instanceof tn0) {
                                interaction.saneness.attabal(closeable2, null);
                                return gq0Var2;
                            }
                            if (!(spartacistVar instanceof nn0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            y13.a((nn0) spartacistVar, false);
                            interaction.saneness.attabal(closeable2, null);
                            return null;
                        } catch (Throwable th6) {
                            th = th6;
                            closeable5 = closeable2;
                            r3 = r2;
                            closeable = closeable5;
                            r3.b(th);
                            if (th instanceof evenfall) {
                                throw th;
                            }
                            r3.a(th);
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
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r3 = r2;
                        closeable = closeable5;
                        r3.b(th);
                        if (th instanceof evenfall) {
                            throw th;
                        }
                        r3.a(th);
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
                    }
                }
                closeable = (Closeable) this.c;
                r3 = (w03) this.b;
                String str5 = (String) this.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    str2 = str5;
                    closeable2 = closeable;
                    r12 = r3;
                    objA3 = obj;
                    try {
                        gq0Var2 = (gq0) objA3;
                        this.a = r12;
                        this.b = closeable2;
                        this.c = gq0Var2;
                        this.d = 4;
                        objA4 = gq0.a(gq0Var2, str2, (String) null, false, (wretchedly.dern) this, 14);
                        if (objA4 != objBeachfront) {
                            r2 = r12;
                            spartacistVar = (spartacist) objA4;
                            if (spartacistVar instanceof tn0) {
                                interaction.saneness.attabal(closeable2, null);
                                return gq0Var2;
                            }
                            if (!(spartacistVar instanceof nn0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            y13.a((nn0) spartacistVar, false);
                            interaction.saneness.attabal(closeable2, null);
                            return null;
                        }
                        return objBeachfront;
                    } catch (Throwable th8) {
                        th = th8;
                        closeable = closeable2;
                        r3 = r12;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            }
            try {
                spartacistVar2 = (spartacist) objA2;
                if (spartacistVar2 instanceof tn0) {
                    interaction.saneness.attabal(r11, null);
                    return gq0Var;
                }
                if (spartacistVar2 instanceof nn0) {
                    throw new NoWhenBranchMatchedException();
                }
                y13.a((nn0) spartacistVar2, false);
                interaction.saneness.attabal(r11, null);
                return null;
            } catch (Throwable th10) {
                th = th10;
                A = r11;
                r4.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                r4.a(th);
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
        } catch (Throwable th11) {
            th = th11;
            r4.b(th);
            if (!(th instanceof evenfall)) {
                throw th;
            }
            r4.a(th);
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
        try {
            r3.b(th);
            if (th instanceof evenfall) {
                throw th;
            }
            r3.a(th);
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
        } catch (Throwable th12) {
            try {
                throw th12;
            } catch (Throwable th13) {
                interaction.saneness.attabal(closeable, th12);
                throw th13;
            }
        }
    }
}
