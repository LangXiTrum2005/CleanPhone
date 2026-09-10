package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2869e7 extends ContinuationImpl {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3070m7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2869e7(C3070m7 c3070m7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3070m7;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
