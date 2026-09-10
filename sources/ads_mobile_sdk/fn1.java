package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class fn1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ hn1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn1(hn1 hn1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = hn1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((JsonObject) null, (a22) null, this);
    }
}
