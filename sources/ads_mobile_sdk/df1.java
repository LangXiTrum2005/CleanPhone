package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class df1 implements portwide {
    public final vg a;

    public df1(vg appState) {
        Intrinsics.checkNotNullParameter(appState, "appState");
        this.a = appState;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.MEMORY;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        Runtime runtime = Runtime.getRuntime();
        return new tn0(new cf1(runtime.freeMemory(), runtime.maxMemory(), runtime.totalMemory(), this.a.d.get()));
    }
}
