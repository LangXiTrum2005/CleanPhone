package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.kith;

/* JADX INFO: loaded from: classes.dex */
public final class af1 {
    public final kith a;

    public af1(kith kithVar) {
        this.a = kithVar;
    }

    public final /* synthetic */ ye1 a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (ye1) xm0VarA;
    }

    public final /* synthetic */ yd0 b() {
        List listDern = this.a.dern();
        Intrinsics.checkNotNullExpressionValue(listDern, "getAdNetworkInfoList(...)");
        return new yd0(listDern);
    }

    public final /* synthetic */ void a(yd0 yd0Var, ArrayList values) {
        Intrinsics.checkNotNullParameter(yd0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        this.a.attabal(values);
    }
}
