package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.yorkshire;

/* JADX INFO: loaded from: classes.dex */
public final class x6 {
    public final yorkshire a;

    public x6(yorkshire yorkshireVar) {
        this.a = yorkshireVar;
    }

    public final /* synthetic */ v6 a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (v6) xm0VarA;
    }

    public final /* synthetic */ void b(yd0 yd0Var, ArrayList values) {
        Intrinsics.checkNotNullParameter(yd0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        this.a.wireman(values);
    }

    public final yd0 c() {
        List listBeachfront = this.a.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getIncludingRegexesList(...)");
        return new yd0(listBeachfront);
    }

    public final /* synthetic */ void a(yd0 yd0Var, ArrayList values) {
        Intrinsics.checkNotNullParameter(yd0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        this.a.dern(values);
    }

    public final yd0 b() {
        List listMarial = this.a.marial();
        Intrinsics.checkNotNullExpressionValue(listMarial, "getExcludingRegexesList(...)");
        return new yd0(listMarial);
    }

    public final void a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.attabal(value);
    }
}
