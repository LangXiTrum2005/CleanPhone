package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class pg extends ContinuationImpl {
    public ug a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ug d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(ug ugVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = ugVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((vf) null, this);
    }
}
