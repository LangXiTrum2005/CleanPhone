package ads_mobile_sdk;

import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class k extends ContinuationImpl {
    public l a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = lVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
