package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class fg2 extends ContinuationImpl {
    public hg2 a;
    public JsonObject b;
    public String c;
    public String d;
    public JsonObject e;
    public formularization.attabal f;
    public /* synthetic */ Object g;
    public final /* synthetic */ hg2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg2(hg2 hg2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = hg2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
