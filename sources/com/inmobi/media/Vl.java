package com.inmobi.media;

import java.util.ArrayList;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Vl extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Wl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vl(Wl wl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = wl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((String) null, (ArrayList) null, this);
    }
}
