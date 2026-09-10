package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3032kj extends ContinuationImpl {
    public String a;
    public Cj b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3107nj d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3032kj(C3107nj c3107nj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3107nj;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return C3107nj.a(this.d, null, null, this);
    }
}
