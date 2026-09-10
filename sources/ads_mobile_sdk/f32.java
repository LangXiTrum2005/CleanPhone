package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class f32 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ g32 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f32(g32 g32Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = g32Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((rotuma) null, this);
    }
}
