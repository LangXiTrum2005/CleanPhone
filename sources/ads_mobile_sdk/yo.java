package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class yo extends ContinuationImpl {
    public Object a;
    public String b;
    public Object c;
    public cb1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zo f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(zo zoVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = zoVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(this);
    }
}
