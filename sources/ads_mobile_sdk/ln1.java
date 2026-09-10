package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ln1 extends ContinuationImpl {
    public mn1 a;
    public Map b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mn1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln1(mn1 mn1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = mn1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
