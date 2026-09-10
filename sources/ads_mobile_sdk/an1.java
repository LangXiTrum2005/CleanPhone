package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class an1 extends ContinuationImpl {
    public hn1 a;
    public JsonObject b;
    public String c;
    public double d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ hn1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an1(hn1 hn1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = hn1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a((JsonObject) null, false, (wretchedly.dern) this);
    }
}
