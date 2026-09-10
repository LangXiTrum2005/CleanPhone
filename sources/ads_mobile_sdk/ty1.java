package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ty1 extends ContinuationImpl {
    public Map a;
    public gq0 b;
    public boolean c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vy1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty1(vy1 vy1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = vy1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, false, false, false, null, this);
    }
}
