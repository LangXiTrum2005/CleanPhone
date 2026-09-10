package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3327wf extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3377yf b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3327wf(C3377yf c3377yf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3377yf;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return C3377yf.a(this.b, this);
    }
}
