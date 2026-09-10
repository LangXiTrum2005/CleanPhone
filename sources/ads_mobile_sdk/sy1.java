package ads_mobile_sdk;

import android.content.Intent;
import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class sy1 extends ContinuationImpl {
    public Object a;
    public gq0 b;
    public Map c;
    public Object d;
    public Intent e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ vy1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy1(vy1 vy1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.i = vy1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a((gq0) null, (Map) null, this);
    }
}
