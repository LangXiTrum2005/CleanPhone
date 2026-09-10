package ads_mobile_sdk;

import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class m42 extends ContinuationImpl {
    public w52 a;
    public formularization.attabal b;
    public m42 c;
    public Iterator d;
    public Iterator e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ w52 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m42(w52 w52Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = w52Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(0L, this);
    }
}
