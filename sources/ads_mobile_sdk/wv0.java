package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.tarboosh;

/* JADX INFO: loaded from: classes.dex */
public final class wv0 implements tarboosh {
    public final /* synthetic */ k63 a;
    public final /* synthetic */ saran b;
    public final /* synthetic */ saran c;
    public final /* synthetic */ ri2 d;
    public final /* synthetic */ jk0 e;

    public wv0(k63 k63Var, saran saranVar, saran saranVar2, ri2 ri2Var, jk0 jk0Var) {
        this.a = k63Var;
        this.b = saranVar;
        this.c = saranVar2;
        this.d = ri2Var;
        this.e = jk0Var;
    }

    @Override // saneness.tarboosh
    public final Unit a() {
        k63 k63Var = this.a;
        saran backgroundScope = this.b;
        saran webViewInitializationScope = this.c;
        ri2 rootTraceCreator = this.d;
        jk0 flags = this.e;
        k63Var.getClass();
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(webViewInitializationScope, "webViewInitializationScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(flags, "flags");
        k63Var.d = backgroundScope;
        k63Var.e = webViewInitializationScope;
        k63Var.f = rootTraceCreator;
        k63Var.g = flags;
        return Unit.f29295attabal;
    }
}
