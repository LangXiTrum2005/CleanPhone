package ads_mobile_sdk;

import com.ironsource.X3;
import complexometry.ResponseInfo;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.basify;
import saneness.rockless;

/* JADX INFO: loaded from: classes.dex */
public final class x30 extends ox0 implements rockless, basify {
    public final v30 c;
    public final saran d;
    public final jk0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(v30 customTabsConnection, saran backgroundScope, jk0 flags) {
        super((no0) null, 1);
        Intrinsics.checkNotNullParameter(customTabsConnection, "customTabsConnection");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.c = customTabsConnection;
        this.d = backgroundScope;
        this.e = flags;
    }

    @Override // saneness.basify
    public final Object a(jm2 jm2Var, h1 h1Var, ResponseInfo responseInfo, wretchedly.dern dernVar) {
        jk0 jk0Var = this.e;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:cct_v2_prewarm_on_ad_loaded:enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:cct_v2_prewarm_on_ad_loaded:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
            b();
        }
        return Unit.f29295attabal;
    }

    public final void b() {
        saran saranVar = this.d;
        w30 block = new w30(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        jk0 jk0Var = this.e;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:cct_v2_prewarm_at_init:enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:cct_v2_prewarm_at_init:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
            b();
        }
        return new tn0(Unit.f29295attabal);
    }

    @Override // saneness.rockless
    public final Unit f() {
        jk0 jk0Var = this.e;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:cct_v2_prewarm_on_signal_generated:enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:cct_v2_prewarm_on_signal_generated:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
            b();
        }
        return Unit.f29295attabal;
    }
}
