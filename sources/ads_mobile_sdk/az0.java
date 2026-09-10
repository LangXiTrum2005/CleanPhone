package ads_mobile_sdk;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class az0 extends ContinuationImpl {
    public wz0 a;
    public JsonObject b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public String j;
    public JsonObject k;
    public Gson l;
    public boolean m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ wz0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az0(wz0 wz0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.p = wz0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.i(this);
    }
}
