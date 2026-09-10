package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import complexometry.ResponseInfo;
import complexometry.competently;
import complexometry.formularize;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.arytenoidectomy;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eigenvalue;
import saneness.imperceivable;
import saneness.metairie;
import saneness.orthocephalic;
import saneness.reparation;

/* JADX INFO: loaded from: classes.dex */
public abstract class k92 {
    public final saran a;
    public final saran b;
    public final l13 c;
    public final jk0 d;
    public final ri2 e;
    public final String f;
    public final yf2 g;
    public final formularize h;
    public final boolean i;
    public final String j;
    public final gy0 k;
    public final arytenoidectomy l;
    public final AtomicBoolean m;
    public orthocephalic n;

    public k92(saran loadScope, saran backgroundScope, l13 traceMetaSet, jk0 flags, ri2 rootTraceCreator, String requestId, yf2 requestType, formularize formularizeVar, boolean z, String appId, gy0 inspectorAdLifecycleMonitor, arytenoidectomy cancellationChannel) {
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(cancellationChannel, "cancellationChannel");
        this.a = loadScope;
        this.b = backgroundScope;
        this.c = traceMetaSet;
        this.d = flags;
        this.e = rootTraceCreator;
        this.f = requestId;
        this.g = requestType;
        this.h = formularizeVar;
        this.i = z;
        this.j = appId;
        this.k = inspectorAdLifecycleMonitor;
        this.l = cancellationChannel;
        this.m = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r9.collect(r2, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.k92 r7, saneness.orthocephalic r8, wretchedly.dern r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof ads_mobile_sdk.y82
            if (r0 == 0) goto L16
            r0 = r9
            ads_mobile_sdk.y82 r0 = (ads_mobile_sdk.y82) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f = r1
            goto L1b
        L16:
            ads_mobile_sdk.y82 r0 = new ads_mobile_sdk.y82
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.d
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            p002kotlin.dern.saneness(r9)
            goto Lae
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.coroutines.CoroutineContext r7 = r0.c
            saneness.orthocephalic r8 = r0.b
            ads_mobile_sdk.k92 r2 = r0.a
            p002kotlin.dern.saneness(r9)
            goto L86
        L43:
            p002kotlin.dern.saneness(r9)
            kotlinx.coroutines.saran r9 = r7.b
            kotlin.coroutines.CoroutineContext r9 = r9.getCoroutineContext()
            kotlin.coroutines.dern$saneness r2 = p002kotlin.coroutines.dern.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r9 = r9.get(r2)
            boolean r2 = r9 instanceof kotlinx.coroutines.merc
            if (r2 == 0) goto L59
            kotlinx.coroutines.merc r9 = (kotlinx.coroutines.merc) r9
            goto L5a
        L59:
            r9 = r5
        L5a:
            if (r9 == 0) goto L63
            java.lang.String r2 = "Publisher Callback"
            kotlinx.coroutines.merc r9 = r9.sayid(r4, r2)
            goto L64
        L63:
            r9 = r5
        L64:
            if (r9 == 0) goto L67
            goto L6d
        L67:
            kotlinx.coroutines.saran r9 = r7.b
            kotlin.coroutines.CoroutineContext r9 = r9.getCoroutineContext()
        L6d:
            kotlinx.coroutines.dhss r2 = kotlinx.coroutines.dhss.f32190kowloon
            kotlin.coroutines.CoroutineContext r9 = r9.plus(r2)
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.f = r4
            java.lang.Object r2 = r7.a(r0)
            if (r2 != r1) goto L82
            goto Lad
        L82:
            r6 = r2
            r2 = r7
            r7 = r9
            r9 = r6
        L86:
            kotlinx.coroutines.flow.dern r9 = (kotlinx.coroutines.flow.dern) r9
            ads_mobile_sdk.b92 r4 = new ads_mobile_sdk.b92
            r4.<init>(r7, r8, r5)
            kotlinx.coroutines.flow.dern r9 = kotlinx.coroutines.flow.marial.cuirassed(r9, r4)
            ads_mobile_sdk.e92 r4 = new ads_mobile_sdk.e92
            r4.<init>(r2, r7, r8, r5)
            kotlinx.coroutines.flow.dern r9 = kotlinx.coroutines.flow.marial.beachfront(r9, r4)
            ads_mobile_sdk.j92 r2 = new ads_mobile_sdk.j92
            r2.<init>(r7, r8)
            r0.a = r5
            r0.b = r5
            r0.c = r5
            r0.f = r3
            java.lang.Object r7 = r9.collect(r2, r0)
            if (r7 != r1) goto Lae
        Lad:
            return r1
        Lae:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.k92.a(ads_mobile_sdk.k92, saneness.orthocephalic, wretchedly.dern):java.lang.Object");
    }

    public abstract Object a(w82 w82Var);

    public Object b(wretchedly.dern dernVar) {
        return Unit.f29295attabal;
    }

    public final eigenvalue a(eigenvalue componentBuilder, adjudge.saneness baseRequest, String adResponseBlob, jp2 signalGenerationData) {
        Intrinsics.checkNotNullParameter(componentBuilder, "componentBuilder");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(adResponseBlob, "adResponseBlob");
        Intrinsics.checkNotNullParameter(signalGenerationData, "signalGenerationData");
        return (eigenvalue) ((eigenvalue) ((eigenvalue) ((eigenvalue) ((eigenvalue) ((eigenvalue) ((eigenvalue) ((eigenvalue) componentBuilder.a(adResponseBlob)).a(signalGenerationData)).a(this.c.a)).a(this.c.b)).a(this.g)).a(baseRequest)).a(this.i)).a(this.k);
    }

    public final reparation a(reparation componentBuilder, competently baseRequest) {
        Intrinsics.checkNotNullParameter(componentBuilder, "componentBuilder");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        return (reparation) ((reparation) ((reparation) ((reparation) ((reparation) ((reparation) ((reparation) ((reparation) ((reparation) componentBuilder.a(this.c.a)).a(this.c.b)).a(this.g)).a(baseRequest)).a(this.i)).a(this.k)).a(new rc2())).b(false)).a(new d6());
    }

    public static LoadAdError a(nn0 error, ResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new LoadAdError(error.a().a(), metairie.attabal(error), responseInfo);
    }

    public final l13 a() {
        return this.c;
    }

    public final Object a(jz1 jz1Var) {
        return a(this, jz1Var);
    }

    public final void a(orthocephalic internalAdLoadCallback, boolean z) {
        Intrinsics.checkNotNullParameter(internalAdLoadCallback, "internalAdLoadCallback");
        if (z) {
            this.m.set(true);
            this.n = internalAdLoadCallback;
        }
        saran saranVar = this.a;
        r82 block = new r82(this, internalAdLoadCallback, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        monroe monroeVarWireman = cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        saran saranVar2 = this.b;
        p82 block2 = new p82(this, monroeVarWireman, null);
        Intrinsics.checkNotNullParameter(saranVar2, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block2, "block");
        cutely.wireman(saranVar2, context, null, new x13(block2, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(k92 k92Var, wretchedly.dern dernVar) {
        q82 q82Var;
        if (dernVar instanceof q82) {
            q82Var = (q82) dernVar;
            int i = q82Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q82Var.c = i - Integer.MIN_VALUE;
            } else {
                q82Var = new q82(k92Var, dernVar);
            }
        } else {
            q82Var = new q82(k92Var, dernVar);
        }
        Object objCompetently = q82Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = q82Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objCompetently);
            q82Var.c = 1;
            objCompetently = impromptu.competently(k92Var.a.getCoroutineContext(), new s82(k92Var, null), q82Var);
            if (objCompetently != objBeachfront) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objCompetently);
            return objCompetently;
        }
        p002kotlin.dern.saneness(objCompetently);
        q82Var.c = 2;
        Object objMolybdenite = marial.molybdenite((kotlinx.coroutines.flow.dern) objCompetently, q82Var);
        return objMolybdenite == objBeachfront ? objBeachfront : objMolybdenite;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (r2.b(r0) == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(wretchedly.dern r8) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.k92.a(wretchedly.dern):java.lang.Object");
    }

    public Object a(imperceivable imperceivableVar, t82 t82Var) {
        return Unit.f29295attabal;
    }
}
