package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class oy1 extends ContinuationImpl {
    public vy1 a;
    public Map b;
    public gq0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vy1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy1(vy1 vy1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = vy1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
