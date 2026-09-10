package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class dk2 extends ContinuationImpl {
    public gk2 a;
    public String b;
    public b10 c;
    public Map d;
    public formularization.attabal e;
    public /* synthetic */ Object f;
    public final /* synthetic */ gk2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk2(gk2 gk2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = gk2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return gk2.a(this.g, null, null, null, this);
    }
}
