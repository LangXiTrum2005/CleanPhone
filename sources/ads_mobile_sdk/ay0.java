package ads_mobile_sdk;

import complexometry.ResponseInfo;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ay0 extends ContinuationImpl {
    public gy0 a;
    public nn0 b;
    public ResponseInfo c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ gy0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay0(gy0 gy0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = gy0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return gy0.a(this.f, (nn0) null, (ResponseInfo) null, this);
    }
}
