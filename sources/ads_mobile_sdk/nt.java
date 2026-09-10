package ads_mobile_sdk;

import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class nt extends ContinuationImpl {
    public iv a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iv d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(iv ivVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
