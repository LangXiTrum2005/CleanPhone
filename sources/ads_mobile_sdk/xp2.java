package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class xp2 extends Lambda implements Function0 {
    public final /* synthetic */ jk0 a;
    public final /* synthetic */ adjudge.saneness b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp2(jk0 jk0Var, adjudge.saneness sanenessVar) {
        super(0);
        this.a = jk0Var;
        this.b = sanenessVar;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.a.F().contains(String.valueOf(this.b.getF3279impassible().getNumber())));
    }
}
