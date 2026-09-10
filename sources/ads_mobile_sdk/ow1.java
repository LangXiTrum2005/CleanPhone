package ads_mobile_sdk;

import android.view.View;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ow1 extends ContinuationImpl {
    public Object a;
    public View b;
    public vk0 c;
    public String d;
    public formularization.attabal e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xw1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow1(xw1 xw1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = xw1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return xw1.a(this.g, null, null, null, this);
    }
}
