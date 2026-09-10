package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class vn extends ir2 {
    public final un f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ vn(un unVar, long j) {
        fr2 fr2Var = fr2.BACKGROUND;
        gp2 gp2Var = gp2.ASYNC;
        bq2 bq2Var = bq2.REQUIRED;
        this(unVar, gp2Var, fr2Var, j, null, 0);
    }

    @Override // ads_mobile_sdk.ir2
    public final portwide b() {
        return this.f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vn(un source, gp2 executionType, fr2 scope, long j, Function0 function0) {
        bq2 importance = bq2.OPTIONAL;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(importance, "importance");
        Intrinsics.checkNotNullParameter(executionType, "executionType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        super(source, importance, executionType, scope, j, function0, 0);
        this.f = source;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn(un unVar, gp2 gp2Var, fr2 fr2Var, long j, Function0 function0, int i) {
        this(unVar, gp2Var, fr2Var, j, function0);
        bq2 bq2Var = bq2.REQUIRED;
    }
}
