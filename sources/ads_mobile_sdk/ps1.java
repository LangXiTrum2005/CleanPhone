package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ps1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public xm c;
    public w03 d;
    public w03 e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ rs1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps1(rs1 rs1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = rs1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
