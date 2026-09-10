package ads_mobile_sdk;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.gondola;

/* JADX INFO: loaded from: classes.dex */
public final class bz2 {
    public final gondola a;

    public bz2(gondola gondolaVar) {
        this.a = gondolaVar;
    }

    public final /* synthetic */ vm a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (vm) xm0VarA;
    }

    public final /* synthetic */ yd0 b() {
        List listDern = this.a.dern();
        Intrinsics.checkNotNullExpressionValue(listDern, "getThirdPartySdkList(...)");
        return new yd0(listDern);
    }

    public final /* synthetic */ void a(yd0 yd0Var, um value) {
        Intrinsics.checkNotNullParameter(yd0Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.attabal(value);
    }
}
