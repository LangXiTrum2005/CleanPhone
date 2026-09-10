package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class gf2 extends ContinuationImpl {
    public JsonObject a;
    public JsonObject b;
    public JsonObject c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ jf2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf2(jf2 jf2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = jf2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
