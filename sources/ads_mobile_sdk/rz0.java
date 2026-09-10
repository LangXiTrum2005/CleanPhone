package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class rz0 extends ContinuationImpl {
    public wz0 a;
    public JsonObject b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wz0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz0(wz0 wz0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = wz0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return wz0.a(this.e, (JsonObject) null, this);
    }
}
