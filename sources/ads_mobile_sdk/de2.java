package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class de2 extends ContinuationImpl {
    public ee2 a;
    public Function1 b;
    public Object c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ee2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de2(ee2 ee2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ee2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((Function1) null, this);
    }
}
