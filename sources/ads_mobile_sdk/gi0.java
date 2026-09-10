package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.ironsource.X3;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.collections.polloi;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.compiler;
import saneness.connector;
import saneness.evenfall;
import saneness.habitue;
import saneness.homozygous;
import saneness.loun;
import saneness.preterite;

/* JADX INFO: loaded from: classes.dex */
public final class gi0 extends al0 implements preterite {
    public final g6 L;
    public final e2 M;
    public final ri2 N;
    public final l13 O;
    public final AtomicBoolean P;

    /* JADX WARN: Illegal instructions before constructor call */
    public gi0(Context applicationContext, saran uiScope, CoroutineContext uiContext, saran backgroundScope, jk0 flags, loun traceLogger, g6 adSpamClient, String afmaVersion, e2 adEventEmitter, habitue adActivityLifecycleEventEmitter, xq0 fullscreenWebViewContainer, ri2 rootTraceCreator, l13 traceMetaSet, yf2 requestType, h1 adConfiguration, homozygous omidMonitor, ip0 gmaUtil, connector backButtonStateDelegate) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(adActivityLifecycleEventEmitter, "adActivityLifecycleEventEmitter");
        Intrinsics.checkNotNullParameter(fullscreenWebViewContainer, "fullscreenWebViewContainer");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backButtonStateDelegate, "backButtonStateDelegate");
        Optional optionalOf = Optional.of(adActivityLifecycleEventEmitter);
        Intrinsics.checkNotNullExpressionValue(optionalOf, "of(...)");
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, requestType, adConfiguration, omidMonitor, gmaUtil, backButtonStateDelegate, optionalOf);
        this.L = adSpamClient;
        this.M = adEventEmitter;
        this.N = rootTraceCreator;
        this.O = traceMetaSet;
        a((View) fullscreenWebViewContainer);
        a(fullscreenWebViewContainer);
        this.P = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c A[PHI: r2
  0x006c: PHI (r2v3 ads_mobile_sdk.gi0) = (r2v2 ads_mobile_sdk.gi0), (r2v2 ads_mobile_sdk.gi0), (r2v5 ads_mobile_sdk.gi0) binds: [B:23:0x005d, B:25:0x0069, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r8.a(r0) == r1) goto L29;
     */
    @Override // ads_mobile_sdk.bm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(wretchedly.dern r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.ei0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ei0 r0 = (ads_mobile_sdk.ei0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ei0 r0 = new ads_mobile_sdk.ei0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            p002kotlin.dern.saneness(r8)
            goto L79
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            ads_mobile_sdk.gi0 r2 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L6c
        L3e:
            ads_mobile_sdk.gi0 r2 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L57
        L44:
            p002kotlin.dern.saneness(r8)
            r0.a = r7
            r0.d = r6
            ads_mobile_sdk.gq0 r8 = r7.j()
            r8.m = r3
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            if (r8 != r1) goto L56
            goto L78
        L56:
            r2 = r7
        L57:
            java.util.concurrent.atomic.AtomicBoolean r8 = r2.n
            boolean r8 = r8.get()
            if (r8 == 0) goto L6c
            ads_mobile_sdk.e2 r8 = r2.M
            r0.a = r2
            r0.d = r5
            kotlin.Unit r8 = r8.g(r0)
            if (r8 != r1) goto L6c
            goto L78
        L6c:
            ads_mobile_sdk.e2 r8 = r2.M
            r0.a = r3
            r0.d = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gi0.a(wretchedly.dern):java.lang.Object");
    }

    @Override // ads_mobile_sdk.bm0
    public final Object c(wretchedly.dern dernVar) {
        Object objA = a(new FullScreenContentError(FullScreenContentError.ErrorCode.INTERNAL_ERROR, "There was an internal error when attempting to show fullscreen content.", null), dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public final boolean p() {
        if (compiler.attabal(this.a)) {
            kn0.a("Fullscreen ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies", (Throwable) null);
            y13.a(this.d, new ci0(this, null));
            y13.a("Application process is in background", null, 6);
            return false;
        }
        if (!this.P.getAndSet(true)) {
            return true;
        }
        kn0.a("This ad has already been shown.", (Throwable) null);
        y13.a(this.d, new di0(this, null));
        y13.a("The ad has already been shown", null, 6);
        return false;
    }

    @Override // ads_mobile_sdk.bm0, saneness.sunback
    public final Object a(FullScreenContentError fullScreenContentError, wretchedly.dern dernVar) {
        Object objA = this.M.a(fullScreenContentError, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r13.o(r0) == r1) goto L22;
     */
    @Override // ads_mobile_sdk.bm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.view.View r13, wretchedly.dern r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof ads_mobile_sdk.fi0
            if (r0 == 0) goto L13
            r0 = r14
            ads_mobile_sdk.fi0 r0 = (ads_mobile_sdk.fi0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.fi0 r0 = new ads_mobile_sdk.fi0
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p002kotlin.dern.saneness(r14)
            goto L78
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            ads_mobile_sdk.gi0 r13 = r0.a
            p002kotlin.dern.saneness(r14)
            goto L6b
        L3b:
            p002kotlin.dern.saneness(r14)
            r0.a = r12
            r0.d = r4
            kotlinx.coroutines.saran r6 = r12.d
            ads_mobile_sdk.zk0 r14 = new ads_mobile_sdk.zk0
            r14.<init>(r12, r13, r5)
            kotlin.coroutines.EmptyCoroutineContext r7 = p002kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            java.lang.String r13 = "<this>"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r13)
            java.lang.String r13 = "context"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r13)
            java.lang.String r13 = "block"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r13)
            ads_mobile_sdk.x13 r9 = new ads_mobile_sdk.x13
            r9.<init>(r14, r5)
            r10 = 2
            r11 = 0
            r8 = 0
            kotlinx.coroutines.impromptu.wireman(r6, r7, r8, r9, r10, r11)
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
            if (r13 != r1) goto L6a
            goto L77
        L6a:
            r13 = r12
        L6b:
            ads_mobile_sdk.e2 r13 = r13.M
            r0.a = r5
            r0.d = r3
            kotlin.Unit r13 = r13.o(r0)
            if (r13 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gi0.a(android.view.View, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.preterite
    public final void a(Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        ri2 ri2Var = this.N;
        no0 no0Var = no0.CUI_NAME_ADSHOW;
        List listMarial = graveside.marial(this.D.toString());
        l13 l13Var = this.O;
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listMarial, l13Var);
            try {
                g6 g6Var = this.L;
                StackTraceElement[] stackTrace = new Exception().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                g6Var.b(polloi.unconsolidated(stackTrace));
                if (!p()) {
                    interaction.saneness.attabal(v62VarA, null);
                    return;
                }
                jk0 jk0Var = this.e;
                jk0Var.getClass();
                Intrinsics.checkNotNullParameter("gads:default_to_immersive:enabled", X3.i.W);
                Boolean bool = Boolean.FALSE;
                jk jkVar = zk.b;
                if (((Boolean) jk0Var.a("gads:default_to_immersive:enabled", bool, jkVar)).booleanValue()) {
                    jk0 jk0Var2 = this.e;
                    jk0Var2.getClass();
                    Intrinsics.checkNotNullParameter("gads:override_pub_immersive_setting:enabled", X3.i.W);
                    if (!((Boolean) jk0Var2.a("gads:override_pub_immersive_setting:enabled", bool, jkVar)).booleanValue() && z2) {
                        this.u = z;
                    } else {
                        this.u = true;
                    }
                } else {
                    this.u = z;
                }
                a(context);
                Unit unit = Unit.f29295attabal;
                interaction.saneness.attabal(v62VarA, null);
                return;
            } catch (Throwable th) {
                try {
                    v62VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        v62VarA.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (!(th instanceof yn0)) {
                                    throw new gn0(th);
                                }
                                throw th;
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        interaction.saneness.attabal(v62VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
        try {
            g6 g6Var2 = this.L;
            StackTraceElement[] stackTrace2 = new Exception().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
            g6Var2.b(polloi.unconsolidated(stackTrace2));
            if (!p()) {
                interaction.saneness.attabal(w03VarA, null);
                return;
            }
            jk0 jk0Var3 = this.e;
            jk0Var3.getClass();
            Intrinsics.checkNotNullParameter("gads:default_to_immersive:enabled", X3.i.W);
            Boolean bool2 = Boolean.FALSE;
            jk jkVar2 = zk.b;
            if (((Boolean) jk0Var3.a("gads:default_to_immersive:enabled", bool2, jkVar2)).booleanValue()) {
                jk0 jk0Var4 = this.e;
                jk0Var4.getClass();
                Intrinsics.checkNotNullParameter("gads:override_pub_immersive_setting:enabled", X3.i.W);
                if (!((Boolean) jk0Var4.a("gads:override_pub_immersive_setting:enabled", bool2, jkVar2)).booleanValue() && z2) {
                    this.u = z;
                } else {
                    this.u = true;
                }
            } else {
                this.u = z;
            }
            a(context);
            Unit unit2 = Unit.f29295attabal;
            interaction.saneness.attabal(w03VarA, null);
        } catch (Throwable th4) {
            try {
                w03VarA.b(th4);
                if (!(th4 instanceof evenfall)) {
                    w03VarA.a(th4);
                    if (!(th4 instanceof TimeoutCancellationException)) {
                        if (!(th4 instanceof CancellationException)) {
                            if (!(th4 instanceof yn0)) {
                                throw new gn0(th4);
                            }
                            throw th4;
                        }
                        throw new bn0(th4);
                    }
                    throw new cp0(th4);
                }
                throw th4;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    interaction.saneness.attabal(w03VarA, th5);
                    throw th6;
                }
            }
        }
    }
}
