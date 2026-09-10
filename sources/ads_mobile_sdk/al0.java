package ads_mobile_sdk;

import android.content.Context;
import java.util.Optional;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import saneness.homozygous;
import saneness.loun;
import saneness.storiette;

/* JADX INFO: loaded from: classes.dex */
public abstract class al0 extends bm0 {
    public final yf2 D;
    public final homozygous E;
    public xq0 F;
    public final taiyuan G;
    public final boolean H;
    public int I;
    public final boolean J;
    public final boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al0(Context applicationContext, saran uiScope, CoroutineContext uiContext, saran backgroundScope, jk0 flags, loun traceLogger, String afmaVersion, yf2 requestType, h1 adConfiguration, homozygous omidMonitor, ip0 gmaUtil, storiette backButtonStateDelegate, Optional adActivityLifecycleEventEmitter) {
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, gmaUtil, backButtonStateDelegate, adActivityLifecycleEventEmitter);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backButtonStateDelegate, "backButtonStateDelegate");
        Intrinsics.checkNotNullParameter(adActivityLifecycleEventEmitter, "adActivityLifecycleEventEmitter");
        this.D = requestType;
        this.E = omidMonitor;
        this.G = p002kotlin.saneness.saneness(new xk0(this));
        this.H = adConfiguration.D;
        this.I = adConfiguration.J;
        this.J = adConfiguration.M;
        this.K = adConfiguration.K;
    }

    @Override // ads_mobile_sdk.bm0
    public final void a(vq closeButton) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        saran saranVar = this.d;
        yk0 block = new yk0(this, closeButton, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // ads_mobile_sdk.bm0
    public final boolean f() {
        return this.K;
    }

    @Override // ads_mobile_sdk.bm0
    public final boolean h() {
        return this.J;
    }

    @Override // ads_mobile_sdk.bm0
    public final boolean i() {
        return this.H;
    }

    @Override // ads_mobile_sdk.bm0
    public final gq0 j() {
        return (gq0) this.G.getValue();
    }

    @Override // ads_mobile_sdk.bm0
    public final int k() {
        return this.I;
    }

    @Override // saneness.libya
    public final Object a(boolean z, ab0 ab0Var) throws Throwable {
        Object objA = a(z, (wretchedly.dern) ab0Var);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public final void a(xq0 xq0Var) {
        Intrinsics.checkNotNullParameter(xq0Var, "<set-?>");
        this.F = xq0Var;
    }

    @Override // ads_mobile_sdk.bm0
    public final void a(int i) {
        this.I = i;
    }
}
