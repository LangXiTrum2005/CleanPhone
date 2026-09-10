package ads_mobile_sdk;

import com.google.common.base.triweekly;
import com.google.gson.Gson;
import complexometry.formularize;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.dragline;
import saneness.evenfall;
import saneness.fright;
import saneness.kaif;
import saneness.loun;
import saneness.spartacist;
import saneness.supercargo;
import svd.ClientRequestBuildingData;
import svd.arytenoidectomy;
import svd.polloi;

/* JADX INFO: loaded from: classes.dex */
public final class ft1 implements fright {
    public final supercargo a;
    public final rs1 b;
    public final polloi c;
    public final formularize d;
    public final dragline e;
    public final l f;
    public final jf2 g;
    public final uf2 h;
    public final jk0 i;
    public final kaif j;
    public final loun k;
    public final Gson l;
    public final e4 m;

    public ft1(supercargo javascriptEngine, rs1 networkResponseRequester, polloi signalsProvider, formularize baseRequest, dragline internalAdRequestEventEmitter, l actionFunction, jf2 clientSideRequestBuilder, uf2 requestThrottler, jk0 flags, kaif randomGenerator, loun traceLogger, Gson gson, e4 adRequestDomainPreloader) {
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(networkResponseRequester, "networkResponseRequester");
        Intrinsics.checkNotNullParameter(signalsProvider, "signalsProvider");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(internalAdRequestEventEmitter, "internalAdRequestEventEmitter");
        Intrinsics.checkNotNullParameter(actionFunction, "actionFunction");
        Intrinsics.checkNotNullParameter(clientSideRequestBuilder, "clientSideRequestBuilder");
        Intrinsics.checkNotNullParameter(requestThrottler, "requestThrottler");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(adRequestDomainPreloader, "adRequestDomainPreloader");
        this.a = javascriptEngine;
        this.b = networkResponseRequester;
        this.c = signalsProvider;
        this.d = baseRequest;
        this.e = internalAdRequestEventEmitter;
        this.f = actionFunction;
        this.g = clientSideRequestBuilder;
        this.h = requestThrottler;
        this.i = flags;
        this.j = randomGenerator;
        this.k = traceLogger;
        this.l = gson;
        this.m = adRequestDomainPreloader;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0091 A[Catch: all -> 0x00b5, TryCatch #2 {all -> 0x00b5, blocks: (B:50:0x0183, B:52:0x0187, B:30:0x008b, B:32:0x0091, B:35:0x00b8), top: B:84:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #2 {all -> 0x00b5, blocks: (B:50:0x0183, B:52:0x0187, B:30:0x008b, B:32:0x0091, B:35:0x00b8), top: B:84:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fb A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:39:0x00eb, B:41:0x00fb, B:43:0x0113, B:45:0x0129, B:46:0x015e, B:48:0x0162), top: B:81:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0113 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:39:0x00eb, B:41:0x00fb, B:43:0x0113, B:45:0x0129, B:46:0x015e, B:48:0x0162), top: B:81:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Code duplicated, block: B:46:0x015e A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:39:0x00eb, B:41:0x00fb, B:43:0x0113, B:45:0x0129, B:46:0x015e, B:48:0x0162), top: B:81:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0162 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:39:0x00eb, B:41:0x00fb, B:43:0x0113, B:45:0x0129, B:46:0x015e, B:48:0x0162), top: B:81:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0091, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0162, please report this as an issue */
    public final Object a(arytenoidectomy arytenoidectomyVar, wretchedly.dern dernVar) {
        at1 at1Var;
        Closeable closeable;
        arytenoidectomy arytenoidectomyVar2;
        ft1 ft1Var;
        w03 w03Var;
        Closeable closeable2;
        spartacist spartacistVar;
        arytenoidectomy arytenoidectomyVar3;
        Closeable closeable3;
        w03 w03Var2;
        spartacist spartacistVar2;
        w03 w03Var3;
        List list;
        String strPreterite;
        Closeable closeable4;
        w03 w03Var4;
        if (dernVar instanceof at1) {
            at1Var = (at1) dernVar;
            int i = at1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                at1Var.g = i - Integer.MIN_VALUE;
            } else {
                at1Var = new at1(this, dernVar);
            }
        } else {
            at1Var = new at1(this, dernVar);
        }
        at1 at1Var2 = at1Var;
        Object objE = at1Var2.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = at1Var2.g;
        if (i2 != 0) {
            if (i2 == 1) {
                w03 w03Var5 = at1Var2.d;
                w03 w03Var6 = (w03) at1Var2.c;
                arytenoidectomyVar2 = (arytenoidectomy) at1Var2.b;
                ft1Var = (ft1) at1Var2.a;
                try {
                    p002kotlin.dern.saneness(objE);
                    closeable2 = w03Var5;
                    w03Var = w03Var6;
                    try {
                        spartacistVar = (spartacist) objE;
                        if (!(spartacistVar instanceof nn0)) {
                            Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                            ((tn0) spartacistVar).getClass();
                            jf2 jf2Var = ft1Var.g;
                            n32 n32VarW = ft1Var.i.W();
                            b12 b12VarV = ft1Var.i.V();
                            Map mapP = ft1Var.i.p();
                            at1Var2.a = arytenoidectomyVar2;
                            at1Var2.b = w03Var;
                            at1Var2.c = closeable2;
                            at1Var2.d = null;
                            at1Var2.g = 2;
                            arytenoidectomyVar3 = arytenoidectomyVar2;
                            objE = jf2Var.a(arytenoidectomyVar3, n32VarW, b12VarV, mapP, at1Var2);
                            if (objE != objBeachfront) {
                                closeable3 = closeable2;
                                w03Var2 = w03Var;
                                spartacistVar2 = (spartacist) objE;
                                triweekly triweeklyVar = kn0.a;
                                kn0.a(new bt1(spartacistVar2));
                                if (spartacistVar2 instanceof tn0) {
                                    String str = ((xm) ((tn0) spartacistVar2).a()).e;
                                    list = ((xm) ((tn0) spartacistVar2).a()).a;
                                    if (list != null) {
                                        strPreterite = CollectionsKt.preterite(list, ",", null, null, 0, null, null, 62, null);
                                    } else {
                                        strPreterite = null;
                                    }
                                    arytenoidectomyVar3.clientRequestBuildingData = new ClientRequestBuildingData(str, ((xm) ((tn0) spartacistVar2).a()).c, strPreterite, igo.attabal.attabal(((xm) ((tn0) spartacistVar2).a()).d), arytenoidectomyVar3.requestId, ((xm) ((tn0) spartacistVar2).a()).f, 65);
                                } else if (spartacistVar2 instanceof nn0) {
                                    arytenoidectomyVar3.clientRequestBuildingData = new ClientRequestBuildingData(null, null, "CSRB error: " + spartacistVar2, null, null, null, 247);
                                }
                                closeable2 = closeable3;
                                w03Var = w03Var2;
                            }
                            return objBeachfront;
                        }
                        spartacistVar2 = (nn0) spartacistVar;
                        arytenoidectomyVar2.clientRequestBuildingData = new ClientRequestBuildingData(null, null, "CSRB error: " + spartacistVar2, null, null, null, 247);
                        closeable2 = closeable2;
                        w03Var = w03Var;
                    } catch (Throwable th) {
                        th = th;
                        w03Var3 = w03Var;
                        closeable = closeable2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable4 = w03Var5;
                    w03Var4 = w03Var6;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable4 = at1Var2.c;
                w03Var4 = (w03) at1Var2.b;
                arytenoidectomyVar3 = (arytenoidectomy) at1Var2.a;
                try {
                    p002kotlin.dern.saneness(objE);
                    closeable3 = closeable4;
                    w03Var2 = w03Var4;
                    spartacistVar2 = (spartacist) objE;
                    triweekly triweeklyVar2 = kn0.a;
                    kn0.a(new bt1(spartacistVar2));
                    if (spartacistVar2 instanceof tn0) {
                        String str2 = ((xm) ((tn0) spartacistVar2).a()).e;
                        list = ((xm) ((tn0) spartacistVar2).a()).a;
                        if (list != null) {
                            strPreterite = CollectionsKt.preterite(list, ",", null, null, 0, null, null, 62, null);
                        } else {
                            strPreterite = null;
                        }
                        arytenoidectomyVar3.clientRequestBuildingData = new ClientRequestBuildingData(str2, ((xm) ((tn0) spartacistVar2).a()).c, strPreterite, igo.attabal.attabal(((xm) ((tn0) spartacistVar2).a()).d), arytenoidectomyVar3.requestId, ((xm) ((tn0) spartacistVar2).a()).f, 65);
                    } else if (spartacistVar2 instanceof nn0) {
                        arytenoidectomyVar3.clientRequestBuildingData = new ClientRequestBuildingData(null, null, "CSRB error: " + spartacistVar2, null, null, null, 247);
                    }
                    closeable2 = closeable3;
                    w03Var = w03Var2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            closeable = closeable4;
            w03Var3 = w03Var4;
            try {
                w03Var3.b(th);
                if (th instanceof evenfall) {
                    throw th;
                }
                w03Var3.a(th);
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
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    interaction.saneness.attabal(closeable, th4);
                    throw th5;
                }
            }
        }
        p002kotlin.dern.saneness(objE);
        w03 w03VarA = j13.a(no0.CUI_NAME_ADREQUEST_BUILDURL, adultoid.formularize(), true);
        try {
            supercargo supercargoVar = this.a;
            at1Var2.a = this;
            arytenoidectomyVar2 = arytenoidectomyVar;
            at1Var2.b = arytenoidectomyVar2;
            at1Var2.c = w03VarA;
            at1Var2.d = w03VarA;
            at1Var2.g = 1;
            objE = ((y91) supercargoVar).e(at1Var2);
            if (objE != objBeachfront) {
                ft1Var = this;
                w03 w03Var7 = w03VarA;
                w03Var = w03Var7;
                closeable2 = w03Var7;
                spartacistVar = (spartacist) objE;
                if (!(spartacistVar instanceof nn0)) {
                    spartacistVar2 = (nn0) spartacistVar;
                    arytenoidectomyVar2.clientRequestBuildingData = new ClientRequestBuildingData(null, null, "CSRB error: " + spartacistVar2, null, null, null, 247);
                    closeable2 = closeable2;
                    w03Var = w03Var;
                } else {
                    Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                    ((tn0) spartacistVar).getClass();
                    jf2 jf2Var2 = ft1Var.g;
                    n32 n32VarW2 = ft1Var.i.W();
                    b12 b12VarV2 = ft1Var.i.V();
                    Map mapP2 = ft1Var.i.p();
                    at1Var2.a = arytenoidectomyVar2;
                    at1Var2.b = w03Var;
                    at1Var2.c = closeable2;
                    at1Var2.d = null;
                    at1Var2.g = 2;
                    arytenoidectomyVar3 = arytenoidectomyVar2;
                    objE = jf2Var2.a(arytenoidectomyVar3, n32VarW2, b12VarV2, mapP2, at1Var2);
                    if (objE != objBeachfront) {
                        closeable3 = closeable2;
                        w03Var2 = w03Var;
                        spartacistVar2 = (spartacist) objE;
                        triweekly triweeklyVar3 = kn0.a;
                        kn0.a(new bt1(spartacistVar2));
                        if (spartacistVar2 instanceof tn0) {
                            String str3 = ((xm) ((tn0) spartacistVar2).a()).e;
                            list = ((xm) ((tn0) spartacistVar2).a()).a;
                            if (list != null) {
                                strPreterite = CollectionsKt.preterite(list, ",", null, null, 0, null, null, 62, null);
                            } else {
                                strPreterite = null;
                            }
                            arytenoidectomyVar3.clientRequestBuildingData = new ClientRequestBuildingData(str3, ((xm) ((tn0) spartacistVar2).a()).c, strPreterite, igo.attabal.attabal(((xm) ((tn0) spartacistVar2).a()).d), arytenoidectomyVar3.requestId, ((xm) ((tn0) spartacistVar2).a()).f, 65);
                        } else if (spartacistVar2 instanceof nn0) {
                            arytenoidectomyVar3.clientRequestBuildingData = new ClientRequestBuildingData(null, null, "CSRB error: " + spartacistVar2, null, null, null, 247);
                        }
                        closeable2 = closeable3;
                        w03Var = w03Var2;
                    }
                }
            }
            return objBeachfront;
        } catch (Throwable th6) {
            th = th6;
            closeable = w03VarA;
            w03Var3 = w03VarA;
        }
        if (spartacistVar2 instanceof nn0) {
            y13.a((nn0) spartacistVar2, false);
        }
        interaction.saneness.attabal(closeable2, null);
        return spartacistVar2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0256  */
    /* JADX WARN: Code duplicated, block: B:104:0x0259  */
    /* JADX WARN: Code duplicated, block: B:107:0x0274  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b6 A[Catch: all -> 0x02c6, TryCatch #1 {all -> 0x02c6, blocks: (B:117:0x02af, B:119:0x02b6, B:121:0x02bd, B:123:0x02c1, B:125:0x02c5, B:128:0x02c9, B:129:0x02ce, B:130:0x02cf, B:131:0x02d6, B:132:0x02d7, B:133:0x02de, B:134:0x02df), top: B:141:0x02af }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02bd A[Catch: all -> 0x02c6, TryCatch #1 {all -> 0x02c6, blocks: (B:117:0x02af, B:119:0x02b6, B:121:0x02bd, B:123:0x02c1, B:125:0x02c5, B:128:0x02c9, B:129:0x02ce, B:130:0x02cf, B:131:0x02d6, B:132:0x02d7, B:133:0x02de, B:134:0x02df), top: B:141:0x02af }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02c1 A[Catch: all -> 0x02c6, TryCatch #1 {all -> 0x02c6, blocks: (B:117:0x02af, B:119:0x02b6, B:121:0x02bd, B:123:0x02c1, B:125:0x02c5, B:128:0x02c9, B:129:0x02ce, B:130:0x02cf, B:131:0x02d6, B:132:0x02d7, B:133:0x02de, B:134:0x02df), top: B:141:0x02af }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02c5 A[Catch: all -> 0x02c6, TryCatch #1 {all -> 0x02c6, blocks: (B:117:0x02af, B:119:0x02b6, B:121:0x02bd, B:123:0x02c1, B:125:0x02c5, B:128:0x02c9, B:129:0x02ce, B:130:0x02cf, B:131:0x02d6, B:132:0x02d7, B:133:0x02de, B:134:0x02df), top: B:141:0x02af }] */
    /* JADX WARN: Code duplicated, block: B:128:0x02c9 A[Catch: all -> 0x02c6, TryCatch #1 {all -> 0x02c6, blocks: (B:117:0x02af, B:119:0x02b6, B:121:0x02bd, B:123:0x02c1, B:125:0x02c5, B:128:0x02c9, B:129:0x02ce, B:130:0x02cf, B:131:0x02d6, B:132:0x02d7, B:133:0x02de, B:134:0x02df), top: B:141:0x02af }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02cf A[Catch: all -> 0x02c6, TryCatch #1 {all -> 0x02c6, blocks: (B:117:0x02af, B:119:0x02b6, B:121:0x02bd, B:123:0x02c1, B:125:0x02c5, B:128:0x02c9, B:129:0x02ce, B:130:0x02cf, B:131:0x02d6, B:132:0x02d7, B:133:0x02de, B:134:0x02df), top: B:141:0x02af }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02d7 A[Catch: all -> 0x02c6, TryCatch #1 {all -> 0x02c6, blocks: (B:117:0x02af, B:119:0x02b6, B:121:0x02bd, B:123:0x02c1, B:125:0x02c5, B:128:0x02c9, B:129:0x02ce, B:130:0x02cf, B:131:0x02d6, B:132:0x02d7, B:133:0x02de, B:134:0x02df), top: B:141:0x02af }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02df A[Catch: all -> 0x02c6, TRY_LEAVE, TryCatch #1 {all -> 0x02c6, blocks: (B:117:0x02af, B:119:0x02b6, B:121:0x02bd, B:123:0x02c1, B:125:0x02c5, B:128:0x02c9, B:129:0x02ce, B:130:0x02cf, B:131:0x02d6, B:132:0x02d7, B:133:0x02de, B:134:0x02df), top: B:141:0x02af }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0132 A[PHI: r4 r8
  0x0132: PHI (r4v5 ads_mobile_sdk.ft1) = (r4v2 ads_mobile_sdk.ft1), (r4v10 ads_mobile_sdk.ft1) binds: [B:50:0x0134, B:42:0x00f8] A[DONT_GENERATE, DONT_INLINE]
  0x0132: PHI (r8v7 svd.arytenoidectomy) = (r8v3 svd.arytenoidectomy), (r8v8 svd.arytenoidectomy) binds: [B:50:0x0134, B:42:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0157  */
    /* JADX WARN: Code duplicated, block: B:56:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0188  */
    /* JADX WARN: Code duplicated, block: B:71:0x0190  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01da A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #2 {all -> 0x0067, blocks: (B:16:0x0062, B:76:0x01cd, B:78:0x01da), top: B:142:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203  */
    /* JADX WARN: Code duplicated, block: B:95:0x0238  */
    /* JADX WARN: Code duplicated, block: B:99:0x024f  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0177, code lost:
    
        if (r0 == r3) goto L110;
     */
    @Override // saneness.fright
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(wretchedly.dern r18) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ft1.a(wretchedly.dern):java.lang.Object");
    }
}
