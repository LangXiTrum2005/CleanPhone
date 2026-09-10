package ads_mobile_sdk;

import android.content.Context;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import complexometry.monoploid;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.polder;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.laky;
import saneness.loun;
import saneness.storiette;

/* JADX INFO: loaded from: classes.dex */
public final class s01 extends bm0 {
    public final wz0 D;
    public final monoploid E;
    public final x F;
    public final gq0 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s01(wz0 inspectorManager, gq0 webView, monoploid listener, x activityTracker, Context applicationContext, saran uiScope, CoroutineContext uiContext, saran backgroundScope, jk0 flags, loun traceLogger, String afmaVersion, ip0 gmaUtil, storiette backButtonStateDelegate) {
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, gmaUtil, backButtonStateDelegate);
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backButtonStateDelegate, "backButtonStateDelegate");
        this.D = inspectorManager;
        this.E = listener;
        this.F = activityTracker;
        this.G = webView;
        this.H = -1;
        a(webView);
        m();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ads_mobile_sdk.bm0
    public final Object a(wretchedly.dern dernVar) {
        n01 n01Var;
        s01 s01Var;
        if (dernVar instanceof n01) {
            n01Var = (n01) dernVar;
            int i = n01Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                n01Var.d = i - Integer.MIN_VALUE;
            } else {
                n01Var = new n01(this, dernVar);
            }
        } else {
            n01Var = new n01(this, dernVar);
        }
        Object obj = n01Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = n01Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            n01Var.a = this;
            n01Var.d = 1;
            j().m = null;
            if (Unit.f29295attabal == objBeachfront) {
                return objBeachfront;
            }
            s01Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s01Var = n01Var.a;
            p002kotlin.dern.saneness(obj);
        }
        if (!s01Var.n.get()) {
            return Unit.f29295attabal;
        }
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(n01Var.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new m01(s01Var, null), 3, null);
        return Unit.f29295attabal;
    }

    @Override // ads_mobile_sdk.bm0
    public final Object c(wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new p01(this, null), 3, null);
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r2.a(r6, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(wretchedly.dern r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.q01
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.q01 r0 = (ads_mobile_sdk.q01) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.q01 r0 = new ads_mobile_sdk.q01
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r6)
            goto L6b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            com.google.gson.Gson r2 = r0.b
            ads_mobile_sdk.s01 r4 = r0.a
            p002kotlin.dern.saneness(r6)
            goto L54
        L3c:
            p002kotlin.dern.saneness(r6)
            com.google.gson.Gson r2 = new com.google.gson.Gson
            r2.<init>()
            ads_mobile_sdk.wz0 r6 = r5.D
            r0.a = r5
            r0.b = r2
            r0.e = r4
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r1) goto L53
            goto L6a
        L53:
            r4 = r5
        L54:
            java.lang.String r6 = r2.toJson(r6)
            ads_mobile_sdk.gq0 r2 = r4.G
            p002kotlin.jvm.internal.Intrinsics.beachfront(r6)
            r4 = 0
            r0.a = r4
            r0.b = r4
            r0.e = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.s01.d(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(wretchedly.dern dernVar) {
        r01 r01Var;
        s01 s01Var;
        if (dernVar instanceof r01) {
            r01Var = (r01) dernVar;
            int i = r01Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r01Var.d = i - Integer.MIN_VALUE;
            } else {
                r01Var = new r01(this, dernVar);
            }
        } else {
            r01Var = new r01(this, dernVar);
        }
        Object obj = r01Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = r01Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            r01Var.a = this;
            r01Var.d = 1;
            if (d(r01Var) == objBeachfront) {
                return objBeachfront;
            }
            s01Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s01Var = r01Var.a;
            p002kotlin.dern.saneness(obj);
        }
        Context contextB = s01Var.F.b();
        if (contextB == null) {
            contextB = s01Var.a;
        }
        return igo.attabal.attabal(s01Var.a(contextB));
    }

    @Override // ads_mobile_sdk.bm0
    public final gq0 j() {
        return this.G;
    }

    @Override // ads_mobile_sdk.bm0
    public final int k() {
        return this.H;
    }

    @Override // ads_mobile_sdk.bm0
    public final void a(int i) {
        this.H = i;
    }

    @Override // ads_mobile_sdk.bm0, saneness.sunback
    public final Object a(FullScreenContentError fullScreenContentError, wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new o01(this, null), 3, null);
        return Unit.f29295attabal;
    }
}
