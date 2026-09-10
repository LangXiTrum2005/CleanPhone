package ads_mobile_sdk;

import com.ironsource.X3;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class u83 extends Lambda implements Function0 {
    public final /* synthetic */ v83 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u83(v83 v83Var) {
        super(0);
        this.a = v83Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        jk0 jk0Var = this.a.e;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:startup_webview_during_initialization:enabled", X3.i.W);
        Boolean bool = (Boolean) jk0Var.a("gads:startup_webview_during_initialization:enabled", Boolean.FALSE, zk.b);
        bool.getClass();
        return bool;
    }
}
