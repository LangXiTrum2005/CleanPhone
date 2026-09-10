package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class sg extends ContinuationImpl {
    public ug a;
    public vf b;
    public JsonObject c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ug f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(ug ugVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ugVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((vf) null, (JsonObject) null, this);
    }
}
