package ads_mobile_sdk;

import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.cutwater;

/* JADX INFO: loaded from: classes.dex */
public final class ul {
    public final cutwater a;

    public ul(cutwater cutwaterVar) {
        this.a = cutwaterVar;
    }

    public final /* synthetic */ sl a() {
        xm0 xm0VarA = this.a.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (sl) xm0VarA;
    }

    public final void b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.marial(value);
    }

    public final /* synthetic */ void a(zd0 zd0Var, LinkedHashMap map) {
        Intrinsics.checkNotNullParameter(zd0Var, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        this.a.dern(map);
    }

    public final void b(boolean z) {
        this.a.beachfront(z);
    }

    public final void a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.attabal(value);
    }

    public final /* synthetic */ zd0 b() {
        Map mapCompetently = this.a.competently();
        Intrinsics.checkNotNullExpressionValue(mapCompetently, "getServerParametersMap(...)");
        return new zd0(mapCompetently);
    }

    public final void a(boolean z) {
        this.a.wireman(z);
    }
}
