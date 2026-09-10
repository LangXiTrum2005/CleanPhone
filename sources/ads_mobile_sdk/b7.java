package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.enthrallment;

/* JADX INFO: loaded from: classes.dex */
public final class b7 {
    public final enthrallment a;

    public b7(enthrallment enthrallmentVar) {
        this.a = enthrallmentVar;
    }

    public final /* synthetic */ z6 a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (z6) xm0VarA;
    }

    public final /* synthetic */ yd0 b() {
        List listDern = this.a.dern();
        Intrinsics.checkNotNullExpressionValue(listDern, "getAdUnitPatternsList(...)");
        return new yd0(listDern);
    }

    public final /* synthetic */ void a(yd0 yd0Var, ArrayList values) {
        Intrinsics.checkNotNullParameter(yd0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        this.a.attabal(values);
    }
}
