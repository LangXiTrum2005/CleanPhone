package ads_mobile_sdk;

import java.util.List;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class n20 extends ContinuationImpl {
    public u20 a;
    public String b;
    public String c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ u20 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(u20 u20Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = u20Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((String) null, (List) null, this);
    }
}
