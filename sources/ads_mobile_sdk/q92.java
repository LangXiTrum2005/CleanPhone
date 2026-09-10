package ads_mobile_sdk;

import java.util.List;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class q92 extends ContinuationImpl {
    public s92 a;
    public String b;
    public List c;
    public /* synthetic */ Object d;
    public final /* synthetic */ s92 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q92(s92 s92Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = s92Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((String) null, this);
    }
}
