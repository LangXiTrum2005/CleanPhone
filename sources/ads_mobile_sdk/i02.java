package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.idolatry;

/* JADX INFO: loaded from: classes.dex */
public final class i02 extends ContinuationImpl {
    public Object a;
    public h1 b;
    public Object c;
    public idolatry d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ q02 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i02(q02 q02Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = q02Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((h1) null, this);
    }
}
