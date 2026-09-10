package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.laky;

/* JADX INFO: loaded from: classes.dex */
public final class dp0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ laky b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp0(laky lakyVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = lakyVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.saneness(0L, null, this);
    }
}
