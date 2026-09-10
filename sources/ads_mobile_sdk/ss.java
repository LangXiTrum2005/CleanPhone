package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class ss extends ContinuationImpl {
    public bt a;
    public spartacist b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bt e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(bt btVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = btVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((JsonObject) null, this);
    }
}
