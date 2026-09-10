package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class qn extends ContinuationImpl {
    public Object a;
    public Object b;
    public Ref$ObjectRef c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ un f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(un unVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = unVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return un.a(this.f, this);
    }
}
