package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3022k9 extends ContinuationImpl {
    public C3047l9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3047l9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3022k9(C3047l9 c3047l9, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3047l9;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
