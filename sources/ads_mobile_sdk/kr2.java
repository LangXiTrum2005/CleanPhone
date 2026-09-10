package ads_mobile_sdk;

import com.ironsource.X3;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.FunctionReferenceImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr2 extends FunctionReferenceImpl implements Function0 {
    public kr2(jk0 jk0Var) {
        super(0, jk0Var, jk0.class, "topicsSignalEnabled", "topicsSignalEnabled()Z", 0);
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        jk0 jk0Var = (jk0) this.receiver;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:topics_signal:enabled", X3.i.W);
        Boolean bool = (Boolean) jk0Var.a("gads:topics_signal:enabled", Boolean.FALSE, zk.b);
        bool.getClass();
        return bool;
    }
}
