package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class nt1 extends ir2 {
    public final portwide f;

    public /* synthetic */ nt1(portwide portwideVar, bq2 bq2Var, gp2 gp2Var, long j) {
        this(portwideVar, bq2Var, gp2Var, fr2.BACKGROUND, j, null, 0);
    }

    @Override // ads_mobile_sdk.ir2
    public final portwide b() {
        return this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt1(portwide source, bq2 importance, gp2 executionType, fr2 scope, long j, Function0 function0) {
        super(source, importance, executionType, scope, j, function0, 0);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(importance, "importance");
        Intrinsics.checkNotNullParameter(executionType, "executionType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f = source;
    }

    public /* synthetic */ nt1(portwide portwideVar, bq2 bq2Var, gp2 gp2Var, fr2 fr2Var, long j, Function0 function0, int i) {
        this(portwideVar, bq2Var, gp2Var, fr2Var, j, function0);
    }
}
