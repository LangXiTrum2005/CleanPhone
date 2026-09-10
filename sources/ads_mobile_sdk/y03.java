package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class y03 extends ContinuationImpl {
    public loun a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ loun d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y03(loun lounVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = lounVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return loun.saneness(this.d, null, null, this);
    }
}
