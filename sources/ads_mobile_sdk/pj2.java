package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import complexometry.formularize;
import formularization.beachfront;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.evenfall;
import saneness.laky;
import saneness.loun;
import saneness.naming;

/* JADX INFO: loaded from: classes.dex */
public final class pj2 {
    public final Context a;
    public final amphitheatre b;
    public final ug c;
    public final x d;
    public final naming e;
    public final saran f;
    public final ri2 g;
    public final long h;
    public final long i;
    public final formularization.attabal j;
    public final ArrayList k;

    public pj2(jk0 flags, Context context, amphitheatre clock, ug appState, x activityTracker, naming mediationAdapterProxyFactory, saran backgroundScope, loun traceLogger, ri2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(mediationAdapterProxyFactory, "mediationAdapterProxyFactory");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.a = context;
        this.b = clock;
        this.c = appState;
        this.d = activityTracker;
        this.e = mediationAdapterProxyFactory;
        this.f = backgroundScope;
        this.g = rootTraceCreator;
        this.h = flags.c0();
        this.i = p002kotlin.time.saneness.seminary(zs2.e.a(), flags.d0());
        this.j = beachfront.saneness(false, 1, null);
        this.k = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d6 A[Catch: all -> 0x01e6, TryCatch #4 {all -> 0x01e6, blocks: (B:110:0x01cf, B:112:0x01d6, B:114:0x01dd, B:116:0x01e1, B:118:0x01e5, B:121:0x01e9, B:122:0x01ee, B:123:0x01ef, B:124:0x01f6, B:125:0x01f7, B:126:0x01fe, B:127:0x01ff), top: B:139:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01dd A[Catch: all -> 0x01e6, TryCatch #4 {all -> 0x01e6, blocks: (B:110:0x01cf, B:112:0x01d6, B:114:0x01dd, B:116:0x01e1, B:118:0x01e5, B:121:0x01e9, B:122:0x01ee, B:123:0x01ef, B:124:0x01f6, B:125:0x01f7, B:126:0x01fe, B:127:0x01ff), top: B:139:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01e1 A[Catch: all -> 0x01e6, TryCatch #4 {all -> 0x01e6, blocks: (B:110:0x01cf, B:112:0x01d6, B:114:0x01dd, B:116:0x01e1, B:118:0x01e5, B:121:0x01e9, B:122:0x01ee, B:123:0x01ef, B:124:0x01f6, B:125:0x01f7, B:126:0x01fe, B:127:0x01ff), top: B:139:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01e5 A[Catch: all -> 0x01e6, TryCatch #4 {all -> 0x01e6, blocks: (B:110:0x01cf, B:112:0x01d6, B:114:0x01dd, B:116:0x01e1, B:118:0x01e5, B:121:0x01e9, B:122:0x01ee, B:123:0x01ef, B:124:0x01f6, B:125:0x01f7, B:126:0x01fe, B:127:0x01ff), top: B:139:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01e9 A[Catch: all -> 0x01e6, TryCatch #4 {all -> 0x01e6, blocks: (B:110:0x01cf, B:112:0x01d6, B:114:0x01dd, B:116:0x01e1, B:118:0x01e5, B:121:0x01e9, B:122:0x01ee, B:123:0x01ef, B:124:0x01f6, B:125:0x01f7, B:126:0x01fe, B:127:0x01ff), top: B:139:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ef A[Catch: all -> 0x01e6, TryCatch #4 {all -> 0x01e6, blocks: (B:110:0x01cf, B:112:0x01d6, B:114:0x01dd, B:116:0x01e1, B:118:0x01e5, B:121:0x01e9, B:122:0x01ee, B:123:0x01ef, B:124:0x01f6, B:125:0x01f7, B:126:0x01fe, B:127:0x01ff), top: B:139:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01f7 A[Catch: all -> 0x01e6, TryCatch #4 {all -> 0x01e6, blocks: (B:110:0x01cf, B:112:0x01d6, B:114:0x01dd, B:116:0x01e1, B:118:0x01e5, B:121:0x01e9, B:122:0x01ee, B:123:0x01ef, B:124:0x01f6, B:125:0x01f7, B:126:0x01fe, B:127:0x01ff), top: B:139:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ff A[Catch: all -> 0x01e6, TRY_LEAVE, TryCatch #4 {all -> 0x01e6, blocks: (B:110:0x01cf, B:112:0x01d6, B:114:0x01dd, B:116:0x01e1, B:118:0x01e5, B:121:0x01e9, B:122:0x01ee, B:123:0x01ef, B:124:0x01f6, B:125:0x01f7, B:126:0x01fe, B:127:0x01ff), top: B:139:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0110 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:57:0x0109, B:59:0x0110, B:61:0x0117, B:63:0x011b, B:65:0x011f, B:68:0x0123, B:69:0x0128, B:70:0x0129, B:71:0x0130, B:72:0x0131, B:73:0x0138, B:74:0x0139), top: B:132:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0117 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:57:0x0109, B:59:0x0110, B:61:0x0117, B:63:0x011b, B:65:0x011f, B:68:0x0123, B:69:0x0128, B:70:0x0129, B:71:0x0130, B:72:0x0131, B:73:0x0138, B:74:0x0139), top: B:132:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x011b A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:57:0x0109, B:59:0x0110, B:61:0x0117, B:63:0x011b, B:65:0x011f, B:68:0x0123, B:69:0x0128, B:70:0x0129, B:71:0x0130, B:72:0x0131, B:73:0x0138, B:74:0x0139), top: B:132:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x011f A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:57:0x0109, B:59:0x0110, B:61:0x0117, B:63:0x011b, B:65:0x011f, B:68:0x0123, B:69:0x0128, B:70:0x0129, B:71:0x0130, B:72:0x0131, B:73:0x0138, B:74:0x0139), top: B:132:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0123 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:57:0x0109, B:59:0x0110, B:61:0x0117, B:63:0x011b, B:65:0x011f, B:68:0x0123, B:69:0x0128, B:70:0x0129, B:71:0x0130, B:72:0x0131, B:73:0x0138, B:74:0x0139), top: B:132:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0129 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:57:0x0109, B:59:0x0110, B:61:0x0117, B:63:0x011b, B:65:0x011f, B:68:0x0123, B:69:0x0128, B:70:0x0129, B:71:0x0130, B:72:0x0131, B:73:0x0138, B:74:0x0139), top: B:132:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0131 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:57:0x0109, B:59:0x0110, B:61:0x0117, B:63:0x011b, B:65:0x011f, B:68:0x0123, B:69:0x0128, B:70:0x0129, B:71:0x0130, B:72:0x0131, B:73:0x0138, B:74:0x0139), top: B:132:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0139 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:57:0x0109, B:59:0x0110, B:61:0x0117, B:63:0x011b, B:65:0x011f, B:68:0x0123, B:69:0x0128, B:70:0x0129, B:71:0x0130, B:72:0x0131, B:73:0x0138, B:74:0x0139), top: B:132:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final Object a(pj2 pj2Var, Map.Entry entry, formularize formularizeVar, Map map, String str, liquory.attabal attabalVar, wretchedly.dern dernVar) {
        oj2 oj2Var;
        w03 w03VarA;
        TimeoutCancellationException th;
        w03 w03Var;
        w03 w03Var2;
        Map mapP;
        w03 w03VarA2;
        TimeoutCancellationException th2;
        w03 w03Var3;
        w03 w03Var4;
        Map mapP2;
        pj2Var.getClass();
        if (dernVar instanceof oj2) {
            oj2Var = (oj2) dernVar;
            int i = oj2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                oj2Var.e = i - Integer.MIN_VALUE;
            } else {
                oj2Var = new oj2(pj2Var, dernVar);
            }
        } else {
            oj2Var = new oj2(pj2Var, dernVar);
        }
        oj2 oj2Var2 = oj2Var;
        Object obj = oj2Var2.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = oj2Var2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                w03Var3 = oj2Var2.b;
                w03Var4 = oj2Var2.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    Unit unit = Unit.f29295attabal;
                    interaction.saneness.attabal(w03Var3, null);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    w03VarA2 = w03Var4;
                    try {
                        w03VarA2.b(th2);
                        if (!(th2 instanceof evenfall)) {
                            throw th2;
                        }
                        w03VarA2.a(th2);
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
                            interaction.saneness.attabal(w03Var3, th4);
                            throw th5;
                        }
                    }
                }
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = oj2Var2.b;
            w03Var2 = oj2Var2.a;
            try {
                p002kotlin.dern.saneness(obj);
                Unit unit2 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var, null);
                return unit2;
            } catch (Throwable th6) {
                th = th6;
                w03VarA = w03Var2;
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
        p002kotlin.dern.saneness(obj);
        ri2 ri2Var = pj2Var.g;
        no0 no0Var = no0.CUI_NAME_RTB_ADAPTER_SIGNALS;
        List listFormularize = adultoid.formularize();
        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
        if (j13.b().a == null) {
            w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                try {
                    j13.a().a.c.d = (String) entry.getKey();
                    String str2 = (String) entry.getKey();
                    Bundle bundle = formularizeVar.impassible().get(str2);
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    sl slVar = (sl) map.get(str2);
                    Bundle bundle2 = new Bundle();
                    if (slVar != null && (mapP2 = slVar.p()) != null) {
                        for (Map.Entry entry2 : mapP2.entrySet()) {
                            bundle2.putString((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    oj2Var2.a = w03VarA2;
                    oj2Var2.b = w03VarA2;
                    oj2Var2.e = 1;
                    if (pj2Var.a(bundle2, bundle, attabalVar, str2, str, oj2Var2) != objBeachfront) {
                        w03Var3 = w03VarA2;
                        w03Var4 = w03Var3;
                        Unit unit3 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var3, null);
                        return unit3;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    w03Var3 = w03VarA2;
                    w03VarA2.b(th2);
                    if (!(th2 instanceof evenfall)) {
                        throw th2;
                    }
                    w03VarA2.a(th2);
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
            } catch (Throwable th10) {
                th2 = th10;
            }
        } else {
            w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                try {
                    j13.a().a.c.d = (String) entry.getKey();
                    String str3 = (String) entry.getKey();
                    Bundle bundle3 = formularizeVar.impassible().get(str3);
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    Bundle bundle4 = bundle3;
                    sl slVar2 = (sl) map.get(str3);
                    Bundle bundle5 = new Bundle();
                    if (slVar2 != null && (mapP = slVar2.p()) != null) {
                        for (Map.Entry entry3 : mapP.entrySet()) {
                            bundle5.putString((String) entry3.getKey(), (String) entry3.getValue());
                        }
                    }
                    oj2Var2.a = w03VarA;
                    oj2Var2.b = w03VarA;
                    oj2Var2.e = 2;
                    if (pj2Var.a(bundle5, bundle4, attabalVar, str3, str, oj2Var2) != objBeachfront) {
                        w03Var = w03VarA;
                        w03Var2 = w03Var;
                        Unit unit4 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var, null);
                        return unit4;
                    }
                } catch (Throwable th11) {
                    th = th11;
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
            } catch (Throwable th12) {
                th = th12;
            }
        }
        return objBeachfront;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(liquory.attabal attabalVar, String str, formularize formularizeVar, wretchedly.dern dernVar) {
        jj2 jj2Var;
        pj2 pj2Var;
        pj2 pj2Var2;
        formularization.attabal attabalVar2;
        if (dernVar instanceof jj2) {
            jj2Var = (jj2) dernVar;
            int i = jj2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jj2Var.e = i - Integer.MIN_VALUE;
            } else {
                jj2Var = new jj2(this, dernVar);
            }
        } else {
            jj2Var = new jj2(this, dernVar);
        }
        jj2 jj2Var2 = jj2Var;
        Object objSaneness = jj2Var2.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = jj2Var2.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objSaneness);
            laky lakyVar = ip0.f;
            long j = this.i;
            lj2 lj2Var = new lj2(this, formularizeVar, str, attabalVar, null);
            jj2Var2.a = this;
            jj2Var2.e = 1;
            objSaneness = lakyVar.saneness(j, lj2Var, jj2Var2);
            if (objSaneness != objBeachfront) {
                pj2Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            pj2Var = jj2Var2.a;
            p002kotlin.dern.saneness(objSaneness);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar2 = jj2Var2.b;
            pj2Var2 = jj2Var2.a;
            p002kotlin.dern.saneness(objSaneness);
        }
        try {
            return pj2Var2.k;
        } finally {
            attabalVar2.wireman(null);
        }
        formularization.attabal attabalVar3 = pj2Var.j;
        jj2Var2.a = pj2Var;
        jj2Var2.b = attabalVar3;
        jj2Var2.e = 2;
        if (attabalVar3.attabal(null, jj2Var2) != objBeachfront) {
            pj2Var2 = pj2Var;
            attabalVar2 = attabalVar3;
            return pj2Var2.k;
        }
        return objBeachfront;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
    
        if (r1.attabal(null, r8) == r9) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.os.Bundle r22, android.os.Bundle r23, liquory.attabal r24, java.lang.String r25, java.lang.String r26, wretchedly.dern r27) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pj2.a(android.os.Bundle, android.os.Bundle, liquory.attabal, java.lang.String, java.lang.String, wretchedly.dern):java.lang.Object");
    }
}
