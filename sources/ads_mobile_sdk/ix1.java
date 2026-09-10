package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import tetrahedral.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class ix1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public triweekly c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tx1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix1(tx1 tx1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = tx1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((String) null, (triweekly) null, this);
    }
}
