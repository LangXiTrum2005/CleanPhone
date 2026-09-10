package ads_mobile_sdk;

import complexometry.ResponseInfo;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class t82 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public kotlinx.coroutines.flow.wireman c;
    public final /* synthetic */ u82 d;
    public Object e;
    public spartacist f;
    public ResponseInfo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t82(u82 u82Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = u82Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
