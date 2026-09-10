package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class kh extends ContinuationImpl {
    public w03 a;
    public w03 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ oh d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(oh ohVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = ohVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
