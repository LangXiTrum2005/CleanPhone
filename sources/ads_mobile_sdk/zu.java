package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class zu extends ContinuationImpl {
    public iv a;
    public /* synthetic */ Object b;
    public final /* synthetic */ iv c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(iv ivVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return iv.k(this.c, this);
    }
}
