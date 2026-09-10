package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class sa0 implements portwide {
    public final vg a;

    public sa0(vg appState) {
        Intrinsics.checkNotNullParameter(appState, "appState");
        this.a = appState;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.DEBUG_SIGNAL;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        Object obj = this.a.f.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return new tn0(new ra0((String) obj, this.a.g.get()));
    }
}
