package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class wa1 extends ContinuationImpl {
    public ya1 a;
    public String b;
    public hemolysin c;
    public Object d;
    public formularization.attabal e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ya1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa1(ya1 ya1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = ya1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return ya1.a(this.g, (String) null, (hemolysin) null, this);
    }
}
