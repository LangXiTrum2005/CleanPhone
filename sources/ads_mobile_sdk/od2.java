package ads_mobile_sdk;

import complexometry.ResponseInfo;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class od2 extends ContinuationImpl {
    public ee2 a;
    public Object b;
    public ResponseInfo c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ee2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od2(ee2 ee2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ee2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return ee2.a(this.f, this);
    }
}
