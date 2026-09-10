package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Ah extends ContinuationImpl {
    public List a;
    public ArrayList b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Bh d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ah(Bh bh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = bh;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((Ne) null, (List) null, this);
    }
}
