package ads_mobile_sdk;

import kotlinx.coroutines.gintrap;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class xa1 extends ContinuationImpl {
    public String a;
    public gintrap b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ya1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa1(ya1 ya1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = ya1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return ya1.a(this.d, (String) null, (gintrap) null, this);
    }
}
