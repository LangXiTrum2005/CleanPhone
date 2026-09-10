package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.vocationalize;

/* JADX INFO: loaded from: classes.dex */
public final class ct1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public w03 c;
    public w03 d;
    public vocationalize e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ft1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct1(ft1 ft1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = ft1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
