package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class tu extends ContinuationImpl {
    public iv a;
    public formularization.attabal b;
    public boolean c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ iv f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(iv ivVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return iv.b(this.f, false, false, this);
    }
}
