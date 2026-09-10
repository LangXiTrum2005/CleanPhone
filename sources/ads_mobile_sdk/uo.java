package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class uo extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ vo b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(vo voVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = voVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return vo.b(this.b, this);
    }
}
