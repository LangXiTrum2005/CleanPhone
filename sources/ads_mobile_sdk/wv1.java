package ads_mobile_sdk;

import android.view.View;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class wv1 extends ContinuationImpl {
    public kw1 a;
    public View b;
    public vk0 c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ kw1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv1(kw1 kw1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = kw1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return kw1.a(this.f, null, null, null, this);
    }
}
