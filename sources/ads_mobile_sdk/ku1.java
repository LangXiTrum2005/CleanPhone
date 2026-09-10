package ads_mobile_sdk;

import androidx.work.polloi;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ku1 extends ContinuationImpl {
    public mu1 a;
    public formularization.attabal b;
    public polloi c;
    public Class d;
    public androidx.work.saneness e;
    public String f;
    public androidx.work.wireman.attabal g;
    public /* synthetic */ Object h;
    public final /* synthetic */ mu1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku1(mu1 mu1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.i = mu1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return mu1.a(this.i, this);
    }
}
