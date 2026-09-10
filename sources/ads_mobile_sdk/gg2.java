package ads_mobile_sdk;

import kotlinx.coroutines.gintrap;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class gg2 extends ContinuationImpl {
    public hg2 a;
    public String b;
    public gintrap c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ hg2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg2(hg2 hg2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = hg2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((String) null, (gintrap) null, this);
    }
}
