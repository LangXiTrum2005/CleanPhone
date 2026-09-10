package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Tm extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ Um c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tm(Um um, dern dernVar) {
        super(dernVar);
        this.c = um;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
