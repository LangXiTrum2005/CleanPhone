package ads_mobile_sdk;

import com.google.common.base.triweekly;
import com.google.gson.Gson;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.kaif;
import saneness.loun;
import saneness.spartacist;
import saneness.supercargo;
import svd.ClientRequestBuildingData;
import svd.arytenoidectomy;
import svd.polloi;

/* JADX INFO: loaded from: classes.dex */
public final class uq2 {
    public final saran a;
    public final CoroutineContext b;
    public final String c;
    public final int d;
    public final adjudge.saneness e;
    public final ri2 f;
    public final l13 g;
    public final op2 h;
    public final polloi i;
    public final supercargo j;
    public final kaif k;
    public final jk0 l;
    public final jf2 m;
    public final loun n;
    public final Gson o;

    public uq2(saran loaderScope, CoroutineContext backgroundContext, String requestId, int i, adjudge.saneness signalRequest, ri2 rootTraceCreator, l13 traceMetaSet, op2 signalGenerationMap, polloi signalsProvider, supercargo javascriptEngine, kaif randomGenerator, jk0 flags, jf2 requestBuilder, loun traceLogger, Gson gson) {
        Intrinsics.checkNotNullParameter(loaderScope, "loaderScope");
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(signalRequest, "signalRequest");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(signalGenerationMap, "signalGenerationMap");
        Intrinsics.checkNotNullParameter(signalsProvider, "signalsProvider");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.a = loaderScope;
        this.b = backgroundContext;
        this.c = requestId;
        this.d = i;
        this.e = signalRequest;
        this.f = rootTraceCreator;
        this.g = traceMetaSet;
        this.h = signalGenerationMap;
        this.i = signalsProvider;
        this.j = javascriptEngine;
        this.k = randomGenerator;
        this.l = flags;
        this.m = requestBuilder;
        this.n = traceLogger;
        this.o = gson;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x0124  */
    /* JADX WARN: Code duplicated, block: B:38:0x0128  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x0128, please report this as an issue */
    public final Object a(arytenoidectomy arytenoidectomyVar, wretchedly.dern dernVar) {
        gq2 gq2Var;
        arytenoidectomy arytenoidectomyVar2;
        uq2 uq2Var;
        arytenoidectomy arytenoidectomyVar3;
        spartacist spartacistVar;
        if (dernVar instanceof gq2) {
            gq2Var = (gq2) dernVar;
            int i = gq2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gq2Var.e = i - Integer.MIN_VALUE;
            } else {
                gq2Var = new gq2(this, dernVar);
            }
        } else {
            gq2Var = new gq2(this, dernVar);
        }
        gq2 gq2Var2 = gq2Var;
        Object objE = gq2Var2.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = gq2Var2.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objE);
            supercargo supercargoVar = this.j;
            gq2Var2.a = this;
            arytenoidectomyVar2 = arytenoidectomyVar;
            gq2Var2.b = arytenoidectomyVar2;
            gq2Var2.e = 1;
            objE = ((y91) supercargoVar).e(gq2Var2);
            if (objE != objBeachfront) {
                uq2Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            arytenoidectomyVar2 = gq2Var2.b;
            uq2Var = (uq2) gq2Var2.a;
            p002kotlin.dern.saneness(objE);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arytenoidectomyVar3 = (arytenoidectomy) gq2Var2.a;
            p002kotlin.dern.saneness(objE);
        }
        spartacistVar = (spartacist) objE;
        triweekly triweeklyVar = kn0.a;
        kn0.a(new hq2(spartacistVar));
        if (spartacistVar instanceof tn0) {
            if (spartacistVar instanceof nn0) {
                arytenoidectomyVar3.clientRequestBuildingData = new ClientRequestBuildingData(null, null, "CSRB error: " + spartacistVar, null, null, null, 247);
            }
            return spartacistVar;
        }
        tn0 tn0Var = (tn0) spartacistVar;
        String str = ((xm) tn0Var.a()).f;
        List list = ((xm) tn0Var.a()).a;
        arytenoidectomyVar3.clientRequestBuildingData = new ClientRequestBuildingData(null, null, list != null ? CollectionsKt.preterite(list, ",", null, null, 0, null, null, 62, null) : null, null, arytenoidectomyVar3.requestId, str, 87);
        String str2 = ((xm) tn0Var.a()).e;
        String str3 = ((xm) tn0Var.a()).f;
        kn0.a(new iq2(str2));
        kn0.a(new jq2(str3));
        return spartacistVar;
        spartacist spartacistVar2 = (spartacist) objE;
        if (spartacistVar2 instanceof nn0) {
            nn0 nn0Var = (nn0) spartacistVar2;
            arytenoidectomyVar2.clientRequestBuildingData = new ClientRequestBuildingData(null, null, "CSRB error: " + nn0Var, null, null, null, 247);
            return nn0Var;
        }
        Intrinsics.competently(spartacistVar2, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        ((tn0) spartacistVar2).getClass();
        jf2 jf2Var = uq2Var.m;
        n32 n32VarW = uq2Var.l.W();
        b12 b12VarV = uq2Var.l.V();
        Map mapP = uq2Var.l.p();
        gq2Var2.a = arytenoidectomyVar2;
        gq2Var2.b = null;
        gq2Var2.e = 2;
        arytenoidectomy arytenoidectomyVar4 = arytenoidectomyVar2;
        objE = jf2Var.a(arytenoidectomyVar4, n32VarW, b12VarV, mapP, gq2Var2);
        if (objE != objBeachfront) {
            arytenoidectomyVar3 = arytenoidectomyVar4;
            spartacistVar = (spartacist) objE;
            triweekly triweeklyVar2 = kn0.a;
            kn0.a(new hq2(spartacistVar));
            if (spartacistVar instanceof tn0) {
                if (spartacistVar instanceof nn0) {
                    arytenoidectomyVar3.clientRequestBuildingData = new ClientRequestBuildingData(null, null, "CSRB error: " + spartacistVar, null, null, null, 247);
                }
                return spartacistVar;
            }
            tn0 tn0Var2 = (tn0) spartacistVar;
            String str4 = ((xm) tn0Var2.a()).f;
            List list2 = ((xm) tn0Var2.a()).a;
            arytenoidectomyVar3.clientRequestBuildingData = new ClientRequestBuildingData(null, null, list2 != null ? CollectionsKt.preterite(list2, ",", null, null, 0, null, null, 62, null) : null, null, arytenoidectomyVar3.requestId, str4, 87);
            String str5 = ((xm) tn0Var2.a()).e;
            String str6 = ((xm) tn0Var2.a()).f;
            kn0.a(new iq2(str5));
            kn0.a(new jq2(str6));
            return spartacistVar;
        }
        return objBeachfront;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x013e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0201  */
    /* JADX WARN: Code duplicated, block: B:96:0x020c  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018f, code lost:
    
        if (r1 == r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021e, code lost:
    
        if (r5.a(r6, r8, r7, r2) == r3) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(wretchedly.dern r18) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uq2.a(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c5 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #9 {all -> 0x0050, blocks: (B:24:0x004c, B:39:0x0082, B:52:0x00c1, B:54:0x00c5, B:50:0x0095, B:51:0x00ac), top: B:131:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:99:0x0165 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #11 {all -> 0x0037, blocks: (B:13:0x0032, B:84:0x0122, B:97:0x0161, B:99:0x0165, B:95:0x0135, B:96:0x014c), top: B:131:0x0028 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [ads_mobile_sdk.tq2, wretchedly.dern] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r14v0, types: [ads_mobile_sdk.uq2] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v37, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r15v14, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v6, types: [ads_mobile_sdk.w03] */
    public static Object a(uq2 uq2Var, wretchedly.dern dernVar) {
        ?? tq2Var;
        ?? r0;
        TimeoutCancellationException th;
        ?? r15;
        ?? r1;
        TimeoutCancellationException th2;
        ?? r16;
        w03 w03Var;
        Exception exception;
        w03 w03Var2;
        TimeoutCancellationException exception2;
        w03 w03Var3;
        Exception exception3;
        w03 w03Var4;
        TimeoutCancellationException exception4;
        Object on0Var;
        if (dernVar instanceof tq2) {
            tq2 tq2Var2 = (tq2) dernVar;
            int i = tq2Var2.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tq2Var2.e = i - Integer.MIN_VALUE;
                tq2Var = tq2Var2;
            } else {
                tq2Var = new tq2(uq2Var, dernVar);
            }
        } else {
            tq2Var = new tq2(uq2Var, dernVar);
        }
        Object obj = tq2Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = tq2Var.e;
        int i3 = 3;
        TimeoutCancellationException timeoutCancellationException = null;
        try {
            try {
                if (i2 == 0) {
                    p002kotlin.dern.saneness(obj);
                    ri2 ri2Var = uq2Var.f;
                    no0 no0Var = no0.CUI_NAME_SCAR_SIGNALS;
                    l13 l13Var = uq2Var.g;
                    List listFormularize = adultoid.formularize();
                    if (j13.b().a == null) {
                        v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                        try {
                            tq2Var.a = v62VarA;
                            tq2Var.b = v62VarA;
                            tq2Var.e = 1;
                            Object objA = uq2Var.a(tq2Var);
                            if (objA != objBeachfront) {
                                v62 v62Var = v62VarA;
                                obj = objA;
                                w03Var4 = v62Var;
                                w03Var3 = v62Var;
                                on0Var = (spartacist) obj;
                                tq2Var = w03Var3;
                                uq2Var = w03Var4;
                                if (on0Var instanceof nn0) {
                                    y13.a((nn0) on0Var, false);
                                }
                                interaction.saneness.attabal(uq2Var, null);
                            }
                        } catch (TimeoutCancellationException e) {
                            w03Var3 = v62VarA;
                            exception4 = e;
                            w03Var4 = w03Var3;
                            Intrinsics.checkNotNullParameter(exception4, "exception");
                            w03 w03VarA = j13.a();
                            w03VarA.e().m = false;
                            w03VarA.a(exception4);
                            on0Var = new un0(timeoutCancellationException, i3);
                            tq2Var = w03Var3;
                            uq2Var = w03Var4;
                        } catch (Exception e2) {
                            w03Var3 = v62VarA;
                            exception3 = e2;
                            w03Var4 = w03Var3;
                            Intrinsics.checkNotNullParameter(exception3, "exception");
                            w03 w03VarA2 = j13.a();
                            w03VarA2.e().m = false;
                            w03VarA2.a(exception3);
                            on0Var = new on0(exception3, null, null, 6);
                            tq2Var = w03Var3;
                            uq2Var = w03Var4;
                        } catch (Throwable th3) {
                            th2 = th3;
                            r1 = v62VarA;
                            r16 = v62VarA;
                            try {
                                r16.b(th2);
                                if (!(th2 instanceof evenfall)) {
                                    r16.a(th2);
                                    if (!(th2 instanceof TimeoutCancellationException)) {
                                        if (!(th2 instanceof CancellationException)) {
                                            if (th2 instanceof yn0) {
                                                throw th2;
                                            }
                                            throw new gn0(th2);
                                        }
                                        throw new bn0(th2);
                                    }
                                    throw new cp0(th2);
                                }
                                throw th2;
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    interaction.saneness.attabal(r1, th4);
                                    throw th5;
                                }
                            }
                        }
                    } else {
                        w03 w03VarA3 = j13.a(no0Var, adultoid.formularize(), true);
                        try {
                            tq2Var.a = w03VarA3;
                            tq2Var.b = w03VarA3;
                            tq2Var.e = 2;
                            Object objA2 = uq2Var.a(tq2Var);
                            if (objA2 != objBeachfront) {
                                w03 w03Var5 = w03VarA3;
                                obj = objA2;
                                w03Var2 = w03Var5;
                                w03Var = w03Var5;
                                on0Var = (spartacist) obj;
                                tq2Var = w03Var;
                                uq2Var = w03Var2;
                                if (on0Var instanceof nn0) {
                                    y13.a((nn0) on0Var, false);
                                }
                                interaction.saneness.attabal(uq2Var, null);
                            }
                        } catch (TimeoutCancellationException e3) {
                            w03Var = w03VarA3;
                            exception2 = e3;
                            w03Var2 = w03Var;
                            Intrinsics.checkNotNullParameter(exception2, "exception");
                            w03 w03VarA4 = j13.a();
                            w03VarA4.e().m = false;
                            w03VarA4.a(exception2);
                            on0Var = new un0(timeoutCancellationException, i3);
                            tq2Var = w03Var;
                            uq2Var = w03Var2;
                        } catch (Exception e4) {
                            w03Var = w03VarA3;
                            exception = e4;
                            w03Var2 = w03Var;
                            Intrinsics.checkNotNullParameter(exception, "exception");
                            w03 w03VarA5 = j13.a();
                            w03VarA5.e().m = false;
                            w03VarA5.a(exception);
                            on0Var = new on0(exception, null, null, 6);
                            tq2Var = w03Var;
                            uq2Var = w03Var2;
                        } catch (Throwable th6) {
                            th = th6;
                            r0 = w03VarA3;
                            r15 = w03VarA3;
                            try {
                                r15.b(th);
                                if (!(th instanceof evenfall)) {
                                    r15.a(th);
                                    if (!(th instanceof TimeoutCancellationException)) {
                                        if (!(th instanceof CancellationException)) {
                                            if (th instanceof yn0) {
                                                throw th;
                                            }
                                            throw new gn0(th);
                                        }
                                        throw new bn0(th);
                                    }
                                    throw new cp0(th);
                                }
                                throw th;
                            } catch (Throwable th7) {
                                try {
                                    throw th7;
                                } catch (Throwable th8) {
                                    interaction.saneness.attabal(r0, th7);
                                    throw th8;
                                }
                            }
                        }
                    }
                    return objBeachfront;
                }
                if (i2 == 1) {
                    w03Var4 = tq2Var.b;
                    w03Var3 = tq2Var.a;
                    try {
                        p002kotlin.dern.saneness(obj);
                        w03Var3 = w03Var3;
                        w03Var4 = w03Var4;
                        on0Var = (spartacist) obj;
                        tq2Var = w03Var3;
                        uq2Var = w03Var4;
                    } catch (TimeoutCancellationException e5) {
                        exception4 = e5;
                        Intrinsics.checkNotNullParameter(exception4, "exception");
                        w03 w03VarA6 = j13.a();
                        w03VarA6.e().m = false;
                        w03VarA6.a(exception4);
                        on0Var = new un0(timeoutCancellationException, i3);
                        tq2Var = w03Var3;
                        uq2Var = w03Var4;
                    } catch (Exception e6) {
                        exception3 = e6;
                        Intrinsics.checkNotNullParameter(exception3, "exception");
                        w03 w03VarA7 = j13.a();
                        w03VarA7.e().m = false;
                        w03VarA7.a(exception3);
                        on0Var = new on0(exception3, null, null, 6);
                        tq2Var = w03Var3;
                        uq2Var = w03Var4;
                    }
                    if (on0Var instanceof nn0) {
                        y13.a((nn0) on0Var, false);
                    }
                    interaction.saneness.attabal(uq2Var, null);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w03Var2 = tq2Var.b;
                    w03Var = tq2Var.a;
                    try {
                        p002kotlin.dern.saneness(obj);
                        w03Var = w03Var;
                        w03Var2 = w03Var2;
                        on0Var = (spartacist) obj;
                        tq2Var = w03Var;
                        uq2Var = w03Var2;
                    } catch (TimeoutCancellationException e7) {
                        exception2 = e7;
                        Intrinsics.checkNotNullParameter(exception2, "exception");
                        w03 w03VarA8 = j13.a();
                        w03VarA8.e().m = false;
                        w03VarA8.a(exception2);
                        on0Var = new un0(timeoutCancellationException, i3);
                        tq2Var = w03Var;
                        uq2Var = w03Var2;
                    } catch (Exception e8) {
                        exception = e8;
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        w03 w03VarA9 = j13.a();
                        w03VarA9.e().m = false;
                        w03VarA9.a(exception);
                        on0Var = new on0(exception, null, null, 6);
                        tq2Var = w03Var;
                        uq2Var = w03Var2;
                    }
                    if (on0Var instanceof nn0) {
                        y13.a((nn0) on0Var, false);
                    }
                    interaction.saneness.attabal(uq2Var, null);
                }
                return on0Var;
            } catch (Throwable th9) {
                ?? r13 = tq2Var;
                r0 = uq2Var;
                th = th9;
                r15 = r13;
            }
        } catch (Throwable th10) {
            ?? r14 = tq2Var;
            r1 = uq2Var;
            th2 = th10;
            r16 = r14;
        }
    }
}
