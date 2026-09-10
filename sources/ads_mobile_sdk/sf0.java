package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class sf0 implements portwide {
    public final jk0 a;

    public sf0(jk0 flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = flags;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.EXPERIMENT_IDS;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        return new tn0(new rf0(this.a.s.dern()));
    }
}
