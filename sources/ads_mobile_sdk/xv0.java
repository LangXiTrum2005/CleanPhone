package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.tarboosh;

/* JADX INFO: loaded from: classes.dex */
public final class xv0 implements tarboosh {
    public final /* synthetic */ l83 a;
    public final /* synthetic */ wz0 b;

    public xv0(wz0 wz0Var, l83 l83Var) {
        this.a = l83Var;
        this.b = wz0Var;
    }

    @Override // saneness.tarboosh
    public final Unit a() {
        l83 l83Var = this.a;
        wz0 debugModeProvider = this.b;
        l83Var.getClass();
        Intrinsics.checkNotNullParameter(debugModeProvider, "debugModeProvider");
        l83Var.p = debugModeProvider;
        return Unit.f29295attabal;
    }
}
