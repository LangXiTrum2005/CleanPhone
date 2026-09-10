package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.physical;

/* JADX INFO: loaded from: classes.dex */
public final class fz2 {
    public final physical a;

    public fz2(physical physicalVar) {
        this.a = physicalVar;
    }

    public final /* synthetic */ rm a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (rm) xm0VarA;
    }

    public final void a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.dern(value);
    }

    public final void a(hm value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.attabal(value);
    }
}
