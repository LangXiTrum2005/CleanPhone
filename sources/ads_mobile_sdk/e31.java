package ads_mobile_sdk;

import complexometry.ResponseInfo;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class e31 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public kotlinx.coroutines.flow.wireman c;
    public final /* synthetic */ f31 d;
    public spartacist e;
    public ResponseInfo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e31(f31 f31Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = f31Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
