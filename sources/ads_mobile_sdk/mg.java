package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class mg extends ContinuationImpl {
    public ug a;
    public String b;
    public String c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ug f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(ug ugVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ugVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, null, this);
    }
}
