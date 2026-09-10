package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import java.util.Optional;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.connector;
import saneness.homozygous;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public abstract class hm0 extends al0 {
    public final x L;
    public final e2 M;
    public boolean N;
    public boolean O;

    /* JADX WARN: Illegal instructions before constructor call */
    public hm0(Context applicationContext, saran uiScope, CoroutineContext uiContext, saran backgroundScope, jk0 flags, loun traceLogger, String afmaVersion, yf2 requestType, h1 adConfiguration, x activityTracker, e2 adEventEmitter, homozygous omidMonitor, ip0 gmaUtil, connector backButtonStateDelegate) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backButtonStateDelegate, "backButtonStateDelegate");
        Optional optionalEmpty = Optional.empty();
        Intrinsics.checkNotNullExpressionValue(optionalEmpty, "empty(...)");
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, requestType, adConfiguration, omidMonitor, gmaUtil, backButtonStateDelegate, optionalEmpty);
        this.L = activityTracker;
        this.M = adEventEmitter;
        this.N = true;
        this.O = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(hm0 hm0Var, wretchedly.dern dernVar) {
        em0 em0Var;
        if (dernVar instanceof em0) {
            em0Var = (em0) dernVar;
            int i = em0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                em0Var.d = i - Integer.MIN_VALUE;
            } else {
                em0Var = new em0(hm0Var, dernVar);
            }
        } else {
            em0Var = new em0(hm0Var, dernVar);
        }
        Object objA = em0Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = em0Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            em0Var.a = hm0Var;
            em0Var.d = 1;
            hm0Var.getClass();
            objA = bm0.a(hm0Var, em0Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hm0Var = em0Var.a;
            p002kotlin.dern.saneness(objA);
        }
        if (!((Boolean) objA).booleanValue()) {
            return igo.attabal.attabal(false);
        }
        saran saranVar = hm0Var.d;
        fm0 block = new fm0(hm0Var, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        return igo.attabal.attabal(true);
    }

    @Override // ads_mobile_sdk.bm0
    public Object a(wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    @Override // ads_mobile_sdk.bm0
    public final Object c(wretchedly.dern dernVar) {
        Object objA = a(new FullScreenContentError(FullScreenContentError.ErrorCode.INTERNAL_ERROR, "There was an internal error when attempting to show fullscreen content.", null), dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(hm0 hm0Var, wretchedly.dern dernVar) {
        cm0 cm0Var;
        if (dernVar instanceof cm0) {
            cm0Var = (cm0) dernVar;
            int i = cm0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cm0Var.d = i - Integer.MIN_VALUE;
            } else {
                cm0Var = new cm0(hm0Var, dernVar);
            }
        } else {
            cm0Var = new cm0(hm0Var, dernVar);
        }
        Object obj = cm0Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = cm0Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            cm0Var.a = hm0Var;
            cm0Var.d = 1;
            hm0Var.j().m = null;
            if (Unit.f29295attabal == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hm0Var = cm0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        if (hm0Var.O && hm0Var.n.get()) {
            saran saranVar = hm0Var.d;
            dm0 block = new dm0(hm0Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    @Override // ads_mobile_sdk.bm0, saneness.sunback
    public Object a(FullScreenContentError fullScreenContentError, wretchedly.dern dernVar) {
        if (this.O) {
            Object objA = this.M.a(fullScreenContentError, dernVar);
            return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
        }
        return Unit.f29295attabal;
    }

    @Override // ads_mobile_sdk.bm0
    public Object a(View view, wretchedly.dern dernVar) {
        return a(this, view, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084 A[PHI: r13
  0x0084: PHI (r13v2 ads_mobile_sdk.hm0) = (r13v1 ads_mobile_sdk.hm0), (r13v1 ads_mobile_sdk.hm0), (r13v8 ads_mobile_sdk.hm0) binds: [B:22:0x0075, B:24:0x0081, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (r13.o(r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.hm0 r13, android.view.View r14, wretchedly.dern r15) {
        /*
            boolean r0 = r15 instanceof ads_mobile_sdk.gm0
            if (r0 == 0) goto L13
            r0 = r15
            ads_mobile_sdk.gm0 r0 = (ads_mobile_sdk.gm0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.gm0 r0 = new ads_mobile_sdk.gm0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            p002kotlin.dern.saneness(r15)
            goto L95
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            ads_mobile_sdk.hm0 r13 = r0.a
            p002kotlin.dern.saneness(r15)
            goto L84
        L3e:
            ads_mobile_sdk.hm0 r13 = r0.a
            p002kotlin.dern.saneness(r15)
            goto L73
        L44:
            p002kotlin.dern.saneness(r15)
            r0.a = r13
            r0.d = r5
            kotlinx.coroutines.saran r7 = r13.d
            ads_mobile_sdk.zk0 r15 = new ads_mobile_sdk.zk0
            r15.<init>(r13, r14, r6)
            kotlin.coroutines.EmptyCoroutineContext r8 = p002kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            java.lang.String r14 = "<this>"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r14)
            java.lang.String r14 = "context"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r14)
            java.lang.String r14 = "block"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r14)
            ads_mobile_sdk.x13 r10 = new ads_mobile_sdk.x13
            r10.<init>(r15, r6)
            r11 = 2
            r12 = 0
            r9 = 0
            kotlinx.coroutines.impromptu.wireman(r7, r8, r9, r10, r11, r12)
            kotlin.Unit r14 = p002kotlin.Unit.f29295attabal
            if (r14 != r1) goto L73
            goto L94
        L73:
            boolean r14 = r13.N
            if (r14 == 0) goto L84
            ads_mobile_sdk.e2 r14 = r13.M
            r0.a = r13
            r0.d = r4
            java.lang.Object r14 = r14.n(r0)
            if (r14 != r1) goto L84
            goto L94
        L84:
            boolean r14 = r13.O
            if (r14 == 0) goto L98
            ads_mobile_sdk.e2 r13 = r13.M
            r0.a = r6
            r0.d = r3
            kotlin.Unit r13 = r13.o(r0)
            if (r13 != r1) goto L95
        L94:
            return r1
        L95:
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
            return r13
        L98:
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hm0.a(ads_mobile_sdk.hm0, android.view.View, wretchedly.dern):java.lang.Object");
    }

    @Override // ads_mobile_sdk.bm0, saneness.sunback
    public final void a() {
        n();
    }
}
