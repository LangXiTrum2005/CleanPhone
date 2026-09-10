package ads_mobile_sdk;

import java.util.Set;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.tarboosh;

/* JADX INFO: loaded from: classes.dex */
public final class tv0 implements tarboosh {
    public final /* synthetic */ x a;
    public final /* synthetic */ Set b;

    public tv0(x xVar, Set set) {
        this.a = xVar;
        this.b = set;
    }

    @Override // saneness.tarboosh
    public final Unit a() {
        x xVar = this.a;
        Set newForegroundStateChangeListeners = this.b;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(newForegroundStateChangeListeners, "newForegroundStateChangeListeners");
        xVar.h.addAll(newForegroundStateChangeListeners);
        return Unit.f29295attabal;
    }
}
