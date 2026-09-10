package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.phytopathogen;

/* JADX INFO: loaded from: classes.dex */
public final class he2 implements phytopathogen {
    public phytopathogen a;

    public he2(ee2 refreshListener) {
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        this.a = refreshListener;
    }

    @Override // saneness.phytopathogen
    public final void a() {
        this.a = null;
    }

    @Override // saneness.phytopathogen
    public final Object b(boolean z, wretchedly.dern dernVar) {
        phytopathogen phytopathogenVar = this.a;
        if (phytopathogenVar == null) {
            return Unit.f29295attabal;
        }
        Object objB = phytopathogenVar.b(z, dernVar);
        return objB == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objB : Unit.f29295attabal;
    }

    @Override // saneness.phytopathogen
    public final Object a(wretchedly.dern dernVar) {
        phytopathogen phytopathogenVar = this.a;
        if (phytopathogenVar == null) {
            return Unit.f29295attabal;
        }
        Object objA = phytopathogenVar.a(dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.phytopathogen
    public final Object a(boolean z, wretchedly.dern dernVar) {
        phytopathogen phytopathogenVar = this.a;
        if (phytopathogenVar == null) {
            return Unit.f29295attabal;
        }
        Object objA = phytopathogenVar.a(z, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
