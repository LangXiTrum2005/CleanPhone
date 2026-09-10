package ads_mobile_sdk;

import android.view.View;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class fi0 extends ContinuationImpl {
    public gi0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gi0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(gi0 gi0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = gi0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((View) null, this);
    }
}
