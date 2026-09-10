package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.lemures;
import saneness.phytopathogen;

/* JADX INFO: loaded from: classes.dex */
public final class oi implements lemures {
    public final phytopathogen a;

    public oi(phytopathogen refreshListener) {
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        this.a = refreshListener;
    }

    @Override // saneness.lemures
    public final Object c(wretchedly.dern dernVar) {
        Object objA = this.a.a(dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
