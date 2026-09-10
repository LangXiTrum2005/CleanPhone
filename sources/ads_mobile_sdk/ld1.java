package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.frailly;

/* JADX INFO: loaded from: classes.dex */
public final class ld1 extends ContinuationImpl {
    public frailly a;
    public /* synthetic */ Object b;
    public final /* synthetic */ frailly c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld1(frailly fraillyVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = fraillyVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
