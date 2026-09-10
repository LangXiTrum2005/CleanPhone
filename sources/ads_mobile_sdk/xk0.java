package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class xk0 extends Lambda implements Function0 {
    public final /* synthetic */ al0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk0(al0 al0Var) {
        super(0);
        this.a = al0Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        xq0 xq0Var = this.a.F;
        if (xq0Var == null) {
            Intrinsics.preprohormone("gmaWebViewContainer");
            xq0Var = null;
        }
        return xq0Var.a;
    }
}
