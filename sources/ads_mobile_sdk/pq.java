package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.sulfarsenide;

/* JADX INFO: loaded from: classes.dex */
public final class pq {
    public final sulfarsenide a;

    public pq(sulfarsenide sulfarsenideVar) {
        this.a = sulfarsenideVar;
    }

    public final /* synthetic */ f10 a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (f10) xm0VarA;
    }

    public final void a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.attabal(value);
    }

    public final void a(boolean z) {
        this.a.dern(z);
    }
}
