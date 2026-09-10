package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.rictus;

/* JADX INFO: loaded from: classes.dex */
public final class nq {
    public final rictus a;

    public nq(rictus rictusVar) {
        this.a = rictusVar;
    }

    public final /* synthetic */ jz a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (jz) xm0VarA;
    }

    public final void a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.attabal(value);
    }
}
