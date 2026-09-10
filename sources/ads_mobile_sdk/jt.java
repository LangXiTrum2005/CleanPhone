package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.apologetic;

/* JADX INFO: loaded from: classes.dex */
public final class jt {
    public final apologetic a;

    public jt(apologetic apologeticVar) {
        this.a = apologeticVar;
    }

    public final /* synthetic */ gt a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (gt) xm0VarA;
    }

    public final /* synthetic */ yd0 b() {
        o21 o21VarWireman = this.a.wireman();
        Intrinsics.checkNotNullExpressionValue(o21VarWireman, "getAllowedApisList(...)");
        return new yd0(o21VarWireman);
    }
}
