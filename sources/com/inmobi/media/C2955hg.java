package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2955hg extends ContinuationImpl {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC2979ig c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2955hg(AbstractC2979ig abstractC2979ig, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = abstractC2979ig;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, this);
    }
}
