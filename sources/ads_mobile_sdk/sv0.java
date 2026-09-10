package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.supercargo;
import saneness.tarboosh;

/* JADX INFO: loaded from: classes.dex */
public final class sv0 implements tarboosh {
    public final /* synthetic */ supercargo a;
    public final /* synthetic */ iv b;

    public sv0(supercargo supercargoVar, iv ivVar) {
        this.a = supercargoVar;
        this.b = ivVar;
    }

    @Override // saneness.tarboosh
    public final Unit a() {
        supercargo supercargoVar = this.a;
        iv consentStringsProvider = this.b;
        y91 y91Var = (y91) supercargoVar;
        y91Var.getClass();
        Intrinsics.checkNotNullParameter(consentStringsProvider, "consentStringsProvider");
        y91Var.p = consentStringsProvider;
        return Unit.f29295attabal;
    }
}
