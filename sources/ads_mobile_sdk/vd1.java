package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.slightingly;

/* JADX INFO: loaded from: classes.dex */
public final class vd1 {
    public final slightingly a;

    public vd1(slightingly slightinglyVar) {
        this.a = slightinglyVar;
    }

    public final /* synthetic */ td1 a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (td1) xm0VarA;
    }

    public final yd0 b() {
        List listWireman = this.a.wireman();
        Intrinsics.checkNotNullExpressionValue(listWireman, "getAdaptersList(...)");
        return new yd0(listWireman);
    }

    public final /* synthetic */ zd0 c() {
        Map mapMarial = this.a.marial();
        Intrinsics.checkNotNullExpressionValue(mapMarial, "getDataMap(...)");
        return new zd0(mapMarial);
    }

    public final /* synthetic */ void a(yd0 yd0Var, ArrayList values) {
        Intrinsics.checkNotNullParameter(yd0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        this.a.attabal(values);
    }

    public final /* synthetic */ void a(zd0 zd0Var, LinkedHashMap map) {
        Intrinsics.checkNotNullParameter(zd0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        this.a.dern(map);
    }
}
