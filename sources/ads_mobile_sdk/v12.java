package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.observability;

/* JADX INFO: loaded from: classes.dex */
public final class v12 extends ContinuationImpl {
    public x12 a;
    public Object b;
    public observability c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x12 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v12(x12 x12Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = x12Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
