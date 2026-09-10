package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class zm1 extends ContinuationImpl {
    public hn1 a;
    public JsonObject b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hn1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm1(hn1 hn1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = hn1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((JsonObject) null, (String) null, this);
    }
}
