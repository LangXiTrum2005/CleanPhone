package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
public final class Dl extends ContinuationImpl {
    public Ref$BooleanRef a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Fl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dl(Fl fl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = fl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return Fl.c(this.c, null, this);
    }
}
