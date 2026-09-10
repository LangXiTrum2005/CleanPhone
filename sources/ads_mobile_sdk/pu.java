package ads_mobile_sdk;

import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class pu extends ContinuationImpl {
    public Object a;
    public Object b;
    public Closeable c;
    public Object d;
    public String e;
    public formularization.attabal f;
    public /* synthetic */ Object g;
    public final /* synthetic */ iv h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu(iv ivVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.s(this);
    }
}
