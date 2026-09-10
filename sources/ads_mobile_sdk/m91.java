package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class m91 extends ContinuationImpl {
    public y91 a;
    public Ref$ObjectRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y91 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m91(y91 y91Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = y91Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b((String) null, this);
    }
}
