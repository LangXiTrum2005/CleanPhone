package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class uy1 extends ContinuationImpl {
    public boolean a;
    public boolean b;
    public gq0 c;
    public String d;
    public String e;
    public String f;
    public o33 g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vy1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy1(vy1 vy1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.k = vy1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, null, this);
    }
}
