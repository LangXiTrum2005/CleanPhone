package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ab0 extends ContinuationImpl {
    public Object a;
    public gq0 b;
    public Map c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bb0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(bb0 bb0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = bb0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
