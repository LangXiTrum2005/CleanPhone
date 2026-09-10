package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class jd0 implements eliminate {
    public final int a;

    public jd0(int i) {
        this.a = i;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.displayCount = Integer.valueOf(this.a);
    }
}
