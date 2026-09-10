package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.benzoyl;

/* JADX INFO: loaded from: classes.dex */
public final class jg1 {
    public final benzoyl a;

    public jg1(benzoyl benzoylVar) {
        this.a = benzoylVar;
    }

    public final /* synthetic */ hg1 a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (hg1) xm0VarA;
    }

    public final void a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.attabal(value);
    }
}
