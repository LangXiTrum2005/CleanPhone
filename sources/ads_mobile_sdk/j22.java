package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.inrooted;

/* JADX INFO: loaded from: classes.dex */
public final class j22 extends SuspendLambda implements Function2 {
    public k22 a;
    public String b;
    public w03 c;
    public w03 d;
    public formularization.attabal e;
    public int f;
    public final /* synthetic */ k22 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j22(k22 k22Var, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.g = k22Var;
        this.h = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new j22(this.g, this.h, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j22(this.g, this.h, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d1 A[Catch: all -> 0x01d2, TryCatch #1 {all -> 0x01d2, blocks: (B:92:0x01bb, B:94:0x01c2, B:96:0x01c9, B:98:0x01cd, B:100:0x01d1, B:103:0x01d5, B:104:0x01da, B:105:0x01db, B:106:0x01e2, B:107:0x01e3, B:108:0x01ea, B:109:0x01eb), top: B:115:0x01bb }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01d5 A[Catch: all -> 0x01d2, TryCatch #1 {all -> 0x01d2, blocks: (B:92:0x01bb, B:94:0x01c2, B:96:0x01c9, B:98:0x01cd, B:100:0x01d1, B:103:0x01d5, B:104:0x01da, B:105:0x01db, B:106:0x01e2, B:107:0x01e3, B:108:0x01ea, B:109:0x01eb), top: B:115:0x01bb }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01db A[Catch: all -> 0x01d2, TryCatch #1 {all -> 0x01d2, blocks: (B:92:0x01bb, B:94:0x01c2, B:96:0x01c9, B:98:0x01cd, B:100:0x01d1, B:103:0x01d5, B:104:0x01da, B:105:0x01db, B:106:0x01e2, B:107:0x01e3, B:108:0x01ea, B:109:0x01eb), top: B:115:0x01bb }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01e3 A[Catch: all -> 0x01d2, TryCatch #1 {all -> 0x01d2, blocks: (B:92:0x01bb, B:94:0x01c2, B:96:0x01c9, B:98:0x01cd, B:100:0x01d1, B:103:0x01d5, B:104:0x01da, B:105:0x01db, B:106:0x01e2, B:107:0x01e3, B:108:0x01ea, B:109:0x01eb), top: B:115:0x01bb }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01eb A[Catch: all -> 0x01d2, TRY_LEAVE, TryCatch #1 {all -> 0x01d2, blocks: (B:92:0x01bb, B:94:0x01c2, B:96:0x01c9, B:98:0x01cd, B:100:0x01d1, B:103:0x01d5, B:104:0x01da, B:105:0x01db, B:106:0x01e2, B:107:0x01e3, B:108:0x01ea, B:109:0x01eb), top: B:115:0x01bb }] */
    /* JADX WARN: Code duplicated, block: B:27:0x008f A[Catch: all -> 0x00ab, TryCatch #5 {all -> 0x00ab, blocks: (B:25:0x008b, B:27:0x008f, B:30:0x009e, B:33:0x00ad, B:35:0x00d0, B:36:0x00d3), top: B:122:0x008b, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0 A[Catch: all -> 0x00ab, TryCatch #5 {all -> 0x00ab, blocks: (B:25:0x008b, B:27:0x008f, B:30:0x009e, B:33:0x00ad, B:35:0x00d0, B:36:0x00d3), top: B:122:0x008b, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff A[Catch: all -> 0x010f, TryCatch #9 {all -> 0x010f, blocks: (B:44:0x00f8, B:46:0x00ff, B:48:0x0106, B:50:0x010a, B:52:0x010e, B:55:0x0112, B:56:0x0117, B:57:0x0118, B:58:0x011f, B:59:0x0120, B:60:0x0127, B:61:0x0128), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0106 A[Catch: all -> 0x010f, TryCatch #9 {all -> 0x010f, blocks: (B:44:0x00f8, B:46:0x00ff, B:48:0x0106, B:50:0x010a, B:52:0x010e, B:55:0x0112, B:56:0x0117, B:57:0x0118, B:58:0x011f, B:59:0x0120, B:60:0x0127, B:61:0x0128), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x010a A[Catch: all -> 0x010f, TryCatch #9 {all -> 0x010f, blocks: (B:44:0x00f8, B:46:0x00ff, B:48:0x0106, B:50:0x010a, B:52:0x010e, B:55:0x0112, B:56:0x0117, B:57:0x0118, B:58:0x011f, B:59:0x0120, B:60:0x0127, B:61:0x0128), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010e A[Catch: all -> 0x010f, TryCatch #9 {all -> 0x010f, blocks: (B:44:0x00f8, B:46:0x00ff, B:48:0x0106, B:50:0x010a, B:52:0x010e, B:55:0x0112, B:56:0x0117, B:57:0x0118, B:58:0x011f, B:59:0x0120, B:60:0x0127, B:61:0x0128), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[Catch: all -> 0x010f, TryCatch #9 {all -> 0x010f, blocks: (B:44:0x00f8, B:46:0x00ff, B:48:0x0106, B:50:0x010a, B:52:0x010e, B:55:0x0112, B:56:0x0117, B:57:0x0118, B:58:0x011f, B:59:0x0120, B:60:0x0127, B:61:0x0128), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0118 A[Catch: all -> 0x010f, TryCatch #9 {all -> 0x010f, blocks: (B:44:0x00f8, B:46:0x00ff, B:48:0x0106, B:50:0x010a, B:52:0x010e, B:55:0x0112, B:56:0x0117, B:57:0x0118, B:58:0x011f, B:59:0x0120, B:60:0x0127, B:61:0x0128), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0120 A[Catch: all -> 0x010f, TryCatch #9 {all -> 0x010f, blocks: (B:44:0x00f8, B:46:0x00ff, B:48:0x0106, B:50:0x010a, B:52:0x010e, B:55:0x0112, B:56:0x0117, B:57:0x0118, B:58:0x011f, B:59:0x0120, B:60:0x0127, B:61:0x0128), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0128 A[Catch: all -> 0x010f, TRY_LEAVE, TryCatch #9 {all -> 0x010f, blocks: (B:44:0x00f8, B:46:0x00ff, B:48:0x0106, B:50:0x010a, B:52:0x010e, B:55:0x0112, B:56:0x0117, B:57:0x0118, B:58:0x011f, B:59:0x0120, B:60:0x0127, B:61:0x0128), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0151 A[Catch: all -> 0x016d, TryCatch #8 {all -> 0x016d, blocks: (B:71:0x014d, B:73:0x0151, B:76:0x0160, B:79:0x016f, B:81:0x0192, B:82:0x0195), top: B:127:0x014d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0192 A[Catch: all -> 0x016d, TryCatch #8 {all -> 0x016d, blocks: (B:71:0x014d, B:73:0x0151, B:76:0x0160, B:79:0x016f, B:81:0x0192, B:82:0x0195), top: B:127:0x014d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c2 A[Catch: all -> 0x01d2, TryCatch #1 {all -> 0x01d2, blocks: (B:92:0x01bb, B:94:0x01c2, B:96:0x01c9, B:98:0x01cd, B:100:0x01d1, B:103:0x01d5, B:104:0x01da, B:105:0x01db, B:106:0x01e2, B:107:0x01e3, B:108:0x01ea, B:109:0x01eb), top: B:115:0x01bb }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c9 A[Catch: all -> 0x01d2, TryCatch #1 {all -> 0x01d2, blocks: (B:92:0x01bb, B:94:0x01c2, B:96:0x01c9, B:98:0x01cd, B:100:0x01d1, B:103:0x01d5, B:104:0x01da, B:105:0x01db, B:106:0x01e2, B:107:0x01e3, B:108:0x01ea, B:109:0x01eb), top: B:115:0x01bb }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01cd A[Catch: all -> 0x01d2, TryCatch #1 {all -> 0x01d2, blocks: (B:92:0x01bb, B:94:0x01c2, B:96:0x01c9, B:98:0x01cd, B:100:0x01d1, B:103:0x01d5, B:104:0x01da, B:105:0x01db, B:106:0x01e2, B:107:0x01e3, B:108:0x01ea, B:109:0x01eb), top: B:115:0x01bb }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k22 k22Var;
        String str;
        w03 w03VarA;
        TimeoutCancellationException timeoutCancellationException;
        w03 w03Var;
        formularization.attabal attabalVar;
        w03 w03Var2;
        w03 w03VarA2;
        TimeoutCancellationException timeoutCancellationException2;
        w03 w03Var3;
        formularization.attabal attabalVar2;
        w03 w03Var4;
        inrooted inrootedVar;
        monroe monroeVar;
        Context context;
        Context applicationContext;
        inrooted inrootedVar2;
        monroe monroeVar2;
        Context context2;
        Context applicationContext2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.f;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            k22Var = this.g;
            ri2 ri2Var = k22Var.e;
            no0 no0Var = no0.CUI_NAME_PLAY_PREWARM;
            str = this.h;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    attabalVar2 = k22Var.f;
                    this.a = k22Var;
                    this.b = str;
                    this.c = w03VarA2;
                    this.d = w03VarA2;
                    this.e = attabalVar2;
                    this.f = 1;
                    if (attabalVar2.attabal(null, this) != objBeachfront) {
                        w03Var4 = w03VarA2;
                        inrootedVar = k22Var.h;
                        if (inrootedVar == null) {
                            context = k22Var.d.a;
                            applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            f62 f62Var = new f62(new k62(context));
                            Intrinsics.checkNotNullExpressionValue(f62Var, "create(...)");
                            k22Var.h = f62Var;
                            inrootedVar = f62Var;
                        }
                        k22Var.b.getClass();
                        k22Var.g = SystemClock.elapsedRealtime();
                        a42 a42Var = new a42();
                        a42Var.a.add(str);
                        ((f62) inrootedVar).a(new b42(a42Var));
                        monroeVar = k22Var.i;
                        if (monroeVar != null) {
                            monroe.attabal.attabal(monroeVar, null, 1, null);
                        }
                        k22Var.i = cutely.wireman(k22Var.a, null, null, new i22(k22Var, null), 3, null);
                        Unit unit = Unit.f29295attabal;
                        attabalVar2.wireman(null);
                        interaction.saneness.attabal(w03VarA2, null);
                    }
                } catch (Throwable th) {
                    timeoutCancellationException2 = th;
                    w03Var3 = w03VarA2;
                    w03VarA2.b(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof evenfall)) {
                        throw timeoutCancellationException2;
                    }
                    w03VarA2.a(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                        throw new cp0(timeoutCancellationException2);
                    }
                    if (!(timeoutCancellationException2 instanceof CancellationException)) {
                        throw new bn0(timeoutCancellationException2);
                    }
                    if (timeoutCancellationException2 instanceof yn0) {
                        throw timeoutCancellationException2;
                    }
                    throw new gn0(timeoutCancellationException2);
                }
            } else {
                w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    attabalVar = k22Var.f;
                    this.a = k22Var;
                    this.b = str;
                    this.c = w03VarA;
                    this.d = w03VarA;
                    this.e = attabalVar;
                    this.f = 2;
                    if (attabalVar.attabal(null, this) != objBeachfront) {
                        w03Var2 = w03VarA;
                        inrootedVar2 = k22Var.h;
                        if (inrootedVar2 == null) {
                            context2 = k22Var.d.a;
                            applicationContext2 = context2.getApplicationContext();
                            if (applicationContext2 != null) {
                                context2 = applicationContext2;
                            }
                            f62 f62Var2 = new f62(new k62(context2));
                            Intrinsics.checkNotNullExpressionValue(f62Var2, "create(...)");
                            k22Var.h = f62Var2;
                            inrootedVar2 = f62Var2;
                        }
                        k22Var.b.getClass();
                        k22Var.g = SystemClock.elapsedRealtime();
                        a42 a42Var2 = new a42();
                        a42Var2.a.add(str);
                        ((f62) inrootedVar2).a(new b42(a42Var2));
                        monroeVar2 = k22Var.i;
                        if (monroeVar2 != null) {
                            monroe.attabal.attabal(monroeVar2, null, 1, null);
                        }
                        k22Var.i = cutely.wireman(k22Var.a, null, null, new i22(k22Var, null), 3, null);
                        Unit unit2 = Unit.f29295attabal;
                        attabalVar.wireman(null);
                        interaction.saneness.attabal(w03VarA, null);
                    }
                } catch (Throwable th2) {
                    timeoutCancellationException = th2;
                    w03Var = w03VarA;
                    w03VarA.b(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof evenfall)) {
                        throw timeoutCancellationException;
                    }
                    w03VarA.a(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                        throw new cp0(timeoutCancellationException);
                    }
                    if (!(timeoutCancellationException instanceof CancellationException)) {
                        throw new bn0(timeoutCancellationException);
                    }
                    if (timeoutCancellationException instanceof yn0) {
                        throw timeoutCancellationException;
                    }
                    throw new gn0(timeoutCancellationException);
                }
            }
            return objBeachfront;
        }
        if (i == 1) {
            formularization.attabal attabalVar3 = this.e;
            w03VarA2 = this.d;
            w03Var4 = this.c;
            str = this.b;
            k22Var = this.a;
            try {
                p002kotlin.dern.saneness(obj);
                attabalVar2 = attabalVar3;
                try {
                    inrootedVar = k22Var.h;
                    if (inrootedVar == null) {
                        context = k22Var.d.a;
                        applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        f62 f62Var3 = new f62(new k62(context));
                        Intrinsics.checkNotNullExpressionValue(f62Var3, "create(...)");
                        k22Var.h = f62Var3;
                        inrootedVar = f62Var3;
                    }
                    k22Var.b.getClass();
                    k22Var.g = SystemClock.elapsedRealtime();
                    a42 a42Var3 = new a42();
                    a42Var3.a.add(str);
                    ((f62) inrootedVar).a(new b42(a42Var3));
                    monroeVar = k22Var.i;
                    if (monroeVar != null) {
                        monroe.attabal.attabal(monroeVar, null, 1, null);
                    }
                    k22Var.i = cutely.wireman(k22Var.a, null, null, new i22(k22Var, null), 3, null);
                    Unit unit3 = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    interaction.saneness.attabal(w03VarA2, null);
                } catch (Throwable th3) {
                    attabalVar2.wireman(null);
                    throw th3;
                }
            } catch (Throwable th4) {
                timeoutCancellationException2 = th4;
                w03Var3 = w03VarA2;
                w03VarA2 = w03Var4;
                try {
                    w03VarA2.b(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof evenfall)) {
                        throw timeoutCancellationException2;
                    }
                    w03VarA2.a(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                        throw new cp0(timeoutCancellationException2);
                    }
                    if (!(timeoutCancellationException2 instanceof CancellationException)) {
                        throw new bn0(timeoutCancellationException2);
                    }
                    if (timeoutCancellationException2 instanceof yn0) {
                        throw timeoutCancellationException2;
                    }
                    throw new gn0(timeoutCancellationException2);
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        interaction.saneness.attabal(w03Var3, th5);
                        throw th6;
                    }
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar4 = this.e;
            w03VarA = this.d;
            w03Var2 = this.c;
            str = this.b;
            k22Var = this.a;
            try {
                p002kotlin.dern.saneness(obj);
                attabalVar = attabalVar4;
                try {
                    inrootedVar2 = k22Var.h;
                    if (inrootedVar2 == null) {
                        context2 = k22Var.d.a;
                        applicationContext2 = context2.getApplicationContext();
                        if (applicationContext2 != null) {
                            context2 = applicationContext2;
                        }
                        f62 f62Var4 = new f62(new k62(context2));
                        Intrinsics.checkNotNullExpressionValue(f62Var4, "create(...)");
                        k22Var.h = f62Var4;
                        inrootedVar2 = f62Var4;
                    }
                    k22Var.b.getClass();
                    k22Var.g = SystemClock.elapsedRealtime();
                    a42 a42Var4 = new a42();
                    a42Var4.a.add(str);
                    ((f62) inrootedVar2).a(new b42(a42Var4));
                    monroeVar2 = k22Var.i;
                    if (monroeVar2 != null) {
                        monroe.attabal.attabal(monroeVar2, null, 1, null);
                    }
                    k22Var.i = cutely.wireman(k22Var.a, null, null, new i22(k22Var, null), 3, null);
                    Unit unit4 = Unit.f29295attabal;
                    attabalVar.wireman(null);
                    interaction.saneness.attabal(w03VarA, null);
                } catch (Throwable th7) {
                    attabalVar.wireman(null);
                    throw th7;
                }
            } catch (Throwable th8) {
                timeoutCancellationException = th8;
                w03Var = w03VarA;
                w03VarA = w03Var2;
                try {
                    w03VarA.b(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof evenfall)) {
                        throw timeoutCancellationException;
                    }
                    w03VarA.a(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                        throw new cp0(timeoutCancellationException);
                    }
                    if (!(timeoutCancellationException instanceof CancellationException)) {
                        throw new bn0(timeoutCancellationException);
                    }
                    if (timeoutCancellationException instanceof yn0) {
                        throw timeoutCancellationException;
                    }
                    throw new gn0(timeoutCancellationException);
                } catch (Throwable th9) {
                    try {
                        throw th9;
                    } catch (Throwable th10) {
                        interaction.saneness.attabal(w03Var, th9);
                        throw th10;
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }
}
