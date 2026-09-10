package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class cu1 extends Lambda implements Function0 {
    public final /* synthetic */ ExecutorService a;
    public final /* synthetic */ eu1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu1(ms msVar, eu1 eu1Var) {
        super(0);
        this.a = msVar;
        this.b = eu1Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new it0(null, this.a, this.b.a);
    }
}
