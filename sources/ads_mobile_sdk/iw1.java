package ads_mobile_sdk;

import android.view.View;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class iw1 extends ContinuationImpl {
    public kw1 a;
    public View b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ kw1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw1(kw1 kw1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = kw1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return kw1.a(this.e, (View) null, this);
    }
}
