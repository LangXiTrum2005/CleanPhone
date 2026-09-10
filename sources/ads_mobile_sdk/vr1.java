package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class vr1 extends ContinuationImpl {
    public js1 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ js1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(js1 js1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = js1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
