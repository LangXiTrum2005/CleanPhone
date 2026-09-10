package ads_mobile_sdk;

import kotlinx.coroutines.gintrap;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class jo2 extends ContinuationImpl {
    public po2 a;
    public gintrap b;
    public formularization.attabal c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ po2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo2(po2 po2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = po2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(false, this);
    }
}
