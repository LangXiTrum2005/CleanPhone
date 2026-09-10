package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class vs0 extends ContinuationImpl {
    public Map a;
    public Map b;
    public wt0 c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ it0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(it0 it0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = it0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((xt0) null, (Map) null, this);
    }
}
