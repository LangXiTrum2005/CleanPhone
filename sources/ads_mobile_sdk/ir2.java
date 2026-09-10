package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public abstract class ir2 {
    public final bq2 a;
    public final gp2 b;
    public final fr2 c;
    public final long d;
    public final Function0 e;

    public ir2(portwide source, bq2 importance, gp2 executionType, fr2 scope, long j, Function0 function0) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(importance, "importance");
        Intrinsics.checkNotNullParameter(executionType, "executionType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = importance;
        this.b = executionType;
        this.c = scope;
        this.d = j;
        this.e = function0;
    }

    public final bq2 a() {
        return this.a;
    }

    public abstract portwide b();

    public final long c() {
        return this.d;
    }

    public /* synthetic */ ir2(portwide portwideVar, bq2 bq2Var, gp2 gp2Var, fr2 fr2Var, long j, Function0 function0, int i) {
        this(portwideVar, bq2Var, gp2Var, fr2Var, j, function0);
    }
}
