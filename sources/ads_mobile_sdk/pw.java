package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class pw extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ qw b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(qw qwVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = qwVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((rotuma) null, this);
    }
}
